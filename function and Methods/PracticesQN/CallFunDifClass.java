class Student{
    String name;

        Student(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
}




public class CallFunDifClass {
    public static void main(String[] args){
        Student jailer = new Student("Tony Stark");
        String name = jailer.getName();
        System.out.println(name);
    }   
}

