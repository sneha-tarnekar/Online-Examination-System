package org.nlt.services;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.nlt.include.DatabaseConnection;
import org.nlt.model.Users;

public class UserServices {

    public static void addUser(Users user)//this method will receive USers object add in database
    {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        ses.save(user);
        ses.getTransaction().commit();
    }
    
    public static void updateUser(Users user)//this method will receive USers object add in database
    {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        ses.update(user);
        ses.getTransaction().commit();
    }

    //public accessible from anywhere & static i.e. we can call by using classname
    

    //this service we can user for login
    public static Users getUser(String email, String password,String userType) {
        int sta=0;
        if(userType.equals("ADMIN"))
        {
            sta=2;
        }
        else if(userType.equals("STUDENT"))
        {
            sta=3;
        }
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();

        Query query = ses.createQuery("from Users where email='" + email + "' and password='" + password + "' and status="+sta);
        List<Users> userList = query.list();
        Iterator<Users> itr = userList.iterator();
        ses.getTransaction().commit();

        if (itr.hasNext())//if itr present record
        {
            Users user = itr.next();
            return user;
        } else//invalid email or password
        {
            return null;
        }
    }

    //this service we can use for forgot password
    public Users getUser(String email) {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();

        Query query = ses.createQuery("from Users where email='" + email + "' and status=1");
        List<Users> userList = query.list();
        Iterator<Users> itr = userList.iterator();
        ses.getTransaction().commit();

        if (itr.hasNext())//if itr present record
        {
            Users user = itr.next();
            return user;
        } else//invalid email or password
        {
            return null;
        }
    }

    //this service we can user to get list of users object
    public static List<Users> getUserList() {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        Query query = ses.createQuery("from Users where status>=1 and status<>2");
        List<Users> userList = query.list();
        ses.getTransaction().commit();
        return userList;//will return list of users object 
    }
    
}