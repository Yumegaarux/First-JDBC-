package classes;

public class Car {
    private String plate;
    private String brand;
    private String name;
    private int model;

    public Car(String plate,String brand,String name, int model){
        this.plate = plate;
        this.brand = brand;
        this.name = name;
        this.model = model;
    }
    
    public String getPlate(){
        return plate;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public String getName(){
        return name;
    }
    
    public int getModel(){
        return model;
    }
}
