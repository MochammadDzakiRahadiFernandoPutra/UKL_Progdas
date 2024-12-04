import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Faktorial dari " + number + " adalah: " + factorial);
        }

        scanner.close();
    }
}
