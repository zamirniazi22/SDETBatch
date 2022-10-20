package BatchCl114;

import java.sql.SQLOutput;

public class doingtaskagain {
    public static void main(String[] args) {
int previous=0;
int currentNumber=1;
int nextNum=0;
        System.out.println(previous);
        System.out.println(currentNumber);
        for(int i=0;i<10;i++){
        nextNum=previous+currentNumber;
     System.out.println(nextNum);
     previous=currentNumber;
currentNumber=nextNum;
}







}

}