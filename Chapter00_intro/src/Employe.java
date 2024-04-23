abstract class Employe {
    abstract void Print_info();
    void Company_info(){
        System.out.println("Perusahaan suka suka");
    }

}

class NewEmployee extends Employe{
    @Override
    void Print_info() {
        String nama = "Riski";
        int age = 21;
        Float salary = 200.2F;

        System.out.println(nama);
        System.out.println(age);
        System.out.println(salary);
    }

}

class OldEmploye extends Employe{
    @Override
    void Print_info() {
        String nama = "Mutia";
        int age = 19;
        Float salary = 200.2F;

        System.out.println(nama);
        System.out.println(age);
        System.out.println(salary);

    }
}
