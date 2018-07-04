import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
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
    private Cursor cursor;
    private ImageIcon img1, img2;
    
    ButtonDemo(){
    initComponents();
    
    }
    
    public void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);
        f=new Font("Arial",Font.BOLD,18);
        
        cursor=new Cursor(Cursor.HAND_CURSOR);
        
        img1=new ImageIcon(getClass().getResource("login.png"));
        img2=new ImageIcon(getClass().getResource("clear.png"));
        
        btn1=new JButton(img1);
        btn1.setFont(f);
        btn1.setCursor(cursor);
        btn1.setBounds(100,50,100,50);

        c.add(btn1);
        
        
        btn2=new JButton(img2);
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

