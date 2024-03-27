interface QuackBehavior {
    void quack();
}

interface FlyBehavior {
    void fly();
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("qwek - qwek");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("squeak");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("tidak bisa bersuara");
    }
}
class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("terbang");
    }
}

class FlyNoway implements FlyBehavior {
    public void fly() {
        System.out.println("tidak bisa terbang");
    }
}

class FlyWithRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("cool, terbang menggunakan rocket");
    }
}

abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    abstract void display();

    void swim() {
        System.out.println("berenang");
    }
    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }
    void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("tampilan Mallarduck");
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("tampilan RedHeadDuck");
    }
}

class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoway();
    }

    @Override
    void display() {

    }
}
class WoodenDuck extends Duck {
    public WoodenDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoway();
    }

    void display() {
        System.out.println("tampilan rubberduck");
    }
}

class Woodenduck extends Duck {
    public void WoodenDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoway();
    }

    void display() {
        System.out.println("tampilan WoodenDuck");
    }
}

class ModelDuck extends Duck {
    ModelDuck() {
        flyBehavior = new FlyNoway();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("tampilan ModelDuck");
    }
}