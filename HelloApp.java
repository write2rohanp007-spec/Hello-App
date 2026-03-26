public class HelloApp {
 feature/UC4-display-multiple-names
    public static void main(String[] args) {

        String message;

        if (args.length > 0) {
            String joinedNames = String.join(", ", args);
            message = "Hello, " + joinedNames + "!";
        } else {
            message = "Hello, World!";
        }

        System.out.println(message);
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