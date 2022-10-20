package class14Tasks;

public class taskk7 {
    char getGrade(int score) {
        char grade;
        if (score > 90) {
            grade = 'A';
        }else  if (score > 80) {
            grade = 'B';
        }else if (score > 70) {
            grade = 'C';
        } else if (score > 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return grade;
    }
    public static void main(String[] args) {
        taskk7 find=new taskk7();

        System.out.println(find.getGrade(40));
    }
}
