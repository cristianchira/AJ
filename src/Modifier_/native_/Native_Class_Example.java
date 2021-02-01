package Modifier_.native_;

public class Native_Class_Example {

    public native String getSystemTime();

    static {
        System.loadLibrary ("nativedatetimeutils");
    }

    public static void main(String[] args) {
        new Native_Class_Example ();
    }


}
