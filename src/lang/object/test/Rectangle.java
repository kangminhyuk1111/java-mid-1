package lang.object.test;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }
}
