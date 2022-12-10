
# Road Map for DataStructure and Algorithm

## 1.One-D Arrays
Code for 
[Reverse of array ](https://github.com/Anjeelchaudhary/JavaCode/blob/master/Arrays/OneDArray/Reverse.java)

#### # Reverse the Array

```http
    public static void reverseArray(int numbers[]){
        int start = 0;
        int end = numbers.length-1;
        int temp;

        while(start < end){
            temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
```
##
Code for 
[Binary search ](https://github.com/Anjeelchaudhary/JavaCode/blob/master/Arrays/OneDArray/BinarySearch.java)

#### # Binary search

```http
     public static int findBinary(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;

        while(start<=end){
            int mid = (start+end) / 2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }
```
##
Code for 
[Buy and Sell stock ](https://github.com/Anjeelchaudhary/JavaCode/blob/master/Arrays/OneDArray/BuyAndSellStock.java)

#### # Buy and Sell Stock 

```http
     public static int calcBuyandSell(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<price.length;i++){
            if(buyPrice < price[i]){
                int profit = price[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
```
##
Code for 
[Kadan's Algorithm](https://github.com/Anjeelchaudhary/JavaCode/blob/master/Arrays/OneDArray/Kadan.java)

#### # Kadan's Algorithm

```http
     public static void calcKadan(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            currSum = currSum + array[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("The maximum Sum is = "+maxSum);
    }
```
##
Code for 
[Linear Search](https://github.com/Anjeelchaudhary/JavaCode/blob/master/Arrays/OneDArray/LinearSearch.java)

#### # Linear Search

```http
     public static void calcKadan(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            currSum = currSum + array[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("The maximum Sum is = "+maxSum);
    }
```
##
Code for 
[Maximum SubArray](https://github.com/Anjeelchaudhary/JavaCode/blob/master/Arrays/OneDArray/MaxSubArray.java)

#### # Maximum SubArray

```http
      public static void calcMax(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                currSum = 0;
                for(int k=i;k<j;k++){
                    currSum += array[k];
                } 
                if(maxSum<currSum){
                    maxSum = currSum;
                    System.out.print(maxSum+" ");
                }
            }
            System.out.println( " ");
        }
        System.out.println("Maximum sum is = "+maxSum);
    }
```
##
Code for 
[Reverse in Array](https://github.com/Anjeelchaudhary/JavaCode/blob/master/Arrays/OneDArray/Reverse.java)

#### # Reverse in Array

```http
    public static void reverseArray(int numbers[]){
        int start = 0;
        int end = numbers.length-1;
        int temp;

        while(start < end){
            temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
```
##
Code for 
[Sub Array](https://github.com/Anjeelchaudhary/JavaCode/blob/master/Arrays/OneDArray/SubArrays.java)

#### # Sub Arrays

```http
    public static void calcSub(int numbers[]) {
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
```
##
Code for 
[Trapped Water](https://github.com/Anjeelchaudhary/JavaCode/blob/master/Arrays/OneDArray/TrappedWater.java)

#### # Trapped Water

```http
    public static int calcReserdWater(int height[]){

        int leftMaxheight[] = new int[height.length];
        leftMaxheight[0] = height[0];
        for(int i=1 ;i<height.length ;i++){
            leftMaxheight[1] = Math.max(height[i], leftMaxheight[i-1]);
        }
        int rightMaxheight[] =new int[height.length];
        rightMaxheight[height.length-1] = height[height.length-1];
        for(int i=height.length-2 ;i>=0 ;i--){
            rightMaxheight[i] = Math.max(height[i], rightMaxheight[i+1]);
        }
        int trappedWater = 0;
        for(int i=0;i<height.length;i++){
            int waterLevel = Math.min(leftMaxheight[i], rightMaxheight[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
``` 