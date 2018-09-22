/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.service;

import co.com.quipux.colegioquipux.manager.impl.DescripcionManagerImpl;
import co.com.quipux.colegioquipux.manager.impl.EstudianteManagerImpl;
import co.com.quipux.colegioquipux.manager.impl.GradoManagerImpl;
import co.com.quipux.colegioquipux.manager.impl.GradoMateriaManagerImpl;
import co.com.quipux.colegioquipux.manager.impl.GrupoManagerImpl;
import co.com.quipux.colegioquipux.manager.impl.MateriaManagerImpl;
import co.com.quipux.colegioquipux.manager.impl.NotasManagerImpl;
import co.com.quipux.colegioquipux.manager.impl.PlanManagerImpl;
import co.com.quipux.colegioquipux.manager.impl.ProfesorManagerImpl;
import co.com.quipux.colegioquipux.manager.impl.ProfesorMateriaManagerImpl;
import co.com.quipux.colegioquipux.models.dto.MateriaDTO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Verde
 */
public class Materia extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ProfesorManagerImpl profesorManager = new ProfesorManagerImpl();
    PlanManagerImpl planManager = new PlanManagerImpl();
    DescripcionManagerImpl descripcionManager = new DescripcionManagerImpl();
    EstudianteManagerImpl estudianteManager = new EstudianteManagerImpl();
    GradoManagerImpl gradoManager = new GradoManagerImpl();
    GradoMateriaManagerImpl gradoMateriaManager = new GradoMateriaManagerImpl();
    GrupoManagerImpl grupoManager = new GrupoManagerImpl();
    MateriaManagerImpl materiaManager = new MateriaManagerImpl();
    NotasManagerImpl notasManager = new NotasManagerImpl();
    ProfesorMateriaManagerImpl profesorMateriaManager = new ProfesorMateriaManagerImpl();

    public static String[] AgregarElementosTabla(MateriaDTO materia) {

        String Dato[] = new String[3];
        Dato[0] = materia.getIdmateria();
        Dato[1] = materia.getNombreMateria();
        Dato[2] = materia.getDescripcionMateria();
        return Dato;
    }

    /**
     * Creates new form ConsultarSimpleProfesor
     */
    public Materia(ProfesorManagerImpl profesorManagerRe, PlanManagerImpl planManagerRe, DescripcionManagerImpl descripcionManagerRe, EstudianteManagerImpl estudianteManagerRe, GradoManagerImpl gradoManagerRe, GradoMateriaManagerImpl gradoMateriaManagerRe, GrupoManagerImpl grupoManagerRe, MateriaManagerImpl materiaManagerRe, NotasManagerImpl notasManagerRe, ProfesorMateriaManagerImpl profesorMateriaManagerRe) {
        profesorManager = profesorManagerRe;
        planManager = planManagerRe;
        descripcionManager = descripcionManagerRe;
        estudianteManager = estudianteManagerRe;
        gradoManager = gradoManagerRe;
        gradoMateriaManager = gradoMateriaManagerRe;
        grupoManager = grupoManagerRe;
        materiaManager = materiaManagerRe;
        notasManager = notasManagerRe;
        profesorMateriaManager = profesorMateriaManagerRe;
        initComponents();
        modelo.addColumn("Id Materia");
        modelo.addColumn("Nombre Materia");
        modelo.addColumn("Descripcion Materia");
        jTable1.setModel(modelo);
        JId.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JId.setText("");
            }
        });
        Jnombre1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Jnombre1.setText("");
            }
        });
        Jdescripcion.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Jdescripcion.setText("");
            }
        });
        Eliminar1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Eliminar1.setText("");
            }
        });
        Jopcion.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Jopcion.setText("");
            }
        });
    }

    public Materia() {
        initComponents();
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Jdescripcion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Consulta1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Eliminar1 = new javax.swing.JTextField();
        Jopcion = new javax.swing.JTextField();
        Combobox = new javax.swing.JComboBox<>();
        JId = new javax.swing.JTextField();
        Jnombre1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 460, 240);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Registro");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 20, 90, 22);

        Jdescripcion.setText("Descripcion Materia");
        getContentPane().add(Jdescripcion);
        Jdescripcion.setBounds(20, 140, 110, 30);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 180, 120, 30);

        jButton2.setText("Refrescar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 180, 140, 30);

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(370, 40, 100, 40);

        Consulta1.setText("Consultar");
        Consulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta1ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta1);
        Consulta1.setBounds(310, 150, 130, 23);

        jButton4.setText("Volver a Inicio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(160, 183, 140, 30);

        Eliminar1.setText("ID de la materia a eliminar");
        getContentPane().add(Eliminar1);
        Eliminar1.setBounds(150, 40, 200, 50);
        getContentPane().add(Jopcion);
        Jopcion.setBounds(270, 110, 210, 30);

        Combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Materia", "Nombre Materia" }));
        Combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(Combobox);
        Combobox.setBounds(160, 110, 100, 30);

        JId.setText("Id Materia");
        getContentPane().add(JId);
        JId.setBounds(20, 60, 110, 30);

        Jnombre1.setText("Nombre Materia");
        getContentPane().add(Jnombre1);
        Jnombre1.setBounds(20, 100, 110, 30);

        jLabel1.setText("Consultar Por:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 90, 90, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (JId.getText().equals("Id Materia") || JId.getText().length() == 0 || Jnombre1.getText().equals("Nombre Materia") || Jnombre1.getText().length() == 0 || Jdescripcion.getText().equals("Descripcion Materia") || Jdescripcion.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe digitar un dato en el campo");
        } else {
            MateriaDTO materia = new MateriaDTO();
            materia.setIdmateria(JId.getText());
            materia.setNombreMateria(Jnombre1.getText());
            materia.setDescripcionMateria(Jdescripcion.getText());
            materiaManager.registrarMateria(materia);
            this.jButton2ActionPerformed(evt);
            JId.setText("Id Materia");
            Jnombre1.setText("Nombre Materia");
            Jdescripcion.setText("Descripcion Materia");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modelo.setRowCount(0);
        ArrayList<MateriaDTO> listaMateria = materiaManager.traerListaMaterias();
        for (MateriaDTO materia : listaMateria) {
            String Dato[] = Materia.AgregarElementosTabla(materia);
            modelo.addRow(Dato);
        }

        jTable1.setModel(modelo);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (Eliminar1.getText().equals("Id Materia") || Eliminar1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe digitar un dato en el campo");
        } else {
            if (materiaManager.consultarMateria(Eliminar1.getText()) != null) {
                materiaManager.eliminarMateria(Eliminar1.getText());
                this.jButton2ActionPerformed(evt);
                Eliminar1.setText("Id Materia");
                JOptionPane.showMessageDialog(null, "Se ha eliminado la materia");
            } else {
                JOptionPane.showMessageDialog(null, "Ese Id no esta registrado");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Consulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta1ActionPerformed

        MateriaDTO materia = new MateriaDTO();
        int i = Combobox.getSelectedIndex();

        if (i == 0) {
            if (Jopcion.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe digitar un dato en el campo");
            } else {
                if (materiaManager.consultarMateria(Jopcion.getText()) != null) {
                    materia = materiaManager.consultarMateria(Jopcion.getText());
                    modelo.setRowCount(0);
                    String Dato[] = Materia.AgregarElementosTabla(materia);
                    modelo.addRow(Dato);
                    Jopcion.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Ese Id no esta registrado");
                    Jopcion.setText("");
                }
            }
        } else if (i == 1) {
            if (Jopcion.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe digitar un dato en el campo");
            } else {
                if (materiaManager.consultarMateriaPorNombre(Jopcion.getText()) != null) {
                    materia = materiaManager.consultarMateriaPorNombre(Jopcion.getText());
                    modelo.setRowCount(0);
                    String Dato[] = Materia.AgregarElementosTabla(materia);
                    modelo.addRow(Dato);
                    Jopcion.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Esa materia no esta registrada");
                    Jopcion.setText("");
                }
                materia = materiaManager.consultarMateriaPorNombre(Jopcion.getText());
            }
        }
    }//GEN-LAST:event_Consulta1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        InicioA c = new InicioA(profesorManager, planManager, descripcionManager, estudianteManager, gradoManager, gradoMateriaManager, grupoManager, materiaManager, notasManager, profesorMateriaManager);
        dispose();
        c.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void ComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboboxActionPerformed
    }//GEN-LAST:event_ComboboxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combobox;
    private javax.swing.JButton Consulta1;
    private javax.swing.JTextField Eliminar1;
    private javax.swing.JTextField JId;
    private javax.swing.JTextField Jdescripcion;
    private javax.swing.JTextField Jnombre1;
    private javax.swing.JTextField Jopcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}