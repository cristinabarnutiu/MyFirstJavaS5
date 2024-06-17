public class ExtraChallenge {
    public static void main(String[] args) {
        System.out.println(singILikeToMoveItMoveIt("Cristina"));
        System.out.println(singILikeToMoveIt2("Cata"));
        int numbers[]={4,5,-7,1,0,-9,-98};
        System.out.println(faceParteDinArray(5,numbers));
        System.out.println(cateNumereNegativeSunt(numbers));

    }

    //challenge 1
        /*
        I like to move it, move it
I like to move it, move it
I like to move it, move it
[nume] likes to move it
I like to move it, move it
I like to move it, move it
I like to move it, move it
[nume] likes to move it

         */
    public static String singILikeToMoveItMoveIt(String nume) {
        String vers = "I like to move it, move it";
        String versNume = nume + " likes to move it";
        String afisare = "";
        for (int i = 0; i < 8; i++) {
            if (i == 3 || i == 7) {
                afisare += versNume + "\n";
            } else
                afisare += vers + "\n";
        }
        return afisare;
    }

    public static String cantaStrofa(String nume) {
        String strofa = "";
        for (int i = 0; i < 3; i++) {
            strofa += "I like to move it, move it\n";
        }
        return strofa + nume + " likes to move it\n";
    }

    public static String singILikeToMoveIt2(String nume) {
        return cantaStrofa(nume) + cantaStrofa(nume);
    }

    //challenge 2
    public static String faceParteDinArray(int number, int numbers[]) {
        String text = "numarul nu face parte din array";
        for (int n:numbers) {
            if (n == number) {
                text = "numarul face parte din array";
            }
        }
        return text;
    }

    //challenge 3
    public static int cateNumereNegativeSunt(int numbers[]){
        int c=0;
        for (int n:numbers){
            if(n<0){
                c++;
            }
        }
        return c;
    }
}






