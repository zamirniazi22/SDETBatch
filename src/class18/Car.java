package class18;
public class  Car{
    String Model;
    String make;
    int year;
    String color;
    int topspeed;
    double price;
    void printCarDetails(){
        System.out.println("Model "+Model+" Make "+make+" color "+color);
    }
}
class BMW extends Car{
    double enginCC;
void printengin(){
    System.out.println("engin "+enginCC);
}
}
class Tesla extends Car{

}
class Toyota extends Car{
    double enginCC;
        }
        class CarTester{
            public static void main(String[] args) {
                BMW bmw=new BMW();
                bmw.make="BMW";
                bmw.color="Black";
                bmw.Model="x8";
                bmw.enginCC=200;
                bmw.printCarDetails();
                bmw.printengin();

            }

        }