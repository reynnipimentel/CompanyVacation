import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
    
     private JMenuBar mb;
     private JMenu menuOpciones,menuCalcular,menuAcercade,menuColorFondo;
     private JMenuItem miCalculo,miRojo,miNegro,miMorado,miElCreador,miSalir,miNuevo;
     private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelAPaterno,labelAMaterno,
                    labelDepartamento,labelAntiguedad,labelResultado,labelfooter;
     private JTextField  txtNombreTrabajador, txtApaternoTrabajador,txtAMaternoTrabajador;
     private JComboBox comboDepartamento,comboAntiguedad;
     private JScrollPane scrollpane1;
     private JTextArea textarea1;
     String nombreAdmin = ""; 

     public Principal(){
       setLayout(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setTitle("Pantalla principal");
       getContentPane().setBackground(new Color(255,0,0));
       setIconImage(new ImageIcon(getClass().getResource("imagenes/icon.png")).getImage());
       Bienvenida ventanaB = new Bienvenida();
       nombreAdmin = ventanaB.texto;  
  
       mb = new JMenuBar();
       mb.setBackground(new Color(255,0,0));
       setJMenuBar(mb);
       
       menuOpciones = new JMenu("Opciones");
       menuOpciones.setBackground(new Color(255,0,0)); 
       menuOpciones.setFont(new Font("Andale Mono", 1, 14));
       menuOpciones.setForeground(new Color(255,255,255));
       mb.add(menuOpciones);

       menuCalcular = new JMenu("Calcular");
       menuCalcular.setBackground(new Color(255,0,0)); 
       menuCalcular.setFont(new Font("Andale Mono", 1, 14));
       menuCalcular.setForeground(new Color(255,255,255));
       mb.add(menuCalcular);
  
       menuAcercade = new JMenu("Acerca de");
       menuAcercade.setBackground(new Color(255,0,0)); 
       menuAcercade.setFont(new Font("Andale Mono", 1, 14));
       menuAcercade.setForeground(new Color(255,255,255));
       mb.add(menuAcercade);
    
       menuColorFondo = new JMenu("Color de fondo");
       menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
       menuColorFondo.setForeground(new Color(255,0,0));
       menuOpciones.add(menuColorFondo);

       
       miCalculo = new JMenuItem("Vacaciones");
       miCalculo.setFont(new Font("Andale Mono", 1, 14));
       miCalculo.setForeground(new Color(255,0,0));
       menuCalcular.add(miCalculo);
       miCalculo.addActionListener(this);
     
       miRojo = new JMenuItem("Rojo");
       miRojo.setFont(new Font("Andale Mono", 1, 14));
       miRojo.setForeground(new Color(255,0,0));
       menuColorFondo.add(miRojo);
       miRojo.addActionListener(this);
      
       miNegro = new JMenuItem("Negro");
       miNegro.setFont(new Font("Andale Mono", 1, 14));
       miNegro.setForeground(new Color(255,0,0));
       menuColorFondo.add(miNegro);
       miNegro.addActionListener(this);
   
       miMorado = new JMenuItem("Morado");
       miMorado.setFont(new Font("Andale Mono", 1, 14));
       miMorado.setForeground(new Color(255,0,0));
       menuColorFondo.add(miMorado);
       miMorado.addActionListener(this);
 
       miNuevo = new JMenuItem("Nuevo");
       miNuevo.setFont(new Font("Andale Mono", 1, 14));
       miNuevo.setForeground(new Color(255,0,0));
       menuOpciones.add(miNuevo);
       miNuevo.addActionListener(this);

       miElCreador = new JMenuItem("El creador");
       miElCreador.setFont(new Font("Andale Mono", 1, 14));
       miElCreador.setForeground(new Color(255,0,0));
       menuAcercade.add(miElCreador);
       miElCreador.addActionListener(this);

       miSalir = new JMenuItem("Salir");
       miSalir.setFont(new Font("Andale Mono", 1, 14));
       miSalir.setForeground(new Color(255,0,0));
       menuOpciones.add(miSalir);
       miSalir.addActionListener(this);

       ImageIcon imagen = new ImageIcon("imagenes/logo-coca.png");
       labelLogo = new JLabel(imagen); 
       labelLogo.setBounds(5,5,250,100);
       add(labelLogo);
   
       labelBienvenido = new JLabel("Bienvenido " + nombreAdmin);
       labelBienvenido.setBounds(280,30,300,50);
       labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
       labelBienvenido.setForeground(new Color(255,255,255));
       add(labelBienvenido);

       labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
       labelTitle.setBounds(45,140,900,25);
       labelTitle.setFont(new Font("Andale Mono", 0, 24));
       labelTitle.setForeground(new Color(255,255,255));
       add(labelTitle);

       labelNombre = new JLabel("Nombre Completo:");
       labelNombre.setBounds(25,188,180,25);
       labelNombre.setFont(new Font("Andale Mono", 1, 12));
       labelNombre.setForeground(new Color(255,255,255));
       add(labelNombre);

       txtNombreTrabajador = new JTextField();
       txtNombreTrabajador.setBounds(25,213,150,25);
       txtNombreTrabajador.setBackground(new java.awt.Color(224,224,224));	
       txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
       txtNombreTrabajador.setForeground(new java.awt.Color(255,0,0));
       add(txtNombreTrabajador);

       labelAPaterno = new JLabel("Apellido Paterno:");
       labelAPaterno.setBounds(25,248,180,25);
       labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
       labelAPaterno.setForeground(new Color(255,255,255));
       add(labelAPaterno);

       txtApaternoTrabajador = new JTextField();
       txtApaternoTrabajador.setBounds(25,273,150,25);
       txtApaternoTrabajador.setBackground(new java.awt.Color(224,224,224));	
       txtApaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
       txtApaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
       add(txtApaternoTrabajador);

       labelAMaterno = new JLabel("Apellido Materno:");
       labelAMaterno.setBounds(25,308,180,25);
       labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
       labelAMaterno.setForeground(new Color(255,255,255));
       add(labelAMaterno);

       txtAMaternoTrabajador = new JTextField();
       txtAMaternoTrabajador.setBounds(25,334,150,25);
       txtAMaternoTrabajador.setBackground(new java.awt.Color(224,224,224));	
       txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
       txtAMaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
       add(txtAMaternoTrabajador);

       labelDepartamento = new JLabel("Selecciona el Departamento:");
       labelDepartamento.setBounds(220,188,180,25);
       labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
       labelDepartamento.setForeground(new Color(255,255,255));
       add(labelDepartamento);

       comboDepartamento = new JComboBox();
       comboDepartamento.setBounds(220,213,220,25);
       comboDepartamento.setBackground(new java.awt.Color(224,224,224));	
       comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
       comboDepartamento.setForeground(new java.awt.Color(255,0,0));
       add(comboDepartamento);
       comboDepartamento.addItem("");
       comboDepartamento.addItem("Atencion al Cliente");
       comboDepartamento.addItem("Departamento de Logistica");
       comboDepartamento.addItem("Departamento de Gerencia");

       labelAntiguedad = new JLabel("Selecciona la Antiguedad:");
       labelAntiguedad.setBounds(220,248,180,25);
       labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
       labelAntiguedad.setForeground(new Color(255,255,255));
       add(labelAntiguedad);

       comboAntiguedad = new JComboBox();
       comboAntiguedad.setBounds(220,273,220,25);
       comboAntiguedad.setBackground(new java.awt.Color(224,224,224));	
       comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
       comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
       add(comboAntiguedad);
       comboAntiguedad.addItem("");
       comboAntiguedad.addItem("1 año de servicio");
       comboAntiguedad.addItem("2 a 6 años de servicio");
       comboAntiguedad.addItem("7 o mas años de servicio");

       labelResultado = new JLabel("Resultado del Calculo:");
       labelResultado.setBounds(220,307,180,25);
       labelResultado.setFont(new Font("Andale Mono", 1, 12));
       labelResultado.setForeground(new Color(255,255,255));
       add(labelResultado);

       textarea1 = new JTextArea();
       textarea1.setEditable(false);
       textarea1.setBackground(new Color(244,244,244));
       textarea1.setFont(new Font("Andale Mono", 1, 11));
       textarea1.setForeground(new Color(255,0,0));
       textarea1.setText("\n Aqui aparece el calculo de las vacaciones.");
       scrollpane1 = new JScrollPane(textarea1);
       scrollpane1.setBounds(220,333,385,90);
       add(scrollpane1);

       labelfooter = new JLabel("©2017 The Coca-Cola Company ║ Todos los derechos reservados:");
       labelfooter.setBounds(135,445,500,30);
       labelfooter.setFont(new Font("Andale Mono", 1, 12));
       labelfooter.setForeground(new Color(255,255,255));
       add(labelfooter);
 
  }
   
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == miCalculo){
       String nombreEmpleado = txtNombreTrabajador.getText();
       String AP = txtApaternoTrabajador.getText();
       String AM = txtAMaternoTrabajador.getText();
       String Depar = comboDepartamento.getSelectedItem().toString();
       String Antiguedad = comboAntiguedad.getSelectedItem().toString();
 
       if(nombreEmpleado.equals("") || AP.equals("") ||AM.equals("") ||
          Depar.equals("") ||Antiguedad.equals("")){
         
          JOptionPane.showMessageDialog(null, "Debes llenar Todos los Campos.");
       }else {
	  if(Depar.equals("Atencion al Cliente")){
     
   	    if(Antiguedad.equals("1 año de servicio")){
             textarea1.setText("\n  Eltrabajador " + nombreEmpleado +" " + AP+ " " +AM +
			       "\n  quien labora en" + Depar + " con " + Antiguedad +
			       "\n   recibe 6 dias de vacaciones.");  
             }
  	     if(Antiguedad.equals("2 a 6 años de servicio")){
             textarea1.setText("\n  Eltrabajador " + nombreEmpleado +" " + AP+ " " +AM +
			       "\n  quien labora en" + Depar + " con " + Antiguedad +
			       "\n   recibe 14 dias de vacaciones.");  
             }
             if(Antiguedad.equals("7 o mas años de servicio")){
             textarea1.setText("\n  Eltrabajador " + nombreEmpleado +" " + AP+ " " +AM +
			       "\n  quien labora en" + Depar + " con " + Antiguedad +
			       "\n   recibe 20 dias de vacaciones.");  
             }
             }
            if(Depar.equals("Departamento de Logistica")){
             if(Antiguedad.equals("1 año de servicio")){
             textarea1.setText("\n  Eltrabajador " + nombreEmpleado +" " + AP+ " " +AM +
			       "\n  quien labora en" + Depar + " con " + Antiguedad +
			       "\n   recibe 7 dias de vacaciones.");  
             }
  	     if(Antiguedad.equals("2 a 6 años de servicio")){
             textarea1.setText("\n  Eltrabajador " + nombreEmpleado +" " + AP+ " " +AM +
			       "\n  quien labora en" + Depar + " con " + Antiguedad +
			       "\n   recibe 15 dias de vacaciones.");  
             }
             if(Antiguedad.equals("7 o mas años de servicio")){
             textarea1.setText("\n  Eltrabajador " + nombreEmpleado +" " + AP+ " " +AM +
			       "\n  quien labora en" + Depar + " con " + Antiguedad +
			       "\n   recibe 22 dias de vacaciones.");  
             }
             }
              if(Depar.equals("Departamento de Gerencia")){
             if(Antiguedad.equals("1 año de servicio")){
             textarea1.setText("\n  Eltrabajador " + nombreEmpleado +" " + AP+ " " +AM +
			       "\n  quien labora en" + Depar + " con " + Antiguedad +
			       "\n   recibe 10 dias de vacaciones.");  
             }
  	     if(Antiguedad.equals("2 a 6 años de servicio")){
             textarea1.setText("\n  Eltrabajador " + nombreEmpleado +" " + AP+ " " +AM +
			       "\n  quien labora en" + Depar + " con " + Antiguedad +
			       "\n   recibe 20 dias de vacaciones.");  
             }
             if(Antiguedad.equals("7 o mas años de servicio")){
             textarea1.setText("\n  Eltrabajador " + nombreEmpleado +" " + AP+ " " +AM +
			       "\n  quien labora en" + Depar + " con " + Antiguedad +
			       "\n   recibe 30 dias de vacaciones.");  
             }
          }
       }
    }
    if(e.getSource() == miRojo){
       getContentPane().setBackground(new Color(255,0,0));
    }
    if(e.getSource() == miNegro){
        getContentPane().setBackground(new Color(0,0,0));
    }
    if(e.getSource() == miMorado){
          getContentPane().setBackground(new Color(51,0,51));
    }
    if(e.getSource() == miElCreador){
       JOptionPane.showMessageDialog(null,"Desarrollado por la mejor programadora de informatica Reynni Fernanda Pimentel Rubio");
	 
    }
    if(e.getSource() == miSalir){
	  Bienvenida obj1 = new Bienvenida();
          obj1.setBounds(0,0,350,450);
          obj1.setVisible(true);
          obj1.setResizable(false);
          obj1.setLocationRelativeTo(null);
          this.setVisible(false);
    }
    if(e.getSource() == miNuevo){
          txtNombreTrabajador.setText("");
          txtApaternoTrabajador.setText("");
          txtAMaternoTrabajador.setText("");
          comboDepartamento.setSelectedIndex(0);
	  comboAntiguedad.setSelectedIndex(0);
          textarea1.setText("\n  Aqui aparece el resultado del calculo de las vacaciones.");
    }
  }
  
  public static void main(String args[]){
    Principal obj3 = new Principal();
    obj3.setBounds(0,0,640,535);
    obj3.setVisible(true);
    obj3.setResizable(false);
    obj3.setLocationRelativeTo(null);
  }
} 