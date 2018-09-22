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
import co.com.quipux.colegioquipux.models.dto.DescripcionDTO;
import co.com.quipux.colegioquipux.models.dto.EstudianteDTO;
import co.com.quipux.colegioquipux.models.dto.MateriaDTO;
import co.com.quipux.colegioquipux.models.dto.NotasDTO;
import co.com.quipux.colegioquipux.models.dto.PlanDTO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Verde
 */
public class Notas extends javax.swing.JFrame {

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

    public static String[] AgregarElementosTabla(NotasDTO nota, String nombreMateria, String descripcionPlan, String nombreEstudiante, String apellidoEstudiante) {

        String Dato[] = new String[7];
        Dato[0] = Integer.toString(nota.getIdNota());
        Dato[1] = descripcionPlan;
        Dato[2] = nombreEstudiante + " " + apellidoEstudiante;
        Dato[3] = nombreMateria;
        Dato[4] = Integer.toString(nota.getNota());
        Dato[5] = nota.getNombreNota();
        Dato[6] = nota.getDescripcionNota();
        return Dato;
    }

    /**
     * Creates new form ConsultarSimpleProfesor
     */
    public Notas(ProfesorManagerImpl profesorManagerRe, PlanManagerImpl planManagerRe, DescripcionManagerImpl descripcionManagerRe, EstudianteManagerImpl estudianteManagerRe, GradoManagerImpl gradoManagerRe, GradoMateriaManagerImpl gradoMateriaManagerRe, GrupoManagerImpl grupoManagerRe, MateriaManagerImpl materiaManagerRe, NotasManagerImpl notasManagerRe, ProfesorMateriaManagerImpl profesorMateriaManagerRe) {
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
        modelo.addColumn("IdNota");
        modelo.addColumn("Descripcion Plan");
        modelo.addColumn("Estudiante");
        modelo.addColumn("Materia");
        modelo.addColumn("nota");
        modelo.addColumn("nombre Nota");
        modelo.addColumn("descripcion Nota");
        jTable1.setModel(modelo);

        JDescripcion.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JDescripcion.setText("");
            }
        });
        Jestudiante.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Jestudiante.setText("");
            }
        });
        Jmateria.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Jmateria.setText("");
            }
        });
        NotN.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                NotN.setText("");
            }
        });
        JnombreNota.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JnombreNota.setText("");
            }
        });
        JdescripcionNota.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JdescripcionNota.setText("");
            }
        });
        Eliminar1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Eliminar1.setText("");
            }
        });
        IdNot.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                IdNot.setText("");
            }
        });
        Not.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Not.setText("");
            }
        });

    }

    public Notas() {
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
        JdescripcionNota = new javax.swing.JTextField();
        JDescripcion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Consulta1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Eliminar1 = new javax.swing.JTextField();
        Jopcion = new javax.swing.JTextField();
        Consulta2 = new javax.swing.JButton();
        Combobox = new javax.swing.JComboBox<>();
        JnombreNota = new javax.swing.JTextField();
        NotN = new javax.swing.JTextField();
        Jmateria = new javax.swing.JTextField();
        Jestudiante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Not = new javax.swing.JTextField();
        IdNot = new javax.swing.JTextField();
        Consulta3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 650));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 320, 770, 253);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Registro");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 0, 90, 30);

        JdescripcionNota.setText("Descripcion Nota");
        JdescripcionNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JdescripcionNotaActionPerformed(evt);
            }
        });
        getContentPane().add(JdescripcionNota);
        JdescripcionNota.setBounds(40, 240, 150, 30);

        JDescripcion.setText("Id DescriopcionPlan");
        getContentPane().add(JDescripcion);
        JDescripcion.setBounds(40, 40, 150, 30);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 280, 150, 30);

        jButton2.setText("Refrescar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(390, 290, 140, 23);

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(480, 80, 120, 23);

        Consulta1.setText("Modificar Nota");
        Consulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta1ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta1);
        Consulta1.setBounds(230, 220, 130, 23);

        jButton4.setText("Volver a Inicio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(230, 290, 140, 23);

        Eliminar1.setText("Id de la nota a eliminar o a consultar");
        Eliminar1.setToolTipText("");
        getContentPane().add(Eliminar1);
        Eliminar1.setBounds(210, 90, 240, 50);
        getContentPane().add(Jopcion);
        Jopcion.setBounds(390, 170, 210, 30);

        Consulta2.setText("Consultar");
        Consulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta2ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta2);
        Consulta2.setBounds(480, 113, 120, 30);

        Combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Estudiante", "Materia", "Id DescripcionPlan", "Nombre Nota", " ", " " }));
        Combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(Combobox);
        Combobox.setBounds(240, 180, 120, 20);

        JnombreNota.setText("Nombre Nota");
        JnombreNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JnombreNotaActionPerformed(evt);
            }
        });
        getContentPane().add(JnombreNota);
        JnombreNota.setBounds(40, 200, 150, 30);

        NotN.setText("Nota");
        NotN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotNActionPerformed(evt);
            }
        });
        getContentPane().add(NotN);
        NotN.setBounds(40, 160, 150, 30);

        Jmateria.setText("Nombre Materia");
        Jmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmateriaActionPerformed(evt);
            }
        });
        getContentPane().add(Jmateria);
        Jmateria.setBounds(40, 120, 150, 30);

        Jestudiante.setText("Id Estudiante");
        Jestudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JestudianteActionPerformed(evt);
            }
        });
        getContentPane().add(Jestudiante);
        Jestudiante.setBounds(40, 80, 150, 30);

        jLabel1.setText("Consultar Por:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 160, 79, 14);

        Not.setText("Nota");
        Not.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotActionPerformed(evt);
            }
        });
        getContentPane().add(Not);
        Not.setBounds(390, 250, 150, 30);

        IdNot.setText("Id Nota");
        IdNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdNotActionPerformed(evt);
            }
        });
        getContentPane().add(IdNot);
        IdNot.setBounds(230, 250, 150, 30);

        Consulta3.setText("Consultar");
        Consulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta3ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta3);
        Consulta3.setBounds(470, 210, 130, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JdescripcionNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JdescripcionNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JdescripcionNotaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DescripcionDTO descripcion = new DescripcionDTO();
        MateriaDTO materia = new MateriaDTO();
        PlanDTO plan = new PlanDTO();
        if (JDescripcion.getText().equals("Id DescriopcionPlan") || JDescripcion.getText().length() == 0 || Jestudiante.getText().equals("Id Estudiante") || Jestudiante.getText().length() == 0 || Jmateria.getText().equals("Nombre Materia") || Jmateria.getText().length() == 0 || NotN.getText().equals("Nota") || NotN.getText().length() == 0 || JnombreNota.getText().equals("Nombre Nota") || JnombreNota.getText().length() == 0 || JdescripcionNota.getText().equals("Descripcion Nota") || JdescripcionNota.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en los campos");
        } else {
            if (this.isNumeric(JDescripcion.getText())) {
                if (this.isNumeric(Jestudiante.getText())) {
                    if (this.isNumeric(NotN.getText())) {
                        if (descripcionManager.consultarDescripcion(Integer.parseInt(JDescripcion.getText())) != null) {
                            if (materiaManager.consultarMateriaPorNombre(Jmateria.getText()) != null) {
                                if (estudianteManager.consultarEstudiante(Integer.parseInt(Jestudiante.getText())) != null) {
                                    descripcion = descripcionManager.consultarDescripcion(Integer.parseInt(JDescripcion.getText()));
                                    plan = planManager.consultarPlan(descripcion.getIdPlan());
                                    materia = materiaManager.consultarMateriaPorNombre(Jmateria.getText());
                                    if (plan.getIdMateria().equals(materia.getIdmateria())) {
                                        NotasDTO nota = new NotasDTO();
                                        materia = materiaManager.consultarMateriaPorNombre(Jmateria.getText());
                                        nota.setIdDescripcionPlan(Integer.parseInt(JDescripcion.getText()));
                                        nota.setIdEstudiante(Integer.parseInt(Jestudiante.getText()));
                                        nota.setIdMateria(materia.getIdmateria());
                                        nota.setNota(Integer.parseInt(NotN.getText()));
                                        nota.setNombreNota(JnombreNota.getText());
                                        nota.setDescripcionNota(JdescripcionNota.getText());
                                        notasManager.registrarNota(nota);
                                        this.jButton2ActionPerformed(evt);
                                        JDescripcion.setText("Id DescriopcionPlan");
                                        Jestudiante.setText("Id Estudiante");
                                        Jmateria.setText("Nombre Materia");
                                        NotN.setText("Nota");
                                        JnombreNota.setText("Nombre Nota");
                                        JdescripcionNota.setText("Descripcion Nota");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "la materia con la que esta registrada este descripcion Plan no es igual a la materia ingresada");
                                        JDescripcion.setText("Id DescriopcionPlan");
                                        Jmateria.setText("Nombre Materia");

                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El Id del estudiante no se encuentra registrado");
                                    Jestudiante.setText("Id Estudiante");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "La materia ingresada no se encuentra registrada");
                                Jmateria.setText("Nombre Materia");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El Id descripcion Plan ingresado no se encuentra registrado");
                            JDescripcion.setText("Id DescriopcionPlan");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El campo de la nota debe ser numerico");
                        NotN.setText("Nota");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El campo del ID del estudiante debe ser numerico");
                    Jestudiante.setText("Id Estudiante");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El campo de Id descripcion debe ser numerico");
                JDescripcion.setText("Id DescriopcionPlan");
                //setear descripcion

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modelo.setRowCount(0);
        ArrayList<NotasDTO> listaNotas = notasManager.traerListaNotas();
        for (NotasDTO nota : listaNotas) {
            MateriaDTO materia = new MateriaDTO();
            EstudianteDTO estudiante = new EstudianteDTO();
            DescripcionDTO descripcion = new DescripcionDTO();
            descripcion = descripcionManager.consultarDescripcion(nota.getIdDescripcionPlan());
            materia = materiaManager.consultarMateria(nota.getIdMateria());
            estudiante = estudianteManager.consultarEstudiante(nota.getIdEstudiante());
            String Dato[] = Notas.AgregarElementosTabla(nota, materia.getNombreMateria(), descripcion.getDescripcion(), estudiante.getNombre(), estudiante.getApellidos());
            modelo.addRow(Dato);
        }

        jTable1.setModel(modelo);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (Eliminar1.getText().equals("Id de la nota a eliminar o a consultar") || Eliminar1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe digitar un dato en el campo");
        } else {
            if (this.isNumeric(Eliminar1.getText())) {
                if (notasManager.consultarNota(Integer.parseInt(Eliminar1.getText())) != null) {
                    notasManager.eliminarNota(Integer.parseInt(Eliminar1.getText()));
                    this.jButton2ActionPerformed(evt);
                    JOptionPane.showMessageDialog(null, "Se ha eliminado la nota");
                } else {
                    JOptionPane.showMessageDialog(null, "El id ingresado no se encuentra registrado");
                    Eliminar1.setText("Id de la nota a eliminar o a consultar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El campo debe ser numerico");
                Eliminar1.setText("Id de la nota a eliminar o a consultar");
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void Consulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta1ActionPerformed

        if (IdNot.getText().equals("Id Nota") || Not.getText().equals("Nota") || IdNot.getText().length() == 0 || Not.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe digitar un dato en el campo");
        } else {
            if (this.isNumeric(IdNot.getText()) && this.isNumeric(Not.getText())) {
                if (notasManager.consultarNota(Integer.parseInt(IdNot.getText())) != null) {
                    notasManager.ModificarNota(Integer.parseInt(IdNot.getText()), Integer.parseInt(Not.getText()));
                    this.jButton2ActionPerformed(evt);
                    IdNot.setText("Id Nota");
                    Not.setText("Nota");
                    JOptionPane.showMessageDialog(null, "Se ha modificado la nota");
                } else {
                    JOptionPane.showMessageDialog(null, "El Id De la nota no esta registrado");
                    IdNot.setText("Id Nota");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Los datos deben ser numericos");
                IdNot.setText("Id Nota");
                Not.setText("Nota");
            }
        }

    }//GEN-LAST:event_Consulta1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        InicioA c = new InicioA(profesorManager, planManager, descripcionManager, estudianteManager, gradoManager, gradoMateriaManager, grupoManager, materiaManager, notasManager, profesorMateriaManager);
        dispose();
        c.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void Consulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta2ActionPerformed

        if (Eliminar1.getText().equals("Id de la nota a eliminar o a consultar") || Eliminar1.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe digitar un dato en el campo");
        } else {
            if (this.isNumeric(Eliminar1.getText())) {
                if (notasManager.consultarNota(Integer.parseInt(Eliminar1.getText())) != null) {
                    NotasDTO nota = new NotasDTO();
                    nota = notasManager.consultarNota(Integer.parseInt(Eliminar1.getText()));
                    modelo.setRowCount(0);
                    MateriaDTO materia = new MateriaDTO();
                    EstudianteDTO estudiante = new EstudianteDTO();
                    System.out.println(nota);
                    materia = materiaManager.consultarMateria(nota.getIdMateria());
                    estudiante = estudianteManager.consultarEstudiante(nota.getIdEstudiante());
                    String Dato[] = Notas.AgregarElementosTabla(nota, materia.getNombreMateria(), nota.getDescripcionNota(), estudiante.getNombre(), estudiante.getApellidos());
                    modelo.addRow(Dato);
                    Eliminar1.setText("Id de la nota a eliminar o a consultar");
                } else {
                    JOptionPane.showMessageDialog(null, "El id ingresado no se encuentra registrado");
                    Eliminar1.setText("Id de la nota a eliminar o a consultar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El campo debe ser numerico");
                Eliminar1.setText("Id de la nota a eliminar o a consultar");
            }
        }
    }//GEN-LAST:event_Consulta2ActionPerformed

    private void JnombreNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JnombreNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JnombreNotaActionPerformed

    private void NotNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotNActionPerformed

    private void JmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmateriaActionPerformed

    private void JestudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JestudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JestudianteActionPerformed

    private void ComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboboxActionPerformed

    private void NotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotActionPerformed

    private void IdNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdNotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdNotActionPerformed

    private void Consulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta3ActionPerformed

        NotasDTO notas = new NotasDTO();
        int i = Combobox.getSelectedIndex();

        if (i == 0) {
            modelo.setRowCount(0);
            if (Jopcion.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe digitar un dato en el campo");
            } else {
                if (this.isNumeric(Jopcion.getText())) {
                    if (estudianteManager.consultarEstudiante(Integer.parseInt(Jopcion.getText())) != null) {
                        ArrayList<NotasDTO> listaNotasE = notasManager.consultarNotasPorEstudiante(Integer.parseInt(Jopcion.getText()));
                        for (NotasDTO notasE : listaNotasE) {
                            MateriaDTO materia = new MateriaDTO();
                            EstudianteDTO estudiante = new EstudianteDTO();
                            DescripcionDTO descripcion = new DescripcionDTO();
                            descripcion = descripcionManager.consultarDescripcion(notasE.getIdDescripcionPlan());
                            materia = materiaManager.consultarMateria(notasE.getIdMateria());
                            estudiante = estudianteManager.consultarEstudiante(notasE.getIdEstudiante());
                            String Dato[] = Notas.AgregarElementosTabla(notasE, materia.getNombreMateria(), descripcion.getDescripcion(), estudiante.getNombre(), estudiante.getApellidos());
                            modelo.addRow(Dato);
                        }
                        Jopcion.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "El Id del estudiante no se encuentra registrado");
                        Jopcion.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El Id del estudiante debe ser numerico");
                    Jopcion.setText("");
                }
            }

        } else if (i == 1) {
            modelo.setRowCount(0);
            if (Jopcion.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe digitar un dato en el campo");
            } else {
                if (materiaManager.consultarMateriaPorNombre(Jopcion.getText()) != null) {
                    MateriaDTO materia = new MateriaDTO();
                    materia = materiaManager.consultarMateriaPorNombre(Jopcion.getText());
                    ArrayList<NotasDTO> listaNotasN = notasManager.consultarNotasPorMateria(materia.getIdmateria());
                    for (NotasDTO notasN : listaNotasN) {
                        EstudianteDTO estudiante = new EstudianteDTO();
                        DescripcionDTO descripcion = new DescripcionDTO();
                        descripcion = descripcionManager.consultarDescripcion(notasN.getIdDescripcionPlan());
                        materia = materiaManager.consultarMateria(notasN.getIdMateria());
                        estudiante = estudianteManager.consultarEstudiante(notasN.getIdEstudiante());
                        String Dato[] = Notas.AgregarElementosTabla(notasN, materia.getNombreMateria(), descripcion.getDescripcion(), estudiante.getNombre(), estudiante.getApellidos());
                        modelo.addRow(Dato);
                    }
                    Jopcion.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "La materia ingresada no existe");
                    Jopcion.setText("");
                }
            }
        } else if (i == 2) {
            modelo.setRowCount(0);
            if (Jopcion.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe digitar un dato en el campo");
            } else {
                if (descripcionManager.consultarDescripcion(Integer.parseInt(Jopcion.getText())) != null) {
                    ArrayList<NotasDTO> listaNotasD = notasManager.consultarNotasporDescripcionPlan(Integer.parseInt(Jopcion.getText()));
                    for (NotasDTO notasD : listaNotasD) {
                        MateriaDTO materia = new MateriaDTO();
                        EstudianteDTO estudiante = new EstudianteDTO();
                        DescripcionDTO descripcion = new DescripcionDTO();
                        descripcion = descripcionManager.consultarDescripcion(notasD.getIdDescripcionPlan());
                        materia = materiaManager.consultarMateria(notasD.getIdMateria());
                        estudiante = estudianteManager.consultarEstudiante(notasD.getIdEstudiante());
                        String Dato[] = Notas.AgregarElementosTabla(notasD, materia.getNombreMateria(), descripcion.getDescripcion(), estudiante.getNombre(), estudiante.getApellidos());
                        modelo.addRow(Dato);
                    }
                    Jopcion.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "El Id de la descripcion ingresado no esta registrado");
                    Jopcion.setText("");
                }
            }
        } else if (i == 3) {
            modelo.setRowCount(0);
            if (Jopcion.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debe digitar un dato en el campo");
            } else {
                ArrayList<NotasDTO> listaNotasD = notasManager.consultarNotasPorNombre(Jopcion.getText());
                for (NotasDTO notasD : listaNotasD) {
                    MateriaDTO materia = new MateriaDTO();
                    EstudianteDTO estudiante = new EstudianteDTO();
                    DescripcionDTO descripcion = new DescripcionDTO();
                    descripcion = descripcionManager.consultarDescripcion(notasD.getIdDescripcionPlan());
                    materia = materiaManager.consultarMateria(notasD.getIdMateria());
                    estudiante = estudianteManager.consultarEstudiante(notasD.getIdEstudiante());
                    String Dato[] = Notas.AgregarElementosTabla(notasD, materia.getNombreMateria(), descripcion.getDescripcion(), estudiante.getNombre(), estudiante.getApellidos());
                    modelo.addRow(Dato);
                }
                Jopcion.setText("");
            }
        }

    }//GEN-LAST:event_Consulta3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combobox;
    private javax.swing.JButton Consulta1;
    private javax.swing.JButton Consulta2;
    private javax.swing.JButton Consulta3;
    private javax.swing.JTextField Eliminar1;
    private javax.swing.JTextField IdNot;
    private javax.swing.JTextField JDescripcion;
    private javax.swing.JTextField JdescripcionNota;
    private javax.swing.JTextField Jestudiante;
    private javax.swing.JTextField Jmateria;
    private javax.swing.JTextField JnombreNota;
    private javax.swing.JTextField Jopcion;
    private javax.swing.JTextField Not;
    private javax.swing.JTextField NotN;
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
