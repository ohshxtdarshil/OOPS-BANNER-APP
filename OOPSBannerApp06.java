/**
 * OOPSBannerApp UC6: Refactor Banner Logic into Functions
 * This version uses static helper methods to encapsulate character patterns,
 * promoting modularity and code reuse.
 * @author Developer
 * @version 6.0
 */
public class OOPSBannerApp06 {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  *** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            "  *** "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ****** ",
            " ** ** ",
            " ** ** ",
            " ****** ",
            " ** ",
            " ** ",
            " ** "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  ***** ",
            " ** ",
            " ** ",
            "  **** ",
            "     ** ",
            "     ** ",
            " ***** "
        };
    }

    public static void main(String[] args) {
        // Step 1: Call methods to get patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Step 2: Use a loop to assemble and print each line
        // We use oPattern twice for the 'OO' in 'OOPS'
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
}