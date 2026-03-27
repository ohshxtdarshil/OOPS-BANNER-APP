public class OOPSBannerApp02 {
    public static void main(String[] args) {
        // We use String.join("", ...) to join parts with an empty string (no gap) 
        
        System.out.println(String.join("", "  *** ", "  *** ", " ***** ", " ***** "));
        System.out.println(String.join("", " * * ", " * * ", " * * ", " * "));
        System.out.println(String.join("", " * * ", " * * ", " * * ", " * "));
        System.out.println(String.join("", " * * ", " * * ", " ***** ", "  **** "));
        System.out.println(String.join("", " * * ", " * * ", " * ", "      *"));
        System.out.println(String.join("", " * * ", " * * ", " * ", "      *"));
        System.out.println(String.join("", "  *** ", "  *** ", " * ", " ***** "));
    }
}