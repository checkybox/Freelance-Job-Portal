package Project;

/* TODO:
derive properties from employment superclass
add jobType parameter (full-time/part-time/freelance/remote)
 */

public class Job
{
    public Job(){}

    public Job(String name, int minimalWage)
    {
        this.name = name;
        this.minimalWage = minimalWage;
    }

    // class attributes
    private String name;
    private int minimalWage;

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
