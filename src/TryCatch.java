public class TryCatch {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9};

        try {
            System.out.println(numbers[9]);
        }
        catch (Exception e){
            System.out.println("A aparut o eroare");
        }

    }
}
