public class Constructor {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("CreateMe");
        Book b3 = new Book(250);

    }
}
class Book{
    String name ;
    int price;
    
    Book() {
        System.out.println("constructor is called ...........");
    }
    Book(String name) {
        this.name = name;
    }
    Book(int price) {
        this.price = price;
    }
}
