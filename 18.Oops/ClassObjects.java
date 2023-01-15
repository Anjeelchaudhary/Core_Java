public class ClassObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
    }
}
class Pen {
    String color;
    int tipPoint;
    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tipPoint = newTip;
    }
}