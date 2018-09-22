/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.models.dto;

/**
 *
 * @author familia peña
 */
public class DescripcionDTO {

    private int idDescripcionPlan;
    private int idPlan;
    private String descripcion;

    public int getIdDescripcionPlan() {
        return idDescripcionPlan;
    }

    public void setIdDescripcionPlan(int idDescripcionPlan) {
        this.idDescripcionPlan = idDescripcionPlan;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
