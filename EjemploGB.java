import java.awt.*;
import javax.swing.*;

public class EjemploGB extends JFrame{

  JButton b1 = new JButton("1");
  JButton b2 = new JButton("2");
  JButton b3 = new JButton("3");
  JButton b4 = new JButton("4");
  JButton b5 = new JButton("5");
  JButton b6 = new JButton("6");
  JButton b7 = new JButton("7");
  JButton b8 = new JButton("8");
  JButton b9 = new JButton("9");
  JButton b10 = new JButton("10");
  JButton b11 = new JButton("11");
  JButton b12 = new JButton("12");

  public EjemploGB(){
      super("Ejemplo de GridBagLayout");
      Container contenedor = getContentPane();
      contenedor.setLayout(new GridBagLayout());
        addConst(contenedor,b1, 0,0,5,1,0,0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addConst(contenedor,b2, 0,1,1,1,0,0, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addConst(contenedor,b3, 1,1,1,1,1,0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addConst(contenedor,b4, 2,1,1,1,0,0, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addConst(contenedor,b5, 3,1,2,1,0,0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addConst(contenedor,b6, 0,2,1,4,0,0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addConst(contenedor,b7, 1,2,3,4,0,0, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addConst(contenedor,b8, 4,2,1,1,0,1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addConst(contenedor,b9, 4,3,1,1,0,1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addConst(contenedor,b10, 4,4,1,1,0,1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addConst(contenedor,b11, 4,5,1,1,0,1, GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        addConst(contenedor,b12, 0,6,5,1,0,0, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
            pack();
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
}//EjemploGB

  public void addConst(Container cont,Component comp, int x,int y,
  int width,int height,int weightx,int weighty,int fill,int anchor){
       GridBagConstraints cons = new GridBagConstraints();
             cons.gridx=x;
             cons.gridy=y;
             cons.gridwidth=width;
             cons.gridheight=height;
             cons.weightx=weightx;
             cons.weighty=weighty;
             cons.fill=fill;
             cons.anchor=anchor;

        cont.add(comp,cons);
}//addConst

     public static void main(String ar[]){
      EjemploGB gbc = new EjemploGB();
 }//main
}//class
