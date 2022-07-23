import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
  private JLabel label1,label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String nombre = "";
  
  public Licencia(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("imagenes/icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre = ventanaBienvenida.texto;
 
    label1 = new JLabel("TERMINOS Y CONDICIONES");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Andale Mono", 1, 14));
    label1.setForeground(new Color(0,0,0));
    add(label1);
    
    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Andale Mono", 0, 9));
    textarea1.setText("\n\n          TERMINOS Y CONDICIONES"+
                      "\n\n          AMAR A DARIYANK JOVANNY SANQUINTIN RODRIGUEZ");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10,40,575,200);
    add(scrollpane1);

    check1 = new JCheckBox( "Yo " + nombre + " Acepto");
    check1.setBounds(10,250,300,30);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,290,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);
    
    
    boton2 = new JButton("No Acepto");
    boton2.setBounds(120,290,100,30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);

    ImageIcon imagen = new ImageIcon("imagenes/coca-cola.png");
    label2 = new JLabel(imagen);
    label2.setBounds(315,135,300,300);
    add(label2);
  }
  
  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
       boton1.setEnabled(true);
       boton2.setEnabled(false);
    }else{
       boton1.setEnabled(false);
       boton2.setEnabled(true);
    }
  }
 
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
        Principal obj3 = new Principal();
        obj3.setBounds(0,0,640,535);
        obj3.setVisible(true);
        obj3.setResizable(false);
        obj3.setLocationRelativeTo(null);
        this.setVisible(false);
    }else if(e.getSource()== boton2){
        Bienvenida obj1 = new Bienvenida();
        obj1.setBounds(0,0,350,450);
        obj1.setVisible(true);
        obj1.setResizable(false);
        obj1.setLocationRelativeTo(null);
        this.setVisible(false);
    }
  }

  public static void main(String args[]){
    Licencia obj2 = new Licencia();
    obj2.setBounds(0,0,600,360);
    obj2.setVisible(true);
    obj2.setResizable(false);
    obj2.setLocationRelativeTo(null);
  }
}