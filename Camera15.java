class Camera {
    private String brand;
    private double cost;

    public Camera(String brand, double cost) {
        this.brand = brand;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return brand + ", " + cost + " Rupees ";
    }
}

class DigitalCamera extends Camera {
    private int memory;

    public DigitalCamera(String brand, double cost, int memory) {
        super(brand, cost);
        this.memory = memory;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + memory + "GB";
    }
}

public class Camera15 {
    public static void main(String[] args) {
        // Create an instance of DigitalCamera
        DigitalCamera digitalCamera = new DigitalCamera("Nikon", 10000, 16);
        
        // Display the output
        System.out.println(digitalCamera);
    }
}