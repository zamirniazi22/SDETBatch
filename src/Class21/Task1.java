package Class21;

public class Task1 {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square ,Box


}
class AreaManager{

    void CalculateArea( double len, double weight){

        System.out.println("The Rectangle Area is"+(len*weight));
    }
    void CalculateArea( double len){

        System.out.println("The Square Area is"+(len*len));
    }
    void Calculatevolume( double len,double hieght,double weight){

        System.out.println("The box volume is"+(len*hieght*weight));
    }

    public static void main(String[] args) {
        AreaManager Area=new AreaManager();
        Area.CalculateArea(10);
        Area.CalculateArea(10,12);
        Area.Calculatevolume(10,12,12);
    }
}