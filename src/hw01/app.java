import java.lang.management.MonitorInfo;

class Vehicle {
    int speed;
    Vehicle(){
        System.out.println("Vechicle()");
        this.speed = 0;
    }
    void pushAccelerator(){
//        오버라이딩될 멤버 메서드
        this.speed += 10;
        return;
    }
    void showDashBoardValues(){
        return;
    }
}
class EngineBasedCar extends Vehicle {
    int fuel;
    EngineBasedCar(){
        System.out.println("EngineBasedCar()");
        this.fuel = 100;
    }
    void pushAccelerator(){
        this.speed += 10;
        this.fuel -= 1;
        return;
    }
    void showDashBoardValues(){
        System.out.println("speed : " + this.speed + "km/h");
        System.out.println("fuel : " + this.fuel + "L");
        return;
    }
}
class MotorBasedCar extends Vehicle{
    int e_fuel;
    MotorBasedCar(){
        System.out.println("MotorBasedCar()");
        this.e_fuel = 10000;
    }
    void pushAccelerator(){
        this.speed += 10;
        this.e_fuel -= 10;
        return;
    }
    void showDashBoardValues(){
        System.out.println("speed : " + this.speed + "km/h");
        System.out.println("e_fuel : " + this.e_fuel + "kWh");
        return;
    }
}
public class app {
    public static void main(String[] args) {
//        탈 것 클래스 정의

        EngineBasedCar ebc = new EngineBasedCar();
        ebc.pushAccelerator();
        ebc.pushAccelerator();
        ebc.showDashBoardValues();

        MotorBasedCar mbc = new MotorBasedCar();
        mbc.pushAccelerator();
        mbc.pushAccelerator();
        mbc.showDashBoardValues();

        return;
    }
}

