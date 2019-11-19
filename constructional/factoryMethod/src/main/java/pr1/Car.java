package pr1;

public class Car extends Product{
    String brand;

    public String toString(){
        return "Car " + this.brand + " " + super.price;
    }
}
