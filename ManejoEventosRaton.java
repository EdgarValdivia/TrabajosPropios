import java.awt.FlowLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

      public class ManejoEventosRaton extends JFrame{
      
          JButton btn1 = new JButton("Sin eventos de Movimientos aun!");
      
              public ManejoEventosRaton(){
              super("Manejo de Eventos del Superraton");
              this.initFrame();
              }//constructor
              
              private void initFrame(){
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.setLayout = (new FlowLayout());
              this.getContentPane().add(mouseBotton);
              
                   //agregando MouseListener al JButton
                mouseButton.addMouseListener(new MouseListener(){
                   public void mouseClicked(MouseEvent e){/*  :)  */}
                   public void mousePressed(MouseEvent e){/*  :)  */}
                   public void mouseReleased(MouseEvent e){/*  :)  */}
                   public void mouseEntered(MouseEvent e){/*  Entro en Boton!  */}
                   public void mouseExited(MouseEvent e){/*  Salio en Boton!  */}
                });
          }//initFrame
          
      public static void main(String ar[]){
        ManejoEventosRaton frame = new ManejoEventosRaton();
        frame.pack();
        frame.setVisible(true);
      }//main
}//class
