class data{
    void datamain(){
        System.err.println("Enter your data to get know to:");
    }
}
class dataset extends data{
    void mained(){
        System.err.println("this us sub class");
    }
}
public class inheri{
    public static void main(String[] args) {
        System.err.println("This is:");
        dataset obj=new dataset();
        obj.datamain();
        obj.mained();
    }
}