
package showmessage;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ListenerDemo extends JFrame {
    private Container c;
    private JButton redButton,greenButton,blueButton;
    
    ListenerDemo(){
    initComponents();
    
    
    }
    
    public void initComponents(){
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Listener Demo");
    this.setBounds(100,100,600,500);
    
    
    c=this.getContentPane();
    c.setLayout(null);
    
    
    //creating and adding button 1
    redButton=new JButton("red");
    redButton.setBounds(50,50,100,50);
    c.add(redButton);
    
    
        
    //creating and adding button 2
    greenButton=new JButton("green");
    greenButton.setBounds(50,110,100,50);
    c.add(greenButton);
    
    
        
    //creating and adding button 3
    blueButton=new JButton("blue");
    blueButton.setBounds(50,170,100,50);
    c.add(blueButton);
    
    
    
    redButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
            c.setBackground(Color.red);
            
        }
    
    
    });
    
    
    greenButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
             c.setBackground(Color.GREEN);
            
        }
    
    
    });
    
    
    blueButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
             c.setBackground(Color.BLUE);
            
        }
    
    
    });
    
    
    
    
    }
    
    public static void main(String[] args) {
        ListenerDemo frame=new ListenerDemo();
        frame.setVisible(true);
    }
    
}
===========================================


package showmessage;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ListenerDemo extends JFrame implements ActionListener {
    private Container c;
    private JButton redButton,greenButton,blueButton;
    
    ListenerDemo(){
    initComponents();
    
    
    }
    
    public void initComponents(){
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Listener Demo");
    this.setBounds(100,100,600,500);
    
    
    c=this.getContentPane();
    c.setLayout(null);
    
    
    //creating and adding button 1
    redButton=new JButton("red");
    redButton.setBounds(50,50,100,50);
    c.add(redButton);
    
    
        
    //creating and adding button 2
    greenButton=new JButton("green");
    greenButton.setBounds(50,110,100,50);
    c.add(greenButton);
    
    
        
    //creating and adding button 3
    blueButton=new JButton("blue");
    blueButton.setBounds(50,170,100,50);
    c.add(blueButton);
    
    redButton.addActionListener(this);
    greenButton.addActionListener(this);
    blueButton.addActionListener(this);
    
    
    
    
    }
    
      @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==redButton){
            
            c.setBackground(Color.red);
        
        
        } else if(e.getSource()==greenButton){
            c.setBackground(Color.GREEN);
        
        
        } else if(e.getSource()==blueButton){
        
         c.setBackground(Color.BLUE);
        }
        
    }
    
    
    
    public static void main(String[] args) {
        ListenerDemo frame=new ListenerDemo();
        frame.setVisible(true);
    }

  
}

