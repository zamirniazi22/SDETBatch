package Class19;

public class furniture {
String color="green";
}
class chair extends furniture{
    String color="Red";
    void printColor(){
        String color="Black";
        System.out.println(super.color);
        System.out.println(this.color);
        System.out.println(color);
    }
}
class Testchair{
    public static void main(String[] args) {
        chair chr=new chair();
                chr.printColor();
    }
}