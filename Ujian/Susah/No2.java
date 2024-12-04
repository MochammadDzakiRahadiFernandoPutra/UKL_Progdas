import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner hzl = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = hzl.nextInt();
        int[] array = new int[n];
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = hzl.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int c = 1;
            if (array[i] != -1) {
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        c++;
                        array[j] = -1;
                    }
                }
                System.out.println(array[i] + " muncul " + c + " kali");
            }
        }
        hzl.close();
    }
}