package io.cucumber.skeleton;

public class IntegerSwapper {
    private int x;
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void swap(int x, int y) {
        this.x = y;
        this.y = x;
    }
}
