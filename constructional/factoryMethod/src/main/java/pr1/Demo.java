package pr1;

public class Demo {
    public static void main(String args[]){
        FabricMethodImpl fm = new FabricMethodImpl();


        System.out.println(fm.fabricMethod("car"));
        System.out.println(fm.fabricMethod("cuddly"));
        System.out.println(fm.fabricMethod("other"));
    }
}