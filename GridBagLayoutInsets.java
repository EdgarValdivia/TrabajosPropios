import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JButton;

  public class GridBagLayoutInsets{
    public static void main(String ar[]){
          String title = "Usando Insets";
          JFrame frame = new JFrame (title);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contenedor = frame.getContentPane();
        contenedor.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();


    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(5,5,5,5);

     int count =1;
     for(int y=0; y<3; y++){
       gbc.gridy = y;
        for(int x=0; x<3; x++){
          gbc.gridx = x;
       contenedor.add(new JButton("Boton "+count++),gbc);
     }//for x
   }//for y
         frame.pack();
         frame.setVisible(true);
    }//main
}//class
