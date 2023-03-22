class cars {
    String name;
    String type;
    String price ;

    public void showInfo(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.price);
    }

    //copy constructure
    cars (cars FourWheel) {
       this.name = FourWheel.name;
       this.price = FourWheel.price;
       this.type = FourWheel.type;
    }

    cars (){

    }
}

public class Polymorph {
    public static void main(String[] args) {
        cars FourWheel = new cars();
        FourWheel.name = "Benze car";
        FourWheel.type = "Extra features";
        FourWheel.price = "One Million";
        FourWheel.showInfo();

        cars twoWheel = new cars(FourWheel);
        twoWheel.showInfo(); 


    }
}