class Rectangle {
    private int w = 10;
    private int h = 20;

    public Rectangle(int w, int h) {
        this.w = width;
        this.h = height;
    }

    public int getWidth() {
        return w;
    }

    public void setWidth(int w) {
        this.w = width;
    }

    public int getHeight() {
        return h;
    }

    public void setHeight(Integer height) {
        this.h = height;
    }

    public int calculateArea() {
        return w * h;
    }

    public int calculatePerimeter() {
        return (w + h) * 2;
    }

    public void RectangleCalculate() {
        System.out.println("Высота прямоугольника: " + h + "\n" + "Ширина прямоугольника: " + w + "\n"
         + "Площадь прямоугольника: " + calculateArea() + "\n" +"Периметр прямоугольника: " + calculatePerimeter());
    }
}