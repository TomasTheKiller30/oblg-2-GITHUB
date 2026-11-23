/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import Dominio.*;
import MainPackage.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Tomas
 */
public class PanelPrincipal extends javax.swing.JFrame implements PropertyChangeListener {
    
    private Sistema modelo;
    
    
    public PanelPrincipal(Sistema unSistema) {
        this.modelo = unSistema;
        initComponents();
        cargarListas();
        cargarResumen();
        configurarColores();
        
        unSistema.agregarSubscriptor(this);
    }

    public void cargarListas(){
        listaAnimales.setListData(modelo.todosLosAnimales());
    }
    
    public void cargarResumen(){
    
        resumen_TotalAnimales.setText(String.valueOf(modelo.getListaAnimales().size()));
        resumen_Disponibles.setText(String.valueOf(modelo.cantidadAnimalesPorEstado("Disponible")));
        resumen_NoDisponibles.setText(String.valueOf(modelo.cantidadAnimalesPorEstado("No Disponible")));
        resumen_Entregados.setText(String.valueOf(modelo.cantidadAnimalesPorEstado("Entregado a Familia")));


        resumen_Adopciones.setText(String.valueOf(modelo.getListaAdopciones().size()));
        resumen_Empresas.setText(String.valueOf(modelo.getListaEmpresas().size()));

        // 1: perros grandes, 2: perros chicos, 3: perros adultos, 4: otros
        resumen_AlimentoGrandes.setText(modelo.stockAlimento(1) + " kg");
        resumen_AlimentoChicos.setText(modelo.stockAlimento(2) + " kg");
        resumen_AlimentoAdultos.setText(modelo.stockAlimento(3) + " kg");
        resumen_AlimentoOtro.setText(modelo.stockAlimento(4) + " kg");
    }

