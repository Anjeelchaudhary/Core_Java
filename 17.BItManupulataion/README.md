## 17.BitManupulatation
Code for 
[Clearing range from (i to j)th position](https://github.com/Anjeelchaudhary/JavaCode/blob/master/13.Arrays/Reverse.java)

#### # ClearingBitRange

```
    public static int clearBitsAtijRange(int number,int i,int j) {
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitmask = a | b;
        return number & bitmask;
    }
```
#
Code for 
[Clearing Bit](https://github.com/Anjeelchaudhary/JavaCode/blob/master/17.BItManupulataion/ClearithBit.java)

#### # Clearing single Bit
```
 public static int clearibit(int number, int i) {
        // ~0 or -1 denotes the same thing i.e 11111111....
        int bitmask = (~0)<<i;
        return number & bitmask;
    }
```
#
Code for 
[Even | Odd](https://github.com/Anjeelchaudhary/JavaCode/blob/master/17.BItManupulataion/EvenOddNum.java)

#### # To check whether given no is even or odd

```
      public static void EveOdd(int number) {
        int bitmas = 1;
        if((number & bitmas) == 0) {
            System.out.println("even number");
        }else {
            System.out.println("Odd number ");
        }
    }
```
#
Code for 
[PowerExponential](https://github.com/Anjeelchaudhary/JavaCode/blob/master/17.BItManupulataion/FastExponential.java)

#### # PowerExponential

```
    public static int FastExp(int pow,int number) {
        int ans = 1;
        while(number>0) {
            if((number&1)!=0) {
                ans = ans*pow;
            }
            pow = pow * pow;
            number= number>>1;
        }
        return ans;
    }
```
#
Code for 
[GetBit](https://github.com/Anjeelchaudhary/JavaCode/blob/master/17.BItManupulataion/GetBit.java)

#### # GetBit

```
     int number = 5; //0101 <-Binary conversion
        int position = 1;
        int bitmask = 1<<position;

        if((bitmask & number) == 0){
            System.out.println("Zero number was there");
        }else{
            System.out.println("One number was there");
        }
    }
```
#
Code for 
[Power of number](https://github.com/Anjeelchaudhary/JavaCode/blob/master/17.BItManupulataion/PowerOfNum.java)

#### # Power Of Number

```
    public static boolean isPowerTwo(int Number) {
        return (Number&(Number-1))==0;
    }
```
#
Code for 
[SetBit](https://github.com/Anjeelchaudhary/JavaCode/blob/master/17.BItManupulataion/SetBit.java)

#### # SetBit

```
   public static void main(String[] args) {
        int number = 5;
    int position = 1;
    int bitmas = 1 << position;

    int bitBoy = bitmas | number;
    System.out.println(bitBoy);
    }
```
#
Code for 
[Counting SetBit](https://github.com/Anjeelchaudhary/JavaCode/blob/master/17.BItManupulataion/SetCout.java)

#### # Counting Set Bit

```
  public static int CountSetBit(int number) {
        int count = 0;
        while(number>0) {
            if((number&1) != 0) {
                count++;
            }
            number = number>>1;
        }
        return count;
    }
```
#
Code for 
[ClearBit](https://github.com/Anjeelchaudhary/JavaCode/blob/master/13.Arrays/Reverse.java)

#### # ClearBit

```
   public static int clearithBit(int number ,int i ) {
        int bitmask = ~(1<<i);
        return bitmask & number;
    }
```
#
Code for 
[upDate Bit](https://github.com/Anjeelchaudhary/JavaCode/blob/master/17.BItManupulataion/updateBit.java)
#### # upDate Bit

```
      public static int clearBit(int number ,int i) {
        int bitmask = ~(1 << i);
        return number & bitmask;
    }
    public static int upDate(int number ,int i, int newBit) {
        int clear = clearBit(number, i);
        int bittu = newBit<<i;
        return number | newBit;
    }
```