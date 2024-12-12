package Project;

public class Freelancer
{
    private String name;
    private int age;
    private String job;

    public Freelancer(String name, int age, String job)
    {
        this.name = name;
        this.age = age;
        this.job = job;
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
