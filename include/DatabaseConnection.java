package org.nlt.include;

import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class DatabaseConnection 
{
    private static SessionFactory sf=null;
    private static Session ses=null;
    
    //this is a constructor which we have to call only once in project
    private DatabaseConnection()
    {
        try
        {
            sf=new Configuration().configure().buildSessionFactory();
            ses=sf.openSession();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Database Connection", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static Session getDatabaseSession()
    {
        //very first time ses will be null then if will be true
        //then it will call constructor of class will initialize ses
        //after initializing it will return ses
        //but 2nd,3rd & so on time it will not call constructor
        //it means without calling constructor it will return ses
        //bcoz after first time ses will not be null there
        if(ses==null)
        {
            new DatabaseConnection();
        }
        return ses;
    }
    
}
