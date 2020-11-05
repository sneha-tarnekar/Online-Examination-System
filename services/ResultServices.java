package org.nlt.services;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.nlt.include.DatabaseConnection;
import org.nlt.model.Results;

public class ResultServices {
 public static List<Results> getResultList() {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        Query query = ses.createQuery("from Results where status=1");
        List<Results> resultList = query.list();
        ses.getTransaction().commit();
        return resultList;//will return list of question object 
    }    
 
 public static void addResult(Results result)//this method will receive USers object add in database
    {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        ses.save(result);
        ses.getTransaction().commit();
    }
 
}
