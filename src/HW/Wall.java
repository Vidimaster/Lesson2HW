package HW;

public class Wall {


    private float heigth;



    static int countheigth;

    public Wall(float heigth) {
        this.heigth = heigth;
        countheigth++;
    }

    public float getHeigth() {
        return heigth;
    }

    public static int getCountheigth() {
        return countheigth;
    }


}
