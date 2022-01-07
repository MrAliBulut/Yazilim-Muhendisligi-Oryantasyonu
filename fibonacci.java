import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        System.out.println("Merhaba bugün sizinle girdiğiniz değer kadar Fibonacci sayılarını yazacağız.");
        Scanner input= new Scanner(System.in);
        int sayi= input.nextInt();
        int birinci= 1;
        int ikinci = 1;
        int yeni=0;
        if (sayi==1){
           System.out.print(birinci);
        }
        else if (sayi==2){
           System.out.print(birinci+" "+ikinci);
        }
        else if (sayi>2) {
            System.out.print(birinci+" "+ikinci+" ");
            for(int i=3;i<=sayi;i++){
                yeni =birinci+ ikinci;
                birinci=ikinci;
                ikinci=yeni;
                System.out.print(yeni+" ");
           }
        }
        else{ 
            System.out.print("Bu değer ile hiç fibonacci sayısı yazamazsınız");
        }
      
    }
}
