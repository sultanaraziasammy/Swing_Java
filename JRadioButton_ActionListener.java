
package radiobuttondemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class RadioButtonDemo extends JFrame {
    
    private Container c;
    private JRadioButton male, female;
    private ButtonGroup grp;
    private Font f;
    private JTextArea ta;
    
    RadioButtonDemo(){
        initComponents();
    
    
    }
    
    
    public void initComponents(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,400,400);
        this.setTitle("RadioButton Demo");
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        f=new Font("Arial",Font.BOLD,18);
        grp=new ButtonGroup();
        
        
        male=new JRadioButton("Male");
        male.setBounds(50,50,100,50);
        male.setBackground(Color.ORANGE);
        //male.setSelected(true);
        male.setFont(f);
    
        c.add(male);
           
        female=new JRadioButton("Female");
        female.setBounds(160,50,100,50);
        female.setBackground(Color.ORANGE);
        //female.setEnabled(false);
        female.setFont(f);
        c.add(female);
       
        
        grp.add(male);
        grp.add(female);
        
        ta=new JTextArea();
        ta.setBounds(20,110,300,200);
        ta.setFont(f);
        ta.setBackground(Color.yellow);
        c.add(ta);
        
        Handler handler=new Handler();
        male.addActionListener(handler);
        female.addActionListener(handler);
    
    
    }
    
    
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          
            
            //if(e.getSource()==male)
            
            if(male.isSelected()){
            ta.append("you have selected male\n ");
            
            }
            else{
            
             ta.append("you have selected female\n ");
            }
         
        }
    
    
    }

  
    public static void main(String[] args) {
        
        RadioButtonDemo frame=new RadioButtonDemo();
        frame.setVisible(true);
   
    }
    
}

