/**
 * OOPSBannerApp UC5: Render OOPS as Banner using Inline Array Initialization
 * This version reduces code verbosity by combining declaration and initialization.
 * * @author Developer
 * @version 5.0
 */
public class OOPSBannerApp05 {

    public static void main(String[] args) {
        // UC5: Define and populate the String array in a single statement [cite: 4, 12]
        // Each String.join() call constructs one horizontal row of the "OOPS" banner [cite: 10, 13]
        String[] lines = {
            String.join("", "  *** ", "  *** ", " ***** ", "  **** "),
            String.join("", " * * ", " * * ", " * *", " * "),
            String.join("", " * * ", " * * ", " * *", " * "),
            String.join("", " * * ", " * * ", " ***** ", "  *** "),
            String.join("", " * * ", " * * ", " * ", "     * "),
            String.join("", " * * ", " * * ", " * ", "     * "),
            String.join("", "  *** ", "  *** ", " * ", " **** ")
        };

        // Use an Enhanced For Loop (for-each) to iterate and print 
        for (String line : lines) {
            System.out.println(line);
        }
    }
}