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
import co.com.quipux.colegioquipux.models.dto.GradoMateriaDTO;
import co.com.quipux.colegioquipux.models.dto.MateriaDTO;
import co.com.quipux.colegioquipux.models.dto.ProfesorDTO;
import co.com.quipux.colegioquipux.models.dto.ProfesorMateriaDTO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Verde
 */
public class GradoMateria extends javax.swing.JFrame {

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

    public static String[] AgregarElementosTabla(GradoMateriaDTO gradoMateria, String nombreMateria) {

        String Dato[] = new String[3];
        Dato[0] = Integer.toString(gradoMateria.getIdGradoMateria());
        Dato[1] = nombreMateria;
        Dato[2] = Integer.toString(gradoMateria.getIdGrado());
        return Dato;
    }

    /**
     * Creates new form ConsultarSimpleProfesor
     */
    public GradoMateria(ProfesorManagerImpl profesorManagerRe, PlanManagerImpl planManagerRe, DescripcionManagerImpl descripcionManagerRe, EstudianteManagerImpl estudianteManagerRe, GradoManagerImpl gradoManagerRe, GradoMateriaManagerImpl gradoMateriaManagerRe, GrupoManagerImpl grupoManagerRe, MateriaManagerImpl materiaManagerRe, NotasManagerImpl notasManagerRe, ProfesorMateriaManagerImpl profesorMateriaManagerRe) {
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
        modelo.addColumn("IdGradoMateria");
        modelo.addColumn("Nombre Materia");
        modelo.addColumn("Grado");
        jTable1.setModel(modelo);

        Jmateria.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Jmateria.setText("");
            }
        });
        Grado.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Grado.setText("");
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

    public GradoMateria() {
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
        Grado = new javax.swing.JTextField();
        Jmateria = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Consulta1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Eliminar1 = new javax.swing.JTextField();
        Jopcion = new javax.swing.JTextField();
        Combobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 650));
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
        jScrollPane1.setBounds(20, 220, 548, 253);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Registro");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 0, 90, 30);

        Grado.setText("Grado");
        Grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradoActionPerformed(evt);
            }
        });
        getContentPane().add(Grado);
        Grado.setBounds(40, 80, 150, 30);

        Jmateria.setText("Nombre Materia");
        getContentPane().add(Jmateria);
        Jmateria.setBounds(40, 40, 150, 30);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 120, 150, 30);

        jButton2.setText("Refrescar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 180, 140, 23);

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(480, 50, 120, 30);

        Consulta1.setText("Consultar");
        Consulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta1ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta1);
        Consulta1.setBounds(450, 150, 130, 23);

        jButton4.setText("Volver a Inicio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(240, 180, 140, 23);

        Eliminar1.setText("Id de la relación a eliminar");
        getContentPane().add(Eliminar1);
        Eliminar1.setBounds(210, 50, 260, 30);
        getContentPane().add(Jopcion);
        Jopcion.setBounds(390, 110, 210, 30);

        Combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Materia", "Grado", " ", " " }));
        getContentPane().add(Combobox);
        Combobox.setBounds(250, 120, 120, 20);

        jLabel1.setText("Consultar Por:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 100, 79, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GradoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (Jmateria.getText().equals("Nombre Materia") || Grado.getText().equals("Grado") || Jmateria.getText().length() == 0 || Grado.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en los campos");
        } else {
            if (materiaManager.consultarMateriaPorNombre(Jmateria.getText()) != null) {
                if (this.isNumeric(Grado.getText())) {
                    if (gradoManager.consultarGrado(Integer.parseInt(Grado.getText())) != null) {
                        GradoMateriaDTO gradoMateria = new GradoMateriaDTO();
                        MateriaDTO materia = new MateriaDTO();
                        materia = materiaManager.consultarMateriaPorNombre(Jmateria.getText());
                        gradoMateria.setIdGrado(Integer.parseInt(Grado.getText()));
                        gradoMateria.setIdmateria(materia.getIdmateria());
                        gradoMateriaManager.registrarGradoMateria(gradoMateria);
                        this.jButton2ActionPerformed(evt);
                        Jmateria.setText("Nombre Materia");
                        Grado.setText("Grado");
                    } else {
                        JOptionPane.showMessageDialog(null, "El grado ingresado no se encuentra registrado");
                        Grado.setText("Grado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El Grado debe ser un caracter Numerico");
                    Grado.setText("Grado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La materia ingreasda no esta registrada");
                Jmateria.setText("Nombre Materia");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modelo.setRowCount(0);
        ArrayList<GradoMateriaDTO> listaGrados = gradoMateriaManager.traerListaGradoMateria();
        for (GradoMateriaDTO gradoMateria : listaGrados) {
            MateriaDTO materia = new MateriaDTO();
            materia = materiaManager.consultarMateria(gradoMateria.getIdmateria());
            String Dato[] = GradoMateria.AgregarElementosTabla(gradoMateria, materia.getNombreMateria());
            modelo.addRow(Dato);
        }

        jTable1.setModel(modelo);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (Eliminar1.getText().equals("Id de la relación a eliminar") || Eliminar1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe rellenar el campo");
        } else {
            if (this.isNumeric(Eliminar1.getText())) {
                gradoMateriaManager.eliminarGradoMateria(Integer.parseInt(Eliminar1.getText()));
                this.jButton2ActionPerformed(evt);
                Eliminar1.setText("Id de la relación a eliminar");
                JOptionPane.showMessageDialog(null, "Se ha eliminado la relación");
            } else {
                JOptionPane.showMessageDialog(null, "El Id debe ser un caracter numerico");
                Eliminar1.setText("Id de la relación a eliminar");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Consulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta1ActionPerformed

        MateriaDTO materia = new MateriaDTO();
        GradoMateriaDTO gradoMateria = new GradoMateriaDTO();

        int i = Combobox.getSelectedIndex();

        if (i == 0) {

            if (Jopcion.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debes rellenar el campo");
            } else {
                if (materiaManager.consultarMateriaPorNombre(Jopcion.getText()) != null) {
                    modelo.setRowCount(0);
                    materia = materiaManager.consultarMateriaPorNombre(Jopcion.getText());
                    ArrayList<GradoMateriaDTO> listaGradoMateriaN = gradoMateriaManager.consultarGradoMateriaPorMateria(materia.getIdmateria());
                    for (GradoMateriaDTO gradoMateriaN : listaGradoMateriaN) {
                        String Dato[] = GradoMateria.AgregarElementosTabla(gradoMateriaN, materia.getNombreMateria());
                        modelo.addRow(Dato);
                    }
                    Jopcion.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "La materia ingresada no ha sido registrada");
                    Jopcion.setText("");
                }
            }
        } else if (i == 1) {
            if (Jopcion.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debes rellenar el campo");
            } else {
                if (this.isNumeric(Jopcion.getText())) {
                    if (gradoManager.consultarGrado(Integer.parseInt(Jopcion.getText())) != null) {
                        modelo.setRowCount(0);
                        ArrayList<GradoMateriaDTO> listaGradoMateriaG = gradoMateriaManager.consultarGradoMateriaPorGrado(Integer.parseInt(Jopcion.getText()));
                        for (GradoMateriaDTO gradoMateriaD : listaGradoMateriaG) {
                            materia = materiaManager.consultarMateria(gradoMateriaD.getIdmateria());
                            String Dato[] = GradoMateria.AgregarElementosTabla(gradoMateriaD, materia.getNombreMateria());
                            modelo.addRow(Dato);
                        }
                        Jopcion.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "El grado ingresado no ha sido registrado");
                        Jopcion.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El grado debe ser un caracter numerico");
                    Jopcion.setText("");
                }
            }
        }
    }//GEN-LAST:event_Consulta1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        InicioA c = new InicioA(profesorManager, planManager, descripcionManager, estudianteManager, gradoManager, gradoMateriaManager, grupoManager, materiaManager, notasManager, profesorMateriaManager);
        dispose();
        c.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradoMateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combobox;
    private javax.swing.JButton Consulta1;
    private javax.swing.JTextField Eliminar1;
    private javax.swing.JTextField Grado;
    private javax.swing.JTextField Jmateria;
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
