

public class main7 {
    void getdata(int number1,int number2){
        int result=number1+number2;
        System.err.println("Enter your number to find out the addition:"+result);
    }
    void  getdata(double number1,double number2){
        double result=number1+number2;
        System.err.println("Enter your number to find out the addition:"+result);
    }
    void getdata(int number1,int number2,int number3,String name){
        System.err.println("Enter your number to find out the addition:");
        int result=number1+number2+number3;
        System.out.println("AND THIS IS YPUR NAME:"+name+result);
    }
    public static void main(String [] args){
        main7 obj= new main7();
        obj.getdata(31,31,32,"himanshu");
        obj.getdata(31, 33);
        obj.getdata(33.33, 33.40);
    }
}
