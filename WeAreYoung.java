public class WeAreYoung {

    public void Go() {
        System.out.println("Your vehicle is moving");
    }

    public void Stop() {
        System.out.println("Your vehicle is stopped");
    }

    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Plane plane = new Plane();
        Vehicle[] vehicles = {car, boat, plane};

        plane.setFlies(false);
        plane.setMaxSpeed(10000);
        plane.setMaxHeight(25000);
        plane.setType("Boeing 747");
        plane.setYear(1968);

        plane.getType();
        plane.getFlies();
        plane.getMaxHeight();
        plane.getMaxSpeed();
        plane.getYear();
        
      
         boat.setType("catamaran");
        boat.setYacht(false);
        boat.setPrice(20000);
       
        boat.getType();
        boat.getYacht();
        boat.getPrice();

        car.setColor("blue");
        car.setSpeed(200);
        car.setModel("Toyota supra");
        car.setSupercar(false);

        car.getColor();
        car.getSpeed();
        car.getModel();
        car.isSupercar();
        for (Vehicle x : vehicles) {
            x.Go();
        }
        plane.Stop();

    }

}
