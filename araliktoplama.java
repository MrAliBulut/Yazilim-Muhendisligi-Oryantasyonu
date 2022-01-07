import java.util.Scanner;
public class araliktoplama { 
    public static void main(String args[]){
        System.out.println("Merhaba bugün sizinle girdiğiniz aralıktaki değerleri toplayacağız");
        System.out.println("Aralığın başlangıç değerini giriniz.");
        Scanner input= new Scanner(System.in);
        int baslangic= input.nextInt();
        System.out.println("Aralığın bitiş değerini giriniz.");
        int bitis =input.nextInt();
        int toplam=0;
        int i=0;
        while(baslangic<=bitis){
            toplam=baslangic+toplam;
            baslangic++;
            i++;
        }
        System.out.println(i+" değeri topladık ve sonucumuz= "+toplam);
    }
}
