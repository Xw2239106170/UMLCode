class NormalBeefNoodle extends BeefNoodle {
    public NormalBeefNoodle() {
        this.price = 10;
        this.name = "Normal Beef Noodle";
    }

    @Override
    public void cook() {
        System.out.println("Cooking " + name + " with price: $" + price);
    }
}

class SignBeefNoodle extends BeefNoodle {
    public SignBeefNoodle() {
        this.price = 15;
        this.name = "Signature Beef Noodle";
    }

    @Override
    public void cook() {
        System.out.println("Cooking " + name + " with price: $" + price);
    }
}

class SauerkrautBeefNoodle extends BeefNoodle {
    public SauerkrautBeefNoodle() {
        this.price = 12;
        this.name = "Sauerkraut Beef Noodle";
    }

    @Override
    public void cook() {
        System.out.println("Cooking " + name + " with price: $" + price);
    }
}
