    interface DiskonStrategy {
        double hitungDiskon(double totalHarga);
    }
    class DiskonPersen implements DiskonStrategy {
        private double persenDiskon;

        public DiskonPersen(double persenDiskon) {
            this.persenDiskon = persenDiskon;
        }

        @Override
        public double hitungDiskon(double totalHarga) {
            return totalHarga * persenDiskon / 100;
        }
    }

    class DiskonPotongan implements DiskonStrategy {
        private double potonganHarga;

        public DiskonPotongan(double potonganHarga) {
            this.potonganHarga = potonganHarga;
        }

        @Override
        public double hitungDiskon(double totalHarga) {
            return Math.min(totalHarga, potonganHarga);
        }
    }
    class Pembelian {
        private DiskonStrategy strategiDiskon;

        public Pembelian(DiskonStrategy strategiDiskon) {
            this.strategiDiskon = strategiDiskon;
        }

        public double hitungTotalHarga(double totalHarga) {
            return totalHarga - strategiDiskon.hitungDiskon(totalHarga);
        }

        public void setStrategiDiskon(DiskonStrategy strategiDiskon) {
            this.strategiDiskon = strategiDiskon;
        }
    }
class main{
    public static void main(String[] args) {
        DiskonStrategy diskonPersen = new DiskonPersen(10);
        DiskonStrategy diskonPotongan = new DiskonPotongan(50000);

        Pembelian pembelian = new Pembelian(diskonPersen);
        double totalHarga = pembelian.hitungTotalHarga(100000);

        System.out.println("Total Harga dengan Diskon Persen: " + totalHarga);

        pembelian.setStrategiDiskon(diskonPotongan);
        totalHarga = pembelian.hitungTotalHarga(100000);

        System.out.println("Total Harga dengan Diskon Potongan: " + totalHarga);

    }
}
