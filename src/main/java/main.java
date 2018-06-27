public class main {

    main(){}

    void helloWorld(){
        System.out.println("Hey World!");
    }

    void start(){
        helloWorld();
        helloWorld();
    }

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        new main().start();
    }
}
