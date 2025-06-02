package Objects;


/*
    Since this is European furniture, everything is measured in cm and kg

 */


public class Table {
    // Attributes
    double height;
    double width;
    double weight;
    double price;
    double length;

    // Default Constructor - Special Methods
    //Name of the Method = the name of the class
    public Table() {
        height = 23;
        width = 40;
        weight = 52;
        price = 50;
        length = 936;


    }

    // Getter/Accessors
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }
    public double getLength() {
        return length;
    }






}
