/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun.ruang;

/**
 *
 * @author Elang
 */
public class main {
    
 
   public static void main(String[] args) {
    // TODO code application logic here
    //kubus
    kubus kotak = new kubus (5);
    kotak.ComputeandSetvolume();
    System.out.println("kubus dengan sisi"+kotak.sisi+" adalah "+kotak.getvolume());
    //balok
    balok lok = new balok (5,4,3);
    lok.ComputeandSetvolume();
    System.out.println("balok dengan lebar"+lok.lebar+",tinggi "+lok.tinggi+",dan panjang "+lok.panjang+"  adalah "+lok.getvolume());
    //tabung
    tabung bung = new tabung (7,10);
     bung.ComputeandSetvolume();
    System.out.println("tabung dengan tinggi"+bung.tinggi+", radius "+bung.radius+" adalah "+bung.getvolume());
    //limas
    limassegiempat limas = new limassegiempat (7,10);
     limas.ComputeandSetvolume();
    System.out.println("limassegiempat dengan sisi"+limas.sisi+", tinggi "+limas.tinggi+" adalah "+limas.getvolume());
    //bola
    bola bulat = new bola (7);
     bulat.ComputeandSetvolume();
    System.out.println("bola dengan bulat"+bulat.radius+" adalah "+bulat.getvolume());
    int [] ratarata_volume = {kotak.getvolume(),lok.getvolume(),bung.getvolume(),limas.getvolume(),bulat.getvolume()};
   int hasil_rata = 0;
   for (int z : ratarata_volume) {
    hasil_rata += z;
     hasil_rata = hasil_rata/5;
  System.out.println ("hasil rata rata volume = "+hasil_rata);
}
   
 

   }
   }
