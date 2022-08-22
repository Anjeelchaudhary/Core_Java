
class Method{
    public void sayHello(){
        System.out.println("hello world");
    }
}
public class CallFunDifClass {
    public static void main(String[] args){
        Method objN = new Method();
        objN.sayHello();
    }
}

