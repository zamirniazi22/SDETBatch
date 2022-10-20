package class18;

public class Horse extends Animal {

public Horse(String name, String breed, int age,
              double weight){
   this.name=name;
    this.breed=breed;
    this.age=age;
    this.weight=weight;


}

 void print(){
    System.out.println(" name "+name+" breed "+breed+" age "+age+" weight "+weight);
}

    public static void main(String[] args) {
        Horse horse= new Horse("sprit","Stallion",20,400);
        horse.print();
    }
}
