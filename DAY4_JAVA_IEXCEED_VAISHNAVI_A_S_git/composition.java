class computers{
    private final processors processors;
    String company,model;
    computers(String company,String model){
        
        this.company=company;
        this.model=model;
        processors  = new processors("zxc");
    }
    public void computer_display(){
        System.out.println("windows");
    }


}
class processors{
    String type;
    processors(String type){
        this.type=type;
    }
    public void processor_display(){
        System.out.println("processors type"+type);
    }

}
public class composition {
    public static void main(String[] args) {
        computers c1=new computers("dell", "intel-core");
        c1.computer_display();
    }
    
}
