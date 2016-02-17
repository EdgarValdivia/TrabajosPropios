import javax.swing.*;
import java.awt.*;

  public class VentanaCorreoTarea{
     public static void main(String ar[]){
        String title = "Correo";
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contenedor = frame.getContentPane();
        contenedor.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill=GridBagConstraints.HORIZONTAL;       //Label Para:
        gbc.anchor=GridBagConstraints.WEST;
        gbc.gridwidth=1;
        gbc.weightx=10;
        gbc.weighty=1;
        gbc.insets=new Insets(30,10,0,30);
        contenedor.add(new JLabel("Para: "),gbc);

        gbc.anchor=GridBagConstraints.REMAINDER;     //TextField del Para:
        gbc.weightx=10;
        gbc.weighty=1;
        contenedor.add(new JTextField(" Escribir Detinatario "),gbc);

        gbc.fill=GridBagConstraints.HORIZONTAL;      //Label Asunto:
        gbc.anchor=GridBagConstraints.WEST;
        gbc.gridwidth=2;
        gbc.weightx=10;
        gbc.weighty=40;
        gbc.insets=new Insets(30,10,0,30);
        contenedor.add(new JLabel("Asunto: "),gbc);

        gbc.anchor=GridBagConstraints.REMAINDER;     //TextField del Para:
        gbc.weightx=10;
        gbc.weighty=10;
        contenedor.add(new JTextField(" Escribir Asunto "),gbc);

        frame.pack();
        frame.setVisible(true);

     }//main
  }//class
