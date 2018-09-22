/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.GradoDao;
import co.com.quipux.colegioquipux.models.entity.GradoEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public class GradoDaoImpl implements GradoDao {

    private ArrayList<GradoEntity> listaGrados = new ArrayList<GradoEntity>();

    @Override
    public void registrarGrado(GradoEntity grado) {
        listaGrados.add(grado);

    }

    @Override
    public void eliminarGrado(int idGrado) {
        int x = -1, encontrado = 0;
        for (GradoEntity grado : listaGrados) {
            x++;
            if (grado.getIdGrado() == idGrado) {
                encontrado = x;
                break;
            }
        }
        listaGrados.remove(encontrado);

    }

    @Override
    public GradoEntity consultarGrado(int idGrado) {
        for (GradoEntity grado : listaGrados) {

            if (grado.getIdGrado() == idGrado) {
                return grado;
            }
        }
        return null;

    }

    @Override
    public ArrayList<GradoEntity> traerListaGrados() {

        return listaGrados;

    }

}
