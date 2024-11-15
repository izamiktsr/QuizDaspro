import java.util.Scanner;

public class RataRataNilaiUjian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah siswa dan mata pelajaran
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah mata pelajaran: ");
        int jumlahMataPelajaran = scanner.nextInt();
        
        // Membuat array untuk menyimpan nilai siswa
        double[][] nilaiSiswa = new double[jumlahSiswa][jumlahMataPelajaran];
        
        // Input nilai siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan nilai untuk Siswa ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahMataPelajaran; j++) {
                System.out.print("Nilai Mata Pelajaran ke-" + (j + 1) + ": ");
                nilaiSiswa[i][j] = scanner.nextDouble();
            }
        }
        
        // Menghitung rata-rata nilai untuk setiap siswa
        System.out.println("\nRata-rata Nilai Siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            double totalNilai = 0;
            for (int j = 0; j < jumlahMataPelajaran; j++) {
                totalNilai += nilaiSiswa[i][j];
            }
            double rataRataSiswa = totalNilai / jumlahMataPelajaran;
            System.out.printf("Rata-rata Siswa ke-%d: %.2f\n", (i + 1), rataRataSiswa);
        }
        
        // Menghitung rata-rata nilai untuk setiap mata pelajaran
        System.out.println("\nRata-rata Nilai Mata Pelajaran:");
        for (int j = 0; j < jumlahMataPelajaran; j++) {
            double totalNilai = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalNilai += nilaiSiswa[i][j];
            }
            double rataRataMataPelajaran = totalNilai / jumlahSiswa;
            System.out.printf("Rata-rata Mata Pelajaran ke-%d: %.2f\n", (j + 1), rataRataMataPelajaran);
        }
        
        // Menutup scanner
        scanner.close();
    }
}