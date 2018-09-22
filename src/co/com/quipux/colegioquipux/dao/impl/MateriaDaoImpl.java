/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.MateriaDao;
import co.com.quipux.colegioquipux.models.entity.MateriaEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public class MateriaDaoImpl implements MateriaDao {

    private ArrayList<MateriaEntity> listaMaterias = new ArrayList<MateriaEntity>();

    @Override
    public void registrarMateria(MateriaEntity materia) {
        listaMaterias.add(materia);
    }

    @Override
    public void eliminarMateria(String idmateria) {
        int x = -1, encontrado = 0;
        for (MateriaEntity materia : listaMaterias) {
            x++;
            if (materia.getIdmateria().equals(idmateria)) {
                encontrado = x;
                break;

            }
        }
        listaMaterias.remove(encontrado);

    }

    @Override
    public MateriaEntity consultarMateria(String idmateria) {
        for (MateriaEntity materia : listaMaterias) {
            if (materia.getIdmateria().equals(idmateria)) {
                return materia;
            }
        }
        return null;
    }

    @Override
    public MateriaEntity consultarMateriaPorNombre(String nombreMateria) {
        for (MateriaEntity materia : listaMaterias) {
            if (materia.getNombreMateria().equals(nombreMateria)) {
                return materia;
            }
        }
        return null;
    }

    @Override
    public ArrayList<MateriaEntity> traerListaMaterias() {

        return listaMaterias;

    }

}
