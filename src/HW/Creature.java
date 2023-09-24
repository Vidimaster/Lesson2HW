package HW;

public abstract  class Creature {
    protected int run;


    protected float jump;

    protected String name;



    protected boolean isInList;

    public Creature(int run, float jump, String name) {
        this.run = run;
        this.jump = jump;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public boolean getInList() {
        return isInList;
    }

    public void setInList(boolean inList) {
        isInList = inList;
    }
    abstract  void running(int runDistance);
    abstract  void jumping(float jumpHeight);
}