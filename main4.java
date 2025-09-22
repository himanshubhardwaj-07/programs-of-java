public class main4{
    int num1, num2;
    main4(int a , int b){
        System.out.print("This is Program that calculate your sum:");
        num1= a;
        num2=b;

    }
    int sum(){
        return  num1 +num2;
    }
    public static void main(String[] args) {
        main4 obj=new main4(44,22);
        int result=obj.sum();
        System.out.print(result);
    }
}