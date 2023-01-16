public class OverRidding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        Dog d1 = new Dog();
        d1.eat();
    }    
}
class Animal {
    String color;
    void eat() {
        System.out.println("Eats");
    }
}
class Dog {
    String breed;
    void eat() {
        System.out.println("Dog likes to eat ice-cream");
    }
}
