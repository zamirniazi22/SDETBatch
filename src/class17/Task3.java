package class17;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Task3 {
    @Contract(pure = true)
    private static @NotNull String getvowels(String Str){
    String newStr= Str.replaceAll("[^aeiouAIEOU]","");
    return newStr;
    }

    public static void main(String[] args) {
        Task3 find= new Task3();
        System.out.println(find.getvowels("zamir"));
    }
}
