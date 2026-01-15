package Examples;
public class Laptop{
    String brand;
    String model;
    double storage;
    double memory;
    double dimension;
    double price;
    String condition;

    void printDetails(){
        System.out.printf("""
                %s %s %s
                """, condition, brand, model);
    }
}