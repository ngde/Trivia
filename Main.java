import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    Questions questions[] = new questions[10];
    boolean con = true;
    int choice = 0;
    do 
    {
      choice = Integer.parseInt(JOptionPane.showInputDialog(null, "1] Add Question\n2] Check Questions\n3] Initiate Quiz"))-1;

    }while (con);
    
    
    science[0]=new Science(true);
    JOptionPane.showMessageDialog(null, science[0]);
    science[1]=new Science();
    JOptionPane.showMessageDialog(null, science[1]);

    // add up to 10 questions
    // bring back questions
    // make a quiz
  }
}