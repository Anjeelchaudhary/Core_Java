public class Constructor {
    public static void main(String[] args) {
        Book b1 = new Book();
    }
}
class Book{
    String name ;
    int price;

    Book() {
        System.out.println("constructor is called ...........");
    }
}
