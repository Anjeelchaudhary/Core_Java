package Arrays.OneDArray;

public class FoodLi {
    public static int searchFood(String food[],String key){
        for(int i=0;i<food.length;i++){
            if(food[i]==key){
                return i;
            }
        }
        return 1;
    }
   public static void main(String[] args) {
    String food[] = {"chowmin","momo","maggie","pasta","hakka noodle","xole bhature"};
    String key = "pasta";
    int index = searchFood(food,key);
    if(index == 1){
        System.out.println("searched food is not in list ");
    }else{
        System.out.println("your food is in index = "+index);
    }
   } 
}
