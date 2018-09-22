/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.ProfesorMateriaEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface ProfesorMateriaDao {

    public void registrarProfesorMateria(ProfesorMateriaEntity profesorMateria);

    public ProfesorMateriaEntity consultarProfesorMateria(int idProfesorMateria);

    public ArrayList<ProfesorMateriaEntity> consultarProfesorMateriaPorProfesor(int idProfesor);

    public ArrayList<ProfesorMateriaEntity> consultarProfesorMateriaPorMateria(String idmateria);

    public ArrayList<ProfesorMateriaEntity> traerListaProfesorMateria();

    public void eliminarProfesorMateria(int idProfesorMateria);

    public ProfesorMateriaEntity consultarProfesorMateriaV(int idProfesor,String idmateria);

}
