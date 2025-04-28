package org.example;

public class Main {

    public static <U> void printBoxContent(Box<U> box) {
        U content = box.getContent();
        System.out.println("Box Content: " + content + " (Type: " + content.getClass().getSimpleName() + ")");
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setContent(456);
        printBoxContent(intBox);

        Box<String> strBox = new Box<>();
        strBox.setContent("Generic Method Demo");
        printBoxContent(strBox);
        Box<Double> doubleBox = new Box<>();
        doubleBox.setContent(3.14159);
        printBoxContent(doubleBox);
    }
}

