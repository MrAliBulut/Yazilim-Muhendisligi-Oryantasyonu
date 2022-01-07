import java.util.Scanner;
public class sinifnotlari {
    public static void main(String[] args){
        System.out.println("Merhaba bugün sizinle sınıfınızdaki öğrencilerin notlarını girip bu notların en yükseğini ve bu notların ortalamalarını bulacağız.");
        Scanner input= new Scanner(System.in);
        System.out.println("Sınıfınızdaki öğrenci sayısını giriniz.");
        int ogrencisayisi=input.nextInt();
        int notlar[]=new int[ogrencisayisi];
        System.out.println("Şimdi ise bu öğrencilerin notlarını giriniz.");
        for(int i=0; i<ogrencisayisi; i++){
            notlar[i]= input.nextInt();
            while(notlar[i]>100 || notlar[i]<0){
                System.out.println("Girdiğiniz değer geçersiz. Lütfen 0 ile 100 arası bir sayı giriniz");
                notlar[i]=input.nextInt();
            }
        }
        int maks= notlar[0];
        int ortalama=notlar[0];
        for(int j=1; j<ogrencisayisi; j++){
            if (notlar[j]>maks){
                maks= notlar[j];
            }
            ortalama= ortalama+notlar[j];
        }
        ortalama=ortalama/ogrencisayisi;
        System.out.println("Girdiğiniz notların en büyüğü= "+maks);
        System.out.println("Girdiğiniz notların ortalaması= "+ortalama);
    }
    
}
