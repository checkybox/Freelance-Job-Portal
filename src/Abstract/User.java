package Abstract;

import Interface.Outputable;
import Project.Freelancer;
import Project.Job;

public abstract class User implements Outputable
{
    public User(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // class attributes
    private int id;
    private String name;
    private int age;

    // getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    // abstract methods
    public abstract void getBasicInfo();
    public abstract void getFullInfo();

    // overrides
    @Override
    public String toString()
    {
        return "ID : " + id
                + "\nName : " + name
                + "\nAge : " + age + "\n";
    }
}
