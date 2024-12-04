// 咖啡类
abstract class Coffee {
    public abstract String getName();

    public void addMilk() {
        System.out.println("Add milk to " + getName());
    }

    public void addSugar() {
        System.out.println("Add sugar to " + getName());
    }
}

// 工厂接口
interface CoffeeFactory {
    Coffee createCoffee();
}
