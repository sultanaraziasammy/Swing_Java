public class ShowMessage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String f_name= JOptionPane.showInputDialog(null,"Enter your fast name : ", "Tjis is title",JOptionPane.QUESTION_MESSAGE);
       String l_name=JOptionPane.showInputDialog("Enter your last name");
       String name=f_name+l_name;
      JOptionPane.showMessageDialog(null,"Your Full name is: ," +name);

       
        
    }
    
}

