public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            greeter(name);
        } else {
            System.out.println("Please provide a name as a command line argument.");
        }
    }

    public static void greeter(String name) {
        System.out.println("Hello, " + name + "!");
        System.out.println("Welcome to the program.");
        System.out.println("We are glad you are here.");
        System.out.println("This program demonstrates the use of command line arguments.");
        System.out.println("Happy coding, " + name + "!");
    }
}