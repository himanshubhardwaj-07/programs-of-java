public class Main3 {
    String laptop,model;
    Main3(String laptopname){
        // this.laptop=laptop;
        laptop=laptopname;
        System.out.println("This is your laptop:"+laptop);
    }
    Main3(Main3 obj,String model){
        laptop=obj.laptop;
        System.out.println("This is model:"+model);
        System.out.println("This is laptop name form copy construstor:"+laptop);
    }
    public static void main(String[] args) {
        Main3 object=new Main3("ASUS");
        Main3 object1=new Main3(object, "pro 15");
    }
}
