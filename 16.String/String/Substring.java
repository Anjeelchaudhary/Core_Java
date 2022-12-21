package String;

class Substring{
     public static void main(String[] args) {
        String Paragraph = "Hello i am jarvis ";

        //substring(indexNumber,endingNumber);
        //this function helps us to take required name from the sentence
        
        String name = Paragraph.substring(11,Paragraph.length());
        System.out.println(name);
    }
}