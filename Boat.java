//author Robin Dupuis
public class Boat extends Vehicle {
    private String type;
   private Boolean yacht;
    private double price;

    public void getType() {
        System.out.print("Your boat is a "+type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getYacht() {
        System.out.print(", but is it considered a yacht ? : "+yacht);
    }

    public void setYacht(Boolean yacht) {
        this.yacht = yacht;
    }

    public void getPrice() {
        System.out.println(" it costs "+price+"$ that is a little expensive! Overall you got a pretty nice boat.");
        System.out.println();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
   public void Go(){
       System.out.println("The boat is moving");
   }
   @Override
   public void Stop(){
       System.out.println("The boat is stopped");
   }


   
    
}
