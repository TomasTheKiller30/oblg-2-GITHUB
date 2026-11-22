/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import Dominio.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author tomas
 */
public class VentanaConsultaFamilia extends javax.swing.JFrame implements PropertyChangeListener{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaConsultaFamilia.class.getName());
    private Sistema modelo;
    /**
     * Creates new form VentanaConsultaFamilia
     */
    public VentanaConsultaFamilia(Sistema unSistema) {
        this.modelo = unSistema;
        initComponents();
        cargarTabla();
    }

    private void cargarTabla (){
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaInfo.getModel(); 
        modeloTabla.setRowCount(0);
        
        Familia[] lista;
        if (radioPorApellido.isSelected()) {
            lista = modelo.familiasOrdenadasPorApellido();
        } 
        else {
            lista = modelo.familiasOrdenadasPorAdopciones();
        }
        
        for (int i = 0; i < lista.length; i++) {
            Familia f = lista[i];
            int cant = modelo.cantidadAdopcionesFamilia(f);

            Object[] fila = new Object[4]; //Crea el molde de las filas
            fila[0] = f.getApellido();
            fila[1] = f.getCedula();
            fila[2] = f.getCelular();
            fila[3] = cant;

            modeloTabla.addRow(fila);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        labelConsultaFamilias = new javax.swing.JLabel();
        labelFiltros = new javax.swing.JLabel();
        radioPorApellido = new javax.swing.JRadioButton();
        radioNroDeAdopciones = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInfo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(460, 585));
        setPreferredSize(new java.awt.Dimension(460, 585));
        getContentPane().setLayout(null);

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 40, 450, 10);

        labelConsultaFamilias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelConsultaFamilias.setText("Consulta de Familias");
        labelConsultaFamilias.setToolTipText("");
        getContentPane().add(labelConsultaFamilias);
        labelConsultaFamilias.setBounds(10, 10, 170, 25);

        labelFiltros.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelFiltros.setText("Filtros:");
        getContentPane().add(labelFiltros);
        labelFiltros.setBounds(10, 60, 46, 22);

        buttonGroup1.add(radioPorApellido);
        radioPorApellido.setSelected(true);
        radioPorApellido.setText("Por Apellido");
        radioPorApellido.addActionListener(this::radioPorApellidoActionPerformed);
        getContentPane().add(radioPorApellido);
        radioPorApellido.setBounds(10, 90, 150, 21);

        buttonGroup1.add(radioNroDeAdopciones);
        radioNroDeAdopciones.setText("Por Nro de Adopciones");
        radioNroDeAdopciones.addActionListener(this::radioNroDeAdopcionesActionPerformed);
        getContentPane().add(radioNroDeAdopciones);
        radioNroDeAdopciones.setBounds(10, 120, 190, 21);

        tablaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Familia", "Cédula", "Número", "Adopciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaInfo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 160, 400, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioPorApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPorApellidoActionPerformed
        cargarTabla();
    }//GEN-LAST:event_radioPorApellidoActionPerformed

    private void radioNroDeAdopcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNroDeAdopcionesActionPerformed
        cargarTabla();
    }//GEN-LAST:event_radioNroDeAdopcionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelConsultaFamilias;
    private javax.swing.JLabel labelFiltros;
    private javax.swing.JRadioButton radioNroDeAdopciones;
    private javax.swing.JRadioButton radioPorApellido;
    private javax.swing.JTable tablaInfo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarTabla();
    }
}
