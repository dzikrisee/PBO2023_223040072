package PERTEMUAN_12.Tugas;

public class InterfaceMain {
    public static void main(String[] args)  {
        SistemOtentikasi sistemOtentikasi = new SistemOtentikasi("abcdef123456");

        // Contoh penggunaan otentikasi
        System.out.println("Verifikasi Sidik Jari: " + sistemOtentikasi.verifikasiSidikJari("abcdef123456")); // Output: true
        System.out.println("Verifikasi Sidik Jari: " + sistemOtentikasi.verifikasiSidikJari("123456abcdef")); // Output: false
    }
}
