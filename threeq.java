// Create a base class Person with a constructor that accepts a name.
// Create a derived class Student that extends Person and also accepts a roll number in its constructor.
// When a Student object is created, it should call the Person constructor first, then its own constructor.
// Print both the name and roll number of the student.
// 👉 Hint: Use super() inside the Student constructor.

class name{
    String stname;
    name(String stname){
        this.stname=stname;
        System.err.println("These is the name of student"+stname);
    }
}
class rollno extends name{
    int rollnu;
    rollno(String stname,int rollnu){
        super(stname);
        this.rollnu=rollnu;
        System.err.println("This is the rollno:"+rollnu);
    }
}
public class threeq{
    public static void main(String[] args) {
        rollno obj=new rollno("Himanshu",66);
        
    }
}