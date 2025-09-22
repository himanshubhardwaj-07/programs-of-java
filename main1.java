
public class main1 {
    int area ,length,breath;
    main1(int length, int breath) {
        this.length=length;
        this.breath=breath;
        System.out.println("This lenght:"+length);
        System.out.println("This breath"+breath);
        }
void display(){
    area=length*breath;
    System.out.println("This is reactqangle:"+area);
}
        
        public static void main(String[] args){
            System.out.println("Now calling deafalt:");
            main1 s1= new main1(32,2);
            s1.display();
            
        }
    }