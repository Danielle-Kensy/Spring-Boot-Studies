package kensy.danielle.Exercise1.Model;

/**
 * @author Daniok
 * @since 15/04/2020
 * @version 1.0
 */
public class Trainer {

    private String name;
    private double age;

    public Trainer() {
    }

    public Trainer(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tainer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
