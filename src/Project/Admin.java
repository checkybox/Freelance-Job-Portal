package Project;

import Abstract.User;
import java.util.ArrayList;

public class Admin extends User
{
    public Admin(String username, String password)
    {
        super(username);
        this.password = password;
    }

    // all admin-created users will have negative id's
    private static int lastAssignedId = 0;
    private String username;
    private String password;

    public void addUser(ArrayList<Freelancer> freelancers, String username)
    {
        System.out.println("Adding user " + username);
        Freelancer freelancer = new Freelancer();
        freelancer.setName(username);
        freelancer.setId(--lastAssignedId);
        freelancers.add(freelancer);
        System.out.println("User " + freelancer.getName() + " added.");
    }

    public void removeUser(ArrayList<Freelancer> freelancers, int id)
    {
        System.out.println("Removing user with ID " + id);
        for (Freelancer freelancer : freelancers)
        {
            if (freelancer.getId() == id)
            {
                System.out.println("User " + freelancer.getName() + " removed.");
                freelancers.remove(freelancer);
                return;
            }
        }
        System.out.println("User with ID " + id + " not found.");
    }

    public void addJob()
    {

    }

    public void removeJob()
    {

    }
}
