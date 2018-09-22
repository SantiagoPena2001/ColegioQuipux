/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.ProfesorMateriaDao;
import co.com.quipux.colegioquipux.models.entity.ProfesorMateriaEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public class ProfesorMateriaDaoImpl implements ProfesorMateriaDao {

    private ArrayList<ProfesorMateriaEntity> listaProfesorMateria = new ArrayList<ProfesorMateriaEntity>();
    int x = 0;

    @Override
    public void registrarProfesorMateria(ProfesorMateriaEntity profesormateria) {
        x++;
        profesormateria.setIdProfesorMateria(x);
        listaProfesorMateria.add(profesormateria);

    }

    @Override
    public ArrayList<ProfesorMateriaEntity> consultarProfesorMateriaPorProfesor(int idProfesor) {
        ArrayList<ProfesorMateriaEntity> listaProfesorMateriaPorPro = new ArrayList<ProfesorMateriaEntity>();
        for (ProfesorMateriaEntity profesorMateria : listaProfesorMateria) {
            if (profesorMateria.getIdProfesor() == idProfesor) {
                listaProfesorMateriaPorPro.add(profesorMateria);
            }
        }
        return listaProfesorMateriaPorPro;
    }

    @Override
    public ArrayList<ProfesorMateriaEntity> consultarProfesorMateriaPorMateria(String idmateria) {
        ArrayList<ProfesorMateriaEntity> listaProfesorMateriaPorPro = new ArrayList<ProfesorMateriaEntity>();
        for (ProfesorMateriaEntity profesorMateria : listaProfesorMateria) {
            if (profesorMateria.getIdMateria().equals(idmateria)) {
                listaProfesorMateriaPorPro.add(profesorMateria);
            }
        }
        return listaProfesorMateriaPorPro;
    }

    @Override
    public void eliminarProfesorMateria(int idProfesorMateria) {

        int x = -1, encontrado = 0;
        for (ProfesorMateriaEntity profesor : listaProfesorMateria) {
            x++;
            if (profesor.getIdProfesor() == idProfesorMateria) {
                encontrado = x;
                break;
            }

        }
        listaProfesorMateria.remove(encontrado);

    }

    @Override
    public ArrayList<ProfesorMateriaEntity> traerListaProfesorMateria() {
        return listaProfesorMateria;
    }

    @Override
    public ProfesorMateriaEntity consultarProfesorMateria(int idProfesorMateria) {
        for (ProfesorMateriaEntity profesorMateria : listaProfesorMateria) {

            if (profesorMateria.getIdProfesorMateria() == idProfesorMateria) {
                return profesorMateria;
            }
        }
        return null;
    }

    @Override
    public ProfesorMateriaEntity consultarProfesorMateriaV(int idProfesor, String idmateria) {

        for (ProfesorMateriaEntity profesorMateria : listaProfesorMateria) {

            if (profesorMateria.getIdProfesor() == idProfesor && profesorMateria.getIdMateria().equals(idmateria)) {
                return profesorMateria;
            }
        }
        return null;

    }

}
