class Engine {
    String enginename;
    int enginemodel, price;

    void enginedetails(String enginename, int enginemodel, int price) {
        this.enginename = enginename;
        this.enginemodel = enginemodel;
        this.price = price;

        System.out.println("=== Car Engine Details ===");
        System.out.println("Car Name   : " + enginename);
        System.out.println("Model No.  : " + enginemodel);
        System.out.println("Price      : " + price + " INR");
        System.out.println("----------------------------");
    }
}

class Outer extends Engine {
    String placeofmodel;
    String ownername;

    void ownerdetails(String placeofmodel, String ownername) {
        this.placeofmodel = placeofmodel;
        this.ownername = ownername;

        System.out.println("=== Owner & Location Details ===");
        System.out.println("Car Name   : " + enginename);
        System.out.println("Model No.  : " + enginemodel);
        System.out.println("Price      : " + price + " INR");
        System.out.println("Place      : " + placeofmodel);
        System.out.println("Owner Name : " + ownername);
        System.out.println("============================");
    }
}

// ✅ Multilevel inheritance (Outer extends Engine, Detailsofcarstech extends Outer)
class Detailsofcarstech extends Outer {
    String typecar;
    int topspeed;
    double average;

    void cardetails(String typecar, int topspeed, double average) {
        this.typecar = typecar;
        this.topspeed = topspeed;
        this.average = average;

        System.out.println("=== Technical Car Details ===");
        System.out.println("Car Name   : " + enginename);
        System.out.println("Model No.  : " + enginemodel);
        System.out.println("Owner Name : " + ownername);
        System.out.println("Type       : " + typecar);
        System.out.println("Top Speed  : " + topspeed + " km/h");
        System.out.println("Average    : " + average + " km/l");
        System.out.println("******************************");
    }
}

public class Main10 {
    public static void main(String[] args) {
        Detailsofcarstech obj = new Detailsofcarstech();

        obj.enginedetails("BMW", 991, 89900);
        obj.ownerdetails("Nagaur", "Himanshu");
        obj.cardetails("Sedan", 260, 32.32);
    }
}
