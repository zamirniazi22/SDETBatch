package class23;

public abstract class DataBase {
    //abstruct concept
    abstract void openDatabase();
    abstract void readData();
    abstract  void writeData();
    abstract  void CloseDatabase();
}
// over the error click on the implemention methods
class MicrosoftDataBase extends DataBase{


    @Override
    void openDatabase() {
        System.out.println("Opening the microsoft Database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from MSDDatabase");

    }

    @Override
    void writeData() {
        System.out.println("Writing the data from MSDDatabas");
    }

    @Override
    void CloseDatabase() {
        System.out.println("closing the  MSDDatabas");
    }
}
class Oracle extends DataBase{

    @Override
    void openDatabase() {
        System.out.println("opening the Oracle DataBase");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from Oracle database");
    }

    @Override
    void writeData() {
        System.out.println("writing the data from Oracle database");
    }

    @Override
    void CloseDatabase() {
        System.out.println("closing the data from Oracle database");
    }

    public static void main(String[] args) {
        DataBase data= new Oracle();
        data.openDatabase();
        data.CloseDatabase();
        data.readData();
        data.writeData();

    }
}
