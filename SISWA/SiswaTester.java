// Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        // membuat Object
        // namaClass namaObject = new Constructor();
        Siswa sabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa felix = new Siswa();
        Siswa arya = new Siswa();
        Siswa widi = new Siswa();
        Siswa natanz = new Siswa();
        Siswa leonsius = new Siswa();


        sabrina.id = 32;
        sabrina.nama = "Sabrina";
        sabrina.ipk = 70.2;
        rasyid.id = 30;
        rasyid.nama = "Rasyid";
        rasyid.ipk = 83.3;
        felix.id = 14;
        felix.nama = "Felix";
        felix.ipk = 100.0;
        arya.id = 2;
        arya.nama = "Arya";
        arya.ipk = 97.9;
        widi.id = 34;
        widi.nama = "Widi";
        widi.ipk = 34.0;
        natanz.id = 27;
        natanz.nama = "Natanz";
        natanz.ipk = 100.0;
        leonsius.id = 18;
        leonsius.nama = "Leonsius";
        leonsius.ipk = 85.7;
        sabrina.print();
        rasyid.print();
        felix.print();
        arya.print();
        widi.print();
        natanz.print();
        leonsius.print();


        
    }
}
