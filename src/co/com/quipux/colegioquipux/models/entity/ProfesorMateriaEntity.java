/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.models.entity;

/**
 *
 * @author salim.castellanos
 */
public class ProfesorMateriaEntity {
    
    private int idProfesorMateria;
    private String idmateria;
    private int idProfesor;

    public String getIdMateria() {
        return idmateria;
    }

    public void setIdMateria(String idMateria) {
        this.idmateria = idMateria;
    }

    public int getIdProfesorMateria() {
        return idProfesorMateria;
    }

    public void setIdProfesorMateria(int idProfesorMateria) {
        this.idProfesorMateria = idProfesorMateria;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
    
    
    
}
