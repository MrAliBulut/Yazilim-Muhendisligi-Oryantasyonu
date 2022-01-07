import java.util.Scanner;
class aralikliasalsayibulma{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Aralığın başlangıç değerini seçiniz");
        int baslangic = input.nextInt();
        System.out.println("Aralığın bitiş değerini seçiniz");
        int bitis = input.nextInt();
        int x=0;
        for(int i=baslangic ; i<=bitis ; i++){
            int alfa=0;
            for(int bolum=2 ; bolum<i; bolum++ ){
                if(i%bolum==0){
                    alfa++;
                }
            }
            if ( i==0 ){}
            else if ( i==1){}
            else if ( alfa ==0 ){
                System.out.println(i+" Değeri asal sayıdır.");
                x++;
            }
        }
        if (x==0){
            System.out.println("Aralıkta hiç asal sayı yoktur");
        }
        else {
            System.out.println("Girdiğiniz aralıkta "+x+" tane asal sayı vardır");
        }
    }
}