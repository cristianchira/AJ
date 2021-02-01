package Enum_;

public class TestEnum {

    @SuppressWarnings("unused")
    public static void main(String[] args) throws UnsupportedOperationException {

        // get a specific element -------------------------------------------------------------------------------------
        EnumExample mobile = EnumExample.APPLE;

        // get an array of collections elements -----------------------------------------------------------------------
        EnumExample[] el = EnumExample.values ();

        // enhanced loop through array ---------------------------------------------------------------------------------
        for (EnumExample e : el) {


            //System.out.println(e.name() + " " + e.i + " " + e.type);
        }

        // using forEach method ----------------------------------------------------------------------------------------
        //Arrays.stream (el).forEach (e -> System.out.println (e.i + " " + e.type));

        // get element by id -------------------------------------------------------------------------------------------
        // getElementById(3);
        getExpectedTelephone("Samsung");

    }

    public static EnumExample getElementById(int id) {

        for (EnumExample en : EnumExample.values ()) {
            if (id == en.getI ()) {
                System.out.println (en.toString ());
                return en;
            }
        }
        throw new RuntimeException ("Value not found");
    }
    //Using	switch	statement	on	an	enum

    public static void getExpectedTelephone(String mark) {

        switch (mark) {
            case "Apple":
                System.out.println ("Apple is ok");
                break;
            case "HTC":
                System.out.println ("Htc is cheap");
                break;
            case "Samsung":
                System.out.println ("Samsung is the best");
                default:
                new RuntimeException ("No phone found");
        }
    }
}
