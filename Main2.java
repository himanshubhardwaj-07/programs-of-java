public class Main2 {
    String name, surname;

    // Parameterized constructor
    Main2(String n, String s) {
        name = n;           
        surname = s;
        System.out.println("This is parameterized constructor: " + name);
        System.out.println("This is surname: " + surname);
    }

    // Copy constructor
    Main2(Main2 obj) {
        name = obj.name;
        surname = obj.surname;
        System.out.println("Copy constructor called: " + name + " " + surname);
    }

    // Display method
    void display() {
        System.out.println("PRINT: " + name + " " + surname);
    }

    public static void main(String[] args) {
        // Using parameterized constructor
        Main2 object1 = new Main2("Kamlesh", "Vyas");
        object1.display();

        // Using copy constructor
        Main2 object2 = new Main2(object1);
        object2.display();
    }
}
