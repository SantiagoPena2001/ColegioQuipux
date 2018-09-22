/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.MateriaDTO;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface MateriaManager {

    public void registrarMateria(MateriaDTO materia);

    public void eliminarMateria(String idmateria);

    public MateriaDTO consultarMateria(String idmateria);

    public MateriaDTO consultarMateriaPorNombre(String nombreMateria);

    public ArrayList<MateriaDTO> traerListaMaterias();

}
