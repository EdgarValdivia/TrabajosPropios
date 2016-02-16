import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;

 public class VentanaJava{

     private JPanel panelSup,panelMed,panelX,panelInfe;          //paneles
     private JLabel lblUsuario,lblContraseña,lblComentarios;     //etiquetas
     private JTextField txtUsuario;                              //campos de texto
     private JTextArea areaComentarios;                          //campos de area
     private JPasswordField txtPass;                             //campo contraseña
     private JButton btnAceptar, btnCancelar;                    //botones
     private JFrame frame;                                       //frame

     public void panelSuperior(){
        panelSup = new JPanel();
        lblUsuario = new JLabel("Usuario");
        txtUsuario = new JTextField(10);
        panelSup.setLayout(new BoxLayout(panelSup, BoxLayout.X_AXIS));
        panelSup.add(lblUsuario);
        panelSup.add(txtUsuario);
}//Superior
     public void panelMedio(){
        panelMed = new JPanel();
        lblContraseña = new JLabel("Contraseña");
        txtPass = new JPasswordField(10);
        panelMed.setLayout(new BoxLayout(panelMed, BoxLayout.X_AXIS));
        panelMed.add(lblContraseña);
        panelMed.add(txtPass);
}//Medio
     public void panelNuevo(){
        panelX = new JPanel();
        lblComentarios = new JLabel("Comentarios");
        areaComentarios = new JTextArea();   //capacidad del area
        panelX.setLayout(new BoxLayout(panelX, BoxLayout.X_AXIS));
        panelX.add(lblComentarios);
        panelX.add(areaComentarios);
}//X
     public void panelInferior(){
        panelInfe = new JPanel();
        btnAceptar =  new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");
        panelInfe.setLayout(new BoxLayout(panelInfe, BoxLayout.X_AXIS));
        panelInfe.add(btnAceptar);
        panelInfe.add(btnCancelar);
}//Inferior
      public void ventana(){
        frame = new JFrame();
        lblUsuario = new JLabel("Informacion De La Cuenta");
        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
        frame.add(lblUsuario);
        frame.add(panelSup);
        frame.add(panelMed);
        frame.add(panelX);
        frame.add(panelInfe);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,100);
        frame.setVisible(true);
}//agregando al frame

                public VentanaJava(){
                   panelSuperior();
                   panelMedio();
                   panelNuevo();
                   panelInferior();
                   ventana();
                }//acomodo

      public static void main(String ar[]){
           VentanaJava v = new VentanaJava();
 }//main
}//class
