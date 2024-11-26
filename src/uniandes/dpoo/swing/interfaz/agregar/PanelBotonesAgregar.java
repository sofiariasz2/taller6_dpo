package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBotonesAgregar extends JPanel implements ActionListener
{
    /**
     * El comando utilizado para el botón que sirve para crear un nuevo restaurante
     */
    private static final String CREAR = "nuevo";

    /**
     * El comando utilizado para el botón que sirve para cerrar la ventana sin crear un restaurante
     */
    private static final String CERRAR = "ver";

    private JButton butNuevo;
    private JButton butCerrar;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaAgregarRestaurante ventanaPrincipal;

    public PanelBotonesAgregar(VentanaAgregarRestaurante ventanaPrincipal)
    {
        this.ventanaPrincipal = ventanaPrincipal;

        // Establecer el diseño del panel
        setLayout(new FlowLayout());

        // Botón para crear el restaurante
        butNuevo = new JButton("Crear Restaurante");
        butNuevo.addActionListener(this);
        butNuevo.setActionCommand(CREAR);
        add(butNuevo); // Agregar el botón al panel

        // Botón para cerrar la ventana
        butCerrar = new JButton("Cerrar");
        butCerrar.addActionListener(this);
        butCerrar.setActionCommand(CERRAR);
        add(butCerrar); // Agregar el botón al panel
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String comando = e.getActionCommand();
        if (comando.equals(CREAR))
        {
            ventanaPrincipal.agregarRestaurante();
        }
        else if (comando.equals(CERRAR))
        {
            ventanaPrincipal.cerrarVentana();
        }
    }
}
