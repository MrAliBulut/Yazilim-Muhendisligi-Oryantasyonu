import java.util.Scanner;
public class ikinciderecedendenklem {
    public static void main(String[] args){
        System.out.println("Merhaba bugün sizlerle katsayılarını girdiğiniz ikinci dereceden denklemin köklerini bulacağız");
        System.out.println("2. dereceden x in katsayısını giriniz");
        Scanner input=new Scanner(System.in);
        double a= input.nextDouble();
        System.out.println("1. dereceden x in katsayısını giriniz");
        double b= input.nextDouble();
        System.out.println("Denklemin sabit değerini giriniz.");
        double c= input.nextDouble();
        double delta=(b*b)-(4*a*c);
        if( delta>0){
            double kök1= (b*(-1) + Math.sqrt(delta)/2*a);
            double kök2= (b*(-1) - Math.sqrt(delta))/(2*a);
            System.out.println("Denkleminizin 2 kökü vardır ve bunlar= "+kök1+" ve "+kök2);
        }
        else if ( delta ==0){
            double kök=(b*(-1))/(2*a);
            System.out.println("Denkleminizin tek kökü vardır ve bu= "+kök);
        }
        else {
            System.out.println("Denkleminizin kökü yoktur.");
        }
    }
}
