package entities;

public class Triangle {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 *(height * width);
    }

    public double diagonal(){
        return Math.sqrt(width * width + height * height);
    }

    public String toString(){
        return "Triangle: " + width + " x " + height + " = " + String.format("%.2f", area()) + ", Triagle perimeter: " + String.format("%.2f", perimeter())+ ", Triangle: "+ String.format("%.2f", diagonal());
    }
}
