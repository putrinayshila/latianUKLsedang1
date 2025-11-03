import java.util.Scanner;

public class soalsedang1 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input bilangan dari pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        // Validasi agar bilangan positif
        if (n < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long faktorial = 1; // gunakan long agar bisa menampung nilai besar

            // Perulangan untuk menghitung faktorial
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }

            // Tampilkan hasil
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }

        input.close();
    }
}


