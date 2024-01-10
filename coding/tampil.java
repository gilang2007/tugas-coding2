public class tampil {
    public static void main(String[] args) {
        Rumah r = new Rumah();
        Kantor k = new Kantor();
        System.out.println("DATA RUMAH");
        r.tampilLokasi();
        r.tampilUkuran(20, 9);
        System.out.println("DATA PEKERJAAN");
        k.tampilNama("Puskesmas");
        k.tampilLokasi();
        k.tampilKerja();
    }

}
