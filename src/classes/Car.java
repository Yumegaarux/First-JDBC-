package classes;

public class Car {
    private String plate;
    private String brand;
    private String name;
    private int model;

    public void setPlate(String plate){
        this.plate = plate;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setModel(int model){
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
    
    public String displayCar(){
        String car = plate + " " + brand + " " + name + " " + model;
        return car;
    }
}
