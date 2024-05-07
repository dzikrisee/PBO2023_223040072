package PERTEMUAN_10.Tugas;

public class InheritanceMain {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen = new Dosen("1234567890", "Dzikri Setiawan", "Bandung");
        
        // Menampilkan informasi dosen
        System.out.println("NIDN: " + dosen.getNidn() +
                "\nNama: " + dosen.getNama() +
                "\nAlamat: " + dosen.getAlamat());
    }
}