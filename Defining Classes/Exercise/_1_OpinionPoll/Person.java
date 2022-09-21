package DefiningClasses.Lab.Exercise._1_OpinionPoll;

public class Person {
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;


    public String toString (){
        return (String.format("%s - %d", getName(), getAge()));
    }

}
