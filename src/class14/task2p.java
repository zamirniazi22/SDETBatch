package class14;

public class task2p {
    public static void main(String[] args) {
        String str;
        str = "dsfkjAMNJK1435*&%";
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("str="+str);
    }
}
