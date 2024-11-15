import java.util.Scanner;

public class DaftarNamaMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline setelah nextInt
        
        // Membuat array untuk menyimpan nama mahasiswa
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        
        // Input nama mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
        }
        
        // Output daftar nama mahasiswa
        System.out.println("\nDaftar Nama Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println((i + 1) + ". " + namaMahasiswa[i]);
        }
        
        // Menutup scanner
        scanner.close();
    }
}