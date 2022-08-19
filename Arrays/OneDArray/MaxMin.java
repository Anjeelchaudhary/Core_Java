package Arrays.OneDArray;

public class MaxMin {

    public static class ComT{
        int min,max;
            public static void CalcMinMax(int arrInput[],int num){
                ComT de = new ComT();//object name is same as class name

                //First condition
                //If the only one value is present in the list
                if(num == 1){
                   de.max = arrInput[0];
                   de.min = arrInput[0];
                }

                //second condition
                //If there only two values in array 
                if(arrInput[0]>arrInput[1]){
                    System.out.print("max "+de.max);
                }else{
                    System.out.print("min "+de.min);
                }

                //Third condition
                //If there are n numbers of value in the arrray 
                for(int i=0;i<num;i++){
                    if(arrInput[i]>de.max){
                        de.max = arrInput[i];
                    }else if(arrInput[i]<de.min){
                        de.min = arrInput[i];
                    }
                }
            }
    }
    public static void main(String args[]){
        int arrayNum = 7;
        int arraylist[] = {500,200,85,1,0,399,750};
        ComT de = CalcMinMax(arraylist,arrayNum);
    }
}
