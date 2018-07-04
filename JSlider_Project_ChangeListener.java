
import java.awt.Color;
import java.awt.Container;
import javafx.beans.value.ObservableValue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class SliderDemo extends JFrame implements ChangeListener  {
    
    private Container c;
    private JSlider redSlider,blueSlider,greenSlider;
    private JLabel redLabel,blueLabel,greenLabel,previewLabel;
    private JTextField redTf,blueTf,greenTf;
    private JPanel panel;
    
    
    SliderDemo(){
    initComponents();
    
    }
    
    public void initComponents(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100,100,800,350);
    this.setTitle("Slider Demo");
    
    c=this.getContentPane();
    c.setLayout(null);
   
    redLabel=new JLabel("Red");
    redLabel.setBounds(50,50,80,50);
    c.add(redLabel);
    
    redSlider=new JSlider(0,255,0);
    redSlider.setBounds(90,50,300,50);
    c.add(redSlider);
    
    redTf=new JTextField();
    redTf.setHorizontalAlignment(JTextField.CENTER);
    redTf.setBounds(400,50,80,40);
    c.add(redTf);
    
    
    blueLabel=new JLabel("Blue");
    blueLabel.setBounds(50,110,80,50);
    c.add(blueLabel);
    
    blueSlider=new JSlider(0,255,0);
    blueSlider.setBounds(90,110,300,50);
    c.add(blueSlider);
    
    blueTf=new JTextField();
    blueTf.setBounds(400,110,80,40);
    blueTf.setHorizontalAlignment(JTextField.CENTER);
    c.add(blueTf);
    
    greenLabel=new JLabel("Green");
    greenLabel.setBounds(50,170,80,50);
    c.add(greenLabel);
    
    
    greenSlider=new JSlider(0,255,0);
    greenSlider.setBounds(90,170,300,50);
    c.add(greenSlider);
    
    greenTf=new JTextField();
    greenTf.setBounds(400,170,80,40);
    greenTf.setHorizontalAlignment(JTextField.CENTER);
    c.add(greenTf);
   
    
    panel=new JPanel();
    panel.setBackground(Color.red);
    panel.setBounds(550,50,200,160);
    c.add(panel);
    
    
    previewLabel=new JLabel("Preview");
    previewLabel.setBounds(630,200,100,50);
    c.add(previewLabel);
    
    redSlider.addChangeListener(this);
    blueSlider.addChangeListener(this);
    greenSlider.addChangeListener(this);
    
    }
    
     @Override
    public void stateChanged(ChangeEvent e) {
        
        int redValue=redSlider.getValue();
        int blueValue=blueSlider.getValue();
        int greenValue=greenSlider.getValue();
        
        
        redTf.setText(""+redValue);
        blueTf.setText(""+blueValue);
        greenTf.setText(""+greenValue);
        
        
        Color color=new Color(redValue,blueValue,greenValue);
        panel.setBackground(color);
        
        
    }

    
    
    public static void main(String[] args) {
        SliderDemo frame=new SliderDemo();
        frame.setVisible(true);
        
    }

   
   
    
}

