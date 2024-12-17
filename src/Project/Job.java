package Project;

public class Job
{
    // attributes
    private String name;
    private int minimalWage;

    // constructor
    public Job(String name, int minimalWage)
    {
        this.name = name;
        this.minimalWage = minimalWage;
    }

    // getters
    public String getName()
    {
        return this.name;
    }

    public int getMinimalWage()
    {
        return this.minimalWage;
    }

    // setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setMinimalWage(int minimalWage)
    {
        this.minimalWage = minimalWage;
    }
}
