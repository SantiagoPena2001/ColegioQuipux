/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.GradoMateriaDao;
import co.com.quipux.colegioquipux.models.entity.GradoMateriaEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public class GradoMateriaDaoImpl implements GradoMateriaDao {

    private ArrayList<GradoMateriaEntity> listaGradoMaterias = new ArrayList<GradoMateriaEntity>();

    @Override
    public void registrarGradoMateria(GradoMateriaEntity gradoMateria) {
        gradoMateria.setIdGradoMateria(listaGradoMaterias.size() + 1);
        listaGradoMaterias.add(gradoMateria);

    }

    @Override
    public ArrayList<GradoMateriaEntity> consultarGradoMateriaPorMateria(String idmateria) {
        ArrayList<GradoMateriaEntity> listaGradoMateriaPorMateria = new ArrayList<GradoMateriaEntity>();

        for (GradoMateriaEntity gradoMateria : listaGradoMaterias) {
            if (gradoMateria.getIdmateria().equals(idmateria)) {
                listaGradoMateriaPorMateria.add(gradoMateria);
            }
        }

        return listaGradoMateriaPorMateria;

    }

    @Override
    public ArrayList<GradoMateriaEntity> consultarGradoMateriaPorGrado(int idGrado) {
        ArrayList<GradoMateriaEntity> listaGradoMateriaPorGrado = new ArrayList<GradoMateriaEntity>();

        for (GradoMateriaEntity gradoMateria : listaGradoMaterias) {
            if (gradoMateria.getIdGrado() == idGrado) {
                listaGradoMateriaPorGrado.add(gradoMateria);
            }
        }

        return listaGradoMateriaPorGrado;
    }

    @Override
    public void eliminarGradoMateria(int idGradoMateria) {
        int x = -1, encontrado = 0;
        for (GradoMateriaEntity gradoMateria : listaGradoMaterias) {
            x++;
            if (gradoMateria.getIdGradoMateria() == idGradoMateria) {
                encontrado = x;
                break;
            }
        }
        listaGradoMaterias.remove(encontrado);

    }

    @Override
    public ArrayList<GradoMateriaEntity> traerListaGradoMateria() {
        return listaGradoMaterias;

    }

    @Override
    public GradoMateriaEntity consultarEstudianteV(int idGrado, String idMateria) {

        for (GradoMateriaEntity gradoMateria : listaGradoMaterias) {
            if (gradoMateria.getIdGrado() == idGrado && gradoMateria.getIdmateria().equals(idMateria)) {
                return gradoMateria;
            }
        }
        return null;

    }

}
