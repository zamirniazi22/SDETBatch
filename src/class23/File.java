package class23;

public abstract class File {

     /* Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method
        while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
        Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc*/

 abstract void open();
 void edit(){
     System.out.println("please edit the file");
 }
 void close(){
     System.out.println("after editing the file should be closed ");
 }

}
class JavaFile extends File {


    void open() {
        System.out.println("to open .java file we need notepad++ or sublime text");
    }
}

class WordFile extends File {


    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");

    }
}

class pdfFile extends File {

    @Override
    void open() {
        System.out.println("to open pdf: we need to install pdf reader");

    }

    public static void main(String[] args) {
        File[] file={new JavaFile(),new pdfFile(),new WordFile()};
        for(File files:file){
            files.open();
            
        }
        /*File file= new JavaFile();
        file.open();
        file.close();
        file.edit();
        file = new WordFile();
        file.open();
        file.edit();
        file.close();
        file = new pdfFile();
        file.open();
        file.edit();
        file.close();*/
    }
}

