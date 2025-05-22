package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JSpinner spnCalificacion;
    private JSpinner spnVisitado;


    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar

        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar

        // Agregar todos los elementos al panel
        // TODO completar
    	
   
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();

            gbc.insets = new Insets(5, 5, 5, 5);
            gbc.anchor = GridBagConstraints.LINE_START;

            // --- Fila 1: Nombre ---
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 0.0;
            gbc.fill = GridBagConstraints.NONE;
            add(new JLabel("Nombre:"), gbc);

            gbc.gridx = 1;
            gbc.weightx = 1.0;
            txtNombre = new JTextField(15);
            add(txtNombre, gbc);

            // --- Fila 2: Calificación ---
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.weightx = 0.0;
            add(new JLabel("Calificación:"), gbc);

            gbc.gridx = 1;
            gbc.weightx = 1.0;
            spnCalificacion = new JSpinner(new SpinnerNumberModel(1, 1, 5, 1));
            ((JSpinner.DefaultEditor) spnCalificacion.getEditor()).getTextField().setColumns(2);
            add(spnCalificacion, gbc);

            // --- Fila 3: Visitado ---
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.weightx = 0.0;
            add(new JLabel("Visitado:"), gbc);

            gbc.gridx = 1;
            gbc.weightx = 1.0;
            spnVisitado = new JSpinner(new SpinnerListModel(new String[]{"Sí", "No"}));
            ((JSpinner.DefaultEditor) spnVisitado.getEditor()).getTextField().setColumns(3);
            add(spnVisitado, gbc);

            // --- Pegamento vertical para alinear arriba ---
            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.gridwidth = 2;
            gbc.weighty = 1.0;
            gbc.fill = GridBagConstraints.VERTICAL;
            add(Box.createGlue(), gbc);
        }
    

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado() {
        return "Sí".equals(spnVisitado.getValue());
    }

    /**
     * Retorna la calificación seleccionada en el spinner como entero.
     */
    public int getCalificacion() {
        return (Integer) spnCalificacion.getValue();
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
    	return txtNombre.getText();
        //return "";
    }
}
