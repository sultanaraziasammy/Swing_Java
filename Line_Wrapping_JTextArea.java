import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author maudud
 */
public class TextAreaDemo extends JFrame {
    
    private Container c;
    private JTextArea ta;
    private Font f;
    
    TextAreaDemo(){
    
    initComponents();
    
    } 
    public void initComponents()
    
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        f=new Font("Arial",Font.BOLD,18);
        
        
        ta=new JTextArea("This is a JText Area");
        ta.setBounds(50,50,300,200);
        ta.setFont(f);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
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

