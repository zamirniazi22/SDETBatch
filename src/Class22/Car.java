package Class22;

import java.sql.SQLOutput;

public class Car {

    void start() {
        System.out.println("Use the key to start");
    }

    void Stop() {
        System.out.println("Use brakes to stop me");
    }

    void park() {
        System.out.println("park me manually");

    }
}
class BMW extends Car{

    void start() {
        System.out.println("Use push start to start me");
    }
    void Stop() {
        System.out.println("you can also use auto-breaking to stop me ");
    }


}
class Toyota extends Car{
    void start(){
        System.out.println("push me to start");
    }
        }
        class Tesla extends Car{
          void start(){
              System.out.println("Use the App to start me");
          }
          void Stop(){
              System.out.println("Use AI and AutoBrake to stop me");
          }
            void park() {
                System.out.println("I can auto park myself");
            }
        }