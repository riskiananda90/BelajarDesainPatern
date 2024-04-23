class Unggas {
    public String Warna;

    public void Berjalan()
    {
        System.out.println("Berjalan Menggunakan kaki");
    }
    public void Suara()
    {
        System.out.println("Dan Bersuara KuKuruyuk");
    }
}
class TidakBisaTerbang extends Unggas{
    public void Terbang(){
        System.out.println("Terbang Dengan Lompat-Lompat");
    }
    public void Suara()
    {
        System.out.println("Dan Bersuara KuKuruyuk");
    }

}
class BisaTerbang extends Unggas {
    public void Terbang()
    {
        System.out.println("Terbang KeLuar angkasa");
    }
    public void Suara()
    {
        System.out.println("Dan Bersuara Kicau");
    }
}
class Inner_Unggas{

}