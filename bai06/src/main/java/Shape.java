public abstract class Shape {
    //super class = parent class
    private String color;
    private String name;

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void doSomething() {
        System.out.println("Do something in Shape");
    }
    public abstract Double getArea();
}
