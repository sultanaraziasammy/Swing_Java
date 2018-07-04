
package showmessage;

import java.awt.Color;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BoxLayoutDemo extends JFrame {
    
    private Container c;
    private JButton btn1,btn2,btn3,btn4,btn5;
    private BoxLayout box;
    
    
    
    BoxLayoutDemo(){
    initComponents();
    
    } 
    
    
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,350,300);
        this.setTitle("BoxLayoutDemo");
    
        
        
        
        c=this.getContentPane();
        
        //BoxLayout (Container c, int axis)
        
        box=new BoxLayout(c,BoxLayout.Y_AXIS);
        c.setLayout(box);
        c.setBackground(Color.CYAN);
        
        
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        btn5=new JButton("5");
        
        c.add(btn1);
        c.add(Box.createVerticalStrut(10));
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
    
    }
    
    public static void main(String[] args) {
        BoxLayoutDemo frame=new BoxLayoutDemo();
        frame.setVisible(true);
    }
    
}

