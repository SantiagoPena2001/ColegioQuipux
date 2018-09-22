/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.ProfesorEntity;
import java.util.ArrayList;

/**
 *
 * @author salim.castellanos
 */
public interface ProfesorDao {

    public void registrarProfesor(ProfesorEntity profesor);

    public void eliminarProfesor(int idProfesor);

    public ProfesorEntity consultarProfesor(int idProfesor);

    public ProfesorEntity consultarProfesorPorDocumento(int idDocumento, String documento);

    public ArrayList<ProfesorEntity> traerListaProfesores();

    public ArrayList<ProfesorEntity> consultarProfesorPorNombre(String nombreProfesor);
    
    public ProfesorEntity consultarProfesorLogin(String correo, int numeroDocumento);
}
