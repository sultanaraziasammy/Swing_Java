package showmessage;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author maudud
 */



public class LavelDemo extends JFrame {
    
    private Container c;
    private JLabel userLabel;
    
    
    LavelDemo(){
    initComponents();
    
    
    }
    
    public void initComponents()
    
    {
    
    
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.CYAN);
    
    userLabel=new JLabel();
    userLabel.setText("Enter your username : ");
    userLabel.setBounds(50,20,150,50);
    c.add(userLabel);
    }
    
   
    public static void main(String[] args) {
        LavelDemo frame =new LavelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,500);
        frame.setTitle("Lavel Demo");
        
     
    
        
    }
    
}

