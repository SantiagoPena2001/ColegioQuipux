/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.GradoMateriaDaoImpl;
import co.com.quipux.colegioquipux.manager.GradoMateriaManager;
import co.com.quipux.colegioquipux.models.dto.GradoMateriaDTO;
import co.com.quipux.colegioquipux.models.entity.GradoMateriaEntity;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author familia peña
 */
public class GradoMateriaManagerImpl implements GradoMateriaManager {

    GradoMateriaDaoImpl gradoMateriaDao = new GradoMateriaDaoImpl();

    @Override
    public void registrarGradoMateria(GradoMateriaDTO gradoMateria) {
        GradoMateriaEntity gradoMateriaEntity = new GradoMateriaEntity();

        gradoMateriaEntity.setIdGrado(gradoMateria.getIdGrado());
        gradoMateriaEntity.setIdGradoMateria(gradoMateria.getIdGradoMateria());
        gradoMateriaEntity.setIdmateria(gradoMateria.getIdmateria());

        if (gradoMateriaDao.consultarEstudianteV(gradoMateriaEntity.getIdGrado(), gradoMateriaEntity.getIdmateria()) != null) {
            JOptionPane.showMessageDialog(null, "Esta relación ya existe");
        } else {
            gradoMateriaDao.registrarGradoMateria(gradoMateriaEntity);
            JOptionPane.showMessageDialog(null, "Se ha registrado la relación");
        }

    }

    @Override
    public ArrayList<GradoMateriaDTO> consultarGradoMateriaPorMateria(String idmateria) {

        ArrayList<GradoMateriaDTO> listaGradoMateriaDtoMat = new ArrayList<GradoMateriaDTO>();
        ArrayList<GradoMateriaEntity> listaGradoMateriaEntity = new ArrayList<GradoMateriaEntity>();
        listaGradoMateriaEntity = gradoMateriaDao.consultarGradoMateriaPorMateria(idmateria);
        for (GradoMateriaEntity gradoMateria : listaGradoMateriaEntity) {
            GradoMateriaDTO gradoMateriaD = new GradoMateriaDTO();
            gradoMateriaD.setIdGrado(gradoMateria.getIdGrado());
            gradoMateriaD.setIdGradoMateria(gradoMateria.getIdGradoMateria());
            gradoMateriaD.setIdmateria(gradoMateria.getIdmateria());

            listaGradoMateriaDtoMat.add(gradoMateriaD);
        }
        return listaGradoMateriaDtoMat;

    }

    @Override
    public ArrayList<GradoMateriaDTO> consultarGradoMateriaPorGrado(int idGrado) {

        ArrayList<GradoMateriaDTO> listaGradoMateriaDtoGrad = new ArrayList<GradoMateriaDTO>();
        ArrayList<GradoMateriaEntity> listaGradoMateriaEntity = new ArrayList<GradoMateriaEntity>();
        listaGradoMateriaEntity = gradoMateriaDao.consultarGradoMateriaPorGrado(idGrado);
        for (GradoMateriaEntity gradoMateria : listaGradoMateriaEntity) {
            GradoMateriaDTO gradoMateriaD = new GradoMateriaDTO();
            gradoMateriaD.setIdGrado(gradoMateria.getIdGrado());
            gradoMateriaD.setIdGradoMateria(gradoMateria.getIdGradoMateria());
            gradoMateriaD.setIdmateria(gradoMateria.getIdmateria());

            listaGradoMateriaDtoGrad.add(gradoMateriaD);
        }
        return listaGradoMateriaDtoGrad;

    }

    @Override
    public ArrayList<GradoMateriaDTO> traerListaGradoMateria() {

        ArrayList<GradoMateriaDTO> listaGradoMateriaDto = new ArrayList<GradoMateriaDTO>();
        ArrayList<GradoMateriaEntity> listaGradoMateriaEntity = new ArrayList<GradoMateriaEntity>();
        listaGradoMateriaEntity = gradoMateriaDao.traerListaGradoMateria();
        for (GradoMateriaEntity gradoMateria : listaGradoMateriaEntity) {
            GradoMateriaDTO gradoMateriaD = new GradoMateriaDTO();
            gradoMateriaD.setIdGrado(gradoMateria.getIdGrado());
            gradoMateriaD.setIdGradoMateria(gradoMateria.getIdGradoMateria());
            gradoMateriaD.setIdmateria(gradoMateria.getIdmateria());

            listaGradoMateriaDto.add(gradoMateriaD);
        }
        return listaGradoMateriaDto;

    }

    @Override
    public void eliminarGradoMateria(int idGradoMateria) {
        gradoMateriaDao.eliminarGradoMateria(idGradoMateria);
    }

}
