import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        final int TARIF_PER_KG_10KM = 4250;
        final int TARIF_PER_KG_LEBIH_10KM = 6000;
        final int BIAYA_ADDITIONAL = 200;
        final int BATAS_VOLUME = 100;


        System.out.print("Masukkan berat paket (dalam kg): ");
        double beratPaket = scanner.nextDouble();

    
        System.out.print("Masukkan panjang paket (dalam cm): ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar paket (dalam cm): ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi paket (dalam cm): ");
        double tinggi = scanner.nextDouble();

        
        double volumePaket = panjang * lebar * tinggi;


        System.out.print("Masukkan jarak pengiriman (dalam km): ");
        double jarak = scanner.nextDouble();

    
        double biayaPengiriman;
        if (jarak <= 10) {
            biayaPengiriman = beratPaket * TARIF_PER_KG_10KM;
        } else {
            biayaPengiriman = beratPaket * TARIF_PER_KG_LEBIH_10KM;
        }


        if (volumePaket > BATAS_VOLUME) {
            biayaPengiriman += BIAYA_ADDITIONAL;
            System.out.println("Biaya tambahan Rp 50.000 dikenakan karena volume paket melebihi 100 cm³ .");
        }
        if (volumePaket > BATAS_VOLUME) {
            biayaPengiriman += BIAYA_ADDITIONAL;
            System.out.println("Biaya tambahan Rp 100.000 dikenakan karena volume paket melebihi 200 cm³ .");
        }
        

        System.out.printf("Biaya pengiriman total: Rp %.2f%n", biayaPengiriman);
        
        scanner.close();
        }
    }
