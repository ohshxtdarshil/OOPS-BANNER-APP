/**
 * OOPSBannerApp UC7: Store Character Pattern in a Class
 * This version uses an inner class to encapsulate character-to-pattern mappings.
 * @version 7.0
 */
public class OOPSBannerApp07 {

    /**
     * Inner class to encapsulate a single character and its ASCII pattern.
     */
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    /**
     * Initializes the library of available character patterns.
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[]{"  *** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", "  *** "}),
            new CharacterPatternMap('P', new String[]{" ******", " ** **", " ** **", " ******", " ** ", " ** ", " ** "}),
            new CharacterPatternMap('S', new String[]{"  *****", " ** ", " ** ", "  **** ", "     **", "     **", " ***** "}),
            new CharacterPatternMap(' ', new String[]{"       ", "       ", "       ", "       ", "       ", "       ", "       "})
        };
    }

    /**
     * Finds the pattern for a specific character in the map.
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps); // Default to space if not found
    }

    /**
     * Renders the banner for any given message string.
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                line.append(getCharacterPattern(ch, charMaps)[i]);
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        // Step 1: Initialize the patterns
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        
        // Step 2: Define and print the message
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}