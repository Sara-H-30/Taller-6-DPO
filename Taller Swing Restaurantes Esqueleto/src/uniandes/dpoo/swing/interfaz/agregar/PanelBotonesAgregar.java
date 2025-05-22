package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.Color;
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

    public PanelBotonesAgregar( VentanaAgregarRestaurante ventanaPrincipal )
    {
        this.ventanaPrincipal = ventanaPrincipal;

        setLayout( new FlowLayout( ) );

        // Agrega el botón para crear el restaurante
        // TODO completar
        
        // Agrga el boton para cerrar la ventana
        // TODO completar
        
        butNuevo = new JButton("Crear restaurante");
        butNuevo.setActionCommand(CREAR);
        butNuevo.addActionListener(this);
        personalizarBoton(butNuevo);
        add(butNuevo);

        butCerrar = new JButton("Cerrar");
        butCerrar.setActionCommand(CERRAR);
        butCerrar.addActionListener(this);
        personalizarBoton(butCerrar);
        add(butCerrar);
    }
    
    private void personalizarBoton(JButton boton)
    {
        boton.setBackground(Color.WHITE);                
        boton.setFocusPainted(false);                   
        boton.setBorderPainted(false);                  
        boton.setContentAreaFilled(true);               
        boton.setOpaque(true);                          
        boton.setBorder(javax.swing.BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, false)); 
    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand( );
        if( comando.equals( CREAR ) )
        {
            ventanaPrincipal.agregarRestaurante( );
        }
        else if( comando.equals( CERRAR ) )
        {
            ventanaPrincipal.cerrarVentana( );
        }
    }
}
