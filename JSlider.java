
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;




public class SliderDemo extends JFrame {
    
    private Container c;
    private JSlider slider;
    
    
    SliderDemo(){
    initComponents();
    
    }
    
    public void initComponents(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100,100,600,300);
    this.setTitle("Slider Demo");
    
    c=this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.red);
    
    slider =new JSlider(0,20,0);
    // slider =new JSlider(JSlider.VERTICAL,0,20,0);
    slider.setMinorTickSpacing(0);
    slider.setMajorTickSpacing(5);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);
    slider.setBounds(100,50,300,50);
    c.add(slider);
    
    
    }
    
    public static void main(String[] args) {
        SliderDemo frame=new SliderDemo();
        frame.setVisible(true);
        
    }
    
}

