package semanatres;

public class Palindromas {

    public static void main(String[] args) {

        boolean flag = palindroma("ala");
        System.out.println(flag);
    }

    public static boolean palindroma(String palabra) {
        if (palabra.length() == 0 || palabra.length() == 1) {
            return true;
        }

        if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)) {
            return palindroma(palabra.substring(1, palabra.length() - 1));
        }
        return false;
    }
}
