package app_laundry;

import java.util.Scanner;

public class App_laundry {
         
	 public static void main(String[] args) {
		// Variable
	 	String nama, alamat,nope,jenis,paket,banyak,kurir; 
	 	int  harga,berat,ongkir, pengerjaan,total_hr;
                
                harga = 0;
                ongkir = 0;
                pengerjaan = 0;
                total_hr= 0;
                banyak = null;
                
                //scanner 
	 	Scanner key = new Scanner(System.in);

	 	//tampilan output 1
	 	System.out.println("----------------Cahyo Laundry-----------------");
                
                //scanner
	 	System.out.print("Nama      : ");
                nama = key.nextLine();
                
                System.out.print("Alamat    : ");
                alamat = key.nextLine();
                
                System.out.print("No HP     : ");
                nope = key.nextLine();
                
                System.out.println("");
                System.out.println("--------------Jenis Laundryan------------");
                System.out.println(" > Pakaian");
                System.out.println("    Harga/Kg Rp.12.000,-");
                System.out.println("        ---");
                System.out.println(" > Karpet");
                System.out.println("    Harga Semua Ukuran Rp.30.000,-");
                System.out.println("        ---");
                 System.out.println(" > Sepatu");
                System.out.println("    Harga/Pasang Rp.10.000,-");
                System.out.println("        ---");
                System.out.print("Jenis (Pakaian/Karpet/Sepatu): ");
                jenis = key.nextLine();
                
                if ("Pakaian".equalsIgnoreCase(jenis) ) {
                    harga = 12000;
                    banyak = " Kg ";
                    jenis = "Pakaian";
                }
                else if ("Karpet" .equalsIgnoreCase(jenis)){
                    harga = 30000;
                    banyak = " Pcs";
                    jenis = "Karpet";   
                }
                else if ("Sepatu" .equalsIgnoreCase(jenis)){
                    harga = 10000;
                    banyak = " Pasang";
                    jenis = "Sepatu";
                }
                
                System.out.print("Jumlah Laundryan      : ");
                berat = key.nextInt();
                
                System.out.println("------------Lama Pengerjaan------------");
                System.out.println(" > Reguler");
                System.out.println("    Tanpa Biaya tambahan");
                System.out.println("        ---");
                System.out.println(" > Express");
                System.out.println("    Harga Paket Express 35% dari Harga laundry");
                System.out.println("        ---");
                System.out.print(" Pengerjaan (Reguler/Express)  : ");
                paket = key.next();
                
                if ("reguler".equalsIgnoreCase(paket) ) {
                    pengerjaan = 0;
                    paket = "Reguler";
                }
                
                else if ("express" .equalsIgnoreCase(paket)){
                     pengerjaan = ((harga*berat*35)/100);
                     paket = "Express";
                }
                else{
                    pengerjaan = 0;
                    paket = "Reguler";
                }
                
                System.out.println("");
                System.out.println("------------Ingin Mengunakan Jasa Pengriman ?------------");
                System.out.print("     >(y/t)<      : ");
                kurir = key.next();
                
                if ("Y".equalsIgnoreCase(kurir) ) {
                    ongkir = 14000;
                }
                
                else if ("T" .equalsIgnoreCase(kurir)){
                     ongkir = 0;
                }
                else {
                    ongkir = 0;
                }
                //operator aritmatika
                total_hr = harga*berat+pengerjaan+ongkir;
                // out print invoice
                System.out.println("");
                System.out.println("------------Cahyo Laundry--------------");
                System.out.println("--------------Invoice------------------");
                System.out.println("Nama             : " + nama);
                System.out.println("Alamat           : " + alamat);
                System.out.println("NO HP            : " + nope);
                System.out.println("Jenis Laundryan  : " + jenis);
                System.out.println("Jenis Pengerjaan : " + paket);
                System.out.println("Jumlah Laundryan : " + berat + banyak);
                System.out.println("Harga Pengerjaan : Rp." + pengerjaan+",-");
                System.out.println("Ongkos Kirim     : Rp." + ongkir +",-");
                System.out.println("Total Harga      : Rp." + total_hr +",-");

                
                
         }         
      

}