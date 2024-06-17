public class Loops {
    public static void main(String[] args) {

        for(int i=0; i<8; i++){
            if(i==4){continue;}
            System.out.println("i = "+i);

        }

        String cars[] = {"BMW", "Elbons 4zen", "Dacia", "Fiat", "Porsche"};
        for (String c: cars){
            //System.out.println("Azi vreau sa conduc "+c);
            if(c=="Elbons 4zen"){
                continue;
                //System.out.println("Azi vreau sa conduc "+c);
                //System.out.println(" dar mai bine conduce Catalin"); ;
            }
            System.out.println("Azi vreau sa conduc "+c);
        }

        int i =0;
        while(i<5){
            //if (i==3){break;}
            i++;
            if (i==3){continue;}
            System.out.println("i="+i);
        }

        int j = 6;
        do {
            System.out.println("j="+j);
            j++;
        }
        while (j<5);


    }
}
