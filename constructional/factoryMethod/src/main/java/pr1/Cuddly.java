package pr1;

public class Cuddly extends Product {
    String softness;

    public String toString(){
        return "Cuddly " + this.softness + " " + super.price;
    }
}
