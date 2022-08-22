package OOPs;

class pen {
    String name ;
    String color ;

    public void printName () {
        System.out.println(this.name);
    }

    public void printColor () {
        System.out.println(this.color);
    }
}

public class ObjNclass {
     public static void main(String[] args) {
        pen cello = new pen();
        cello.name = "jelpen";
        cello.color = "Black or Blue";

        pen natraj = new pen();
        natraj.name = "Natraj Pencil";
        natraj.color = "HB";

        cello.printName();
        cello.printColor();

        natraj.printName();
        natraj.printColor();
    }
    
}
