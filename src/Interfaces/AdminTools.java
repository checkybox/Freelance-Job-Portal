package Interfaces;

import Project.Freelancer;
import java.util.ArrayList;

// AdminTools interface
// not yet implemented

public interface AdminTools
{
    void addUser(String username);
    void removeUser(ArrayList<Freelancer> freelancers, int id);
    void addJob();
    void removeJob();
}
