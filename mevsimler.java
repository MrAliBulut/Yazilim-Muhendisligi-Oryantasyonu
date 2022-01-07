import java.util.Scanner;
public class mevsimler {
    public static void main(String[] args){
        System.out.println("Merhaba bugün sizlerle bulunduğunuz ayın mevsimini yazacağız.");
        Scanner input= new Scanner(System.in);
        String mevsimler[]={"Kış","İlkbahar","Yaz","Sonbahar"};
        String ay= input.nextLine();
        if(ay.equals("Aralık")){
            System.out.println("Bulunduğunuz mevsim= "+mevsimler[0]);
        }
        else if(ay.equals("Ocak")){
            System.out.println("Bulunduğunuz mevsim= "+mevsimler[0]);
        }
        else if(ay.equals("Şubat")){
            System.out.println("Bulunduğunuz mevsim= "+mevsimler[0]);
        }
        else if(ay.equals("Mart")){
            System.out.println("Bulunduğunuz mevsim= "+mevsimler[1]);
        }
        else if(ay.equals("Nisan")){
            System.out.println("Bulunduğunuz mevsim= "+mevsimler[1]);
        }
        else if(ay.equals("Mayıs")){
            System.out.println("Bulunduğunuz mevsim= "+mevsimler[1]);
        }
        else if(ay.equals("Haziran")){
            System.out.println("Bulunduğunuz mevsim= "+mevsimler[2]);
        }
        else if(ay.equals("Temmuz")){
            System.out.println("Bulunduğunuz mevsim= "+mevsimler[2]);
        }
        else if(ay.equals("Ağustos")){
            System.out.println("Bulunduğunuz mevsim= "+mevsimler[2]);
        }
        else if(ay.equals("Eylül")){
            System.out.println("Bulunduğunuz mevsim= "+mevsimler[3]);
        }
        else if(ay.equals("Ekim")){
            System.out.println("Bulunduğunuz mevsim= "+mevsimler[3]);
        }
        else if(ay.equals("Kasım")){
            System.out.println("Bulunduğunuz mevsim= "+mevsimler[3]);
        }
        else {
            System.out.println("Girdiğiniz değer mevsimlerle alakasız");
        }
    }
}

