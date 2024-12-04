import java.util.Scanner;

public class No2 {
    
    public static double hitungVolumeTabung(double radius, double tinggi) {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }

    public static void main(String[] args) {
        
    
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari alas tabung (dalam cm): ");
        double radius = Scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung (dalam cm): ");
        double tinggi = Scanner.nextDouble();


        double volume = hitungVolumeTabung(radius, tinggi);

        System.out.printf("Volume tabung dengan jari-jari %.2f cm dan tinggi %.2f cm adalah: %.2f cm³%n", radius, tinggi, volume);

        Scanner.close();
    }
}
