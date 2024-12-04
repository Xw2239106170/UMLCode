class Sheep implements Cloneable {
    private String name;
    private Integer age;

    // Constructor
    public Sheep(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // Overriding clone method
    @Override
    public Sheep clone() {
        try {
            return (Sheep) super.clone(); // Use Java's native clone method
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null; // Return null in case of an error
        }
    }

    @Override
    public String toString() {
        return "Sheep{name='" + name + "', age=" + age + "}";
    }
}

public class Client {
    public static void main(String[] args) {
        // Original Sheep
        Sheep originalSheep = new Sheep("Dolly", 2);
        System.out.println("Original Sheep: " + originalSheep);

        // Cloned Sheep
        Sheep clonedSheep = originalSheep.clone();
        if (clonedSheep != null) {
            clonedSheep.setName("Molly");
            clonedSheep.setAge(3);
            System.out.println("Cloned Sheep: " + clonedSheep);
        }

        // Verify original sheep is unaffected
        System.out.println("Original Sheep after cloning: " + originalSheep);
    }
}
