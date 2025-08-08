@FunctionalInterface
interface program {
    void display();


    
}
public class function_interface {
    public static void main(String[] args) {
        
        program p1=new program() {
            public void display(){
                for(int i =0;i<10;i++){
                    System.out.println(i);
                }
            }
        };
        p1.display();
    }
    
}
