public class AnimalTester {
       public static void main(String[] args) {
         Dog dog = new Dog("Buddy", 5, "Brown", "Bulldog");
         Cat cat = new Cat("Kitty", 3, "White", "Persian");
         System.out.println("1.========");
         System.out.println(dog.info());
         System.out.println("2.========");
         System.out.println(cat.info());
         System.out.println("3.========");
         dog.makeSound();
         System.out.println("4.========");
         cat.makeSound();
       }
   }

class Animal {
    public String name;
    public int age;
    public String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    public String info() {
      return "Name: "+name+"\nAge: "+age+"\nColor: "+color+"\n";
    }
}

//TASK4
class Dog extends Animal{
       String breed;
       public Dog(String nam, int age, String col, String br){
              super(nam, age, col);
              this.breed =br;
              
       }

       public void makeSound() {
              System.out.println(this.color + " color " + this.name + " is barking");
       }

       public String info(){
              return super.info() + "Breed: " + this.breed;
       }
}

class Cat extends Animal{
       String breed;
       public Cat(String nam, int age, String col, String br){
              super(nam, age, col);
              this.breed =br;
              
       }

       public void makeSound() {
              System.out.println(this.color + " color " + this.name + " is meowing");
       }

       public String info(){
              return super.info() + "Breed: " + this.breed;
       }  
}
