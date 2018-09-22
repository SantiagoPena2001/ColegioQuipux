/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.DescripcionPlanDao;
import co.com.quipux.colegioquipux.models.entity.DescripcionPlanEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public class DescripcionPlanDaoImpl implements DescripcionPlanDao {

    //holsd sdfklsdhfsldkjfsdlkf me gusta eimy
    
    
    
    private ArrayList<DescripcionPlanEntity> listaDescripciones = new ArrayList<DescripcionPlanEntity>();
    int x = 0;
    @Override
    public void registrarDescripcionPlan(DescripcionPlanEntity descripcion) {
        x++;
        descripcion.setIdDescripcionPlan(x);
        listaDescripciones.add(descripcion);

    }

    @Override
    public void eliminarDescripcionPlan(int idDescripcionPlan) {
        int x = -1, encontrado = 0;
        for (DescripcionPlanEntity descripcion : listaDescripciones) {
            x++;
            if (descripcion.getIdDescripcionPlan() == idDescripcionPlan) {
                encontrado = x;
                break;
            }
        }
        listaDescripciones.remove(encontrado);
    }

    @Override
    public void modificarDescripcionPlan(DescripcionPlanEntity descripcionPlanMod, int idDescripcionPlan) {
        int x = -1, encontrado = 0;
        DescripcionPlanEntity descripcionE = new DescripcionPlanEntity();
        for (DescripcionPlanEntity descripcion : listaDescripciones) {
            x++;
            if (descripcion.getIdDescripcionPlan() == idDescripcionPlan) {
                descripcionE = descripcion;
                encontrado = x;
                break;
            }
        }
        listaDescripciones.set(encontrado, descripcionPlanMod);
    }

    @Override
    public DescripcionPlanEntity consultarDescripcion(int idDescripcionPlan) {
        for (DescripcionPlanEntity descripcion : listaDescripciones) {

            if (descripcion.getIdDescripcionPlan() == idDescripcionPlan) {
                return descripcion;
            }
        }
        return null;
    }

    @Override
    public ArrayList<DescripcionPlanEntity> consultarDescripcionPorPlan(int idPlan) {
        ArrayList<DescripcionPlanEntity> listaDescripcionesPlan = new ArrayList<DescripcionPlanEntity>();

        for (DescripcionPlanEntity descripcion : listaDescripciones) {
            if (descripcion.getIdPlan() == idPlan) {
                listaDescripcionesPlan.add(descripcion);
            }
        }

        return listaDescripcionesPlan;
    }

    @Override
    public ArrayList<DescripcionPlanEntity> traerListaDescripcionPlan() {

        return listaDescripciones;
    }

    @Override
    public DescripcionPlanEntity consultarDescripcionV(String descripcion, int idPlan) {
        for (DescripcionPlanEntity descripcionE : listaDescripciones) {

            if (descripcionE.getDescripcion().equals(descripcion)  && descripcionE.getIdPlan() == idPlan) {
                return descripcionE;
            }
        }
        return null;

    }

}
