public class DataTypes {
    public static void main(String[] args) {
        boolean myBoolean = true;
        //myBoolean = false;
        boolean myBoolean2 = myBoolean;
        myBoolean = false;

        char myChar = 'A';

        byte myByte = 100;

        short myShort = 10000;

        int myInt = 1000000000;

        long myLong = 100000000000000000L;

        float myFloat = 5.5f;

        double myDouble = 23.5689745;

        System.out.println(myBoolean);
        System.out.println(myBoolean2);
        System.out.println(myChar);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);

        //casting implicit
        int x = 5;
        double y = x;
        System.out.println(y);

        int z = (int)y;
        System.out.println(z);

    }
}
