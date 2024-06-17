public class MyString {
    public static void main(String[] args) {
        String text = "Hello ";
        String nume = "Cristina";
        System.out.println(text+nume);
        String numeMare = nume.toUpperCase();
        System.out.println(numeMare);
        String numeMic = nume.toLowerCase();
        System.out.println(numeMic);

        String propozitie = "Ana are mere";
        int lungime = propozitie.length();
        System.out.println(lungime);
        char primaLitera = propozitie.charAt(0);
        System.out.println(primaLitera);
        char a6aLitera = propozitie.charAt(5);
        System.out.println(a6aLitera);

        String filmulPreferat = "Filmul meu preferat este \n\"Harry Potter\"";
        System.out.println(filmulPreferat);

        //Ex 5 Optionale
        //Declarati un array de elemente de tip char cu elementele: a, b, c, d
        char[] myCharArray = {'a','b','c','d'};
        System.out.println(myCharArray[0]); //elementul de pe prima pozitie.
        System.out.println(myCharArray[1]); //elementul de pe a doua pozitie.
        System.out.println(myCharArray[3]); //elementul de pe ultima pozitie.
        //Afisati toate elementele sirului folosind FOR.

        for (int i=0; i< myCharArray.length; i++){
            System.out.println(myCharArray[i]);
        }

        for (char c: myCharArray){
            System.out.print(c);
        }





    }
}
