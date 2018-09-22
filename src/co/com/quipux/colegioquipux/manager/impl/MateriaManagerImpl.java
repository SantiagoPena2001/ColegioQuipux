/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.MateriaDaoImpl;
import co.com.quipux.colegioquipux.manager.MateriaManager;
import co.com.quipux.colegioquipux.models.dto.MateriaDTO;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author familia peña
 */
public class MateriaManagerImpl implements MateriaManager {

    MateriaDaoImpl materiaDao = new MateriaDaoImpl();

    @Override
    public void registrarMateria(MateriaDTO materia) {

        MateriaEntity materiaEntity = new MateriaEntity();

        materiaEntity.setIdmateria(materia.getIdmateria());
        materiaEntity.setDescripcionMateria(materia.getDescripcionMateria());
        materiaEntity.setNombreMateria(materia.getNombreMateria());

        if (materiaDao.consultarMateriaPorNombre(materiaEntity.getNombreMateria()) != null || materiaDao.consultarMateria(materiaEntity.getIdmateria()) != null) {
            JOptionPane.showMessageDialog(null, "La materia ya esta registrada");
        } else {
            materiaDao.registrarMateria(materiaEntity);
            JOptionPane.showMessageDialog(null, "Se ha registrado la materia");
        }
    }

    @Override
    public void eliminarMateria(String idmateria) {
        materiaDao.eliminarMateria(idmateria);
    }

    @Override
    public MateriaDTO consultarMateria(String idmateria) {

        MateriaEntity materia = new MateriaEntity();
        materia = materiaDao.consultarMateria(idmateria);
        if (materia != null) {
            MateriaDTO materiaD = new MateriaDTO();
            materiaD.setIdmateria(materia.getIdmateria());
            materiaD.setDescripcionMateria(materia.getDescripcionMateria());
            materiaD.setNombreMateria(materia.getNombreMateria());
            return materiaD;
        } else {
            return null;
        }

    }

    @Override
    public MateriaDTO consultarMateriaPorNombre(String nombreMateria) {
        MateriaEntity materia = new MateriaEntity();
        materia = materiaDao.consultarMateriaPorNombre(nombreMateria);
        if (materia != null) {
            MateriaDTO materiaD = new MateriaDTO();
            materiaD.setIdmateria(materia.getIdmateria());
            materiaD.setDescripcionMateria(materia.getDescripcionMateria());
            materiaD.setNombreMateria(materia.getNombreMateria());
            return materiaD;
        } else {
            return null;
        }

    }

    @Override
    public ArrayList<MateriaDTO> traerListaMaterias() {
        ArrayList<MateriaDTO> listaMateriaDTO = new ArrayList<MateriaDTO>();
        ArrayList<MateriaEntity> listaMateriaEntity = new ArrayList<MateriaEntity>();
        listaMateriaEntity = materiaDao.traerListaMaterias();
        for (MateriaEntity materia : listaMateriaEntity) {
            MateriaDTO materiaD = new MateriaDTO();
            materiaD.setIdmateria(materia.getIdmateria());
            materiaD.setDescripcionMateria(materia.getDescripcionMateria());
            materiaD.setNombreMateria(materia.getNombreMateria());
            listaMateriaDTO.add(materiaD);
        }
        return listaMateriaDTO;
    }

}
