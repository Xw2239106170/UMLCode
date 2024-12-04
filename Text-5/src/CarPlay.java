// 定义颜色接口
interface Color {
    void paint(String carType);
}

// 红色实现类
class Red implements Color {
    @Override
    public void paint(String carType) {
        System.out.println("Painting the " + carType + " in Red color.");
    }
}

// 白色实现类
class White implements Color {
    @Override
    public void paint(String carType) {
        System.out.println("Painting the " + carType + " in White color.");
    }
}

// 抽象的汽车类
abstract class CarPlay {
    protected Color color;

    public Car(Color color) {
        this.color = color;
    }

    public abstract void move();
}

// 汽油车类
class PetrolCar extends Car {
    public PetrolCar(Color color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.print("Petrol Car is moving. ");
        color.paint("Petrol Car");
    }
}

// 电动车类
class ElectricCar extends Car {
    public ElectricCar(Color color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.print("Electric Car is moving. ");
        color.paint("Electric Car");
    }
}

// 测试类
public class Car {
    public static void main(String[] args) {
        // 创建一个红色汽油车
        Car petrolCar = new PetrolCar(new Red());
        petrolCar.move();

        // 创建一个白色电动车
        Car electricCar = new ElectricCar(new White());
        electricCar.move();
    }
}
