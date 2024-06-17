public class ExercitiiMetode {
    public static void main(String[] args) {
        System.out.println(returneazaInvers(4));
        System.out.println(returneazaInvers(-3));
        System.out.println(returneazaInvers(0));
        System.out.println(returneazaMaximulDintreDouaNumere(8,9));
        System.out.println(returneazaMaximulDintreDouaNumere(18,9));
        System.out.println(returneazaMediaAritmetica(9,9,10));
        System.out.println(returneazaLungimeString("Abcdefg"));
        System.out.println(returneazaInversulUnuiString("cuvant"));
        System.out.println(returneazaDacaENrPar(6));
        System.out.println(returneazaAntotimpul(""));
        System.out.println(returneazaMaximulAPatruNr(-9,88,3,197));
        System.out.println(returneazaCaractereleDinMijloc("cuvant"));
        System.out.println(returneazaSumaCifrelor(-82754));

    }

    //Ex. 1
    private static int returneazaInvers(int numar){
        //int invers = -numar;
       // return invers;
        return -numar;
    }

    //Ex 2
    private static int returneazaMaximulDintreDouaNumere(int x, int y){
        int max;
        if (x>y){max = x;}
        else max=y;
        return max;
    }

    //Ex 3
    private static double returneazaMediaAritmetica(int x, int y, int z){
        return (x+y+z)/3.0;
    }

    //Ex. 4
    private static int returneazaLungimeString(String cuvant){
        return cuvant.length();
    }

    //Ex 5
    private static String returneazaDouaStringuriConcatenate(String a, String b){
        //return a.concat(b);
        return a+b;
    }

    //Ex 6
    private static String returneazaInversulUnuiString (String cuvant){
        String invers = "";
        int lungimeaStringului = cuvant.length();

        for (int i = lungimeaStringului-1; i>=0;i--){
            invers = invers+cuvant.charAt(i);
        }

//        for (int i = 1; i<=lungimeaStringului;i++){
//            invers = invers+cuvant.charAt(lungimeaStringului-i);
//        }
        return invers;
    }

    //Ex optional 2
    public static boolean returneazaDacaENrPar(int numar){
//        boolean par = false;
//        if(numar%2==0){
            return numar%2==0;

    }

    public static String returneazaAntotimpul(String luna){
        String anotimp;
        if(luna.equalsIgnoreCase("martie")||
                luna.equalsIgnoreCase("aprilie")||
                luna.equalsIgnoreCase("mai"))
        {
            anotimp="primavara";
        }
        else if(luna.equalsIgnoreCase("iunie")||
                luna.equalsIgnoreCase("iulie")||
                luna.equalsIgnoreCase("august"))
        {
            anotimp="vara";
        }
        else if(luna.equalsIgnoreCase("septembrie")||
                luna.equalsIgnoreCase("octombrie")||
                luna.equalsIgnoreCase("noiembrie"))
        {
            anotimp="toamna";
        }
        else if(luna.equalsIgnoreCase("decembrie")||
                luna.equalsIgnoreCase("ianuarie")||
                luna.equalsIgnoreCase("februarie"))
        {
            anotimp="iarna";
        }
        else anotimp="unknown";
        return anotimp;
    }

    //Ex 5 optionale
    private static int returneazaMaximulAPatruNr(int x, int y, int z, int w){
        int max=x;
        int numere[]= {x,y,z,w};
        for (int n:numere){
            if(n>=max){
                max=n;
            }
        }
        return max;
    }


    private static String returneazaCaractereleDinMijloc(String cuvant){
        String mijloc;
        int lungime = cuvant.length();
        //nr litere impar - o singura litera
        if (lungime%2!=0){
          mijloc = cuvant.substring(lungime/2,lungime/2+1); //to be checked
       //     mijloc = String.valueOf(cuvant.charAt(lungime/2));
        }
        //nr litere par - doua litere
        else mijloc = cuvant.substring(lungime/2-1,lungime/2+1);
        return mijloc;
    }

    //Ex. 8 optional
    public static int returneazaSumaCifrelor(int numar) {
       // if (numar<0){numar=-;}

        int sumaCifrelor=0;
        int rest;

        do {
            rest = numar%10;
            numar = numar/10;
            sumaCifrelor= sumaCifrelor+rest;
        }
                while(numar>=0);

        return sumaCifrelor;

    }






}
