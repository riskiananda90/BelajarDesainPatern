public interface Kendaraan {
     void Berjalan();
     void Berhenti();
     void Klakson();
}
class Sepeda implements Kendaraan{
    @Override
    public void Berjalan() {
        System.out.println("Dengan Mengayuh ");
    }

    @Override
    public void Berhenti() {
        System.out.println("Dengan Sendal");
    }

    @Override
    public void Klakson() {
        System.out.println("Dengan Kring-Kring");
    }
}
class Sepeda_motor implements Kendaraan{
    @Override
    public void Berjalan() {
        System.out.println("Dengan Mengegas");
    }

    @Override
    public void Berhenti() {
        System.out.println("dengan mengerem");
    }

    @Override
    public void Klakson() {
        System.out.println("Dengan OM TELOLET OM");
    }
}
class Inner_Kendaraan {
    public static void main(String[] args) {
        Kendaraan sepeda = new Sepeda();
        Sepeda_motor S_motor = new Sepeda_motor();

        System.out.println("=============================");
        System.out.println("Ini adalah Sepeda ");
        System.out.println("Sepeda ini Berjalan ");
        sepeda.Berjalan();
        System.out.println("Sepeda ini berhenti ");
        sepeda.Berhenti();

        System.out.println("=============================");

        System.out.println("Ini adalah Sepeda Motor ");
        System.out.println("Sepeda Motor ini Berjalan ");
        S_motor.Berjalan();
        System.out.println("Sepeda Motor ini berhenti ");
        S_motor.Berhenti();
        System.out.println("=============================");

    }
}