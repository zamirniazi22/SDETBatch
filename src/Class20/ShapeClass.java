package Class20;

public class ShapeClass {
   // Area of a circle when the radius is known.	πr2
    //Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    //In circle class create a method to calculate the area of circle. Test your code

    double radius;

    ShapeClass(double radius){
        this.radius=radius;
    }
 static class circle extends ShapeClass{
   public circle(double radius){
        super(radius);
    }
    void Calculate(){
        System.out.println(Math.PI*Math.pow(radius,2));
   }
}
  public static void main(String[] args) {
        circle cr = new circle(6);
        cr.Calculate();
    }
        }