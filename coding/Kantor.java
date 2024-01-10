import java.util.Scanner;

public class Kantor {
    Scanner acan = new Scanner(System.in);
    public void tampilNama(String nama){
        System.out.println("Saya bekerja di: "+nama);
    }
    public void tampilLokasi(){
        String alamat = "Ds Pagelaran";
        System.out.println("Lokasi kantor: "+ alamat);
    }
    public void tampilKerja(){
        String pekerjaan = "Bidan";
        System.out.println("Bekerja sebagai: "+pekerjaan);
    }
}
