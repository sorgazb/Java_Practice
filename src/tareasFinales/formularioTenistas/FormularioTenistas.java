package tareasFinales.formularioTenistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioTenistas extends JFrame implements ActionListener {
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JCheckBox estaRetidadoCheck;
    private JRadioButton masculinoRadio;
    private JRadioButton femeninoRadio;
    private JRadioButton revesAUnaMano;
    private JRadioButton revesADosManos;
    private JComboBox<String> superficieSeleccionada;
    private JButton botonAceptar;
    private JButton botonAbrirTabla;
    private ButtonGroup grupoGenero;
    private ButtonGroup grupoReves;
    public static BaseDatosTenistas bd;

    public FormularioTenistas() {
        super("Formulario Tenistas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel panelNombre = new JPanel();
        panelNombre.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelNombre.add(new JLabel("Nombre:"));
        campoNombre = new JTextField(10);
        panelNombre.add(campoNombre);
        add(panelNombre);
        
        JPanel panelApellido = new JPanel();
        panelApellido.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelApellido.add(new JLabel("Apellido:"));
        campoApellido = new JTextField(10);
        panelApellido.add(campoApellido);
        add(panelApellido);

        JPanel estaRetirado = new JPanel();
        estaRetirado.setLayout(new FlowLayout(FlowLayout.CENTER));
        estaRetidadoCheck = new JCheckBox("Está Retirado");
        estaRetirado.add(estaRetidadoCheck);
        add(estaRetirado);

        JPanel panelGenero = new JPanel();
        panelGenero.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelGenero.add(new JLabel("Sexo:"));
        masculinoRadio = new JRadioButton("Masculino");
        femeninoRadio = new JRadioButton("Femenino");
        grupoGenero = new ButtonGroup();
        grupoGenero.add(masculinoRadio);
        grupoGenero.add(femeninoRadio);
        panelGenero.add(masculinoRadio);
        panelGenero.add(femeninoRadio);
        add(panelGenero);
        
        JPanel panelTipoReves = new JPanel();
        panelTipoReves.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelTipoReves.add(new JLabel("Tipo Revés:"));
        revesAUnaMano = new JRadioButton("A una Mano");
        revesADosManos = new JRadioButton("A dos Manos");
        grupoReves = new ButtonGroup();
        grupoReves.add(revesAUnaMano);
        grupoReves.add(revesADosManos);
        panelTipoReves.add(revesAUnaMano);
        panelTipoReves.add(revesADosManos);
        add(panelTipoReves);
        
        JPanel superficiePanel = new JPanel();
        superficiePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        superficiePanel.add(new JLabel("Superficie Favorita"));
        superficieSeleccionada = new JComboBox<>(new String[]{"Tierra", "Hierba", "Pista"});
        superficiePanel.add(superficieSeleccionada);
        add(superficiePanel);
        
        botonAceptar = new JButton("Registrar");
        botonAceptar.addActionListener(this);
        JPanel botonPanel = new JPanel();
        botonPanel.add(botonAceptar);
        add(botonPanel);
        
        botonAbrirTabla = new JButton("Mostrar Tabla");
        botonAbrirTabla.addActionListener(e -> bd.mostrarTabla());
        JPanel botonTabla = new JPanel();
        botonPanel.add(botonAbrirTabla);
        add(botonTabla);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        boolean estaRetidado = estaRetidadoCheck.isSelected();
        
        String genero = "No especificado";
        if (masculinoRadio.isSelected()) {
        	genero = "Masculino";
        } else if (femeninoRadio.isSelected()) {
        	genero = "Femenino";
        }
        
        String reves = "No especificado";
        if (revesAUnaMano.isSelected()) {
        	reves = "A una Mano";
        } else if (revesADosManos.isSelected()) {
        	reves = "A dos Manos";
        }
        
        String superficie = (String) superficieSeleccionada.getSelectedItem();
                
        //Lo registramos en una base de datos
        Tenista tenista= new Tenista(nombre, apellido, estaRetidado, genero, reves, superficie);
        bd.insertarTenista(tenista);
        JOptionPane.showMessageDialog(this,"Tenista Registrado");
        
    }

    public static void main(String[] args) {
    	bd= new BaseDatosTenistas();
    	bd.cargarConfiguracionBD();
    	bd.crearTabla();
        new FormularioTenistas();
    }
}
