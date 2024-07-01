package entities;

public class retangulo {

    public double w, h;
    public String name;

    public double area () {
        return w * h;
    }
    public double perimeter(){
        return 2 * (w + h);
    }
    public double diagonal(){
        return   Math.sqrt (w * w + h * h);
    }

    public String toString () {
         return   String.format("Area = %.2f%n", area())
         + String.format("perimeter = %.2f%n", perimeter())
         + String.format("Diagonal = %.2f%n",diagonal());

    }


}
