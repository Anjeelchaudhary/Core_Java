public class ShortestPath {
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
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getShortestPath(str));
    }
}
