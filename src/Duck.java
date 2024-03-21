//Menggunakan Interface
//### Tahap 2. Menggunakan Interface. (Rubah kode pada tahap 1 menjadi seperti berikut)
//        1. Buat sebuah interface Quackable untuk perilaku bersuara.
//        2. Buat sebuah interface Flyable untuk perilaku terbang.
//        3. Implementasikan kedua interface tersebut dalam kelas Duck dan kelas-kelas turunannya.

interface Quackable {
    void quack();
}

interface Flyable {
    void fly();
}

abstract class Duck {
    abstract void display();
    void Swim()
    {
        System.out.println("Berenang");
    }
}

class Mallarduck extends Duck implements Quackable,Flyable{
    @Override
    public void quack() {
        System.out.println("Quak Quak ");
    }

    @Override
    public void fly() {
        System.out.println("Terbang");
    }
    @Override
        void display()
        {
            System.out.println("Tampilan Mallarduck");
        }
}
class RedheadDuck extends Duck implements Quackable, Flyable {
    @Override
    public void quack() {
        System.out.println("Qwek Qwek");
    }

    @Override
    public void fly() {
        System.out.println("Terbang");
    }

    @Override
    void display() {
        System.out.println("Tampilan RedHeadDuck");
    }
}
class RubberDuck extends Duck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Squak");
    }

    @Override
    void display() {
        System.out.println("Tampilan RubberDuck");
    }
}

class WoodenDuck extends Duck {
    @Override
    void display() {
        System.out.println("Tmapilan Woodenduck");
    }

}

class ToyDuck extends Duck implements Flyable {
    @Override
    public void fly() {
        System.out.println("Terbang seperti mainan");
    }

    @Override
    void display() {
        System.out.println("Tampilan ToyDuck");
    }
}
//> _Analisis_:
//> - Menggunakan interface untuk mendefinisikan perilaku bersuara dan terbang membuat kode lebih modular.
//> - Menerapkan polimorfisme dengan menggunakan interface, yang memungkinkan berbagai implementasi perilaku bersuara dan terbang.
//> - Kelas turunan dapat mengimplementasikan lebih dari satu perilaku bersuara atau terbang jika diperlukan.
//> _Kekurangan_:
//> - Masih terbatas dalam fleksibilitas saat ingin mengubah perilaku bersuara atau terbang secara dinamis pada saat runtime.
//> - Jika ada perubahan pada perilaku bersuara atau terbang, perubahan tersebut masih perlu diterapkan pada semua kelas turunan yang terkait