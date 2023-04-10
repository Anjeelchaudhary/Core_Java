## 16.String
Code for 
[String-Builder](https://github.com/Anjeelchaudhary/JavaCode/blob/master/16.String/BuilderString.java)

#### # String-Builder

```
     StringBuilder sb = new StringBuilder("TomAndJerry");
        System.out.println(sb);

        //this charAt() helps to give only pointed letter 
        System.out.println(sb.charAt(0));

        //to change the letter
        //sb.setCharAt(index, ch);<-syntax
        sb.setCharAt(0, 'B');
        System.out.println(sb);//in upper line it has changed the value so thats why sb is uesed here

        //insert is used to insert letter in the word 
        sb.insert(2, 'o');
        System.out.println(sb);
        
        //.delete is used to delete form index number to wanted number
        sb.delete(2, 3);
        System.out.println(sb);

        //append meaning adding letter at last
        sb.append('N');
        sb.append('i');
        sb.append('n');
        sb.append('j');
        sb.append('a');
        System.out.println(sb);
```
#
Code for 
[ComparingTwoStrings](https://github.com/Anjeelchaudhary/JavaCode/blob/master/16.String/ComTooName.java)

#### # ComparingTwoStrings
```
 String nameOne = "Tony";
        String nameTwo = "Tony";

        if(nameOne.compareTo(nameTwo) == 0){
            System.out.println("The names are equal");
        }else{
            System.out.println("The names are not equal");
        }
```
#
Code for 
[LargestString](https://github.com/Anjeelchaudhary/JavaCode/blob/master/16.String/LargestString.java)

#### # LargestString

```
     String froots[] = {"apple","mango","banana"};
        
        String Largest = froots[0];
        for(int i=0;i<froots.length;i++) {
            if(Largest.compareTo(froots[i]) < 0) {
                Largest = froots[i];
            }
        }
        System.out.println(Largest);
```
#
Code for 
[isPalindromeString](https://github.com/Anjeelchaudhary/JavaCode/blob/master/16.String/Plindrome.java)

#### # isPalindromeString

```public static boolean isPalindrome(String str) {
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
```
#
Code for 
[GeShortestPath](https://github.com/Anjeelchaudhary/JavaCode/blob/master/16.String/ShortestPath.java)

#### # ShortestPath

```
    public static float getShortestPath(String str) {
        int y = 0;
        int x = 0;
        for(int i=0;i<str.length();i++) {
            int direction = str.charAt(i);
            //bottom
            if(direction == 'S') {
                y--;
            }
            //top
            else if(direction == 'N') {
                y++;
            }
            //left
            else if(direction == 'W') {
                x--;
            }
            else {
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
```

#### # Character as integer

```
    //here 26 alphabet assign their posion
    int finaAns = 'b'-'a';
    System.out.println(finalAns);

    output:1

```