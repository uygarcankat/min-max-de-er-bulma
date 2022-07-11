import java.util.Scanner;


public class Min_Max {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz:");

        int numbers = input.nextInt();

        int i;
        long value_1 = 0;
        long value_last = 0;
        long kucuk;
        kucuk = value_last;
        long old=0;
        int x=1;

            System.out.println("1. Sayıyı giriniz:");

            value_1 = input.nextInt();


        for(i=2; i<= numbers ; i++) {

            System.out.println(i + " . Sayıyı giriniz:");

            value_last = input.nextInt();


            if((value_1 <value_last)&& (x==1) ){
               old =value_1;
              x++;

            }

            else if ((value_last <value_1)&& (x==1) ){
                old=value_last;
               x++;
            }



            if(value_1 <value_last) {

                kucuk = value_1;

                if (old < kucuk) {
                    kucuk = old;
                }

                value_1 = value_last;
            }

                else{

                    kucuk = value_last;

                if (old < kucuk) {
                    kucuk = old;
                }

                value_last= value_1;

                }
        }

        System.out.println("en büyük :" + value_last);

        System.out.println("kucuk :"  + kucuk);

    }
}

