import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



/**
 *
 * @author maudud
 */



public class ActionDemo2 extends JFrame  {
    
    private Container c;
    private JTextField tf;
    private JButton bt;
    
    ActionDemo2(){
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);
        
        tf=new JTextField();
        tf.setBounds(50,50,150,50);
        c.add(tf);
        
        bt=new JButton("Clear");
        bt.setBounds(50,110,80,50);
        
        c.add(bt);
   
    bt.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        
        tf.setText("");
    
    
    }
    
    
    });
    
    }
    
    
    public static void main(String[] args) {
        
        ActionDemo2 frame=new ActionDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("JButton ActionListener Demo");
        
        
        
    }
    
}

