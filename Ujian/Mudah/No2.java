
import java.util.Scanner;

public class Ganjilgenap {

    public static void main(String[] args) {
        System.out.println("Program menentukan bilangan ganjil atau genap");
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil");
        }
    }
}
