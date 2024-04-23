public class Employe_Main {
        public static void main(String[] args) {
            System.out.println("Abstract Class Example");
            System.out.println("----------------------");
            Employe empBaru = new NewEmployee();
            empBaru.Print_info();
            empBaru.Company_info();

            Employe empLama = new OldEmploye();
            empLama.Print_info();
            empLama.Company_info();
            // Example of choosing between interface and abstract
            System.out.println("Example of choosing between interface and abstract");
            System.out.println("---------------------------------------------------");
            System.out.println("------Abstract------");
            ShapeAbstract bulat = new Circle(2);
            Rectangle pp = new Rectangle(2,5);
            bulat.calculateArea();
            pp.calculateArea();
            bulat.draw();
            pp.draw();

            System.out.println("------Interface------");
            Bulat bulat2 = new Bulat(2);
            PersegiPanjang pp2 = new PersegiPanjang(2,5);
            bulat2.calculateArea();
            pp.calculateArea();
            bulat2.draw();
            pp2.draw();
        }
    }
