import java.util.Scanner;
public class cember {
    public static void main(String[] args){
        System.out.println("Merhaba bugün sizinle çapını girdiğiniz çemberin çevresini/1 dönme ile gidebileceği uzaklığı bulacağız");
        Scanner input=new Scanner(System.in);
        double cap= input.nextDouble();
        double yaricap=cap/2;
        double pi=3.14;
        double cevre=(2*pi*yaricap*yaricap);
        System.out.println("Çemberin çevresi ve 1 tam tur ile alabileceği mesafe= "+cevre);
    }
}
