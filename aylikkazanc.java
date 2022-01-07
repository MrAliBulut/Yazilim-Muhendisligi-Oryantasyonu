import java.util.Scanner;
public class aylikkazanc {
    public static void main(String[] args){
        System.out.println("Merhaba sizinle aylık kazancınızı; yıllık, günlük ve saatlik olarak göstereceğiz."); // Aylar 30 gün yıl ise 30*12= 360 gün kabul edildi.
        Scanner input= new Scanner(System.in);
        int aylik= input.nextInt();
        int yillik= aylik*12;
        double günlük= aylik/30;
        double saatlik= günlük/24;
        System.out.println("Yıllık kazancınız= "+ yillik);
        System.out.println("Günlük kazancınız= "+ günlük);
        System.out.println("saatlik kazancınız= "+ saatlik);
    }
    
}
