package Abstract;

import Interface.Outputable;

public abstract class Employment implements Outputable
{
    public Employment() {}

    public Employment(String title, int salary, String location)
    {
        this.title = title;
        this.salary = salary;
        this.location = location;
    }

    // class attributes
    private String title;
    private int salary;
    private String location;

    // getters
    public String getTitle() { return title; }
    public int getSalary() { return salary; }
    public String getLocation() { return location; }

    // setters
    public void setTitle(String title) { this.title = title; }
    public void setSalary(int salary) { this.salary = salary; }
    public void setLocation(String location) { this.location = location; }

    // abstract methods
    public abstract void getBasicInfo();
    public abstract void getFullInfo();
}
