/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.GradoMateriaDTO;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface GradoMateriaManager {

    public void registrarGradoMateria(GradoMateriaDTO gradoMateria);


    public ArrayList<GradoMateriaDTO> consultarGradoMateriaPorMateria(String idmateria);

    public ArrayList<GradoMateriaDTO> consultarGradoMateriaPorGrado(int idGrado);

    public ArrayList<GradoMateriaDTO> traerListaGradoMateria();

    public void eliminarGradoMateria(int idGradoMateria);

}
