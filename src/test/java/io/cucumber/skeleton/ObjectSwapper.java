package io.cucumber.skeleton;

public class ObjectSwapper {
    Object x;
    Object y;

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }

    public void swap(Object x, Object y) {
        this.x = y;
        this.y = x;
    }
}
