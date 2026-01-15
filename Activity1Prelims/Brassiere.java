package Activity1Prelims;

public class Brassiere {
    String color;
    String type;
    String brand;
    String fabric;
    String size;

    void printDescription(){
        System.out.printf("""
            Color: %s
            Type: %s
            Brand: %s
            Fabric: %s
            Size: %s
             
                """, color, type, brand, fabric, size);
    }
}
