public class Shape {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}
public class Rectangle extends Shape {
}

public class Square extends Shape {
    @Override
    public void setWidth(int side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public void setHeight(int side) {
        this.width = side;
        this.height = side;
    }
}