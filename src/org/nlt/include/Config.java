package org.nlt.include;

import java.util.LinkedHashMap;
import java.util.Properties;
import org.nlt.model.Questions;
import org.nlt.model.Results;
import org.nlt.model.Users;
import org.nlt.view.DefaultFrame;
import org.nlt.view.ExaminationFrame;
import org.nlt.view.InstructionFrame;
import org.nlt.view.LoginFrame;
import org.nlt.view.MainFrame;
import org.nlt.view.PracticeFrame;
import org.nlt.view.QuestionFrame;
import org.nlt.view.ResultFrame;
import org.nlt.view.SettingFrame;
import org.nlt.view.SignupFrame;
import org.nlt.view.StudentFrame;

public class Config {
public static MainFrame mainFrame=null;
public static LoginFrame loginFrame=null;
public static SignupFrame signupFrame=null;
public static StudentFrame studentFrame=null;
public static InstructionFrame instructionFrame=null;
public static ExaminationFrame examinationFrame=null;
public static PracticeFrame practiceFrame=null;
public static SettingFrame settingFrame=null;
public static QuestionFrame questionFrame=null;
public static ResultFrame resultFrame=null;
public static DefaultFrame defaultFrame=null;

public static LinkedHashMap<String,Users> userMap=new LinkedHashMap();
public static LinkedHashMap<String,Questions> questionMap=new LinkedHashMap();
public static LinkedHashMap<String,Questions> practiceQuestionMap=new LinkedHashMap();
public static LinkedHashMap<String,Results> resultMap=new LinkedHashMap();

public static Users loginUser=null;
public static Properties props = new Properties();
}
