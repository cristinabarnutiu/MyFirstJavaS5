public class Algorythms {
    public static void main(String[] args) {
        /*Declarați un șir de numere întregi (ex. 1, -25, 34, -2, 67, 5)
Scrieți un program care să afișeze doar vecinii numerelor din șir
(ex. în loc de 1 afișați 0 și 2; în loc de -25 afișați -26 și -24; etc)
*/
        int numbers[] = {1, -25, 34, -2, 67, 5, -45, -987};
        for (int n: numbers){
            System.out.println((n-1)+" "+(n+1));
        }

        int max = numbers[0];
        for (int n:numbers){
            if (n>max){
                max=n;
            }
        }
        System.out.println("max="+max);


        for (int n:numbers){
            if(n<0) {
                System.out.println(n);
            }
        }

        String text = "Abracadabra";
        String text2= "Abracadabra";
        System.out.println(text.charAt(3));
        System.out.println(text.concat(text2));
        System.out.println(text.contains("cat"));
        System.out.println(text.endsWith("bra"));
        System.out.println(text.length());
        System.out.println(text.indexOf('c'));
        System.out.println(text.startsWith("Abr"));
        System.out.println(text.substring(6,9));

        String tari[]={"Anglia","Romania","Albania","Franta","Elveția","China", "SUA", "Australia"};

        for (String t:tari){
            System.out.println(t.charAt(0));
        }
        for (String t:tari){
            if(t.charAt(0)=='A') {
                System.out.println(t);
            }
        }

        int maxLetters = tari[0].length();
        String taraCuCelMaiLungNume = tari[0];

        for (String t:tari){
            if (t.length()>maxLetters){
                maxLetters = t.length();
                taraCuCelMaiLungNume = t;
            }
        }
        System.out.println("tara cu cel mai lung nume este "+taraCuCelMaiLungNume);

    }
}
