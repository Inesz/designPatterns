package ex1;

public class Main {
    public static void main(String[] args) {
        ChristmasTree tree1 = new BubbleLights(new ChristmasTreeImpl());
        ChristmasTree tree2 = new BubbleLights(new Garland(new BubbleLights(new ChristmasTreeImpl())));

        System.out.println(tree1.decorate());
        System.out.println(tree2.decorate());
    }
}
