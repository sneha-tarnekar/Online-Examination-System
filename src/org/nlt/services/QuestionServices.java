package org.nlt.services;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.nlt.include.DatabaseConnection;
import org.nlt.model.Questions;

public class QuestionServices {
    
    public static List<Questions> getQuestionList() {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        Query query = ses.createQuery("from Questions where status=1");
        List<Questions> questionList = query.list();
        ses.getTransaction().commit();
        return questionList;//will return list of question object 
    }
    
    public static List<Questions> getPracticeQuestionList() {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        Query query = ses.createQuery("from Questions where status=2");
        List<Questions> questionList = query.list();
        ses.getTransaction().commit();
        return questionList;//will return list of question object 
    }
    
    public static void addQuestion(Questions question)//this method will receive USers object add in database
    {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        ses.save(question);
        ses.getTransaction().commit();
    }
    
     public static void updateQuestion(Questions question)//this method will receive USers object add in database
    {
        Session ses = DatabaseConnection.getDatabaseSession();
        ses.beginTransaction();
        ses.update(question);
        ses.getTransaction().commit();
    }
}
