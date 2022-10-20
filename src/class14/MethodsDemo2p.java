package class14;

import java.sql.SQLOutput;

public class MethodsDemo2p {
    void printManyTimes(String word, int times){
        for (int i=0; i<times; i++){
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        MethodsDemo2p obj=new MethodsDemo2p();
        obj.printManyTimes( "GoodMornig",2);
        obj.printManyTimes( "Goodeveing",3);
        obj.printManyTimes( "Syntax classes is five days a week",5);
    }
}
