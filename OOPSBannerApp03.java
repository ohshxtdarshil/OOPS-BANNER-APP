public class OOPSBannerApp03 {
    public static void main(String[] args) {
        // 1. Create a String array to hold the 7 lines of the banner
        String[] bannerLines = new String[7];

        // 2. Populate the array using String.join() (improving UC3)
        bannerLines[0] = String.join("", "  *** ", "  *** ", " ***** ", "  ***** ");
        bannerLines[1] = String.join("", " * * ", " * * ", " * * ", " * ");
        bannerLines[2] = String.join("", " * * ", " * * ", " * * ", " * ");
        bannerLines[3] = String.join("", " * * ", " * * ", " ***** ", "  **** ");
        bannerLines[4] = String.join("", " * * ", " * * ", " * ", "      *");
        bannerLines[5] = String.join("", " * * ", " * * ", " * ", "      *");
        bannerLines[6] = String.join("", "  *** ", "  *** ", " * ", " ***** ");

        // 3. Use a for-each loop to print everything in the array
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}