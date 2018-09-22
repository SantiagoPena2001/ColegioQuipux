/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.MateriaEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface MateriaDao {

    public void registrarMateria(MateriaEntity materia);
    public void eliminarMateria(String idmateria);
    

    public MateriaEntity consultarMateria(String idmateria);
    public MateriaEntity consultarMateriaPorNombre(String nombreMateria);

    public ArrayList<MateriaEntity> traerListaMaterias();
    
}
