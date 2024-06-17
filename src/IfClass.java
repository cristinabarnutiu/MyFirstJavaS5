public class IfClass {
    public static void main(String[] args) {
        int time = 8;

        if (time > 24 || time < 0) {
            System.out.println("incorrect time");
        } else if (time > 18) {
            System.out.println("Good evening!");
        } else if (time > 12) {
            System.out.println("Good day!");
        } else System.out.println("Good morning!");

        int dayNumber = 9;

        switch (dayNumber) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Ziua nu este valida");

        }

        char gender = 'f';
        boolean married = false;

        if (gender == 'm') {
            System.out.println("Domnul");

        } else if (gender == 'f') {
            if (married) {
                System.out.println("Doamna");
            } else System.out.println("Domnisoara");
        }

        int x = 9;
        int y = 16;
        int z = 33;

        if (x > y) {
            System.out.println(x + " este mai mare decat " + y);
        } else if (x < y) {
            System.out.println(y + " este mai mare decat " + x);
        } else System.out.println(x + " este egal cu " + y);

        int max = x;

        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }
        System.out.println("cel mai mare numar dintre cele 3 este " + max);

        char letter = 'u';

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("vocala");
        } else System.out.println("consoana");




   /* Happy birthday to you
   Happy birthday to you
   Happy birthday dear Gabriel
   Happy birthday to you

   Happy birthday to you
   Happy birthday to you
   Happy birthday dear Gabriel
   Happy birthday to you
    */

        String happyBirthday = "Happy birthday to you";
        String happyBirthdayDearGabriel = "Happy birthday dear Gabriel";

        for(int i=0; i<2;i++) { //repeta strofa de 2 ori
            for (int j = 0; j < 4; j++) { //repeta versurile
                if(j==2){
                    System.out.println(happyBirthdayDearGabriel);
                }
                else System.out.println(happyBirthday);
            }
            System.out.println();
        }




    }
}
