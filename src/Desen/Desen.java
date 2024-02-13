package Desen;
import java.util.Scanner;
public class Desen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        desen(n); // Call the desen function with the input value
    }

    static void desen(int n) {
        int sayi = n;

        while (sayi >= 0) {
            System.out.println(sayi);
            sayi -= 5;
        }

        while (sayi < n) {
            System.out.println(sayi);
            sayi += 5;
        }
    }
}