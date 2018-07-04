
package showmessage;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GridLayoutDemo extends JFrame {
    private Container c;
    private GridLayout gl;
    private JButton btn1,btn2,btn3,btn4;
    
    GridLayoutDemo(){
    initComponents();
    
    }
    
    
    public void initComponents(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,300,250);
        this.setTitle("GridLayoutDemo");
        
        c=this.getContentPane();
        gl=new GridLayout(2,2,5,5);
        c.setLayout(gl);
        
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
    
    
    }
    public static void main(String[] args) {
        GridLayoutDemo frame=new GridLayoutDemo();
        frame.setVisible(true);
        
    }
    
}

