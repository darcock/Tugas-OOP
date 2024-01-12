import java.util.Scanner;
public class drone {
    public static void main(String[] args) {
        Drone_ drone = new Drone_();
        Scanner scan = new Scanner(System.in);
        int aksi;
        drone.energi = 100;
        drone.ketinggian = 0;

        System.out.print("Masukan merek drone : ");
        drone.merek = scan.nextLine();
        System.out.print("Masukan kecepatan : ");
        drone.kecepatan = scan.nextInt();
        System.out.println("Jalankan Aksi!");
        System.out.println("1. Nyalakan\n2. Naik\n3. Turun\n4. Belok kanan\n5. Belok kiri\n6. Maju\n7. Mundur\n8. Matikan");

        for (int i = 0; i < 8; i++){
            System.out.print("Aksi : ");
            aksi = scan.nextInt();
            if (aksi == 1){
                drone.nyala();
            }
            else if (aksi == 2){
                drone.naik();
            }
            else if (aksi == 3){
                drone.turun();
            }
            else if (aksi == 4){
                drone.belok_kanan();
            }
            else if (aksi == 5){
                drone.belok_kiri();
            }
            else if (aksi == 6){
                drone.maju();
            }
            else if (aksi == 7){
                drone.mundur();
            }
            else if (aksi == 8){
                drone.matikanMesin();
            }
            else {
                System.out.println("Aksi tidak ditemukan");
            }
        }
    }
}

class Drone_ {
    String merek;
    int energi;
    int ketinggian;
    int kecepatan;
        
    void nyala(){
        energi--;
        if(energi > 10){
            ketinggian++;
            System.out.println("Drone " +merek+ " telah aktif.");
        } 
        else {
            System.out.println("Energi lemah : Drone "+merek+" nggak bisa aktif");
        }
        }
    
        void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        } 
        else {
            System.out.println("Mesin dimatikan...");
        }
    }

    void naik(){
        ketinggian += 10;
        System.out.println("Drone " +merek+ " naik");
        System.out.println("Ketinggian : " + ketinggian);
    }
    
    void turun(){
        ketinggian -= 10;
        System.out.println("Drone "+merek+ " turun");
        System.out.println("Ketinggian : " + ketinggian);
    }
    
    void belok_kanan(){
        energi -= 10;
        System.out.println("Drone " + merek+" belok ke kanan");
    }

    void belok_kiri(){
        energi -= 10;
        System.out.println("Drone "+merek+" belok ke kiri");
    }
        
    void maju(){
        energi -= 10;
        System.out.println("Drone "+merek+" maju ke depan");
        System.out.println("Kecepatan : " + kecepatan);
        kecepatan += 10;
    }
    
    void mundur(){
        energi -= 10;
        System.out.println("Drone " +merek+ " mundur");
        System.out.println("Kecepatan : " + kecepatan);
        kecepatan -= 10;
    }
}
