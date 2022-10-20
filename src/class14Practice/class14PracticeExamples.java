package class14Practice;


import java.util.Arrays;

public class class14PracticeExamples {
    public static void main(String[] args) {
        String sentence="Batch 14 is Great. Batch 14 is excellent? Batch 14 is just amazing";
       String[] split= sentence.split("[.?!]");
        System.out.println(Arrays.toString(split));
    }
}
