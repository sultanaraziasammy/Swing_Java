
package showmessage;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SlideShowDemo extends JFrame implements ActionListener {
    private CardLayout cl;
    private Container c;
    private JPanel panel;
    private JButton prevButton, nextButton;
    private ImageIcon icon;
    private JLabel label;
    
    
    SlideShowDemo(){
    initComponents();
    showImage();
    
    }
    
    public void showImage(){
        String[] imageNames={"1.jpg","2.jpg"};
        
        for(String n:imageNames){
         icon=new ImageIcon("src/img/"+n);
         label=new JLabel(icon);
         panel.add(label);
        
        }
       
    
    
    }
    
    public void initComponents(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100,100,600,500);
    this.setTitle("SlideShow Demo");
    
    
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.CYAN);
    
    
    cl=new CardLayout();
    panel=new JPanel(cl);
    panel.setBounds(10,10,560,380);
    c.add(panel);
    
    prevButton=new JButton("Previous");
    prevButton.setBounds(10,400,100,50);
    c.add(prevButton);
    
    
    nextButton=new JButton("Next");
    nextButton.setBounds(470,400,100,50);
    c.add(nextButton);
    
    prevButton.addActionListener(this);
    nextButton.addActionListener(this);
    
    }
    
       @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==prevButton){
        
         cl.previous(panel);
        }
        
        if(e.getSource()==nextButton){
         cl.next(panel);
        
        }
       
    }
    public static void main(String[] args) {
        SlideShowDemo frame=new SlideShowDemo();
        frame.setVisible(true);
    }

 
    
    
}

