package io.ninetails.tolken;

public class Main {

    public static void main(String[] args) {
        // Driver for tolken
        String filename;
        String language;

        switch (args.length) {
            case 0:
                System.exit(1);
            case 1:
                filename = args[0];
                language = "java";
                break;
            default:
                filename = args[0];
                language = args[1].toLowerCase();
        }

        System.out.println("Welcome to Tolke\n\nExecuting " + filename + " in "+ language);
    }
}
