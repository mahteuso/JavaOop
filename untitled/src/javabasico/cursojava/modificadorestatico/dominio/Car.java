package javabasico.cursojava.modificadorestatico.dominio;

public class Car {
    private String name;
    private Double maxSpeed;
    private static Double limitSpeed = 180.0;

    public Car(String name, Double maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public static void setLimitSpeed(Double limitSpeed){
        Car.limitSpeed = limitSpeed;
    }

    public static Double getLimitSpeed(){
        return limitSpeed;
    }
    public void  getPrintCar(){
        System.out.println("name: "+this.name);
        System.out.println("Maximum speed : "+this.maxSpeed);
        System.out.println("Limit speed : "+this.getLimitSpeed() );
        System.out.println("---------------------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
