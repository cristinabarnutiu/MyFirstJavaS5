public class Operators {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 30;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a%c);

        //System.out.println(++a);
        //++a - incrementeaza si apoi il afiseaza
        //a++ - afiseaza si apoi incrementeaza
        System.out.println(a++);
        System.out.println(a);

        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);

        System.out.println(100+50);
        System.out.println(a+b);
        System.out.println(a+50);

        //Operatori de atribuire
        int d = 10;
        int e = d;

        d+=2; // echivalent cu d = d+2;
        System.out.println(d);

        d-=3; // echivalent cu d = d-3;
        System.out.println(d);

        for (int i = 0; i<=10; i+=2){
            System.out.println(i);
        }

        for (int i=10; i>=0; i--){
            System.out.println(i);
        }

        System.out.println(a>=b);
        System.out.println(b>=a);
        System.out.println(5==5);
        System.out.println(a==b);
        System.out.println(a!=b);

        boolean iLoveJava = false;
        System.out.println(!iLoveJava);

        if (iLoveJava){
            System.out.println("Learn Test Automation");
        }
        else {
            System.out.println("Still learning");
        }

        System.out.println(d); //d=9
        System.out.println(e); //e =10

        if(d<10 && e<10){
            System.out.println("d si e mai mici decat 10");
        }

        if(d<10 || e<10){
            System.out.println("d sau e mai mici decat 10");
        }

        int n = 10;
        //if (n%2==0){...}

        int numar1 = 5;
        int numar2 = 5;
        int sum = numar1+numar2;


        if (sum>=10){
            System.out.println("suma >=10");
        }
        else {
            System.out.println("suma <10");
        }

        if (sum%2==0){
            System.out.println("suma este nr par");
        }

        //ex optionale
        int var1 = 10;
        int var2 = 20;
        int var3 = 30;
        int var4 = 40;

        int sumVar = var1+var2+var3+var4;
        int prodVar = var1*var2*var3*var4;

        System.out.println(sumVar);
        System.out.println(prodVar);
        System.out.println(var4%var2);

//        var1++;
//        var1++;
//        var1++;
//        System.out.println(var1);

        for (int i =0; i<3; i++){
            var1++;
        }
        System.out.println(var1);

        boolean cond1 = sumVar>100;
        boolean cond2 = prodVar>1000;
        System.out.println(cond1);
        System.out.println(cond2);

        boolean ambeleTrue = cond1&&cond2;
        boolean celPutinUna = cond1||cond2;

        System.out.println(ambeleTrue);
        System.out.println(celPutinUna);


    }
}
