
package showmessage;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class VowelCounter extends JFrame {
    
    private Container c;
    private JLabel promtLabel,vowelLabel,aLabel,eLabel,iLabel,oLabel,uLabel;
    private JTextArea inputTextArea;
    private JScrollPane scroll;
    
    int totalVowel=0;
    int letter_a=0;
    int letter_e=0;
    int letter_i=0;
    int letter_o=0;
    int letter_u=0;
    
    
    VowelCounter(){
    initComponents();
    
    }
    
    
    
    public void initComponents(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100,100,600,500);
    this.setTitle("Counting vowel app");
    
    
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.CYAN);
    
    promtLabel=new JLabel("Enter the Text : ");
    promtLabel.setBounds(10,20,200,30);
    c.add(promtLabel);
    
    inputTextArea=new JTextArea();
    inputTextArea.setLineWrap(true);
    inputTextArea.setWrapStyleWord(true);
    
    
    scroll=new JScrollPane(inputTextArea);
    scroll.setBounds(120,20,450,100);
    c.add(scroll);
    
    vowelLabel=new JLabel();
    vowelLabel.setBounds(110,150,250,30);
    c.add(vowelLabel);
    
    
    aLabel=new JLabel();
    aLabel.setBounds(110,190,250,30);
    c.add(aLabel);
    
    eLabel=new JLabel();
    eLabel.setBounds(110,230,250,30);
    c.add(eLabel);
    
    iLabel=new JLabel();
    iLabel.setBounds(110,270,250,30);
    c.add(iLabel);
    
    oLabel=new JLabel();
    oLabel.setBounds(110,310,250,30);
    c.add(oLabel);
    
    uLabel=new JLabel();
    uLabel.setBounds(110,350,250,30);
    c.add(uLabel);
    
    
    inputTextArea.addKeyListener(new KeyListener(){
        @Override
        public void keyTyped(KeyEvent e) {
           
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
            if(e.getSource()==inputTextArea){
            
            
                if(e.VK_A==e.getKeyCode()){
                
                letter_a++;
                totalVowel++;
                
                }
                if(e.VK_E==e.getKeyCode()){
                
                letter_e++;
                totalVowel++;
                
                }if(e.VK_I==e.getKeyCode()){
                
                letter_i++;
                totalVowel++;
                
                }if(e.VK_O==e.getKeyCode()){
                
                letter_o++;
                totalVowel++;
                
                }if(e.VK_U==e.getKeyCode()){
                
                letter_u++;
                totalVowel++;
                
                }
                
                
            
            }
            
            vowelLabel.setText("Total number of vowels: "+totalVowel);
            aLabel.setText("Total number of a: "+letter_a);
            eLabel.setText("Total number of e: "+letter_e);
            iLabel.setText("Total number of i: "+letter_i);
            oLabel.setText("Total number of o: "+letter_o);
            uLabel.setText("Total number of u: "+letter_u);
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }
    
    
    
    
    });
    
    
    
   
    }
    
    public static void main(String[] args) {
        VowelCounter frame=new VowelCounter();
        frame.setVisible(true);
    }
    
}

