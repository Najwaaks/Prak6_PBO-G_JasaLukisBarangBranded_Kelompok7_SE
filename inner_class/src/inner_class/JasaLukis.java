package inner_class.src.inner_class;

public class JasaLukis {
    // atribut
    String namaJasa; 
    String deskripsi;
    double hargaPerBarang;

    // constructor
    public JasaLukis(String namaJasa, String deskripsi, double hargaPerBarang) {
        this.namaJasa = namaJasa;
        this.deskripsi = deskripsi;
        this.hargaPerBarang = hargaPerBarang;
    }

    //inner class pemesanan
    public class Pemesanan {
        String namaPelanggan;
        String jenisBarang;
        int jumlahBarang;

        public Pemesanan(String namaPelanggan, String jenisBarang, int jumlahBarang) {
            this.namaPelanggan = namaPelanggan;
            this.jenisBarang = jenisBarang;
            this.jumlahBarang = jumlahBarang;
        }

        //method tampilkanDetailPemesanan
        public void tampilkanDetailPemesanan() {
        System.out.println("===== DETAIL PEMESANAN =====");
        System.out.println("Nama Pelanggan   : " + namaPelanggan);
        System.out.println("Jenis Barang     : " + jenisBarang);
        System.out.println("Jumlah Barang    : " + jumlahBarang);
        System.out.println("Jasa Lukis       : " + namaJasa);
        System.out.println("Deskripsi Jasa   : " + deskripsi);
        System.out.println("Harga per Barang : Rp " + hargaPerBarang);
        System.out.println("Total Bayar      : Rp " + (hargaPerBarang * jumlahBarang));
        System.out.println("============================");
        }
    }
}