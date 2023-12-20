package mirea.JavaLesson.practical5;

public class Person implements Nameable{
    private String name;
    private float height;
    private float weight;
    public Person(String name, float height, float weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }
}
