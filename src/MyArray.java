public class MyArray {
    public static void main(String[] args) {

        int[] numbers = {1,3,5,7,9};
        String[] cursanti = {"Mihail", "Nicu", "Rebeca"};

        System.out.println(cursanti[0]);
        System.out.println(cursanti[2]);
        cursanti[2] = "Raluca";
        System.out.println(cursanti[2]);
        System.out.println(cursanti.length);

        System.out.println(numbers.length);

        for(int i=0;i<cursanti.length;i++){
            System.out.println(cursanti[i]);
        }
        System.out.println("---------------------------");

        for(String c:cursanti){
            System.out.println(c);
        }


    }
}
