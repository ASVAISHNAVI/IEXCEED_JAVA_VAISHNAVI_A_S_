class demo extends Thread{
    public void display(){
        System.out.println("hello threads");
    }
    public void run(){
        display();
    }

}
public class pr1 {
    public static void main(String[] args) {
        demo obj1=new demo();
        obj1.start();
    }
    
}
