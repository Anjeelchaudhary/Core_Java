## 14.Basic Sorting Alogrithm
Code for 
[Bubblesort](https://github.com/Anjeelchaudhary/JavaCode/blob/master/14.Basic%20sorting%20Algorithm/BubbleSort.java)

#### # Bubblesort

```
    //Sorting function
    public static void calcBubbleSort(int array[]){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j] > array[j+1]){
                    //swap 
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                } 
            }
        }
    }
    //function for printing 
    public static void printSort(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println(" ");
    }
```
#
Code for 
[Count Sorting](https://github.com/Anjeelchaudhary/JavaCode/blob/master/14.Basic%20sorting%20Algorithm/CountSort.java)

#### # CountSort
```
public static void calcCount(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            largest = Math.max(largest, array[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }

        int j=0;
        for(int i=0;i<array.length;i++){
            while(count[i]>0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print(int array[]){
       for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
       }
       System.out.println();
    }
```
#
Code for 
[InsertionSort](https://github.com/Anjeelchaudhary/JavaCode/blob/master/14.Basic%20sorting%20Algorithm/InsertionSort.java)

#### # InsertionSort

```
         public static void calcInsertionSort(int array[]){
        for(int i=1;i<array.length;i++){
            int current = array[i];
            int previous = i-1;
            while(previous >=0 && array[previous] > array[current]){
                array[previous + 1] = array[previous];
                previous--;
            }
            array[previous+1] = array[current];
        }
    }
    public static void PrintSorting(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
```
#
Code for 
[SelectionSort](https://github.com/Anjeelchaudhary/JavaCode/blob/master/14.Basic%20sorting%20Algorithm/SelectionSort.java)

#### # SelectionSort

```
     public static void calcSelectionSort(int array[]){
        for(int i=0;i<array.length-1;i++){
            int min = i;
            for(int j=i+1;j<array.length;j++){
                if(array[min]> array[j]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
    public static void printselection(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }
```