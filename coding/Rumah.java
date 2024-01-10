public class Rumah {
    public static void main(String[] args) {
        Rumah r = new Rumah();
        r.tampilLokasi();
        r.tampilUkuran(20, 9);
    }

    public void tampilUkuran(int panjang, int lebar) {
        int luas = panjang * lebar;
        System.out.println("Ukuran Rumah: " + luas);
    }

    public void tampilLokasi() {
        String alamat = "Gondanglegi";
        System.out.println("Lokasi Rumah: " + alamat);
    }

}
