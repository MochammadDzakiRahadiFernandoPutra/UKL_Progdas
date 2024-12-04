import java.util.Random;
import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
        
            int angka1 = random.nextInt(10) + 1;
            int angka2 = random.nextInt(10) + 1;
            int operator = random.nextInt(3);
            String soal;
            int jawabanBenar = 0;

            switch (operator) {
                case 0:
                    soal = angka1 + " * " + angka2 + " = ";
                    jawabanBenar = angka1 * angka2;
                    break;
                case 1:
                    angka2 = angka2 == 0 ? 1 : angka2;
                    soal = angka1 + " / " + angka2 + " = ";
                    jawabanBenar = angka1 / angka2;
                    break;
                case 2:
                    angka2 = angka2 == 0 ? 1 : angka2;
                    soal = angka1 + " % " + angka2 + " = ";
                    jawabanBenar = angka1 % angka2;
                    break;
                default:
                    soal = "Operasi tidak dikenal";
            }

            
            System.out.print(soal);

            
            int jawabanPengguna = scanner.nextInt();

            
            if (jawabanPengguna == jawabanBenar) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah. Jawaban yang benar adalah: " + jawabanBenar);
            }

            
            System.out.print("Apakah Anda ingin melanjutkan? (ya/tidak): ");
            String lanjutkanKuis = scanner.next();
            if (lanjutkanKuis.equalsIgnoreCase("tidak")) {
                System.out.println("Terima kasih sudah bermain!");
                break;
            }
        }

        scanner.close();
    }
}
