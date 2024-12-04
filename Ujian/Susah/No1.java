import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0.");
        } else {
            double[] nilaiUjian = new double[jumlahSiswa];
            double totalNilai = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                System.out.print("Masukkan nilai ujian untuk siswa ke-" + (i + 1) + ": ");
                nilaiUjian[i] = scanner.nextDouble();
                totalNilai += nilaiUjian[i];
            }

            double rataRata = totalNilai / jumlahSiswa;

            System.out.printf("Rata-rata nilai ujian Produktif RPL dari %d siswa adalah: %.2f%n", jumlahSiswa, rataRata);
        }

        scanner.close();
    }
}
