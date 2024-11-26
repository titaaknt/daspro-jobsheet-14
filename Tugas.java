import java.util.Scanner;

public class Tugas {
    public static int totalIterative(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static int totalRecursive(int[] numbers, int length) {
        if (length == 0) {
            return 0;
        }
        return numbers[length - 1] + totalRecursive(numbers, length - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = n; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            numbers[n - i] = scanner.nextInt();
        }

        int total = totalIterative(numbers);

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + total);

    }
}