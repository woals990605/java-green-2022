package methodtest;

public class Box {
    int width;
    int length;
    int height;

    public void setWidth(int w) {
        width = w;
    }

    public int getwidth() {
        return width;
    }

    public void setLength(int l) {
        length = l;
    }

    public int getLength() {
        return length;
    }

    public int getheight() {
        return height;
    }

    public void setheight(int h) {
        height = h;
    }

    public int getVolume() {
        return height * width * length;
    }

    public void print(int w, int l, int h) {
        System.out.println("가로는 : " + width);
        System.out.println("세로는 : " + length);
        System.out.println("높이는" + height);
    }

}

class Boxtest {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setWidth(100);
        box1.setLength(100);
        box1.setheight(100);
        box1.print(100, 100, 100);
        System.out.println(box1.getVolume());
        Box box2 = new Box();
        box2.setWidth(200);
        box2.setLength(200);
        box2.setheight(200);
        System.out.println(box2.getVolume());

        box1.setWidth(box2.width);
        System.out.println(box1.getwidth());
        box1.setLength(box2.length);
        System.out.println(box1.getLength());
        box1.setheight(box2.height);
        System.out.println(box1.getheight());

    }

}