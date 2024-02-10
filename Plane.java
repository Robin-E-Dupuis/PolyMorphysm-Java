//author Robin Dupuis

public class Plane extends Vehicle {
    private String type;
    private Boolean flies;
    private double maxHeight;
   private double maxSpeed;
    private  int year;

    public void getType() {
        System.out.print("Your plane is a "+type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getFlies() {
        if(flies==true)
         System.out.print(", it is also flying.");
        else
            System.out.print(", it is not flying though.");
    }

    public void setFlies(Boolean flies) {
        this.flies = flies;
        
    }

    public void getMaxHeight() {
        System.out.println();
        System.out.print("The maximum height achievable by your plane is "+maxHeight+" feet ,");
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public void getMaxSpeed() {
       
        System.out.print("it's maximum speed is "+maxSpeed+ " wow that is fast !");
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void getYear() {
        System.out.println(" Your plane was made in "+year+" how interesting!");
        System.out.println();
    }

    public void setYear(int year) {
        this.year = year;
    }
   
    @Override
    public void Go(){
        
        System.out.println("Your plane is moving");
        
    }

   @Override
   public void Stop(){
       System.out.println("Your plane is stopped");
  
   }
    
    
}
