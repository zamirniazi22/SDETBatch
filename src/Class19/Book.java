package Class19;

public class Book {
   /* Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed*/
    String name;
    String Authour;
    int noOfChipters;
    int yearpublished;
    int ISBN;

  public  Book( String name,String Authour, int noOfChipters,int yearpublished){
        this.name=name;
        this.Authour=Authour;
        this.noOfChipters=noOfChipters;
        this.yearpublished=yearpublished;
    }
   public Book( String name,String Authour, int noOfChipters,int yearpublished,int ISBN) {
       /* this.name=name;
        this.Authour=Authour;
        this.noOfChipters=noOfChipters;
        this.yearpublished=yearpublished;*/
       this(name, Authour, noOfChipters, yearpublished);
       this.ISBN = ISBN;
   }

       void printbook(){
           System.out.println("name "+ name+" Author "+Authour+" noOfChipters "+noOfChipters+" published year "+yearpublished+" ISBN "+ISBN);
       }

    public static void main(String[] args) {
        new Book("javaBasics","zamir",10,2021).printbook();
        new Book("javaadvance","khan",11,2020,1234).printbook();
    }

}
