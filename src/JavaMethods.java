import java.sql.SQLOutput;

public class JavaMethods {
    public static void main(String[] args) {
        afiseazaCeva();
        afiseazaCeva();
        afiseazaCeva();
        helloNume("Mihail");
        helloNume("Raluca");
        helloNumber(4);
        helloNumber(10);
        afiseazaNumeVarsta("Andrei",8);
        afiseazaNumeVarsta("Ana", 10);
        calculeazaSuma(5,10);
        calculeazaSuma(6,9);
        calculeazaDiferenta(20,8);
        calculeazaProdus(10,8);
        calculeazaSuma(2.5,9.0);
        metoda1();
        metoda1("Un nume");
        metoda1("Un nume", "Alt nume");
        learning2Code("Java");
        learning2Code("Python");
        learning2Code("JavaScript");
        learning2Code("C++");
        aflaNumarulMaiMare(23856,2539387);
        lungimeaCuvantului("Abracadabra");
        vocalaSauConsoana("Raluca");
        vocalaSauConsoana("Alexandru");
        varsta(13);
        varsta(30);
        varsta(100);
        vocalaSauConsoanaCuFor("Raluca");
        vocalaSauConsoanaCuFor("Alexandru");
        myMethod(5);
        myMethod("5");
        System.out.println(sum(5,10));
        System.out.println(concatenateTwoStrings("String A","String B"));
        System.out.println(aDouaLitera("Java"));

    }

    private static void afiseazaCeva(){
        System.out.println("Hello World!");
    }

    private static void helloNume(String nume){
        System.out.println("Hello "+nume);
    }

    private static void helloNumber(int number){
        System.out.println("Hello "+number);
    }

    private static void afiseazaNumeVarsta(String nume, int varsta){
        System.out.println("Ma numesc "+nume+" si am "+varsta+" ani");
    }

    private static void calculeazaSuma(int x, int y){
        System.out.println(x+y);
    }
    private static void calculeazaDiferenta(int x, int y){
        System.out.println(x-y);
    }
    private static void calculeazaProdus(int x, int y){
        System.out.println(x*y);
    }

    private static void calculeazaSuma(double x, double y){
        System.out.println(x+y);
    }

    private static void metoda1(){
        System.out.println("metoda1");
    }

    private static void metoda1(String nume){
        System.out.println("metoda1 cu nume");
    }

    private static void metoda1(String nume1, String nume2){
        System.out.println("metoda1 cu doua nume");
    }

    //Ex 2
    private static void learning2Code(String limbajProgramare){
        System.out.println("It’s easy to learn "+limbajProgramare);
    }

    private static void aflaNumarulMaiMare(int x, int y){
        int nrMaiMare;
        if(x>y){nrMaiMare=x;}
        else nrMaiMare=y;
        System.out.println("numarul mai mare este: "+nrMaiMare);
//        if (x>y){
//            System.out.println(x);
//        }else System.out.println(y);
    }

    private static void lungimeaCuvantului(String cuvant) {
        int lungime = cuvant.length();
        System.out.println("lungimea cuvantului este: "+lungime);
    }

    //Ex 5
    private static void vocalaSauConsoana(String cuvant){
        String cuvantCuLitereMici = cuvant.toLowerCase();
        if (cuvantCuLitereMici.charAt(0)=='a' ||
                cuvantCuLitereMici.charAt(0)=='e' ||
                cuvantCuLitereMici.charAt(0)=='i' ||
                cuvantCuLitereMici.charAt(0)=='o' ||
                cuvantCuLitereMici.charAt(0)=='u'){
            System.out.println(cuvant+" incepe cu vocala");
        } else System.out.println(cuvant+" incepe cu consoana");
    }

    //Ex 5 - varianta cu for
    private static void vocalaSauConsoanaCuFor(String cuvant){
        char primaLitera = cuvant.toLowerCase().charAt(0);
        char vocale[] = {'a','e','i','o','u'};
        for (char v:vocale){
            if (primaLitera==v){
                System.out.println(cuvant+" incepe cu vocala"); break;
            }else System.out.println(cuvant+" incepe cu consoana"); break;
        }
    }

    //Ex 6
    private static void varsta(int varsta){
        if (varsta<18){
            System.out.println("to young");
        }
        else if (varsta >=18 && varsta <60){
            System.out.println("just fine");
        }
        else System.out.println("too old");
    }

    private static void myMethod(String a){
        System.out.println("1");
    }
    private static void myMethod(int a){
        System.out.println("2");
    }

    //metode cu return
    private static int sum(int a, int b){
        //int sum = a+b;
        return a+b;
    }

    private static String concatenateTwoStrings(String a, String b){
        //String concat = a+b;
        return a+b;
    }

    private static char aDouaLitera(String cuvant){
        return cuvant.charAt(1);
    }


}
