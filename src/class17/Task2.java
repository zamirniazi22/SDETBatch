package class17;

public class Task2 {

    public static String reversedStr(String str){
        // firstway
        String newStr;
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
       newStr=sb.toString();
      return newStr;

        //second way
      //  return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Task2 find=new Task2();
        System.out.println(find.reversedStr("monday"));
    }

}
