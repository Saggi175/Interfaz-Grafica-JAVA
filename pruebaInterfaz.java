import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pruebaInterfaz extends JFrame implements ActionListener {
    private JLabel labelNombre;
    private JLabel labelApellido;
    private JLabel labelEdad;
    private JLabel labelNacionalidad;
    private JLabel labelProfesion;
    private JLabel labelEstadistica;

    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoEdad;
    private JTextField campoNacionalidad;
    private JTextField campoProfesion;
    private JTextField campoEstadistica;

    private JButton botonAgregar;
    private JTextArea areaTexto;

    public pruebaInterfaz() {
        super("Panel de Prueba en Java");
        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new GridLayout(3, 2));

        labelNombre = new JLabel("Nombre: ");
        panelSuperior.add(labelNombre);
        campoNombre = new JTextField(20);
        panelSuperior.add(campoNombre);

        labelApellido = new JLabel("Apellido: ");
        panelSuperior.add(labelApellido);
        campoApellido = new JTextField(20);
        panelSuperior.add(campoApellido);

        labelEdad = new JLabel("Edad: ");
        panelSuperior.add(labelEdad);
        campoEdad = new JTextField(20);
        panelSuperior.add(campoEdad);

        labelNacionalidad = new JLabel("Nacionalidad: ");
        panelSuperior.add(labelNacionalidad);
        campoNacionalidad = new JTextField(20);
        panelSuperior.add(campoNacionalidad);

        labelProfesion = new JLabel("Profesion: ");
        panelSuperior.add(labelProfesion);
        campoProfesion = new JTextField(20);
        panelSuperior.add(campoProfesion);

        labelEstadistica = new JLabel("\t Estadisticas: ");
        panelSuperior.add(labelEstadistica);
        campoEstadistica = new JTextField(20);
        panelSuperior.add(campoEstadistica);

        add(panelSuperior, BorderLayout.NORTH);

        botonAgregar = new JButton("Agregar");
        //botonAgregar
        botonAgregar.addActionListener(this);
        //botonAgregar.setLayout(new GridLayout(20,20));
        add(botonAgregar, BorderLayout.CENTER);

        areaTexto = new JTextArea();
        add(areaTexto, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        int edad = Integer.parseInt(campoEdad.getText());
        String nacionalidad = campoNacionalidad.getText();
        String profesion = campoProfesion.getText();
        int estadistica = Integer.parseInt (campoEstadistica.getText());

        areaTexto.append(nombre + " " + apellido + ", " + edad + " " + "años de edad, " + nacionalidad + ", " + profesion + ", " + estadistica + " " +"de AVG" + "\n");
        
        campoNombre.setText("");
        campoApellido.setText("");
        campoEdad.setText("");
        campoNacionalidad.setText("");
        campoProfesion.setText("");
        campoEstadistica.setText("");
    }

    public static void main(String[] args) {
        pruebaInterfaz ig = new pruebaInterfaz();
    }
}