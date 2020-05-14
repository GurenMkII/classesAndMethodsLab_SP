public class Main {

    public static void main(String[] args) {

        Bookstore bookstore1 = new Bookstore();
        
        bookstore1.storeIntro(bookstore1);

        bookstore1.printTitles();

        bookstore1.checkTitle("Java for Dummies");
        
        bookstore1.checkTitle("just enough requirements and documentation");




        
    }
    
}