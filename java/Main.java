package lab0.java;

import java.util.Scanner;

// Run using Ctrl + Shift + B to build, Ctrl + F5 to run
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        taskOne(scanner);
        taskTwo(scanner);

        scanner.close();
    }

    public static void taskOne(Scanner scanner) {

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Nilai Asli: ");
        int nilai_asli = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan Durasi: ");
        int durasi = scanner.nextInt();
        scanner.nextLine();

        double nilai_akhir;

        if (durasi < 60) {
            nilai_akhir = 1.2 * nilai_asli;
        } else if (60 <= durasi && durasi <= 70) {
            nilai_akhir = nilai_asli;
        } else if (70 < durasi && durasi < 90) {
            nilai_akhir = 0.75 * nilai_asli;
        } else if (90 <= durasi && durasi <= 100) {
            nilai_akhir = 0.5 * nilai_asli;
        } else {
            nilai_akhir = 0.2 * nilai_asli;
        }

        System.out.println(nama + " mendapatkan nilai akhir " + nilai_akhir);
    }

    public static void taskTwo(Scanner scanner) {

        System.out.println("Masukkan bilangan utama (n): ");
        int n = scanner.nextInt();
        System.out.println("Masukkan bilangan pemangkatan (m): ");
        int m = scanner.nextInt();

        // Factorial
        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }

        // Pemangkatan
        int pemangkatan = 1;
        for (int i = 0; i < m; i++) {
            pemangkatan *= n;
        }

        System.out.println("Hasil faktorial dari " + n + " adalah " + factorial);
        System.out.println("Hasil pemangkatan dari " + n + " pangkat " + m + " adalah " + pemangkatan);
    }
}