import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;




/**
 *
 * @author maudud
 */



public class ActionDemo extends JFrame  {
    
    private Container c;
    private JTextField tf1,tf2;
    
    
    ActionDemo()
            
            {
           initComponents();

}
    
    public void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        tf1=new JTextField();
        tf1.setBounds(50,50,150,50);
        c.add(tf1);
    
        tf2=new JTextField();
        tf2.setBounds(50,110,150,50);
        c.add(tf2);
        
        
      tf1.addActionListener(new ActionListener(){
          
          public void actionPerformed(ActionEvent e){
              String s=tf1.getText();
              
              if(s.isEmpty()){
              
                JOptionPane.showMessageDialog(null, "you did not enter anything");
              
              }
              
              else {
                            JOptionPane.showMessageDialog(null, "tf1 = "+s);

              
              }
          
          
          }
      
      
      
      });
      
      
      tf2.addActionListener(new ActionListener(){
          
          public void actionPerformed(ActionEvent e){
              String s=tf2.getText();
              
              if(s.isEmpty()){
              
                JOptionPane.showMessageDialog(null, "you did not enter anything");
              
              }
              
              else {
                            JOptionPane.showMessageDialog(null, "tf2 = "+s);

              
              }
          
          
          }
      
      
      
      });
    
    
    }
    
  
    
    
    
   
 
    public static void main(String[] args) {
        
        ActionDemo frame=new ActionDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("ActionListener Demo");
        
        
        
    }
    
}

