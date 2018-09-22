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
import co.com.quipux.colegioquipux.models.dto.EstudianteDTO;
import co.com.quipux.colegioquipux.models.dto.GradoDTO;
import co.com.quipux.colegioquipux.models.dto.GrupoDTO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Verde
 */
public class Estudiante extends javax.swing.JFrame {

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

    public static String[] AgregarElementosTabla(EstudianteDTO estudiante, String estado) {
        String Dato[] = new String[17];
        Dato[0] = Integer.toString(estudiante.getIdEstudiante());
        Dato[1] = estudiante.getTipoDocumento();
        Dato[2] = Integer.toString(estudiante.getNumeroDocumento());
        Dato[3] = estudiante.getNombre();
        Dato[4] = estudiante.getApellidos();
        Dato[5] = estudiante.getSexo();
        Dato[6] = estudiante.getFechaNacimiento();
        Dato[7] = estudiante.getDireccionResidencia();
        Dato[8] = estudiante.getCiudadResidencia();
        Dato[9] = Integer.toString(estudiante.getTelefonoResidencia());
        Dato[10] = Integer.toString(estudiante.getTelefonoCelular());
        Dato[11] = estudiante.getCorreo();
        Dato[12] = Integer.toString(estudiante.getAño());
        Dato[13] = Integer.toString(estudiante.getIdGrado());
        Dato[14] = Integer.toString(estudiante.getIdGrupo());
        Dato[15] = estado;
        Dato[16] = Float.toString(estudiante.getNotaPromedio());
        return Dato;
    }

    public Estudiante() {
        initComponents();
    }

