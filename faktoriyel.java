import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args){
        System.out.println("Merhaba bugün sizinle girdiğiniz değerin faktöriyelini bulacağız.");
        Scanner input= new Scanner(System.in);
        int deger= input.nextInt();
        int sonuc=1;
        for(int i =1;i<=deger;i++){
            sonuc=i*sonuc;
        }
        System.out.println("Faktöriyelin sonucu= "+sonuc);
    }
    
}
