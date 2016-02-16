import java.awt.GridBagLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagConstraints;

public class GridBagLayoutFillModificadoEnCLase{
   public static void main(String ar[]){
     String title = "Usando (fill) en el Bonton 2";
     JFrame frame = new JFrame(title);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     Container contenedor = frame.getContentPane();
     contenedor.setLayout(new GridBagLayout());

     //creando la variable de GridBagConstraints
     GridBagConstraints gbc = new GridBagConstraints();

    //para expandir un componente usamos fill
     gbc.fill = GridBagConstraints.NONE;//aqui ponemos el comportamiento del boton!

     gbc.gridx = 0;
     gbc.gridy = 0;
     contenedor.add(new JButton("Boton 1"),gbc);

     gbc.gridx = 1;
     gbc.gridy = 0;
     gbc.gridwidth = GridBagConstraints.RELATIVE;
     contenedor.add(new JButton("Boton 2"),gbc);

     gbc.gridx = GridBagConstraints.RELATIVE;
     gbc.gridy = 0;
     gbc.gridwidth = GridBagConstraints.REMAINDER;//mandando al boton 3 al final
     contenedor.add(new JButton("Boton 3"),gbc);

     //reseteando el gridwidth para que por default se valla al valor 1
       gbc.gridwidth=1;
       gbc.gridy = 1;
      for(int i=0; i<3; i++){
         gbc.gridx = i;
         contenedor.add(new JButton("Boton "+(i+4)),gbc);
      //   if(i=5)
      //  {contenedor=contenedor.add(new JButton("Este es el Gran Boton 5"+(i),gbc));}
}//for i
     gbc.gridy = 2;
      for(int k=0; k<3; k++){
         gbc.gridx = k;
         contenedor.add(new JButton("Boton "+(k+7)),gbc);
}//for
          frame.pack();
          frame.setVisible(true);
}//main
}//class
