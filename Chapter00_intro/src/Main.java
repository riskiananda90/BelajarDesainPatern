class Main {
        public static void main(String[] args) {
                //-----------------------------------------------------------------------
                //      Berikut object Mahasiswa
                Mahasiswa mhs2 = new Mahasiswa();
                mhs2.Nama = "Rizki Ananda";
                mhs2.Alamat = "Batuphat Barat";
                mhs2.Email = "Risskiananda90@gmail.com";
                mhs2.JenisKelamin = "Laki-Laki";
                mhs2.NIM = "2022573010115";

                System.out.println("Nama : " + mhs2.Nama);
                System.out.println("Alamat : " + mhs2.Alamat);
                System.out.println("Email : " + mhs2.Email);
                System.out.println("JenisKelamin : " + mhs2.JenisKelamin);
                System.out.println("NIM : " + mhs2.NIM);
                // -----------------------------------------------------------------------

                //      Berikut object Dosen
                Dosen DSN1 = new Dosen();
                DSN1.Nama = "Reza Zulman";
                DSN1.Alamat = "Aceh";
                DSN1.Email = "RezzaZulman90@gmail.com";
                DSN1.JenisKelamin = "Laki-Laki";
                DSN1.NIP = "9028763627837637438";
                //-----------------------------------------------------------------------
                System.out.println("Nama : " + mhs2.Nama);
                System.out.println("Alamat : " + mhs2.Alamat);
                System.out.println("Email : " + mhs2.Email);
                System.out.println("JenisKelamin : " + mhs2.JenisKelamin);
                System.out.println("NIM : " + mhs2.NIM);




        }
}