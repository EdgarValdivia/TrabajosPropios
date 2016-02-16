import java.awt.GridBagLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagConstraints;

   public class GridBagConstraints{
     public static void main(String ar[]){
        String title = "Aqui Utilice Constraints!";
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contenedor = frame.getContentPane();
        contenedor.setLayout(new GridBagLayout());

        //creando la variable de GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();

        JButton btn1 = new JButton("Boton 1");
        JButton btn2 = new JButton("Boton 2");
        JButton btn3 = new JButton("Boton 3");

            gbc.gridx=0;
            gbc.gridy=0;
            gbc.gridwidth = GridBagConstraints.REMAINDER;//el objeto(boton) se va al final con REMAINDER
            contenedor.add(btn1,gbc);

            gbc.gridx = GridBagConstraints.RELATIVE;
            gbc.gridy = GridBagConstraints.RELATIVE;
            gbc.gridwidth = 1;
            contenedor.add(btn2,gbc);

            gbc.gridx = GridBagConstraints.RELATIVE;
            gbc.gridy = 1;
            contenedor.add(btn3,gbc);

            frame.pack();
            frame.setVisible(true);

  }//main
}//class
