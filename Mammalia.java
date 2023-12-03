package models;

public class Mammalia {
    boolean hairy_body = true;
    int no_of_heart = 4;
    boolean warm_blodded = true;
    String name;

    public boolean isHairy_body() {
        return hairy_body;
    }

    public void setHairy_body(boolean hairy_body) {
        this.hairy_body = hairy_body;
    }

    public int getNo_of_heart() {
        return no_of_heart;
    }

    public void setNo_of_heart(int no_of_heart) {
        this.no_of_heart = no_of_heart;
    }

    public boolean isWarm_blodded() {
        return warm_blodded;
    }

    public void setWarm_blodded(boolean warm_blodded) {
        this.warm_blodded = warm_blodded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
