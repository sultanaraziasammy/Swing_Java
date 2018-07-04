import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;






/**
 *
 * @author maudud
 */



public class ButtonDemo extends JFrame  {
    
    private Container c;
    private JButton btn1,btn2;
    private Font f;
    
    ButtonDemo(){
    initComponents();
    
    }
    
    public void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);
        f=new Font("Arial",Font.BOLD,18);
        
        btn1=new JButton("Submit");
        btn1.setFont(f);
        btn1.setBounds(100,50,100,50);
        c.add(btn1);
        
        
        btn2=new JButton("Clear");
        btn2.setBounds(210,50,100,50);
        btn2.setFont(f);
        c.add(btn2);
    
    
    }
    
 
    public static void main(String[] args) {
        
        ButtonDemo frame=new ButtonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("Button Demo");
        
        
        
    }
    
}

