package org.example;
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World");
            getValue();
            System.out.println("nach der exception");
        } catch (InvalidIdException e) {
            System.out.println("Exception caught");

        }
      //  getValue();
    }

    public static String getValue() throws InvalidIdException {
        //exception
       throw new InvalidIdException("not found, my good friend");

    }
}
