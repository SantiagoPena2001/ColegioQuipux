/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.models.entity;

/**
 *
 * @author familia peña
 */
public class NotasEntity {
    private int idNota;
    private int idDescripcionPlan;
    private int idEstudiante;
    private String idMateria;
    private int nota;
    private String nombreNota;
    private String descripcionNota;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public int getIdDescripcionPlan() {
        return idDescripcionPlan;
    }

    public void setIdDescripcionPlan(int idDescripcionPlan) {
        this.idDescripcionPlan = idDescripcionPlan;
    }

    
    
    
    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDescripcionNota() {
        return descripcionNota;
    }

    public void setDescripcionNota(String descripcionNota) {
        this.descripcionNota = descripcionNota;
    }

    public String getNombreNota() {
        return nombreNota;
    }

    public void setNombreNota(String nombreNota) {
        this.nombreNota = nombreNota;
    }
    
    
    
}
