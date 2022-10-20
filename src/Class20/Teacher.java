package Class20;


   // Write a Java program called Teacher.  Identify features and behaviour of that Class.
     //   Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
   // that would have it their own features and behaviour. Test all 4 classes

    public class Teacher{
        String name;
        String lastname;
        int age;
        int noOfExperiance;
        Teacher(String name, String lastname, int age,
                int noOfExperiance) {
            this.name = name;
            this.lastname = lastname;
            this.age = age;
            this.noOfExperiance = noOfExperiance;

            }
        void printinfo()
        {
            System.out.println("name " + name + " lastname " + lastname + " age" + age + " Experiance " + noOfExperiance);
        }


}
class MathTeacher extends Teacher {
    MathTeacher(String name, String lastname, int age,
            int noOfExperiance){
        super(name, lastname, age, noOfExperiance);
    }
}
class ChemistryTeacher extends Teacher{
    ChemistryTeacher(String name, String lastname, int age,
                int noOfExperiance){
        super(name, lastname, age, noOfExperiance);


    }
}
   class PianoTeacher extends Teacher {
       PianoTeacher(String name, String lastname, int age,
        int noOfExperiance){
           super(name, lastname, age, noOfExperiance);
       }

       public static void main(String[] args) {
           Teacher Teach=new Teacher("Aslam","yaar",25,5);
           Teach.printinfo();
         MathTeacher math  =new MathTeacher("salman","khan ",57,30);
           math.printinfo();
           ChemistryTeacher Teacher =new ChemistryTeacher("salman","ali",57,30);
           Teacher.printinfo();
       }
   }