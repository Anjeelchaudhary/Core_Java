package Arrays.OneDArray;

class LinearSearch{
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,5,8,10,16,25};
        int key = 10;
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Your number is not in array ");
        }else{
            System.out.println("Your number is in index = "+index);
        }
    }
}