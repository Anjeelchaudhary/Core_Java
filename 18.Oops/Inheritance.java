public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }    
}

class Animal {
    String color;
    
    void eat() {
        System.out.println("Eats");
    }
    void sleep() {
        System.out.println("Sleeps");
    }
}

class Fish extends Animal {
    String name;
    
    void swim() {
        System.out.println("Swims");
    }
}