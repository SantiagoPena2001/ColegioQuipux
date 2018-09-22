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
import co.com.quipux.colegioquipux.models.dto.GrupoDTO;
import co.com.quipux.colegioquipux.models.dto.MateriaDTO;
import co.com.quipux.colegioquipux.models.dto.PlanDTO;
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
public class Grupo extends javax.swing.JFrame {

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

    public static String[] AgregarElementosTabla(GrupoDTO grupo, String nombreProfesor, String apellidoProfesor) {

        String Dato[] = new String[5];
        Dato[0] = Integer.toString(grupo.getIdGrupo());
        Dato[1] = Integer.toString(grupo.getIdGrado());
        Dato[2] = nombreProfesor + " " + apellidoProfesor;
        Dato[3] = grupo.getJornada();
        return Dato;
    }

    /**
     * Creates new form ConsultarSimpleProfesor
     */
    public Grupo(ProfesorManagerImpl profesorManagerRe, PlanManagerImpl planManagerRe, DescripcionManagerImpl descripcionManagerRe, EstudianteManagerImpl estudianteManagerRe, GradoManagerImpl gradoManagerRe, GradoMateriaManagerImpl gradoMateriaManagerRe, GrupoManagerImpl grupoManagerRe, MateriaManagerImpl materiaManagerRe, NotasManagerImpl notasManagerRe, ProfesorMateriaManagerImpl profesorMateriaManagerRe) {
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
        modelo.addColumn("Grupo");
        modelo.addColumn("Grado");
        modelo.addColumn("Profesor");
        modelo.addColumn("Jornada");
        jTable1.setModel(modelo);

        Grado.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Grado.setText("");
            }
        });
        Profe.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Profe.setText("");
            }
        });
        Jornada.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Jornada.setText("");
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
        GrupoP.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                GrupoP.setText("");
            }
        });
        ProfesorP.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ProfesorP.setText("");
            }
        });
    }

    public Grupo() {
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
        ProfesorP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Consulta1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Eliminar1 = new javax.swing.JTextField();
        Jopcion = new javax.swing.JTextField();
        Consulta2 = new javax.swing.JButton();
        Grado = new javax.swing.JTextField();
        Profe = new javax.swing.JTextField();
        Combobox = new javax.swing.JComboBox<>();
        GrupoP = new javax.swing.JTextField();
        Jornada = new javax.swing.JTextField();
        Consulta3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 650));
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
        jScrollPane1.setBounds(30, 270, 548, 253);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Registro");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 30, 90, 22);

        ProfesorP.setText("Id Profesor");
        getContentPane().add(ProfesorP);
        ProfesorP.setBounds(340, 200, 110, 30);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 190, 120, 30);

        jButton2.setText("Refrescar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 240, 140, 23);

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 40, 100, 23);

        Consulta1.setText("Cambiar Profesor");
        Consulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta1ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta1);
        Consulta1.setBounds(210, 170, 240, 23);

        jButton4.setText("Volver a Inicio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(240, 240, 140, 23);

        Eliminar1.setText("Grupo a consultar o eliminar");
        getContentPane().add(Eliminar1);
        Eliminar1.setBounds(202, 40, 240, 50);
        getContentPane().add(Jopcion);
        Jopcion.setBounds(360, 110, 260, 30);

        Consulta2.setText("Consultar");
        Consulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta2ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta2);
        Consulta2.setBounds(460, 70, 120, 23);

        Grado.setText("Grado");
        getContentPane().add(Grado);
        Grado.setBounds(40, 70, 110, 30);

        Profe.setText("Id Profesor");
        getContentPane().add(Profe);
        Profe.setBounds(40, 110, 110, 30);

        Combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por Id Profesor", "Por grado", " " }));
        getContentPane().add(Combobox);
        Combobox.setBounds(200, 110, 140, 30);

        GrupoP.setText("Grupo");
        getContentPane().add(GrupoP);
        GrupoP.setBounds(210, 200, 110, 30);

        Jornada.setText("Jornada");
        getContentPane().add(Jornada);
        Jornada.setBounds(40, 150, 110, 30);

        Consulta3.setText("Consultar");
        Consulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta3ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta3);
        Consulta3.setBounds(450, 143, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (Grado.getText().equals("Grado") || Profe.getText().equals("Id Profesor") || Jornada.getText().equals("Jornada") || Grado.getText().length() == 0 || Profe.getText().length() == 0 || Jornada.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en los campos");
        } else {
            if (this.isNumeric(Grado.getText())) {
                if (gradoManager.consultarGrado(Integer.parseInt(Grado.getText())) != null) {
                    if (this.isNumeric(Profe.getText())) {
                        if (profesorManager.consultarProfesor(Integer.parseInt(Profe.getText())) != null) {
                            if (grupoManager.consultarGrupoPorProfesor(Integer.parseInt(Profe.getText())) == null) {
                                GrupoDTO grupo = new GrupoDTO();
                                grupo.setIdGrado(Integer.parseInt(Grado.getText()));
                                grupo.setIdProfesor(Integer.parseInt(Profe.getText()));
                                grupo.setJornada(Jornada.getText());
                                grupoManager.registrarGrupo(grupo);
                                this.jButton2ActionPerformed(evt);
                                Grado.setText("Grado");
                                Profe.setText("Id Profesor");
                                Jornada.setText("Jornada");
                            } else {
                                JOptionPane.showMessageDialog(null, "El Id del profesor ya esta registrado en un grupo");
                                Profe.setText("Id Profesor");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El Id del profesor ingresado no esta registrado");
                            Profe.setText("Id Profesor");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El Id del profesor debe ser un caracter numerico");
                        Profe.setText("Id Profesor");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El grado ingresado no esta registrado");
                    Grado.setText("Grado");
                }

            } else {
                JOptionPane.showMessageDialog(null, "El grado debe ser un caracter numerico");
                Grado.setText("Grado");
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modelo.setRowCount(0);
        ArrayList<GrupoDTO> listaGrupos = grupoManager.traerListaGrupos();
        for (GrupoDTO grupo : listaGrupos) {
            ProfesorDTO profesor = new ProfesorDTO();
            profesor = profesorManager.consultarProfesor(grupo.getIdProfesor());
            String Dato[] = Grupo.AgregarElementosTabla(grupo, profesor.getNombre(), profesor.getApellidos());
            modelo.addRow(Dato);
        }

        jTable1.setModel(modelo);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (Eliminar1.getText().equals("Grupo a consultar o eliminar") || Eliminar1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en el campo");
        } else {
            if (this.isNumeric(Eliminar1.getText())) {
                if (grupoManager.consultarGrupo(Integer.parseInt(Eliminar1.getText())) != null) {
                    grupoManager.eliminarGrupo(Integer.parseInt(Eliminar1.getText()));
                    this.jButton2ActionPerformed(evt);
                    Eliminar1.setText("Grupo a consultar o eliminar");
                    JOptionPane.showMessageDialog(null, "El grupo se ha eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "El grupo ingresado no est aregistrado");
                    Eliminar1.setText("Grupo a consultar o eliminar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El grupo debe ser un caracter numerico");
                Eliminar1.setText("Grupo a consultar o eliminar");
            }
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void Consulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta1ActionPerformed

        if (GrupoP.getText().equals("Grupo") || ProfesorP.getText().equals("Id Profesor") || GrupoP.getText().length() == 0 || ProfesorP.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en los campos");
        } else {
            if (this.isNumeric(GrupoP.getText())) {
                if (grupoManager.consultarGrupo(Integer.parseInt(GrupoP.getText())) != null) {
                    if (this.isNumeric(ProfesorP.getText())) {
                        if (profesorManager.consultarProfesor(Integer.parseInt(ProfesorP.getText())) != null) {
                            if (grupoManager.consultarGrupoPorProfesor(Integer.parseInt(ProfesorP.getText())) == null) {
                                grupoManager.cambiarProfesor(Integer.parseInt(GrupoP.getText()), Integer.parseInt(ProfesorP.getText()));
                                this.jButton2ActionPerformed(evt);
                                GrupoP.setText("Grupo");
                                ProfesorP.setText("Id Profesor");
                                JOptionPane.showMessageDialog(null, "Se ha cambiado el profesor");
                            } else {
                                JOptionPane.showMessageDialog(null, "El profesor ingreasdo ya esta registrado en un grupo");
                                ProfesorP.setText("Id Profesor");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El Id del profesor ingreasdo no esta registrado");
                            ProfesorP.setText("Id Profesor");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El Id del profesor debe ser un caracter numerico");
                        ProfesorP.setText("Id Profesor");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El grupo ingresado no ha sido registrado");
                    GrupoP.setText("Grupo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El grupo debe ser un caracter numerico");
                GrupoP.setText("Grupo");
            }
        }
    }//GEN-LAST:event_Consulta1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        InicioA c = new InicioA(profesorManager, planManager, descripcionManager, estudianteManager, gradoManager, gradoMateriaManager, grupoManager, materiaManager, notasManager, profesorMateriaManager);
        dispose();
        c.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void Consulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta2ActionPerformed

        if (Eliminar1.getText().equals("Grupo a consultar o eliminar") || Eliminar1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en el campo");
        } else {
            if (this.isNumeric(Eliminar1.getText())) {
                if (grupoManager.consultarGrupo(Integer.parseInt(Eliminar1.getText())) != null) {
                    GrupoDTO grupo = new GrupoDTO();
                    ProfesorDTO profesor = new ProfesorDTO();
                    grupo = grupoManager.consultarGrupo(Integer.parseInt(Eliminar1.getText()));
                    profesor = profesorManager.consultarProfesor(grupo.getIdProfesor());
                    modelo.setRowCount(0);
                    String Dato[] = Grupo.AgregarElementosTabla(grupo, profesor.getNombre(), profesor.getApellidos());
                    modelo.addRow(Dato);
                    Eliminar1.setText("Grupo a consultar o eliminar");
                } else {
                    JOptionPane.showMessageDialog(null, "El grupo ingresado no est aregistrado");
                    Eliminar1.setText("Grupo a consultar o eliminar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El grupo debe ser un caracter numerico");
                Eliminar1.setText("Grupo a consultar o eliminar");
            }
        }


    }//GEN-LAST:event_Consulta2ActionPerformed

    private void Consulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta3ActionPerformed

        GrupoDTO grupo = new GrupoDTO();

        int i = Combobox.getSelectedIndex();
        if (i == 0) {

            if (Jopcion.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe rellenar el campo");
            } else {
                if (this.isNumeric(Jopcion.getText())) {
                    if (profesorManager.consultarProfesor(Integer.parseInt(Jopcion.getText())) != null) {
                        if (grupoManager.consultarGrupoPorProfesor(Integer.parseInt(Jopcion.getText())) != null) {
                            modelo.setRowCount(0);
                            ProfesorDTO profesor = new ProfesorDTO();
                            grupo = grupoManager.consultarGrupoPorProfesor(Integer.parseInt(Jopcion.getText()));
                            profesor = profesorManager.consultarProfesor(Integer.parseInt(Jopcion.getText()));
                            String Dato[] = Grupo.AgregarElementosTabla(grupo, profesor.getNombre(), profesor.getApellidos());
                            modelo.addRow(Dato);
                            Jopcion.setText("");
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay un grupo registrado con ese profesor");
                            Jopcion.setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El Id del profesor ingresado no ha sido registrado");
                        Jopcion.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El Id del profesor debe ser un caracter numerico");
                    Jopcion.setText("");
                }
            }
        } else if (i == 1) {

            if (Jopcion.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe rellenar el campo");
            } else {
                if (this.isNumeric(Jopcion.getText())) {
                    if (gradoManager.consultarGrado(Integer.parseInt(Jopcion.getText())) != null) {
                        modelo.setRowCount(0);
                        ArrayList<GrupoDTO> listaGrupos = grupoManager.consultarGrupoPorGrado(Integer.parseInt(Jopcion.getText()));
                        for (GrupoDTO grupoG : listaGrupos) {
                            ProfesorDTO profesor = new ProfesorDTO();
                            profesor = profesorManager.consultarProfesor(grupoG.getIdProfesor());
                            String Dato[] = Grupo.AgregarElementosTabla(grupoG, profesor.getNombre(), profesor.getApellidos());
                            modelo.addRow(Dato);
                        }
                        Jopcion.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "El grado ingresado no se encuentra registrado");
                        Jopcion.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El grado debe ser un caracter numerico");
                    Jopcion.setText("");
                }
            }
        }
    }//GEN-LAST:event_Consulta3ActionPerformed

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
            java.util.logging.Logger.getLogger(Grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton Consulta2;
    private javax.swing.JButton Consulta3;
    private javax.swing.JTextField Eliminar1;
    private javax.swing.JTextField Grado;
    private javax.swing.JTextField GrupoP;
    private javax.swing.JTextField Jopcion;
    private javax.swing.JTextField Jornada;
    private javax.swing.JTextField Profe;
    private javax.swing.JTextField ProfesorP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
