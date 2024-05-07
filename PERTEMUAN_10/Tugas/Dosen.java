package PERTEMUAN_10.Tugas;

public class Dosen extends Orang {
    private String nidn;

    public Dosen(String nidn, String nama, String alamat) {
        super(nama, alamat);
        setNidn(nidn);
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
}
