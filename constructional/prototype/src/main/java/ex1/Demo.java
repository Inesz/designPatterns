package ex1;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        circle.color = "blue";
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);


        if (circle != anotherCircle) {
            System.out.println("Shapes are different objects (yay!)");
            if (circle.equals(anotherCircle)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Shape objects are the same (booo!)");
        }

        printValues(circle);
        printValues(anotherCircle);

        Shape anotherCircle2 = (Shape) circle.clone();
        printValues(anotherCircle2); //all fields, from circle and shape are visible.

        if (circle != anotherCircle2) {
            System.out.println("Shapes are different objects (yay!)");
            if (circle.equals(anotherCircle2)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Shape objects are the same (booo!)");
        }

        //== compares object references, it checks to see if the two operands point to the same object
        // (not equivalent objects, the same object)
        //very important to compare string with equals() method.
        if (circle != circle) {
            System.out.println("Shapes are different objects (yay!)");
        } else {
            System.out.println("Shape objects are the same (booo!)");
        }
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }

    /**
     * pring all
     * @param o
     */
    static void printValues(Object o) {
        Class<?> c = o.getClass();
        List<Field> fields = getPublicFields(c);

        System.out.println("---------");
        System.out.println(o.toString());
        for (Field field : fields) {
            try {
                System.out.println(field.getName() + " : " + field.get(o));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    static List<Field> getAllFieldsNames(Class<?> c){
        List<Field> fields = new ArrayList<Field>();

        for (Class<?> sc = c; sc != null; sc = sc.getSuperclass()) {
            fields.addAll(Arrays.asList(sc.getDeclaredFields()));
        }

        return fields;
    }

    static List<Field> getPublicFields(Class<?> c){
        List<Field> fields = new ArrayList<Field>();
        fields.addAll(Arrays.asList(c.getFields()));

        return fields;
    }
}