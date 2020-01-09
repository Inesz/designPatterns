package ex1;

public class Main {
    public static void main(String[] args) {
        ChristmasTree tree1 = new BubbleLights(new ChristmasTreeImpl());
        ChristmasTree tree2 = new BubbleLights(new Garland(new BubbleLights(new ChristmasTreeImpl())));
        ChristmasTree tree3 = new BubbleLights(new Garland(new ChristmasTreeImpl()));
        
        System.out.println(tree1.decorate());
        System.out.println(tree2.decorate());
        System.out.println(tree3.decorate());
    }
}

/*
decorate() execute recursion;

Output:

Christmas tree with Bubble Lights
Christmas tree with Bubble Lights with Garland with Bubble Lights
Christmas tree with Garland with Bubble Lights
 */