public class main {

    main(){}
    
    /*void bogus2(){
        System.out.println("this function is not called");
    }*/

    void helloWorld(){
        System.out.println("Hello, World!");
        System.out.println("Hey, World!");
    }

    void start(){
        helloWorld();
    }

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        new main().start();
    }
}
