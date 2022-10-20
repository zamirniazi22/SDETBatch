package Repls;

public class SyntaxTechnologiesclass {

        String schoolName;
        int batch;
        int year;
        String lastDayOfClass;

            SyntaxTechnologiesclass (){

            }
            void display1(){
                System.out.println("null 00 null");

            }



        SyntaxTechnologiesclass(String schoolName, int batch, int year, String lastDayOfClass) {
            this.schoolName = schoolName;
            this.batch = batch;
            this.year = year;
            this.lastDayOfClass = lastDayOfClass;

        }

        void display() {
            System.out.println(schoolName +" " +batch +" " +year + " "+ lastDayOfClass);
        }

        public static void main(String[] args) {
            SyntaxTechnologiesclass Syntax = new SyntaxTechnologiesclass("Syntax", 6, 2020, "07/30/2020");
            Syntax.display();
            Syntax.display1();

        }
    }

