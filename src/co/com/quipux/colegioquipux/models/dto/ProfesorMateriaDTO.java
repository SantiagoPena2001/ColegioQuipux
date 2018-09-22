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
public class ProfesorMateriaDTO {

    private int idProfesorMateria;
    private String idmateria;
    private int idProfesor;

    public int getIdProfesorMateria() {
        return idProfesorMateria;
    }

    public void setIdProfesorMateria(int idProfesorMateria) {
        this.idProfesorMateria = idProfesorMateria;
    }

    public String getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(String idmateria) {
        this.idmateria = idmateria;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

}
