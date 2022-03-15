import java.util.*;
class Animal
{
    private String breed;
    private int id=1000;
    public Animal(){
        this.breed="Dog"; 
    }
    public int getTax(){
        return id;
    }
    public void display(){
        System.out.println("BreedName: "+this.breed+" TaxId: "+this.id);
    }
}
public class Dog extends Animal
{
    private String dogBreed;
    private int id=2000;
    public Dog(String dogBreed){
        super.display();
        this.dogBreed=dogBreed; 
    }
    public int getTax(){
        return id;
    }
    public void display(){
        System.out.println(this.dogBreed);
    }
    public static void main(String args[]) throws java.lang.Exception
    {
       Dog v=new Dog("German");
       System.out.println(v.getTax());
    }
}