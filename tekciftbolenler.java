import java.util.Scanner;
public class tekciftbolenler {
    public static void main(String[] args){
        System.out.println("Merhaba sizinle girdiğiniz değerin tek ve çift bölenlerini bulacağız.");
        Scanner input= new Scanner(System.in);
        int deger= input.nextInt();
        StringBuffer tek= new StringBuffer("Tek bölenlerimiz= ");
        StringBuffer cift=new StringBuffer("Çift bölenlerimiz= ");
        for(int i=1;i<=deger;i++){
            if(deger%i==0){
                if(i%2==0){
                    cift.append(i+" ");
                }
                else{
                    tek.append(i+" ");
                }
            }
        }
        System.out.println(tek);
        System.out.println(cift);
    }    
}
