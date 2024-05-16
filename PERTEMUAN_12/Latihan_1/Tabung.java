package PERTEMUAN_12.Latihan_1;

public class Tabung extends Bentuk {

    private int tinggi;
    
    public Tabung(int jari2, int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    
    }
    
    public double luas()
    {
        return 2*PHI*jari2*(jari2+tinggi);
    }
    
    // setter & Getter
    
    public int getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}