class PracMerg{
    public static void calcMergSort(int array[],int si,int ei){
        //si = sarting index and ei = ending index 
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2; //here (si+ei)/2 == si+(ei-si)/2 and si+(ei-si)/2 is more optimized
        calcMergSort(array, si, mid);//for left array
        calcMergSort(array, mid+1, ei);//for Right array
        calcMerg(array, si, mid, ei);

    }
    public static void calcMerg(int array[],int si,int mid,int ei){
        //left(0,3)=4 right(4,6)=3 -->6-0+1=7
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left array
        int j = mid+1;//iterator for right array 
        int k = 0; //iterator for temporary array

        while(i <= mid && j <= ei){
            if(array[i] < array[j]){
                temp[k] = array[i];
                i++;
            }else{
                temp[k] = array[j];
                j++;
            }
            k++;

        }
        //for left part
        while(i <= mid){
            temp[k++] = array[i++]; 
        }
        //right part
        while(j <= ei){
            temp[k++] = array[j++];
        }
        //coping to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            array[i] = temp[k];
        }
    }

    //here print function is for printing of sorted array
    public static void printMergSort(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = {6,3,9,5,2,8};
        calcMergSort(array, 0, array.length-1);
        printMergSort(array);
        
    }
}