    private void configurarColores(){
        listaAnimales.setCellRenderer(new javax.swing.DefaultListCellRenderer() {
            @Override
            public java.awt.Component getListCellRendererComponent(
                    javax.swing.JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {

                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (value instanceof Animal) {
                    Animal a = (Animal) value;
                    setText(a.toString2()); // Acá le decís que use toString2()

                    if (!isSelected) {
                        if (a.getEstado().equals("Disponible")) {
                            setForeground(new java.awt.Color(0, 153, 0)); // Verde
                        } else if (a.getEstado().equals("No Disponible")) {
                            setForeground(java.awt.Color.RED); // Rojo
                        } else if (a.getEstado().equals("Entregado a Familia")) {
                            setForeground(java.awt.Color.BLUE); // Azul
                        }
                    }
                }
                return this;
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        resumen_TotalAnimales = new javax.swing.JLabel();
        resumen_Disponibles = new javax.swing.JLabel();
        resumen_NoDisponibles = new javax.swing.JLabel();
        resumen_Entregados = new javax.swing.JLabel();
        resumen_Adopciones = new javax.swing.JLabel();
        resumen_Empresas = new javax.swing.JLabel();
        resumen_AlimentoGrandes = new javax.swing.JLabel();
        resumen_AlimentoChicos = new javax.swing.JLabel();
        resumen_AlimentoAdultos = new javax.swing.JLabel();
        resumen_AlimentoOtro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAnimales = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAltas = new javax.swing.JMenu();
        m_a_Animales = new javax.swing.JMenuItem();
        m_a_Familias = new javax.swing.JMenuItem();
        m_a_Empresas = new javax.swing.JMenuItem();
        menuMovimientos = new javax.swing.JMenu();
        m_m_RealizarAdopcion = new javax.swing.JMenuItem();
        m_m_CambiarDeEstado = new javax.swing.JMenuItem();
        m_m_AnularAdopcion = new javax.swing.JMenuItem();
        m_m_RegistrarDonacion = new javax.swing.JMenuItem();
        m_m_ImportarDonaciones = new javax.swing.JMenuItem();
        menuVarios = new javax.swing.JMenu();
        m_v_ConsultaFamilias = new javax.swing.JMenuItem();
        m_v_ConsultaDonaciones = new javax.swing.JMenuItem();
        m_v_GenerarPagina = new javax.swing.JMenuItem();
        m_v_RecuperarDatos = new javax.swing.JMenuItem();
        m_v_Autores = new javax.swing.JMenuItem();
        m_v_Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Refugio de perros");
        setBackground(new java.awt.Color(225, 237, 187));
        setPreferredSize(new java.awt.Dimension(580, 420));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen del refugio"));

        jLabel1.setText("Total de animales:");

        jLabel2.setText("Disponibles:");

        jLabel3.setText("No disponibles:");

        jLabel4.setText("Entregados a familias:");

        jLabel5.setText("Adopciones registradas:");

        jLabel6.setText("Empresas registradas:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Stock de alimento (kg):");

        jLabel8.setText("Perros grandes:");

        jLabel9.setText("Perros chicos:");

        jLabel10.setText("Perros adultos:");

        jLabel11.setText("Otro:");

        resumen_TotalAnimales.setText("0");

        resumen_Disponibles.setText("0");

        resumen_NoDisponibles.setText("0");

        resumen_Entregados.setText("0");

        resumen_Adopciones.setText("0");

        resumen_Empresas.setText("0");

        resumen_AlimentoGrandes.setText("0");

        resumen_AlimentoChicos.setText("0");

        resumen_AlimentoAdultos.setText("0");

        resumen_AlimentoOtro.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resumen_TotalAnimales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumen_Disponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumen_NoDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumen_Entregados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumen_Adopciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumen_Empresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumen_AlimentoGrandes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumen_AlimentoChicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumen_AlimentoAdultos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumen_AlimentoOtro, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(resumen_TotalAnimales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(resumen_Disponibles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(resumen_NoDisponibles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(resumen_Entregados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(resumen_Adopciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(resumen_Empresas))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(resumen_AlimentoGrandes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(resumen_AlimentoChicos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(resumen_AlimentoAdultos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resumen_AlimentoOtro)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 270, 290);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Animales"));

        jScrollPane1.setViewportView(listaAnimales);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(310, 20, 250, 290);

        menuAltas.setText("Altas");

        m_a_Animales.setText("Animales");
        m_a_Animales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_a_AnimalesActionPerformed(evt);
            }
        });
        menuAltas.add(m_a_Animales);

        m_a_Familias.setText("Familias");
        m_a_Familias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_a_FamiliasActionPerformed(evt);
            }
        });
        menuAltas.add(m_a_Familias);

        m_a_Empresas.setText("Empresas");
        m_a_Empresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_a_EmpresasActionPerformed(evt);
            }
        });
        menuAltas.add(m_a_Empresas);

        jMenuBar1.add(menuAltas);

        menuMovimientos.setText("Movimientos");

        m_m_RealizarAdopcion.setText("Realizar adopción");
        m_m_RealizarAdopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_m_RealizarAdopcionActionPerformed(evt);
            }
        });
        menuMovimientos.add(m_m_RealizarAdopcion);

        m_m_CambiarDeEstado.setText("Cambiar de estado");
        m_m_CambiarDeEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_m_CambiarDeEstadoActionPerformed(evt);
            }
        });
        menuMovimientos.add(m_m_CambiarDeEstado);

        m_m_AnularAdopcion.setText("Anular adopción");
        m_m_AnularAdopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_m_AnularAdopcionActionPerformed(evt);
            }
        });
        menuMovimientos.add(m_m_AnularAdopcion);

        m_m_RegistrarDonacion.setText("Registrar donación");
        m_m_RegistrarDonacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_m_RegistrarDonacionActionPerformed(evt);
            }
        });
        menuMovimientos.add(m_m_RegistrarDonacion);

        m_m_ImportarDonaciones.setText("Importar donaciones");
        m_m_ImportarDonaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_m_ImportarDonacionesActionPerformed(evt);
            }
        });
        menuMovimientos.add(m_m_ImportarDonaciones);

        jMenuBar1.add(menuMovimientos);

        menuVarios.setText("Varios");

        m_v_ConsultaFamilias.setText("Consulta de familias");
        m_v_ConsultaFamilias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_v_ConsultaFamiliasActionPerformed(evt);
            }
        });
        menuVarios.add(m_v_ConsultaFamilias);

        m_v_ConsultaDonaciones.setText("Consulta de donaciones");
        menuVarios.add(m_v_ConsultaDonaciones);

        m_v_GenerarPagina.setText("Generar página");
        m_v_GenerarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_v_GenerarPaginaActionPerformed(evt);
            }
        });
        menuVarios.add(m_v_GenerarPagina);

        m_v_RecuperarDatos.setText("Recuperar datos");
        menuVarios.add(m_v_RecuperarDatos);

        m_v_Autores.setText("Autores");
        m_v_Autores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_v_AutoresActionPerformed(evt);
            }
        });
        menuVarios.add(m_v_Autores);

        m_v_Salir.setText("Salir");
        menuVarios.add(m_v_Salir);

        jMenuBar1.add(menuVarios);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_a_AnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_a_AnimalesActionPerformed
        VentanaAltaAnimal ventanaAlta = new VentanaAltaAnimal(this.modelo);
        ventanaAlta.setVisible(true);
    }//GEN-LAST:event_m_a_AnimalesActionPerformed

    private void m_m_RealizarAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_m_RealizarAdopcionActionPerformed
        VentanaRealizarAdopcion ventanaAlta = new VentanaRealizarAdopcion(this.modelo);
        ventanaAlta.setVisible(true);
    }//GEN-LAST:event_m_m_RealizarAdopcionActionPerformed

    private void m_m_CambiarDeEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_m_CambiarDeEstadoActionPerformed
        VentanaCambiarEstado ventanaAlta = new VentanaCambiarEstado(this.modelo);
        ventanaAlta.setVisible(true);
    }//GEN-LAST:event_m_m_CambiarDeEstadoActionPerformed

    private void m_m_AnularAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_m_AnularAdopcionActionPerformed
        VentanaAnularAdopcion ventanaAlta = new VentanaAnularAdopcion(this.modelo);
        ventanaAlta.setVisible(true);
    }//GEN-LAST:event_m_m_AnularAdopcionActionPerformed
    private void m_a_FamiliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_a_FamiliasActionPerformed
        VentanaAltaFamilia ventanaAlta2 = new VentanaAltaFamilia(this.modelo);
        ventanaAlta2.setVisible(true);
    }//GEN-LAST:event_m_a_FamiliasActionPerformed

    private void m_a_EmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_a_EmpresasActionPerformed
        VentanaAltaEmpresa ventanaAlta3 = new VentanaAltaEmpresa(this.modelo);
        ventanaAlta3.setVisible(true);
    }//GEN-LAST:event_m_a_EmpresasActionPerformed

    private void m_m_RegistrarDonacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_m_RegistrarDonacionActionPerformed
        new VentanaRegistrarDonacion(this.modelo).setVisible(true);
    }//GEN-LAST:event_m_m_RegistrarDonacionActionPerformed

    private void m_m_ImportarDonacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_m_ImportarDonacionesActionPerformed
        new VentanaImportarDonaciones(this.modelo).setVisible(true);
    }//GEN-LAST:event_m_m_ImportarDonacionesActionPerformed
    private void m_v_ConsultaFamiliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_v_ConsultaFamiliasActionPerformed
        VentanaConsultaFamilia ventanaAlta = new VentanaConsultaFamilia(this.modelo);
        ventanaAlta.setVisible(true);
    }//GEN-LAST:event_m_v_ConsultaFamiliasActionPerformed

    private void m_v_GenerarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_v_GenerarPaginaActionPerformed
        VentanaGenerarPagina ventanaAlta = new VentanaGenerarPagina(this.modelo);
        ventanaAlta.setVisible(true);
    }//GEN-LAST:event_m_v_GenerarPaginaActionPerformed

    private void m_v_AutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_v_AutoresActionPerformed
        VentanaAutores VentanaAlta = new VentanaAutores(this.modelo);
        VentanaAlta.setVisible(true);
    }//GEN-LAST:event_m_v_AutoresActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaAnimales;
    private javax.swing.JMenuItem m_a_Animales;
    private javax.swing.JMenuItem m_a_Empresas;
    private javax.swing.JMenuItem m_a_Familias;
    private javax.swing.JMenuItem m_m_AnularAdopcion;
    private javax.swing.JMenuItem m_m_CambiarDeEstado;
    private javax.swing.JMenuItem m_m_ImportarDonaciones;
    private javax.swing.JMenuItem m_m_RealizarAdopcion;
    private javax.swing.JMenuItem m_m_RegistrarDonacion;
    private javax.swing.JMenuItem m_v_Autores;
    private javax.swing.JMenuItem m_v_ConsultaDonaciones;
    private javax.swing.JMenuItem m_v_ConsultaFamilias;
    private javax.swing.JMenuItem m_v_GenerarPagina;
    private javax.swing.JMenuItem m_v_RecuperarDatos;
    private javax.swing.JMenuItem m_v_Salir;
    private javax.swing.JMenu menuAltas;
    private javax.swing.JMenu menuMovimientos;
    private javax.swing.JMenu menuVarios;
    private javax.swing.JLabel resumen_Adopciones;
    private javax.swing.JLabel resumen_AlimentoAdultos;
    private javax.swing.JLabel resumen_AlimentoChicos;
    private javax.swing.JLabel resumen_AlimentoGrandes;
    private javax.swing.JLabel resumen_AlimentoOtro;
    private javax.swing.JLabel resumen_Disponibles;
    private javax.swing.JLabel resumen_Empresas;
    private javax.swing.JLabel resumen_Entregados;
    private javax.swing.JLabel resumen_NoDisponibles;
    private javax.swing.JLabel resumen_TotalAnimales;
    // End of variables declaration//GEN-END:variables
    
    
    @Override
    public void propertyChange(PropertyChangeEvent evt){
        cargarListas();
        cargarResumen();
        configurarColores();
    }
}

