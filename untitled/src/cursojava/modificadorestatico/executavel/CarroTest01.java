package cursojava.modificadorestatico.executavel;

import cursojava.modificadorestatico.dominio.Car;

public class CarroTest01 {
    public static void main(String[] args){
        Car car01 = new Car("Mercedes", 280.);
        Car car02 = new Car("Mustang", 310.);
        Car car03 = new Car("Maceratti", 330.);

        car01.getPrintCar();
        car02.getPrintCar();
        car03.getPrintCar();
        car02.setLimitSpeed(340.);
        car01.getPrintCar();
        car02.getPrintCar();
        car03.getPrintCar();
    }
}
