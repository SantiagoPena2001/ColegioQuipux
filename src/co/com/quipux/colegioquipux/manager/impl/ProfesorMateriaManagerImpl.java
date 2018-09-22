/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.ProfesorMateriaDaoImpl;
import co.com.quipux.colegioquipux.manager.ProfesorMateriaManager;
import co.com.quipux.colegioquipux.models.dto.ProfesorMateriaDTO;
import co.com.quipux.colegioquipux.models.entity.ProfesorMateriaEntity;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author familia peña
 */
public class ProfesorMateriaManagerImpl implements ProfesorMateriaManager {

    ProfesorMateriaDaoImpl profesorMateriaDao = new ProfesorMateriaDaoImpl();

    @Override
    public void registrarProfesorMateria(ProfesorMateriaDTO profesorMateria) {

        ProfesorMateriaEntity profesorMateriaEntity = new ProfesorMateriaEntity();

        profesorMateriaEntity.setIdMateria(profesorMateria.getIdmateria());
        profesorMateriaEntity.setIdProfesor(profesorMateria.getIdProfesor());
        profesorMateriaEntity.setIdProfesorMateria(profesorMateria.getIdProfesorMateria());

        if (profesorMateriaDao.consultarProfesorMateriaV(profesorMateriaEntity.getIdProfesor(), profesorMateria.getIdmateria()) != null) {
            JOptionPane.showMessageDialog(null, "Esta relación ya esta registrada");
        } else {
            profesorMateriaDao.registrarProfesorMateria(profesorMateriaEntity);
            JOptionPane.showMessageDialog(null, "Se ha registrado la relación");
        }

    }

    @Override
    public ArrayList<ProfesorMateriaDTO> consultarProfesorMateriaPorProfesor(int idProfesor) {
        ArrayList<ProfesorMateriaDTO> listaProfesorMateriaDTO = new ArrayList<ProfesorMateriaDTO>();
        ArrayList<ProfesorMateriaEntity> listaProfesorMateriaEntity = new ArrayList<ProfesorMateriaEntity>();
        listaProfesorMateriaEntity = profesorMateriaDao.consultarProfesorMateriaPorProfesor(idProfesor);
        for (ProfesorMateriaEntity profesorMateria : listaProfesorMateriaEntity) {
            ProfesorMateriaDTO profesorMateriaD = new ProfesorMateriaDTO();
            profesorMateriaD.setIdmateria(profesorMateria.getIdMateria());
            profesorMateriaD.setIdProfesor(profesorMateria.getIdProfesor());
            profesorMateriaD.setIdProfesorMateria(profesorMateria.getIdProfesorMateria());
            listaProfesorMateriaDTO.add(profesorMateriaD);
        }
        return listaProfesorMateriaDTO;

    }

    @Override
    public ArrayList<ProfesorMateriaDTO> consultarProfesorMateriaPorMateria(String idmateria) {
        ArrayList<ProfesorMateriaDTO> listaProfesorMateriaDTO = new ArrayList<ProfesorMateriaDTO>();
        ArrayList<ProfesorMateriaEntity> listaProfesorMateriaEntity = new ArrayList<ProfesorMateriaEntity>();
        listaProfesorMateriaEntity = profesorMateriaDao.consultarProfesorMateriaPorMateria(idmateria);
        for (ProfesorMateriaEntity profesorMateria : listaProfesorMateriaEntity) {
            ProfesorMateriaDTO profesorMateriaD = new ProfesorMateriaDTO();
            profesorMateriaD.setIdmateria(profesorMateria.getIdMateria());
            profesorMateriaD.setIdProfesor(profesorMateria.getIdProfesor());
            profesorMateriaD.setIdProfesorMateria(profesorMateria.getIdProfesorMateria());
            listaProfesorMateriaDTO.add(profesorMateriaD);
        }
        return listaProfesorMateriaDTO;

    }

    @Override
    public ArrayList<ProfesorMateriaDTO> traerListaProfesorMateria() {

        ArrayList<ProfesorMateriaDTO> listaProfesorMateriaDTO = new ArrayList<ProfesorMateriaDTO>();
        ArrayList<ProfesorMateriaEntity> listaProfesorMateriaEntity = new ArrayList<ProfesorMateriaEntity>();
        listaProfesorMateriaEntity = profesorMateriaDao.traerListaProfesorMateria();
        for (ProfesorMateriaEntity profesorMateria : listaProfesorMateriaEntity) {
            ProfesorMateriaDTO profesorMateriaD = new ProfesorMateriaDTO();
            profesorMateriaD.setIdmateria(profesorMateria.getIdMateria());
            profesorMateriaD.setIdProfesor(profesorMateria.getIdProfesor());
            profesorMateriaD.setIdProfesorMateria(profesorMateria.getIdProfesorMateria());
            listaProfesorMateriaDTO.add(profesorMateriaD);
        }
        return listaProfesorMateriaDTO;

    }

    @Override
    public void eliminarProfesorMateria(int idProfesorMateria) {
        profesorMateriaDao.eliminarProfesorMateria(idProfesorMateria);
    }

    @Override
    public ProfesorMateriaDTO consultarProfesorMateria(int idProfesorMateria) {

        ProfesorMateriaEntity profesorMateria = new ProfesorMateriaEntity();
        profesorMateria = profesorMateriaDao.consultarProfesorMateria(idProfesorMateria);
        if (profesorMateria != null) {
            ProfesorMateriaDTO profesorMateriaD = new ProfesorMateriaDTO();
            profesorMateriaD.setIdmateria(profesorMateria.getIdMateria());
            profesorMateriaD.setIdProfesor(profesorMateria.getIdProfesor());
            profesorMateriaD.setIdProfesorMateria(profesorMateria.getIdProfesorMateria());
            return profesorMateriaD;
        } else {
            return null;
        }

    }

}
