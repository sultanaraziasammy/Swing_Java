import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;






/**
 *
 * @author maudud
 */



public class PasswordFieldDemo extends JFrame  {
    
    private Container c;
    private JPasswordField pf;
    private Font f;
    
   PasswordFieldDemo(){
   
       initComponents();
   
   }
   
   public void initComponents(){
   c=this.getContentPane();
   c.setLayout(null);
   c.setBackground(Color.red);
   f=new Font("Arial",Font.BOLD,32);
   
   
   pf=new JPasswordField();
   pf.setBounds(50,20,150,50);
   pf.setEchoChar('*');
   pf.setFont(f);
   pf.setForeground(Color.BLUE);
   pf.setBackground(Color.YELLOW);
   c.add(pf);
   
   }
    
      
    
   
 
    public static void main(String[] args) {
        
        PasswordFieldDemo frame=new PasswordFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("PasswordField Demo");
        
        
        
    }
    
}

