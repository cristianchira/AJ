package Hashing_in_Java;

public class gg {
    public static void main(String[] args) {
        String King = "King";

        int mod = King.hashCode () % 15;
        System.out.println (mod);
    }
}