    /**
     * Creates new form ConsultarSimpleProfesor
     */
    public Estudiante(ProfesorManagerImpl profesorManagerRe, PlanManagerImpl planManagerRe, DescripcionManagerImpl descripcionManagerRe, EstudianteManagerImpl estudianteManagerRe, GradoManagerImpl gradoManagerRe, GradoMateriaManagerImpl gradoMateriaManagerRe, GrupoManagerImpl grupoManagerRe, MateriaManagerImpl materiaManagerRe, NotasManagerImpl notasManagerRe, ProfesorMateriaManagerImpl profesorMateriaManagerRe) {
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
        modelo.addColumn("IdEstudiante");
        modelo.addColumn("Documento");
        modelo.addColumn("Numero Documento");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Sexo");
        modelo.addColumn("Fecha De Nacimiento");
        modelo.addColumn("Direccion De Residencia");
        modelo.addColumn("Ciudad De Residencia");
        modelo.addColumn("Telefono");
        modelo.addColumn("Celular Acudiente");
        modelo.addColumn("Correo");
        modelo.addColumn("Año");
        modelo.addColumn("Grado");
        modelo.addColumn("Grupo");
        modelo.addColumn("Estado");
        modelo.addColumn("Nota Promedio");
        jTable1.setModel(modelo);

        Documento.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Documento.setText("");
            }
        });
        NumDoc.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                NumDoc.setText("");
            }
        });
        Nombre.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Nombre.setText("");
            }
        });
        Apellido.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Apellido.setText("");
            }
        });
        Sexo.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Sexo.setText("");
            }
        });
        FechaNacimiento.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                FechaNacimiento.setText("");
            }
        });
        Direccion.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Direccion.setText("");
            }
        });
        Ciudad.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Ciudad.setText("");
            }
        });
        Telefono.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Telefono.setText("");
            }
        });
        Celular.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Celular.setText("");
            }
        });
        Correo.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Correo.setText("");
            }
        });
        Grado.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Grado.setText("");
            }
        });
        Grupo.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Grupo.setText("");
            }
        });
        Año.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Año.setText("");
            }
        });
        Promedio.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Promedio.setText("");
            }
        });
        Modi.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Modi.setText("");
            }
        });
        PromoRetiro1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                PromoRetiro1.setText("");
            }
        });
        Consulta.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Consulta.setText("");
            }
        });
        ConsultaDoc.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ConsultaDoc.setText("");
            }
        });
        ConsultaNum.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                ConsultaNum.setText("");
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
        Documento = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Sexo = new javax.swing.JTextField();
        Ciudad = new javax.swing.JTextField();
        NumDoc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Modi = new javax.swing.JTextField();
        Combobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Consulta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ConsultaDoc = new javax.swing.JTextField();
        ConsultaNum = new javax.swing.JTextField();
        Consulta1 = new javax.swing.JButton();
        Consulta2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Telefono = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        FechaNacimiento = new javax.swing.JTextField();
        Grado = new javax.swing.JTextField();
        Grupo = new javax.swing.JTextField();
        Promedio = new javax.swing.JTextField();
        Celular = new javax.swing.JTextField();
        Año = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        PromoRetiro1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(540, 515));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15", "Title 16", "Title 17"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 330, 1020, 253);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Registro");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 30, 90, 22);

        Documento.setText("Documento");
        Documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(Documento);
        Documento.setBounds(20, 60, 90, 30);

        Apellido.setText("Apellidos");
        getContentPane().add(Apellido);
        Apellido.setBounds(430, 60, 160, 30);

        Sexo.setText("Sexo");
        Sexo.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(Sexo);
        Sexo.setBounds(20, 100, 90, 30);

        Ciudad.setText("Ciudad De Residencia");
        getContentPane().add(Ciudad);
        Ciudad.setBounds(460, 100, 140, 30);

        NumDoc.setText("Numero De Documento");
        getContentPane().add(NumDoc);
        NumDoc.setBounds(120, 60, 150, 30);

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 220, 110, 23);

        jButton2.setText("Refrescar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(889, 230, 130, 40);

        jButton3.setText("Promocion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(400, 290, 160, 23);

        Modi.setText("ID Del Estudiante A Modificar");
        Modi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModiActionPerformed(evt);
            }
        });
        getContentPane().add(Modi);
        Modi.setBounds(260, 220, 220, 30);

        Combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por Nombre", "Por Grupo", "Por Grado", " " }));
        Combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboboxActionPerformed(evt);
            }
        });
        getContentPane().add(Combobox);
        Combobox.setBounds(599, 60, 110, 20);

        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 40, 79, 14);
        getContentPane().add(Consulta);
        Consulta.setBounds(720, 60, 160, 30);

        jLabel3.setText("Consultar Por Documento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(740, 100, 140, 14);

        ConsultaDoc.setText("Documento");
        getContentPane().add(ConsultaDoc);
        ConsultaDoc.setBounds(620, 120, 180, 40);

        ConsultaNum.setText("Numero Documento");
        getContentPane().add(ConsultaNum);
        ConsultaNum.setBounds(810, 120, 194, 40);

        Consulta1.setText("Consultar");
        Consulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta1ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta1);
        Consulta1.setBounds(890, 60, 130, 23);

        Consulta2.setText("Consultar");
        Consulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta2ActionPerformed(evt);
            }
        });
        getContentPane().add(Consulta2);
        Consulta2.setBounds(869, 170, 140, 30);

        jButton4.setText("Volver a Inicio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(709, 230, 170, 40);

        Telefono.setText("Telefono De Residencia");
        getContentPane().add(Telefono);
        Telefono.setBounds(20, 140, 150, 30);

        Correo.setText("Correo Estudiante");
        getContentPane().add(Correo);
        Correo.setBounds(410, 140, 180, 30);

        FechaNacimiento.setText("Fecha De Nacimiento");
        getContentPane().add(FechaNacimiento);
        FechaNacimiento.setBounds(120, 100, 150, 30);

        Grado.setText("Grado");
        getContentPane().add(Grado);
        Grado.setBounds(20, 180, 150, 30);

        Grupo.setText("Grupo");
        getContentPane().add(Grupo);
        Grupo.setBounds(180, 180, 100, 30);

        Promedio.setText("Nota Promedio");
        Promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromedioActionPerformed(evt);
            }
        });
        getContentPane().add(Promedio);
        Promedio.setBounds(440, 180, 140, 30);

        Celular.setText("Telefono Celular Acudiente");
        Celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelularActionPerformed(evt);
            }
        });
        getContentPane().add(Celular);
        Celular.setBounds(180, 140, 220, 30);

        Año.setText("Año De Ingreso");
        getContentPane().add(Año);
        Año.setBounds(290, 180, 140, 30);

        Direccion.setText("Direccion De Residencia");
        getContentPane().add(Direccion);
        Direccion.setBounds(280, 100, 170, 30);

        Nombre.setText("Nombre");
        getContentPane().add(Nombre);
        Nombre.setBounds(280, 60, 140, 30);

        jButton5.setText("Registrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(20, 220, 100, 23);

        jButton7.setText("Retiro/Egreso");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(400, 260, 160, 23);

        PromoRetiro1.setText("ID Del Estudiante");
        PromoRetiro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PromoRetiro1ActionPerformed(evt);
            }
        });
        getContentPane().add(PromoRetiro1);
        PromoRetiro1.setBounds(20, 270, 359, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        GrupoDTO grupo = new GrupoDTO();
        GradoDTO grado = new GradoDTO();
        if (Documento.getText().equals("Documento") || Documento.getText().length() == 0 || NumDoc.getText().equals("Numero De Documento") || NumDoc.getText().length() == 0 || Nombre.getText().equals("Nombre") || Nombre.getText().length() == 0 || Apellido.getText().equals("Apellidos") || Apellido.getText().length() == 0 || Sexo.getText().equals("Sexo") || Sexo.getText().length() == 0 || FechaNacimiento.getText().equals("Fecha De Nacimiento") || FechaNacimiento.getText().length() == 0 || Direccion.getText().equals("Direccion De Residencia") || Direccion.getText().length() == 0 || Ciudad.getText().equals("Ciudad De Residencia") || Ciudad.getText().length() == 0 || Telefono.getText().equals("Telefono De Residencia") || Telefono.getText().length() == 0 || Celular.getText().equals("Telefono Celular Acudiente") || Celular.getText().length() == 0 || Correo.getText().equals("Correo Estudiante") || Correo.getText().length() == 0 || Grado.getText().equals("Grado") || Grado.getText().length() == 0 || Grupo.getText().equals("Grupo") || Grupo.getText().length() == 0 || Año.getText().equals("Año De Ingreso") || Año.getText().length() == 0 || Promedio.getText().equals("Nota Promedio") || Promedio.getText().length() == 0 || Modi.getText().equals("ID Del Estudiante A Modificar") || Modi.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en los campos");
        } else {
            if (this.isNumeric(NumDoc.getText())) {
                if (this.isNumeric(Telefono.getText())) {
                    if (this.isNumeric(Celular.getText())) {
                        if (this.isNumeric(Grado.getText())) {
                            if (this.isNumeric(Grupo.getText())) {
                                if (gradoManager.consultarGrado(Integer.parseInt(Grado.getText())) != null) {
                                    if (grupoManager.consultarGrupo(Integer.parseInt(Grupo.getText())) != null) {
                                        grupo = grupoManager.consultarGrupo(Integer.parseInt(Grupo.getText()));
                                        if (Integer.parseInt(Grado.getText()) == grupo.getIdGrado()) {
                                            if (this.isNumeric(Año.getText())) {
                                                if (this.isNumeric(Promedio.getText())) {
                                                    if (this.isNumeric(Modi.getText())) {
                                                        if (estudianteManager.consultarEstudiante(Integer.parseInt(Modi.getText())) != null) {
                                                            Documento.setText("Documento");
                                                            NumDoc.setText("Numero De Documento");
                                                            Nombre.setText("Nombre");
                                                            Apellido.setText("Apellidos");
                                                            Sexo.setText("Sexo");
                                                            FechaNacimiento.setText("Fecha De Nacimiento");
                                                            Direccion.setText("Direccion De Residencia");
                                                            Ciudad.setText("Ciudad De Residencia");
                                                            Telefono.setText("Telefono De Residencia");
                                                            Celular.setText("Telefono Celular Acudiente");
                                                            Correo.setText("Correo Estudiante");
                                                            Grado.setText("Grado");
                                                            Grupo.setText("Grupo");
                                                            Año.setText("Año De Ingreso");
                                                            Promedio.setText("Nota Promedio");
                                                            Modi.setText("ID Del Estudiante A Modificar");
                                                            EstudianteDTO estudiante = new EstudianteDTO();
                                                            estudiante.setApellidos(Apellido.getText());
                                                            estudiante.setAño(Integer.parseInt(Año.getText()));
                                                            estudiante.setCiudadResidencia(Ciudad.getText());
                                                            estudiante.setCorreo(Correo.getText());
                                                            estudiante.setDireccionResidencia(Direccion.getText());
                                                            estudiante.setEstado(1);
                                                            estudiante.setFechaNacimiento(FechaNacimiento.getText());
                                                            estudiante.setIdGrado(Integer.parseInt(Grado.getText()));
                                                            estudiante.setIdGrupo(Integer.parseInt(Grupo.getText()));
                                                            estudiante.setNombre(Nombre.getText());
                                                            estudiante.setNotaPromedio(Float.parseFloat(Promedio.getText()));
                                                            estudiante.setNumeroDocumento(Integer.parseInt(NumDoc.getText()));
                                                            estudiante.setSexo(Sexo.getText());
                                                            estudiante.setTelefonoCelular(Integer.parseInt(Celular.getText()));
                                                            estudiante.setTelefonoResidencia(Integer.parseInt(Telefono.getText()));
                                                            estudiante.setTipoDocumento(Documento.getText());
                                                            estudianteManager.modificarDatosEstudiante(estudiante, Integer.parseInt(Modi.getText()));
                                                            JOptionPane.showMessageDialog(null, "Se han modificado los datos del estudiante");
                                                            this.jButton2ActionPerformed(evt);
                                                        } else {
                                                            JOptionPane.showMessageDialog(null, "El Id del estudiante a modificar ingresado no esta registrado");
                                                            Modi.setText("ID Del Estudiante A Modificar");
                                                        }
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "El Id del estudiante a modificar debe ser un caracter numerico");
                                                        Modi.setText("ID Del Estudiante A Modificar");

                                                    }

                                                } else {
                                                    JOptionPane.showMessageDialog(null, "La nota promedio debe ser un caracter numerico");
                                                    Promedio.setText("Nota Promedio");
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Año debe ser un caracter numerico");
                                                Año.setText("Año De Ingreso");

                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "El grupo ingresado no esta registrado para el grado ingresado");
                                            Grupo.setText("Grupo");
                                            Grado.setText("Grado");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "El grupo ingresado no esta registrado");
                                        Grupo.setText("Grupo");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El grado ingresado no esta registrado");
                                    Grado.setText("Grado");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "El grupo debe ser un caracter numerico");
                                Grupo.setText("Grupo");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El grado debe ser un caracter numerico");
                            Grado.setText("Grado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El telefono del acudiente debe ser un caracter numerico");
                        Celular.setText("Telefono Celular Acudiente");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El telefono de residencia debe ser un caracter numerico");
                    Telefono.setText("Telefono De Residencia");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El numero de documento debe ser un caracter Numerico");
                NumDoc.setText("Numero De Documento");
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modelo.setRowCount(0);
        ArrayList<EstudianteDTO> listaEstudiantes = estudianteManager.traerListaEstudiantes();
        for (EstudianteDTO estudiante : listaEstudiantes) {
            String estado = "";
            if (estudiante.getEstado() == 1) {
                estado = "estudiando";
            } else if (estudiante.getEstado() == 2) {
                estado = "egresado/retirado";
            }
            String Dato[] = Estudiante.AgregarElementosTabla(estudiante, estado);
            System.out.println(estudiante.getIdEstudiante());
            modelo.addRow(Dato);
        }

        jTable1.setModel(modelo);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (PromoRetiro1.getText().equals("ID Del Estudiante") || Modi.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en el campo");
        } else {
            if (this.isNumeric(PromoRetiro1.getText())) {
                if (estudianteManager.consultarEstudiante(Integer.parseInt(PromoRetiro1.getText())) != null) {
                    estudianteManager.promocionEstudiantes(Integer.parseInt(PromoRetiro1.getText()));
                    this.jButton2ActionPerformed(evt);
                    JOptionPane.showMessageDialog(null, "El estudiante ha sido promovido");

                } else {
                    JOptionPane.showMessageDialog(null, "El Id del estudiante no ha sido registrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Id del estudiante debe ser un caracter numerico");
                PromoRetiro1.setText("ID Del Estudiante");
            }

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void ModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModiActionPerformed

    private void Consulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta1ActionPerformed

        GrupoDTO grupo = new GrupoDTO();
        GradoDTO grado = new GradoDTO();
        int i = Combobox.getSelectedIndex();
        if (i == 0) {
            if (Consulta.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debes ingresar algo en el campo");
            } else {
                modelo.setRowCount(0);
                ArrayList<EstudianteDTO> listaEstudiantes = estudianteManager.consultarEstudiantePorNombre(Consulta.getText());
                for (EstudianteDTO estudianteN : listaEstudiantes) {
                    String estado = "";
                    if (estudianteN.getEstado() == 1) {
                        estado = "estudiando";
                    } else if (estudianteN.getEstado() == 2) {
                        estado = "egresado/retirado";
                    }
                    String Dato[] = Estudiante.AgregarElementosTabla(estudianteN, estado);
                    modelo.addRow(Dato);
                }
                Consulta.setText("");
            }
        } else if (i == 1) {
            if (Consulta.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debes ingresar algo en el campo");
            } else {
                if (grupoManager.consultarGrupo(Integer.parseInt(Consulta.getText())) != null) {
                    modelo.setRowCount(0);
                    ArrayList<EstudianteDTO> listaEstudiantes = estudianteManager.consultarEstudiantePorGrupo(Integer.parseInt(Consulta.getText()));
                    for (EstudianteDTO estudianteG : listaEstudiantes) {
                        String estado = "";
                        if (estudianteG.getEstado() == 1) {
                            estado = "estudiando";
                        } else if (estudianteG.getEstado() == 2) {
                            estado = "egresado/retirado";
                        }
                        String Dato[] = Estudiante.AgregarElementosTabla(estudianteG, estado);
                        modelo.addRow(Dato);
                    }
                    Consulta.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "El grupo Ingresado en  el campo no esta registrado");
                    Consulta.setText("");
                }
            }
        } else if (i == 2) {

            if (Consulta.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debes ingresar algo en el campo");
            } else {
                if (gradoManager.consultarGrado(Integer.parseInt(Consulta.getText())) != null) {
                    modelo.setRowCount(0);
                    ArrayList<EstudianteDTO> listaEstudiantes = estudianteManager.consultarEstudiantePorGrado(Integer.parseInt(Consulta.getText()));
                    for (EstudianteDTO estudianteG : listaEstudiantes) {
                        String estado = "";
                        if (estudianteG.getEstado() == 1) {
                            estado = "estudiando";
                        } else if (estudianteG.getEstado() == 2) {
                            estado = "egresado/retirado";
                        }
                        String Dato[] = Estudiante.AgregarElementosTabla(estudianteG, estado);
                        modelo.addRow(Dato);
                    }
                    Consulta.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "El grado Ingresado en  el campo no esta registrado");
                    Consulta.setText("");
                }

            }
        }

    }//GEN-LAST:event_Consulta1ActionPerformed

    private void Consulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta2ActionPerformed

        if (ConsultaDoc.getText().equals("Documento") || ConsultaNum.getText().equals("Numero Documento") || ConsultaDoc.getText().length() == 0 || ConsultaNum.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en los campos");
        } else {
            if (this.isNumeric(ConsultaNum.getText())) {
                if (estudianteManager.consultarEstudiantePorDocumento(Integer.parseInt(ConsultaNum.getText()), ConsultaDoc.getText()) != null) {
                    EstudianteDTO estudiante = new EstudianteDTO();
                    estudiante = estudianteManager.consultarEstudiantePorDocumento(Integer.parseInt(ConsultaNum.getText()), ConsultaDoc.getText());
                    modelo.setRowCount(0);
                    String estado = "";
                    if (estudiante.getEstado() == 1) {
                        estado = "estudiando";
                    } else if (estudiante.getEstado() == 2) {
                        estado = "egresado/retirado";
                    }
                    String Dato[] = Estudiante.AgregarElementosTabla(estudiante, estado);
                    modelo.addRow(Dato);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay estudiante registrado con ese documento");
                }

            } else {
                JOptionPane.showMessageDialog(null, "El numero de documento debe ser un caracter numerico");
                ConsultaNum.setText("Numero Documento");
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        GrupoDTO grupo = new GrupoDTO();
        if (Documento.getText().equals("Documento") || Documento.getText().length() == 0 || NumDoc.getText().equals("Numero De Documento") || NumDoc.getText().length() == 0 || Nombre.getText().equals("Nombre") || Nombre.getText().length() == 0 || Apellido.getText().equals("Apellidos") || Apellido.getText().length() == 0 || Sexo.getText().equals("Sexo") || Sexo.getText().length() == 0 || FechaNacimiento.getText().equals("Fecha De Nacimiento") || FechaNacimiento.getText().length() == 0 || Direccion.getText().equals("Direccion De Residencia") || Direccion.getText().length() == 0 || Ciudad.getText().equals("Ciudad De Residencia") || Ciudad.getText().length() == 0 || Telefono.getText().equals("Telefono De Residencia") || Telefono.getText().length() == 0 || Celular.getText().equals("Telefono Celular Acudiente") || Celular.getText().length() == 0 || Correo.getText().equals("Correo Estudiante") || Correo.getText().length() == 0 || Grado.getText().equals("Grado") || Grado.getText().length() == 0 || Grupo.getText().equals("Grupo") || Grupo.getText().length() == 0 || Año.getText().equals("Año De Ingreso") || Año.getText().length() == 0 || Promedio.getText().equals("Nota Promedio") || Promedio.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en los campos");
        } else {
            if (this.isNumeric(NumDoc.getText())) {
                if (this.isNumeric(Telefono.getText())) {
                    if (this.isNumeric(Celular.getText())) {
                        if (this.isNumeric(Grado.getText())) {
                            if (this.isNumeric(Grupo.getText())) {
                                if (gradoManager.consultarGrado(Integer.parseInt(Grado.getText())) != null) {
                                    if (grupoManager.consultarGrupo(Integer.parseInt(Grupo.getText())) != null) {
                                        grupo = grupoManager.consultarGrupo(Integer.parseInt(Grupo.getText()));
                                        if (Integer.parseInt(Grado.getText()) == grupo.getIdGrado()) {
                                            if (this.isNumeric(Año.getText())) {
                                                if (this.isNumeric(Promedio.getText())) {
                                                    EstudianteDTO estudiante = new EstudianteDTO();
                                                    estudiante.setApellidos(Apellido.getText());
                                                    estudiante.setAño(Integer.parseInt(Año.getText()));
                                                    estudiante.setCiudadResidencia(Ciudad.getText());
                                                    estudiante.setCorreo(Correo.getText());
                                                    estudiante.setDireccionResidencia(Direccion.getText());
                                                    estudiante.setEstado(1);
                                                    estudiante.setFechaNacimiento(FechaNacimiento.getText());
                                                    estudiante.setIdGrado(Integer.parseInt(Grado.getText()));
                                                    estudiante.setIdGrupo(Integer.parseInt(Grupo.getText()));
                                                    estudiante.setNombre(Nombre.getText());
                                                    estudiante.setNotaPromedio(Float.parseFloat(Promedio.getText()));
                                                    estudiante.setNumeroDocumento(Integer.parseInt(NumDoc.getText()));
                                                    estudiante.setSexo(Sexo.getText());
                                                    estudiante.setTelefonoCelular(Integer.parseInt(Celular.getText()));
                                                    estudiante.setTelefonoResidencia(Integer.parseInt(Telefono.getText()));
                                                    estudiante.setTipoDocumento(Documento.getText());
                                                    estudianteManager.registrarEstudiante(estudiante);
                                                    this.jButton2ActionPerformed(evt);
                                                    Documento.setText("Documento");
                                                    NumDoc.setText("Numero De Documento");
                                                    Nombre.setText("Nombre");
                                                    Apellido.setText("Apellidos");
                                                    Sexo.setText("Sexo");
                                                    FechaNacimiento.setText("Fecha De Nacimiento");
                                                    Direccion.setText("Direccion De Residencia");
                                                    Ciudad.setText("Ciudad De Residencia");
                                                    Telefono.setText("Telefono De Residencia");
                                                    Celular.setText("Telefono Celular Acudiente");
                                                    Correo.setText("Correo Estudiante");
                                                    Grado.setText("Grado");
                                                    Grupo.setText("Grupo");
                                                    Año.setText("Año De Ingreso");
                                                    Promedio.setText("Nota Promedio");
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "La nota promedio debe ser un caracter numerico");
                                                    Promedio.setText("Nota Promedio");
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Año debe ser un caracter numerico");
                                                Año.setText("Año De Ingreso");

                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "El grupo ingresado no esta registrado para el grado ingresado");
                                            Grupo.setText("Grupo");
                                            Grado.setText("Grado");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "El grupo ingresado no esta registrado");
                                        Grupo.setText("Grupo");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El grado ingresado no esta registrado");
                                    Grado.setText("Grado");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "El grupo debe ser un caracter numerico");
                                Grupo.setText("Grupo");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El grado debe ser un caracter numerico");
                            Grado.setText("Grado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El telefono del acudiente debe ser un caracter numerico");
                        Celular.setText("Telefono Celular Acudiente");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El telefono de residencia debe ser un caracter numerico");
                    Telefono.setText("Telefono De Residencia");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El numero de documento debe ser un caracter Numerico");
                NumDoc.setText("Numero De Documento");
            }
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void PromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PromedioActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (PromoRetiro1.getText().equals("ID Del Estudiante") || Modi.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar algo en el campo");
        } else {
            if (this.isNumeric(PromoRetiro1.getText())) {
                if (estudianteManager.consultarEstudiante(Integer.parseInt(PromoRetiro1.getText())) != null) {
                    estudianteManager.retiroOegresoEstudiante(Integer.parseInt(PromoRetiro1.getText()));
                    this.jButton2ActionPerformed(evt);
                    JOptionPane.showMessageDialog(null, "El Estado del estudiante ha cambiado");

                } else {
                    JOptionPane.showMessageDialog(null, "El Id del estudiante no ha sido registrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Id del estudiante debe ser un caracter numerico");
                PromoRetiro1.setText("ID Del Estudiante");
            }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void PromoRetiro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PromoRetiro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PromoRetiro1ActionPerformed

    private void CelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelularActionPerformed

    private void DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocumentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estudiante().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Año;
    private javax.swing.JTextField Celular;
    private javax.swing.JTextField Ciudad;
    private javax.swing.JComboBox<String> Combobox;
    private javax.swing.JTextField Consulta;
    private javax.swing.JButton Consulta1;
    private javax.swing.JButton Consulta2;
    private javax.swing.JTextField ConsultaDoc;
    private javax.swing.JTextField ConsultaNum;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Documento;
    private javax.swing.JTextField FechaNacimiento;
    private javax.swing.JTextField Grado;
    private javax.swing.JTextField Grupo;
    private javax.swing.JTextField Modi;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NumDoc;
    private javax.swing.JTextField Promedio;
    private javax.swing.JTextField PromoRetiro1;
    private javax.swing.JTextField Sexo;
    private javax.swing.JTextField Telefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
