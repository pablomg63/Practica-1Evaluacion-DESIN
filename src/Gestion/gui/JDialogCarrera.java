/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.gui;

import Gestion.dto.Gestor;
import java.util.Date;

/**
 *
 * @author PABLO
 */
public class JDialogCarrera extends javax.swing.JDialog {
    private Gestor gestor= null;
    /**
     * Creates new form JDialogCarrera
     */
    public JDialogCarrera(java.awt.Frame parent, boolean modal, Gestor gestor) {
        super(parent, modal);
        this.gestor=gestor;
        initComponents();
        if(!gestor.getNombreCarreraModificar().equals("")){
            jTextFieldNombre.setText(gestor.getNombreCarreraModificar());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelFechaCarr = new javax.swing.JLabel();
        jSpinnerFechaCarr = new javax.swing.JSpinner();
        jLabelLugar = new javax.swing.JLabel();
        jComboBoxLugar = new javax.swing.JComboBox<>();
        jLabelFechaNac1 = new javax.swing.JLabel();
        jSpinnerParticipantes = new javax.swing.JSpinner();
        jButtonAlta = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNombre.setText("Nombre:");

        jLabelFechaCarr.setText("Fecha Carrera:");

        jSpinnerFechaCarr.setModel(new javax.swing.SpinnerDateModel());

        jLabelLugar.setText("Lugar:");

        jComboBoxLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andalucia", "Aragon", "Asturias", "Baleares", "Canarias", "Cantabria", "Castilla La Mancha", "Castilla y León", "Cataluña", "Comunidad Valenciana", "Extremadura", "Galicia", "La Rioja", "Madrid", "Murcia", "Navarra", "Pais Vasco", "Cuta o Melilla", " " }));

        jLabelFechaNac1.setText("Participantes:");

        jButtonAlta.setText("Alta...");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelFechaCarr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerFechaCarr, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelLugar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxLugar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFechaNac1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSpinnerParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAlta)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaCarr)
                    .addComponent(jSpinnerFechaCarr, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLugar)
                    .addComponent(jComboBoxLugar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNac1)
                    .addComponent(jSpinnerParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlta)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        String nombre = jTextFieldNombre.getText();
        Date fechaCarrera = (Date) jSpinnerFechaCarr.getValue();
        String lugar = (String)jComboBoxLugar.getSelectedItem();
        int participantes= Integer.parseInt(jSpinnerParticipantes.getValue()+"");
        gestor.DarAltaCarrera(nombre, fechaCarrera, lugar, participantes, 0);
        dispose();
        
    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        String nombre= jTextFieldNombre.getText();
        Date fechaCarrera = (Date) jSpinnerFechaCarr.getValue();
        String lugar = (String)jComboBoxLugar.getSelectedItem();
        int participantes= Integer.parseInt(jSpinnerParticipantes.getValue()+"");
        gestor.ModificarCarrera(nombre, lugar, fechaCarrera, participantes);
        dispose();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxLugar;
    private javax.swing.JLabel jLabelFechaCarr;
    private javax.swing.JLabel jLabelFechaNac1;
    private javax.swing.JLabel jLabelLugar;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JSpinner jSpinnerFechaCarr;
    private javax.swing.JSpinner jSpinnerParticipantes;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
