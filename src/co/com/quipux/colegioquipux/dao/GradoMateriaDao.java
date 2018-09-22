/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.GradoMateriaEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface GradoMateriaDao {

    public void registrarGradoMateria(GradoMateriaEntity gradoMateria);

    public GradoMateriaEntity consultarEstudianteV(int idGrado, String idMateria);

    public ArrayList<GradoMateriaEntity> consultarGradoMateriaPorMateria(String idmateria);

    public ArrayList<GradoMateriaEntity> consultarGradoMateriaPorGrado(int idGrado);

    public ArrayList<GradoMateriaEntity> traerListaGradoMateria();

    public void eliminarGradoMateria(int idGradoMateria);

}
