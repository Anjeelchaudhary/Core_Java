
class GetBit {
    public static void main(String[] args) {
        int number = 5; //0101 <-Binary conversion
        int position = 1;
        int bitmask = 1<<position;

        if((bitmask & number) == 0){
            System.out.println("Zero number was there");
        }else{
            System.out.println("One number was there");
        }
    }
}