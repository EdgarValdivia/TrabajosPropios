import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.GridBagLayout;

   public class SimplestGridBagLayout{
       public static void main(String ar[]){
           String title = "GridBagLayout in it's Simple Form";

      JFrame frame = new JFrame(title);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container contentPane = frame.getContentPane();
      contentPane.setLayout(new GridBagLayout());

          for(int i=1; i <=6 ; i++){
               contentPane.add(new JButton("Button "+i));
}//for
      frame.pack();
      frame.setVisible(true);
}//main
}//class
