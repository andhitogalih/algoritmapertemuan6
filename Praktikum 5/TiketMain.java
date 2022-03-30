import java.util.Scanner;
public class TiketMain {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            TiketService Prak = new TiketService();
    
            Tiket tkt1 = new Tiket("Lion Air", 500000, "Surabaya", "Semarang");
            Tiket tkt2 = new Tiket("Garuda Indonesia", 350000, "Surabaya", "Malang");
            Tiket tkt3 = new Tiket("Garuda Indonesia", 450000, "Pekanbaru", "Surabaya");
            Tiket tkt4 = new Tiket("indonesia AirAsia", 360000, "Malang", "Jakarta");
            Tiket tkt5 = new Tiket("Batik Air", 570000, "Surabaya", "Yogyakarta");
    
            Prak.tambah(tkt1);
            Prak.tambah(tkt2);
            Prak.tambah(tkt3);
            Prak.tambah(tkt4);
            Prak.tambah(tkt5);

            char ulang = 'Y';
            do{
                System.out.println("");
                System.out.println(" DATA SEBELUM SORTING ");
                System.out.println("==========================================================");
                Prak.tampilAll();
                System.out.println("");
                System.out.println("Pilihan Sorting: ");
                System.out.println("1. Ascending ");
                System.out.println("2. Descending ");
                System.out.println("");
                System.out.print("Masukkan Pilihan: ");
                int pil = sc.nextInt();
                
                switch(pil){
                    case 1:
                    System.out.println("");
                    System.out.println("Pengurutan Besar ke Kecil (Ascending)");
                    System.out.println("");
                    System.out.println("Daftar Data Maskapai setelah sorting berdasarkan harga");
                    System.out.println("=========================================================");
                    Prak.bubbleSort();
                    Prak.tampilAll();
                    break;
                    case 2:
                    System.out.println("");
                    System.out.println("Pengurutan Kecil ke Besar (Descending)");
                    System.out.println("");
                    System.out.println("Daftar Data Maskapai setelah sorting berdasarkan harga");
                    System.out.println("==========================================================");
                    Prak.selectionSort();
                    Prak.tampilAll();
                    break;
                    
                    default:
                    System.out.println("Pilihan yang Anda masukkan salah!");
                }
                System.out.print("Apakah ingin sorting lagi? (Y/T) :");
                ulang = sc.next().charAt(0);
            }while(ulang == 'Y' || ulang == 'y');
            System.out.println("");
            System.out.println("TERIMA KASIH ");
        }
    }
