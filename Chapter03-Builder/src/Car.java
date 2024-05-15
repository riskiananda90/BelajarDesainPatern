public class Car {

    private String engine, wheels, color, interior;

    public Car() {
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "Car Properties"
                + "\n-----------"
                + "\nEngine: " + getEngine()
                + "\nWheels: " + getWheels()
                + "\nColor: " + getColor()
                + "\nInterior: " + getInterior();
    }

}

class CarBuilder {
    private Car car;

    public CarBuilder() {
        this(new Car());
    }

    public CarBuilder(Car car) {
        this.car = car;
    }

    public CarBuilder engine(String engine) {
        car.setEngine(engine);
        return this;
    }

    public CarBuilder wheels(String wheels) {
        car.setWheels(wheels);
        return this;
    }

    public CarBuilder color(String color) {
        car.setColor(color);
        return this;
    }

    public CarBuilder interior(String interior) {
        car.setInterior(interior);
        return this;
    }

    public Car getResult() {
        return car;
    }
}

class CarDirector {

    // Declare Singleton
    private static CarDirector director = null;

    private CarDirector() {}

    public static synchronized CarDirector getInstance() {
        if (director == null) {
            director = new CarDirector();
        }
        return director;
    }

    public Car buildSportsCar() {
        CarBuilder builder = new CarBuilder();
        builder.engine("V8 Engine");
        builder.wheels("Alloy Wheels");
        builder.color("Red");
        builder.interior("Leather");

        return builder.getResult();
    }

    public Car buildSUV() {
        CarBuilder builder = new CarBuilder();
        builder.engine("V6 Engine");
        builder.wheels("All-Terrain Wheels");
        builder.color("Black");
        builder.interior("Fabric");

        return builder.getResult();
    }

    public Car buildEconomyCar() {
        CarBuilder builder = new CarBuilder();
        builder.engine("I4 Engine");
        builder.wheels("Steel Wheels");
        builder.color("White");
        builder.interior("Cloth");

        return builder.getResult();
    }
}

class MainCar {

    public static void main(String[] args) {
        // Create a sports car using CarDirector
        Car sportsCar = CarDirector.getInstance().buildSportsCar();
        System.out.println("Sports Car:");
        System.out.println(sportsCar);
        System.out.println();

        // Create an SUV using CarDirector
        Car suv = CarDirector.getInstance().buildSUV();
        System.out.println("SUV:");
        System.out.println(suv);
        System.out.println();

        // Create an economy car using CarDirector
        Car economyCar = CarDirector.getInstance().buildEconomyCar();
        System.out.println("Economy Car:");
        System.out.println(economyCar);
        System.out.println();

        // Create a custom car using CarBuilder directly
        CarBuilder carBuilder = new CarBuilder();
        Car customCar = carBuilder.engine("Electric Motor").wheels("Carbon Fiber Wheels").
                color("Blue").interior("Vegan Leather").getResult();
        System.out.println("Custom Car:");
        System.out.println(customCar);
    }
}

