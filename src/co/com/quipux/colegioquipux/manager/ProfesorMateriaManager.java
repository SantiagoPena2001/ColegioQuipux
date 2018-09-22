/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.ProfesorMateriaDTO;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface ProfesorMateriaManager {

    public void registrarProfesorMateria(ProfesorMateriaDTO profesorMateria);

    public ArrayList<ProfesorMateriaDTO> consultarProfesorMateriaPorProfesor(int idProfesor);

    public ArrayList<ProfesorMateriaDTO> consultarProfesorMateriaPorMateria(String idmateria);

    public ArrayList<ProfesorMateriaDTO> traerListaProfesorMateria();

    public void eliminarProfesorMateria(int idProfesorMateria);

    public ProfesorMateriaDTO consultarProfesorMateria(int idProfesorMateria);


}
