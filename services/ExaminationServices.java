package org.nlt.services;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.nlt.include.Config;
import org.nlt.include.DatabaseConnection;
import org.nlt.model.Examinations;
import org.nlt.model.Users;

public class ExaminationServices {
    public static void addExaminationQuestion(Examinations examination)
    {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        ses.save(examination);
        ses.getTransaction().commit();
    }
    
    public static List<Examinations> getExaminations(Users loginUser )
    {
         Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        Query query = ses.createQuery("from Examinations where status=1 and user_id="+loginUser.getId());
        List examinationList = query.list();
        return examinationList;
    }
    
    public static List<Examinations> getPractice()
    {
         Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        Query query = ses.createQuery("from Examinations where status=1");
        List examinationList = query.list();
        return examinationList;
    }
    
}
