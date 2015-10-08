package controllers;

//import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

import models.User;

public class PacemakerAPI
{
  //private List <User> users = new ArrayList<User>();
  //private Map<String, User> users = new HashMap<String, User>();
  private Map<String, User> users = new HashMap<>();
  
  public Collection<User> getUsers ()
  {
	//return users;
    return users.values();
  }

  public  void deleteUsers() 
  {
    users.clear();
  }

  public User createUser(String firstName, String lastName, String email, String password) 
  {
    User user = new User (firstName, lastName, email, password);
    //users.add(user);
    users.put(email, user);
    return user;
  }
  
  public User getUser(String email) 
  {
   /* for (User user : users)
    {
      if (email.equals(user.email))
        return user;
    }
    return null;*/
	  return users.get(email);
  }

  public void deleteUser(String email) 
  {
   /* User foundUser = null;
    for (User user : users)
    {
      if (email.equals(user.email))
        foundUser = user;
    }
    if (foundUser != null)
    {
      users.remove(foundUser);
    }*/
	  users.remove(email);
  }
}