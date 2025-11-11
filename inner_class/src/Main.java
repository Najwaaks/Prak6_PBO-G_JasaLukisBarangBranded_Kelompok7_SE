package inner_class.src;
import inner_class.src.inner_class.JasaLukis;
import inner_class.src.inner_class.JasaLukis.Pemesanan;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== JASA LUKIS BARANG BRANDED ===");
        
        JasaLukis jasa1 = new JasaLukis("Lukis Sepatu", "Lukisan custom dengan cat tahan air", 150000);
        JasaLukis jasa2 = new JasaLukis("Lukis Tas", "Lukisan custom dengan cat tahan air", 200000);
    
        Pemesanan pesanan1 = jasa1.new Pemesanan("Najwa", "Sepatu Nike", 2);
        Pemesanan pesanan2 = jasa2.new Pemesanan("Nadia","Tas Dior", 2);

        pesanan1.tampilkanDetailPemesanan();
        pesanan2.tampilkanDetailPemesanan();
        
        System.out.println("=== TERIMA KASIH TELAH BERBELANJA! ===");
    }
}