abstract class Duck {
    void Quack()
    {
        System.out.println(" Qwek Qwek");
    }
    void Swim()
    {
        System.out.println("Berenang");
    }
    abstract void display();

    void fly()
    {
        System.out.println("Terbang");
    }
}

class Mallarduck extends Duck{
    @Override
        void display()
        {
            System.out.println("Tampilan Mallarduck");
        }
}
class RubberDuck extends Duck {
    @Override
    void display() {
        System.out.println("Tampilan RubberDuck");
    }

    @Override
    void Quack() {
        System.out.println("Bunyinya Squeek bukan Qwak");
    }

    @Override
    void fly() {
//        Tidak ada implementasi karena bebek mainan tidak dapat terbang
    }
}

class WoodenDuck extends Duck{
    @Override
    void display() {
        System.out.println("Tmapilan Woodenduck");
    }

    @Override
    void Quack() {
//        tidak ada implementasi karena bebek mainan tidak dapat bersuara
    }

    @Override
    void Swim() {
        System.out.println("Mengambang");
    }

    @Override
    void fly() {
//        Tidak ada implementasi karena bebek mainan tidak dapat terbang
    }
}
