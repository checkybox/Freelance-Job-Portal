package Abstract;

public abstract class Employment
{
    public Employment(String title, float salary, String location)
    {
        this.title = title;
        this.salary = salary;
        this.location = location;
    }

    // class attributes
    private String title;
    private float salary;
    private String location;

    // getters
    public String getTitle() { return title; }
    public float getSalary() { return salary; }
    public String getLocation() { return location; }

    // setters
    public void setTitle(String title) { this.title = title; }
    public void setSalary(float salary) { this.salary = salary; }
    public void setLocation(String location) { this.location = location; }

    // abstract class methods

}
