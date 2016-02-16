import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JButton;

  public class GridBagLayoutAnchor{
    public static void main(String ar[]){
          String title = "Usando Anchor y Acomodando los Puntos Cardinales!";
          JFrame frame = new JFrame (title);

        JButton[]btn = new JButton[9];
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contenedor = frame.getContentPane();
        contenedor.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        btn[0] = new JButton("NOROESTE");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 5;
        gbc.ipady = 5;
        gbc.weightx = 100;
        gbc.weighty =100;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        contenedor.add(btn[0],gbc);

        btn[1] = new JButton("NORTE");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        contenedor.add(btn[1],gbc);

        btn[2] = new JButton("NORESTE");
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        contenedor.add(btn[2],gbc);

        btn[3] = new JButton("OESTE");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        contenedor.add(btn[3],gbc);

        btn[4] = new JButton("CENTRO");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        contenedor.add(btn[4],gbc);

        btn[5] = new JButton("ESTE");
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        contenedor.add(btn[5],gbc);

        btn[6] = new JButton("SUROESTE");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        contenedor.add(btn[6],gbc);

        btn[7] = new JButton("SUR");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.SOUTH;
        contenedor.add(btn[7],gbc);

        btn[8] = new JButton("SURESTE");
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        contenedor.add(btn[8],gbc);

         frame.pack();
         frame.setVisible(true);
    }//main
}//class
