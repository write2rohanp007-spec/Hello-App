feature/UC7-CharacterPatternClass
/**
 * OOPSBannerApp
 * UC7 - Store Character Pattern in a Class
 */

public class OOPSBannerApp {

    // Inner static class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Method to print banner
    public static void printBanner(CharacterPattern[] word) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern ch : word) {
                line.append(ch.getPattern()[i]).append(" ");
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        CharacterPattern[] word = {O, O, P, S};

        printBanner(word);
    }
}

public class HelloApp {
  feature/UC6-substring-method

 feature/UC5-enhanced-for-loop
 feature/UC4-display-multiple-names
 main
 main
    public static void main(String[] args) {

        String message;

feature/UC6-substring-method
        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            message = "Hello, " + names + "!";

feature/UC5-enhanced-for-loop
        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            StringBuilder names = new StringBuilder();

            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }

            message = "Hello, " + names.toString() + "!";
        }

        System.out.println(message);
    }
}
        if (args.length > 0) {
            String joinedNames = String.join(", ", args);
            message = "Hello, " + joinedNames + "!";
        } else {
            message = "Hello, World!";
 main
        }

        System.out.println(message);
    }
 feature/UC6-substring-method
}



    public static void main(String[] args) {

 feature/UC2-display-name
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }

        System.out.println("Hello World");
 main

    }

 main
}
main
 main
 main
