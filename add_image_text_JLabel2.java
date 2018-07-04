
package showmessage;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo extends JFrame {
    private Container c;
    private JLabel label;
    private ImageIcon image;
    
    
    LabelDemo(){
    initComponents();
    
    }
    
    public void initComponents(){
        
    
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        image=new ImageIcon(getClass().getResource("login.png"));
        
        label=new JLabel("Avro keyboard",image,JLabel.RIGHT);
        label.setBounds(50,50,250,50);
        c.add(label);
    
    }
    
    
    public static void main(String[] args) {
        LabelDemo frame=new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Label Demo");
    }
    
       
    
}

