package unidad13.teoriaU13.formulario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener {
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoCiudad;
    private JCheckBox tieneCocheCheck;
    private JRadioButton masculinoRadio;
    private JRadioButton femeninoRadio;
    private JRadioButton noBinarioRadio;
    private JComboBox<String> departamentoSelect;
    private JButton botonAceptar;
    private ButtonGroup grupoGenero;

    public Formulario() {
        super("Formulario empleado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel panelNombre = new JPanel();
        panelNombre.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelNombre.add(new JLabel("Nombre:"));
        campoNombre = new JTextField(10);
        panelNombre.add(campoNombre);
        add(panelNombre);
        
        JPanel panelApellido = new JPanel();
        panelApellido.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelApellido.add(new JLabel("Apellido:"));
        campoApellido = new JTextField(10);
        panelApellido.add(campoApellido);
        add(panelApellido);
        
        JPanel panelCiudad = new JPanel();
        panelCiudad.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelCiudad.add(new JLabel("Ciudad:"));
        campoCiudad = new JTextField(10);
        panelCiudad.add(campoCiudad);
        add(panelCiudad);

        JPanel tieneCochePanel = new JPanel();
        tieneCochePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        tieneCocheCheck = new JCheckBox("Tiene coche");
        tieneCochePanel.add(tieneCocheCheck);
        add(tieneCochePanel);

        JPanel panelGenero = new JPanel();
        panelGenero.setLayout(new FlowLayout(FlowLayout.LEFT));
        masculinoRadio = new JRadioButton("Masculino");
        femeninoRadio = new JRadioButton("Femenino");
        noBinarioRadio = new JRadioButton("No binario");
        grupoGenero = new ButtonGroup();
        grupoGenero.add(masculinoRadio);
        grupoGenero.add(femeninoRadio);
        grupoGenero.add(noBinarioRadio);
        panelGenero.add(masculinoRadio);
        panelGenero.add(femeninoRadio);
        panelGenero.add(noBinarioRadio);
        add(panelGenero);
        
        JPanel deparmentoPanel = new JPanel();
        deparmentoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        deparmentoPanel.add(new JLabel("Departamento"));
        departamentoSelect = new JComboBox<>(new String[]{"Ventas", "Desarrollo", "Sistemas", "Recursos Humanos", "Marketing"});
        deparmentoPanel.add(departamentoSelect);
        add(deparmentoPanel);
        
        botonAceptar = new JButton("Submit");
        botonAceptar.addActionListener(this);
        JPanel botonPanel = new JPanel();
        botonPanel.add(botonAceptar);
        add(botonPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        String ciudad = campoCiudad.getText();
        boolean tieneCoche = tieneCocheCheck.isSelected();
        
        String genero = "No especificado";
        if (masculinoRadio.isSelected()) {
        	genero = "Masculino";
        } else if (femeninoRadio.isSelected()) {
        	genero = "Femenino";
        } else if (noBinarioRadio.isSelected()) {
        	genero = "No binario";
        }
        
        String departamento = (String) departamentoSelect.getSelectedItem();
        
        // Procesamos o mostrarmos la datos leídos de los campos
        JOptionPane.showMessageDialog(this,
                "Nombre: " + nombre + "\nApellido: " + apellido + "\nCiudad: " + ciudad +
                "\nTiene coche: " + (tieneCoche ? "Sí" : "No") +
                "\nGénero: " + genero +
                "\nDepartamento: " + departamento);
    }

    public static void main(String[] args) {
        new Formulario();
    }
}
