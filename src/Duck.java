//### Tahap 3. Menggunakan Strategy Pattern (Rubah kode pada tahap 2 menjadi seperti berikut)
//1. Buat sebuah interface QuackBehavior untuk perilaku bersuara.
//        2. Buat sebuah interface FlyBehavior untuk perilaku terbang.
//        3. Implementasikan kelas-kelas konkrit yang mengimplementasikan interface-interface tersebut.
//        4. Gunakan komposisi untuk memasukkan perilaku bersuara dan terbang ke dalam kelas Duck.
//
//        ```java
interface QuackBehavior {
    void quack();
}

interface FlyBehavior {
    void fly();
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Qwek - Qwek");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Tidak Bisa Bersuara");
    }
}


class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Terbang");
    }
}

class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Tidak bisa terbang");
    }
}

class FlyWithRocketPower implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Cool, terbang menggunakan rocket");
    }
}

abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    abstract void display();

    void swim() {
        System.out.println("Berenang");
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
        System.out.println("Tampilan MallardDuck");
    }
}

class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("Tampilan ReadHeadDuck");
    }
}

class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    void display () {
        System.out.println("Tampilan RubberDuck");
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    void display () {
        System.out.println("Tampilan WoodenDuck");
    }
}

class ModelDuck extends Duck {
    ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("Tampilan ModelDuck");
    }
}


//        > _Analisis_:
//        > - Menerapkan Strategy Pattern memungkinkan kita untuk memisahkan perilaku bersuara dan terbang menjadi objek terpisah.
//        > - Fleksibilitas tinggi dalam mengubah perilaku bersuara atau terbang pada saat runtime dengan mudah.
//        >- Memungkinkan penggunaan berbagai macam perilaku bersuara dan terbang tanpa perubahan pada kelas bebek.
//        _Kekurangan_:
//        > - Memperkenalkan kompleksitas tambahan ke dalam kode karena memerlukan lebih banyak kelas dan objek untuk mengelola strategi-strategi perilaku.
//        > - Dapat menjadi terlalu abstrak untuk aplikasi sederhana, yang dapat menyulitkan pemahaman bagi pengembang yang kurang berpengalaman.
//### Pada file Main.java, isikan kode berikut
//```java
class Main {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelduck = new ModelDuck();
        modelduck.performFly(); // Akan memanggil constructor modelduck(FlyNoWay())
        modelduck.setFlyBehavior(new FlyWithRocketPower());
        modelduck.performFly();
    }
}