class Many{
    String name;
    int id;

    public void Show(){
        System.out.println(this.name);
    }
    public void Show(String name){
        System.out.println(name);
    }
}

public class CompileTimePoly {
    public static void main(String[] args) {
        Many ncit = new Many();
        ncit.name = "Tony Strark";
        ncit.id = 01;
        ncit.Show();
        ncit.Show(ncit.name);
        
    }
}
