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
import co.com.quipux.colegioquipux.models.dto.ProfesorDTO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Verde
 */
public class Profesor extends javax.swing.JFrame {

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

    public static String[] AgregarElementosTabla(ProfesorDTO profesor) {
        String Dato[] = new String[6];
        Dato[0] = Integer.toString(profesor.getIdProfesor());
        Dato[1] = profesor.getNombre();
        Dato[2] = profesor.getApellidos();
        Dato[3] = profesor.getCorreo();
        Dato[4] = profesor.getDocumento();
        Dato[5] = Integer.toString(profesor.getIdDocumento());
        return Dato;
    }

    public Profesor() {
        initComponents();
    }

    /**
     * Creates new form ConsultarSimpleProfesor
     */
    public Profesor(ProfesorManagerImpl profesorManagerRe, PlanManagerImpl planManagerRe, DescripcionManagerImpl descripcionManagerRe, EstudianteManagerImpl estudianteManagerRe, GradoManagerImpl gradoManagerRe, GradoMateriaManagerImpl gradoMateriaManagerRe, GrupoManagerImpl grupoManagerRe, MateriaManagerImpl materiaManagerRe, NotasManagerImpl notasManagerRe, ProfesorMateriaManagerImpl profesorMateriaManagerRe) {
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
        modelo.addColumn("IdProfesor");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Corrreo");
        modelo.addColumn("Documento");
        modelo.addColumn("NumeroDocumento");
        jTable1.setModel(modelo);
        JtextNombre.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JtextNombre.setText("");
            }
        });
        JtextApellidos.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JtextApellidos.setText("");
            }
        });
        JtextDocumento.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JtextDocumento.setText("");
            }
        });
        JtextCorreo.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JtextCorreo.setText("");
            }
        });
        JtextNumeroDoc.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JtextNumeroDoc.setText("");
            }
        });
        Eliminar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Eliminar.setText("");
            }
        });
        Documento.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Documento.setText("");
            }
        });
        Num.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Num.setText("");
            }
        });
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
        JtextNombre = new javax.swing.JTextField();
        JtextDocumento = new javax.swing.JTextField();
        JtextCorreo = new javax.swing.JTextField();
        JtextNumeroDoc = new javax.swing.JTextField();
        JtextApellidos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Eliminar = new javax.swing.JTextField();
        Combobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Consultas1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Documento = new javax.swing.JTextField();
        Num = new javax.swing.JTextField();
        Consulta1 = new javax.swing.JButton();
        Consulta2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(540, 515));
        setMinimumSize(new java.awt.Dimension(540, 515));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 280, 530, 253);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Registro");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 0, 90, 22);

        JtextNombre.setText("Nombre");
        JtextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextNombreActionPerformed(evt);
            }
        });
        getContentPane().add(JtextNombre);
        JtextNombre.setBounds(50, 30, 90, 40);

        JtextDocumento.setText("Tipo Documento");
        getContentPane().add(JtextDocumento);
        JtextDocumento.setBounds(50, 120, 157, 30);

        JtextCorreo.setText("Correo");
        getContentPane().add(JtextCorreo);
        JtextCorreo.setBounds(50, 160, 100, 30);

        JtextNumeroDoc.setText("NumeroDocumento");
        getContentPane().add(JtextNumeroDoc);
        JtextNumeroDoc.setBounds(50, 200, 140, 30);

        JtextApellidos.setText("Apellidos");
        getContentPane().add(JtextApellidos);
        JtextApellidos.setBounds(50, 80, 90, 30);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 240, 130, 30);

        jButton2.setText("Refrescar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 250, 160, 30);

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(146, 13, 90, 30);

        Eliminar.setText("ID del profesor a eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar);
        Eliminar.setBounds(242, 14, 288, 30);

        Combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Profesor", "Nombre", " " }));
        Combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(Combobox);
        Combobox.setBounds(170, 70, 100, 30);

        jLabel1.setText("Consultar Por:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 50, 380, 20);
        getContentPane().add(Consultas1);
        Consultas1.setBounds(280, 70, 278, 30);

        jLabel3.setText("Consultar Por Documento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 120, 256, 14);

        Documento.setText("Documento");
        getContentPane().add(Documento);
        Documento.setBounds(240, 140, 166, 30);

        Num.setText("Numero Documento");
        getContentPane().add(Num);
        Num.setBounds(410, 140, 194, 30);

        Consulta1.setText("Consultar");
        Consulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta1ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta1);
        Consulta1.setBounds(429, 100, 130, 30);

        Consulta2.setText("Consultar");
        Consulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta2ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta2);
        Consulta2.setBounds(480, 170, 130, 40);

        jButton4.setText("Volver a Inicio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(210, 250, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextNombreActionPerformed
    }//GEN-LAST:event_JtextNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (JtextNombre.getText().equals("Nombre") || JtextApellidos.getText().equals("Apellidos") || JtextDocumento.getText().equals("Tipo Documento") || JtextCorreo.getText().equals("Correo") || JtextNumeroDoc.getText().equals("NumeroDocumento")) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en los campos");
        } else {
            if (JtextNombre.getText().length() == 0 || JtextApellidos.getText().length() == 0 || JtextDocumento.getText().length() == 0 || JtextCorreo.getText().length() == 0 || JtextNumeroDoc.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");
            } else {
                if (this.isNumeric(JtextNumeroDoc.getText())) {
                    ProfesorDTO profesor = new ProfesorDTO();
                    profesor.setNombre(JtextNombre.getText());
                    profesor.setApellidos(JtextApellidos.getText());
                    profesor.setDocumento(JtextDocumento.getText());
                    profesor.setCorreo(JtextCorreo.getText());
                    profesor.setIdDocumento(Integer.parseInt(JtextNumeroDoc.getText()));
                    profesorManager.registrarProfesor(profesor);
                    this.jButton2ActionPerformed(evt);
                    JtextNombre.setText("Nombre");
                    JtextApellidos.setText("Apellidos");
                    JtextDocumento.setText("Tipo Documento");
                    JtextCorreo.setText("Correo");
                    JtextNumeroDoc.setText("NumeroDocumento");
                } else {
                    JOptionPane.showMessageDialog(null, "El numero de documento, debe ser un caracter numerico");
                    JtextNumeroDoc.setText("NumeroDocumento");
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modelo.setRowCount(0);
        ArrayList<ProfesorDTO> listaprofesor = profesorManager.traerLista();
        for (ProfesorDTO profesor : listaprofesor) {
            String Dato[] = Profesor.AgregarElementosTabla(profesor);
            modelo.addRow(Dato);
        }

        jTable1.setModel(modelo);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (Eliminar.getText().equals("ID del profesor a eliminar") || Eliminar.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en los campo");
        } else {
            if (this.isNumeric(Eliminar.getText())) {
                if (profesorManager.consultarProfesor(Integer.parseInt(Eliminar.getText())) != null) {
                    profesorManager.consultarProfesor(Integer.parseInt(Eliminar.getText()));
                    profesorManager.eliminarProfesor(Integer.parseInt(Eliminar.getText()));
                    JOptionPane.showMessageDialog(null, "El profesor se ha eliminado");
                    this.jButton2ActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(null, "Ese Id no esta registrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Id debe ser numerico");
            }
        }
        Eliminar.setText("ID del profesor a eliminar");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void Consulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta1ActionPerformed

        ProfesorDTO profesor = new ProfesorDTO();
        int i = Combobox.getSelectedIndex();

        if (i == 0) {
            if (Consultas1.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debes ingresar algo en el campo");
            } else {
                if (this.isNumeric(Consultas1.getText())) {
                    if (profesorManager.consultarProfesor(Integer.parseInt(Consultas1.getText())) != null) {
                        profesor = profesorManager.consultarProfesor(Integer.parseInt(Consultas1.getText()));
                        modelo.setRowCount(0);
                        String Dato[] = Profesor.AgregarElementosTabla(profesor);
                        modelo.addRow(Dato);
                        Consultas1.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ese Id no esta registrado");
                        Consultas1.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El Id debe ser numerico");
                    Consultas1.setText("");
                }
            }

        } else if (i == 1) {
            if (Consultas1.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debes ingresar algo en el campo");
            } else {
                modelo.setRowCount(0);
                ArrayList<ProfesorDTO> listaprofesor = profesorManager.consultarProfesorPorNombre(Consultas1.getText());
                for (ProfesorDTO profesorN : listaprofesor) {
                    String Dato[] = Profesor.AgregarElementosTabla(profesorN);
                    modelo.addRow(Dato);
                    Consultas1.setText("");
                }
            }
        }

    }//GEN-LAST:event_Consulta1ActionPerformed

    private void Consulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta2ActionPerformed
        if (Documento.getText().equals("Documento") || Documento.getText().length() == 0 || Num.getText().equals("Numero Documento") || Num.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en los campo");
        } else {
            if (this.isNumeric(Num.getText())) {
                if (profesorManager.consultarProfesorPorDocumento(Integer.parseInt(Num.getText()), Documento.getText()) != null) {
                    ProfesorDTO profesor = new ProfesorDTO();
                    profesor = profesorManager.consultarProfesorPorDocumento(Integer.parseInt(Num.getText()), Documento.getText());
                    modelo.setRowCount(0);
                    String Dato[] = Profesor.AgregarElementosTabla(profesor);
                    modelo.addRow(Dato);
                    Documento.setText("Documento");
                    Num.setText("Numero Documento");
                    Consultas1.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "No hay profesor registrado con ese documento");
                    Documento.setText("Documento");
                    Num.setText("Numero Documento");
                    Consultas1.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El numero de documento debe ser un caracter numerico");
                Num.setText("Numero Documento");
                Consultas1.setText("");
            }
        }
    }//GEN-LAST:event_Consulta2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        InicioA c = new InicioA(profesorManager, planManager, descripcionManager, estudianteManager, gradoManager, gradoMateriaManager, grupoManager, materiaManager, notasManager, profesorMateriaManager);
        dispose();
        c.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void ComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboboxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profesor().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combobox;
    private javax.swing.JButton Consulta1;
    private javax.swing.JButton Consulta2;
    private javax.swing.JTextField Consultas1;
    private javax.swing.JTextField Documento;
    private javax.swing.JTextField Eliminar;
    private javax.swing.JTextField JtextApellidos;
    private javax.swing.JTextField JtextCorreo;
    private javax.swing.JTextField JtextDocumento;
    private javax.swing.JTextField JtextNombre;
    private javax.swing.JTextField JtextNumeroDoc;
    private javax.swing.JTextField Num;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
