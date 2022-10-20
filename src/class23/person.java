package class23;

public interface person {
    void eat();

}
interface employee{
    void work();
}
interface Syntaxemployee extends employee,person{
default void createRepl(){

}
}
class Asghar implements Syntaxemployee{

    @Override
    public void eat() {
        System.out.println("like to eat grilled fish");
    }

    @Override
    public void work() {
        System.out.println("Teaches Batch14");

    }

    @Override
    public void createRepl() {
        System.out.println("Create easy Repls");

    }
}