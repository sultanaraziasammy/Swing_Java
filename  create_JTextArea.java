import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author maudud
 */
public class TextAreaDemo extends JFrame {
    
    private Container c;
    private JTextArea ta;
    
    
    TextAreaDemo(){
    
    initComponents();
    
    } 
    public void initComponents()
    
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        
        ta=new JTextArea("This is a JText Area");
        ta.setBounds(50,50,300,200);
        c.add(ta);
        
        
    
    
    
    }
    
    
    public static void main(String[] args) {
        TextAreaDemo frame =new TextAreaDemo();
        frame.setVisible(true);
        frame.setBounds(100,50,500,400);
        frame.setTitle("TextArea Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

