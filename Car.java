//author Robin Dupuis
public class Car extends Vehicle {

    private double speed;//was private
    private String color;
    private String model;
    private boolean supercar;

    public void getSpeed() {
        System.out.print(" it's going at "+speed+"mph.");
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void getColor() {
        System.out.print("The car is "+color+" and ");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getModel() {
        System.out.println();
        System.out.print("Your car's model is "+model+" ,that is nice, but");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void isSupercar() {
        System.out.print(" is it a supercar ? : "+supercar);
        System.out.println();
    }

    public void setSupercar(boolean supercar) {
        this.supercar = supercar;
    }

    @Override
    public void Go() {
        System.out.println();
        System.out.println("The car is moving");
    }
    @Override
    public void Stop(){
        System.out.println("The car is stopped");
    }

  


}
