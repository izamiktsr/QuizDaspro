public class NumberPyramid18 {
    public static void main(String[] args) {
        int n = 5; // Jumlah baris yang ingin ditampilkan

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Mencetak angka tanpa baris baru
            }
            System.out.println(); // Pindah ke baris berikutnya setelah mencetak satu baris
        }
    }
}