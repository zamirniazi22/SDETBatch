package class23;

public interface IDatabase {
    //intefece concept ONLY USE IMPLEMENTS IN INTERFACE BUT WITH ABSTRACT ONLY ABSTRACT KEYWORD

    void openDatabase();
    void readData();
    void writeData();
    void CloseDatabase();

}
class IBM implements IDatabase{

    @Override
    public void openDatabase() {
        System.out.println("opening the IBM database");

    }

    @Override
    public void readData() {
        System.out.println("Reading the data from the  database");
    }

    @Override
    public void writeData() {
        System.out.println("Writing the data to the IBM database");

    }

    @Override
    public void CloseDatabase() {
        System.out.println("close the data from IBM database");

    }

    public static void main(String[] args) {
        IDatabase iDatabase=new IBM();
        iDatabase.readData();
        iDatabase.openDatabase();
        iDatabase.writeData();
        iDatabase.CloseDatabase();
    }
}
