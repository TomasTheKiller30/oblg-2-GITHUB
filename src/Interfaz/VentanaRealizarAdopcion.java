/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import Dominio.*;
import MainPackage.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 */
public class VentanaRealizarAdopcion extends javax.swing.JFrame {
    private Sistema modelo;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaRealizarAdopcion.class.getName());

    /**
     * Creates new form VentanaRealizarAdopcion
     */
    public VentanaRealizarAdopcion(Sistema unSistema) {
        this.modelo = unSistema;
        initComponents();
        cargarListas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFieldComentarios = new javax.swing.JTextField();
        btnAceptarAdopcion = new javax.swing.JButton();
        labelComentarios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAnimales = new javax.swing.JList<>();
        labelAnimales = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaFamilias = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        labelTitulo = new javax.swing.JLabel();
        labelFamilias = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        labelAnimalSeleccionado = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelTemperamento = new javax.swing.JLabel();
        labelTemperamento1 = new javax.swing.JLabel();
        labelMostrarCodigo = new javax.swing.JLabel();
        labelMostrarNombre = new javax.swing.JLabel();
        labelMostrarTemperamento = new javax.swing.JLabel();
        labelMostrarPeso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelMostrarNumeroAdopcion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 600));
        getContentPane().setLayout(null);

        textFieldComentarios.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(textFieldComentarios);
        textFieldComentarios.setBounds(310, 410, 370, 126);

        btnAceptarAdopcion.setBackground(new java.awt.Color(241, 255, 236));
        btnAceptarAdopcion.setForeground(new java.awt.Color(4, 101, 4));
        btnAceptarAdopcion.setText("Aceptar");
        btnAceptarAdopcion.addActionListener(this::btnAceptarAdopcionActionPerformed);
        getContentPane().add(btnAceptarAdopcion);
        btnAceptarAdopcion.setBounds(90, 360, 100, 23);

        labelComentarios.setText("Comentarios:");
        getContentPane().add(labelComentarios);
        labelComentarios.setBounds(310, 390, 100, 16);

        listaAnimales.setToolTipText("");
        listaAnimales.setSelectionBackground(new java.awt.Color(235, 247, 255));
        listaAnimales.addListSelectionListener(this::listaAnimalesValueChanged);
        jScrollPane1.setViewportView(listaAnimales);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 90, 170, 280);

        labelAnimales.setText("Animales (disponibles):");
        getContentPane().add(labelAnimales);
        labelAnimales.setBounds(310, 70, 130, 16);

        listaFamilias.setSelectionBackground(new java.awt.Color(235, 247, 255));
        jScrollPane2.setViewportView(listaFamilias);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(510, 90, 170, 280);

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setToolTipText("");
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 40, 700, 10);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelTitulo.setText("Nueva Adopción");
        getContentPane().add(labelTitulo);
        labelTitulo.setBounds(10, 10, 140, 20);

        labelFamilias.setText("Familias:");
        getContentPane().add(labelFamilias);
        labelFamilias.setBounds(510, 70, 60, 16);

        panelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("INFO"));

        labelAnimalSeleccionado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelAnimalSeleccionado.setText("Animal Seleccionado:");

        labelCodigo.setText("Código:");

        labelNombre.setText("Nombre:");

        labelTemperamento.setText("Temperamento:");

        labelTemperamento1.setText("Peso (kg):");

        labelMostrarCodigo.setText("---");

        labelMostrarNombre.setText("---");

        labelMostrarTemperamento.setText("---");

        labelMostrarPeso.setText("---");

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Numero de Adopcion:");

        labelMostrarNumeroAdopcion.setForeground(new java.awt.Color(102, 102, 102));
        labelMostrarNumeroAdopcion.setText("---");

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(labelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelMostrarCodigo))
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTemperamento)
                                    .addComponent(labelNombre)
                                    .addComponent(labelTemperamento1))
                                .addGap(51, 51, 51)
                                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMostrarPeso)
                                    .addComponent(labelMostrarNombre)
                                    .addComponent(labelMostrarTemperamento)))
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(labelMostrarNumeroAdopcion))))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelAnimalSeleccionado)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAnimalSeleccionado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(labelMostrarCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(labelMostrarNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTemperamento)
                    .addComponent(labelMostrarTemperamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTemperamento1)
                    .addComponent(labelMostrarPeso))
                .addGap(31, 31, 31)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelMostrarNumeroAdopcion))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(panelInfo);
        panelInfo.setBounds(20, 130, 240, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //hace que se muestren los arraylist en los Jlist
    private void cargarListas(){
        
        listaAnimales.setListData(modelo.animalesDisponibles());
        listaFamilias.setListData(modelo.familiasDisponibles());
    }
    
    // valida y registra en el arraylist
    private void btnAceptarAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAdopcionActionPerformed
        Animal animalElegido = listaAnimales.getSelectedValue();
        Familia familiaElegida = listaFamilias.getSelectedValue();
        String comentarios = textFieldComentarios.getText().trim();
        //validacion
        
        if (animalElegido == null){
            JOptionPane.showMessageDialog(this, "No se ha elegido un animal, intente devuelta", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else if ( familiaElegida == null){
            JOptionPane.showMessageDialog(this, "No se ha elegido una familia, intente devuelta", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else if (comentarios.isEmpty()){ // ya se le hizo el .trim() mas arriba
            JOptionPane.showMessageDialog(this, "No se han escrito comentarios", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else {
            
            // hace 2 cosas, guarda el numero y realiza la Adopción (aka, la guarda en el arrayList.)
            int nro = modelo.realizarAdopcion(animalElegido, familiaElegida, comentarios);
            JOptionPane.showMessageDialog(this, "", "Adopción realizada con éxitos", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            cargarListas(); // recarga
        }
    }//GEN-LAST:event_btnAceptarAdopcionActionPerformed

    
    
    private void listaAnimalesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAnimalesValueChanged
        Animal a = listaAnimales.getSelectedValue();

        if (a != null) {
            labelMostrarCodigo.setText(a.getCodigo());
            labelMostrarNombre.setText(a.getNombreAnimal());
            labelMostrarTemperamento.setText(a.getTemperamento());
            labelMostrarPeso.setText(String.valueOf(a.getPeso()));
            labelMostrarNumeroAdopcion.setText(String.valueOf(modelo.getProximoNumeroAdopcion()));
        } else {
            labelMostrarCodigo.setText("---");
            labelMostrarNombre.setText("---");
            labelMostrarTemperamento.setText("---");
            labelMostrarPeso.setText("---");
            labelMostrarNumeroAdopcion.setText("---");
        }
    }//GEN-LAST:event_listaAnimalesValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarAdopcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAnimalSeleccionado;
    private javax.swing.JLabel labelAnimales;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelComentarios;
    private javax.swing.JLabel labelFamilias;
    private javax.swing.JLabel labelMostrarCodigo;
    private javax.swing.JLabel labelMostrarNombre;
    private javax.swing.JLabel labelMostrarNumeroAdopcion;
    private javax.swing.JLabel labelMostrarPeso;
    private javax.swing.JLabel labelMostrarTemperamento;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTemperamento;
    private javax.swing.JLabel labelTemperamento1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<Animal> listaAnimales;
    private javax.swing.JList<Familia> listaFamilias;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JTextField textFieldComentarios;
    // End of variables declaration//GEN-END:variables
    }

