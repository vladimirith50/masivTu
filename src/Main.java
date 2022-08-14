public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //задача 1
        int nomer[] = new int[3];
        nomer[0] = 1;
        nomer[1] = 2;
        nomer[2] = 3;
        for (int i = 0; i < nomer.length; i++) {
            System.out.println(nomer[1]);
        }

        double masiv[] = {1.57, 7.654, 9.986};
        System.out.println(masiv[2]);

        int zero[] = new int[10];
        zero[2] = 15;
        zero[4] = 8;
        zero[7] = 4;
        System.out.println("килограмм фруктов" + zero[2]);

        //задание 2
        for (int i = 0; i < masiv[2]; i++) {
            System.out.println(masiv[2]);
            if (i != masiv.length - 1) {
                System.out.println("цифра" + masiv[2]);

            }
        }
        for (int i = 0; i < masiv[1]; i++) {
            System.out.println(masiv[1]);
            if (i != masiv.length - 1) {
                System.out.println("цифра" + masiv[1]);
            }
        }
        for (int i = 0; i < masiv[0]; i++) {
            System.out.println(masiv[0]);
            if (i != masiv.length - 1) {

            }
        }

        //задание 3

        for (int i = masiv.length - 1; i >= 0; i--) {
            System.out.println("номео" + masiv[1]);


        }
        //задание 4
        for (int i = 0; i < masiv.length; i++) {
        if( masiv[1] % 2==1){
           masiv[1]++;
            System.out.println("округление"+masiv[1]);
       if(i!=masiv[1]-1){
           System.out.println(masiv);
       }

        }
            }
        }
    }





