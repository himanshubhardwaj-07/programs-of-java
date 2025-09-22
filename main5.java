public class main5 {
    int sum(int a, int b){
        return a +b;
    }
    void pos(int result){
        if (result % 2==0) {
            System.out.println("postive");
        } else {
            System.err.println("Negative");
        }
    }
    public static void main(String[] args) {
        main5 obj=new main5();
       int result=obj.sum(44,1);
        System.out.println(result);
        main5 obj1=new main5();
        obj1.pos(result);
    }
}
