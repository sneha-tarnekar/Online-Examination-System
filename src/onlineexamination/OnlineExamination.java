package onlineexamination;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.nlt.view.MainFrame;

public class OnlineExamination {

    public static void main(String[] args) {
        try
        {
        UIManager.setLookAndFeel(new AcrylLookAndFeel());
        new MainFrame().setVisible(true);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Online Examination", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
