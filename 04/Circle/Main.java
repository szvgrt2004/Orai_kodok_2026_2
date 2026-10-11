class Circle
{
    public static int circleCount = 0; //osztályváltozó

    private double radius; //attribútumok -> példányváltozók

    public Circle(double radius) //konstruktor
    {
        this.radius = radius;
        circleCount++;
    }

    @Override
    public String toString() {
        return "" + this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class Main
{
    public static void main(String[] args) {
        System.out.println(Circle.circleCount);
        Circle c1 = new Circle(2.5);
        //1
        //System.out.println(c1);
        System.out.println(Circle.circleCount);
        Circle c2 = new Circle(3.5); 
        //2
        System.out.println(Circle.circleCount);
        Circle c3 = new Circle(4.5);
        //3
        System.out.println(Circle.circleCount);
    }
}