package HW;

public class Distance {


    private int length;



    static int countDistance;

    public Distance(int length) {
        this.length = length;
        countDistance++;
    }

    public int getLength() {
        return length;
    }

    public static int getCountDistance() {
        return countDistance;
    }
}
