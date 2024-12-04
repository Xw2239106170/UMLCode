public class Main {
    public static void main(String[] args) {
        // 创建美式咖啡工厂
        CoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        CoffeeStore americanCoffeeStore = new CoffeeStore(americanCoffeeFactory);
        Coffee americanCoffee = americanCoffeeStore.orderCoffee();
        System.out.println("Ordered: " + americanCoffee.getName());

        // 创建拿铁咖啡工厂
        CoffeeFactory latteCoffeeFactory = new LatteCoffeeFactory();
        CoffeeStore latteCoffeeStore = new CoffeeStore(latteCoffeeFactory);
        Coffee latteCoffee = latteCoffeeStore.orderCoffee();
        System.out.println("Ordered: " + latteCoffee.getName());
    }
}
