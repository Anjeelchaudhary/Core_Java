# Arraylist reference 

#### #  Syntax for ArrayList

```
    ArrayList<Integer> list = new ArrayList<>(); //this is for integer data
    ArrayList<String> list2 = new ArrayList<>(); //this is for string values
    ArrayList<Boolean> list3 = new ArrayList<>(); //this is for the boolean values 
```
#
Code for 
[Swapping in ArrayList](https://github.com/Anjeelchaudhary/JavaCode/blob/master/23.ArrayList/Swap.java)

#### # Swapping in ArrayList

```
public static void Swwap(ArrayList<Integer> lys,int num1,int num2) {
        int temp = lys.get(num1);
        lys.set(num1, lys.get(num2));
        lys.set(num2, temp);
    }
```
#
Code for 
[PairSum](https://github.com/Anjeelchaudhary/JavaCode/blob/master/23.ArrayList/PairSum.java)

#### # PairSum

```
public static boolean calcPairSum(ArrayList<Integer> lys,int target) {
        for(int i=0;i<lys.size();i++) {
            for(int j=i+1;j<lys.size();j++) {
                if(lys.get(i)+lys.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
```
#
Code for 
[PairSumRotaion](https://github.com/Anjeelchaudhary/JavaCode/blob/master/23.ArrayList/PairSumRotaion.java)

#### # PairSumRotaion

```
   public static boolean calcRotaionalPairSum(ArrayList<Integer> lys,int target) {
        int Bp = -1;
        int n =lys.size();
        for(int i=0;i<lys.size();i++) {
            if(lys.get(i) > lys.get(i+1)) {
                Bp = i;
                break;
            }
        }
        int Lp = Bp+1;
        int Rp = Bp;
        while(Rp != Lp) {
            if(lys.get(Lp)+lys.get(Rp)==target) {
                return true;
            }
            if(lys.get(Lp)+lys.get(Rp) < target) {
                Lp = (Lp+1) % n;
            }else{
                Rp = (n+Rp-1) % n;
            }
        }
        return false;
    }
```
#
Code for 
[StoreWater in ArrayList](https://github.com/Anjeelchaudhary/JavaCode/blob/master/23.ArrayList/StoreWater.java)

#### # StoreWater in ArrayList

```
     public static int calcStoreWater(ArrayList<Integer> lys) {
        int maxWater = 0;
        for(int i=0;i<lys.size();i++) {
            for(int j=i+1;j<lys.size();j++) {
                int height = Math.min(lys.get(i),lys.get(j));
                int width = j-i;
                int area = height * width;
                maxWater = Math.max(maxWater, area);
            }
        }
        return maxWater;
    }
```
#
Code for 
[2-D ArrayList](https://github.com/Anjeelchaudhary/JavaCode/blob/master/23.ArrayList/TwoDArraylist.java)
#### # 2-D ArrayList

```
     ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        mainlist.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        mainlist.add(list2);

        for(int i=0 ; i<mainlist.size() ;i++) {
            ArrayList<Integer> currenList = mainlist.get(i); // values gets copied to currentlist from mainlist
            for(int j=0;j<currenList.size();j++) {
                System.out.print(currenList.get(j)+" ");
            }
            System.out.println();
        }
        
    }
```

#
Code for 
[3-D ArrayList](https://github.com/Anjeelchaudhary/JavaCode/blob/master/23.ArrayList/ThreeDArraylist.java)

#### # 3-D ArrayList

```
   ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        //inserting integer in all lists in single loop
        for(int i=0;i<=5;i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        //not adding all list to mainList 
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        //Now printing 
        for(int i=0;i<mainList.size();i++) {
            ArrayList<Integer> currentList = mainList.get(i);
            for(int j=0;j<currentList.size();j++) {
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();
        }
    }
```
#
Code for 
[Trapping of water](https://github.com/Anjeelchaudhary/JavaCode/blob/master/23.ArrayList/TrappingWater.java)

#### # Trapping of water

```
     public static int Trapped(ArrayList<Integer> height) {
        int maxWater = 0;
        for(int i=0;i<height.size();i++) {
            for(int j=i+1;j<height.size();j++) {
                int hgt = Math.min(height.get(i), height.get(j));
                int wdt = j-i;
                int currentWater = hgt * wdt;
                maxWater = Math.max(maxWater, currentWater);
            }
        }
        return maxWater;
    }
```
