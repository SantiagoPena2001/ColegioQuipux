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
public class EstuNotDesPlanMatEntity {
    //esta es estudiantesNotasDescripcionPlanMateria pero para no
    //ponerlo tan largo lo resumo así y es la relacion entre esas
    //cuatro entidades (las que se ven abajo con los ids)
    private int idEstuNotDesPlanMat;
    private int idEstudiante;
    private int idNota;
    private int idDescripcionPlan;
    private String idMateria;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getIdDescripcionPlan() {
        return idDescripcionPlan;
    }

    public void setIdDescripcionPlan(int idDescripcionPlan) {
        this.idDescripcionPlan = idDescripcionPlan;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }
    
}
