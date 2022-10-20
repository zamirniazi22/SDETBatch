package class14Tasks;

public class taskk3 {
    void printPalindrome(String word){
        StringBuilder str= new StringBuilder(word);
        str.reverse();
        if (str.toString().equals (word)){
            System.out.println("is palindrome");
        }else{
            System.out.println("is not palindrome");
        }
    }

    public static void main(String[] args) {
        taskk3 find=new taskk3();
        find.printPalindrome("dad");
        find.printPalindrome("car");
        find.printPalindrome("mom");
    }
}
