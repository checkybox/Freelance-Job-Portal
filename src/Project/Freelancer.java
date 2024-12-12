package Project;

public class Freelancer
{
    private String name;
    private int age;
    private String job;

    // constructor
    public Freelancer(String name, int age, String job)
    {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void work()
    {
        System.out.println(this.name + " is working on the project...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("The work is finished.");
    }

    // get methods
    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getJob()
    {
        return this.job;
    }

    // set methods
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setJob(String job)
    {
        this.job = job;
    }
}
