package ex1;

public class Garland extends TreeDecorator {

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }
}