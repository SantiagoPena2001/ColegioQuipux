/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.PlanDao;
import co.com.quipux.colegioquipux.models.entity.PlanEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public class PlanDaoImpl implements PlanDao {

    private ArrayList<PlanEntity> listaPlanes = new ArrayList<PlanEntity>();
    int x = 0;

    @Override
    public void registrarPlan(PlanEntity plan) {
        x++;
        plan.setIdPlan(x);
        listaPlanes.add(plan);
    }

    @Override
    public void eliminarPlan(int idPlan) {
        int x = -1, encontrado = 0;
        for (PlanEntity plan : listaPlanes) {
            x++;
            if (plan.getIdPlan() == idPlan) {
                encontrado = x;
                break;
            }
        }
        listaPlanes.remove(encontrado);

    }

    @Override
    public PlanEntity consultarPlan(int idPlan) {
        for (PlanEntity plan : listaPlanes) {

            if (plan.getIdPlan() == idPlan) {
                return plan;
            }
        }
        return null;
    }

    @Override
    public ArrayList<PlanEntity> consultarPlanPorMateria(String idmateria) {
        ArrayList<PlanEntity> listaProfesorPlanPorMateria = new ArrayList<PlanEntity>();

        for (PlanEntity plan : listaPlanes) {
            if (plan.getIdMateria().equals(idmateria)) {
                listaProfesorPlanPorMateria.add(plan);
            }
        }

        return listaProfesorPlanPorMateria;
    }

    @Override
    public PlanEntity consultarPlanPorNombre(String nombrePlan) {
        for (PlanEntity plan : listaPlanes) {

            if (plan.getNombrePlan().equals(nombrePlan)) {
                return plan;
            }
        }
        return null;
    }

    @Override
    public ArrayList<PlanEntity> traerListaPlan() {

        return listaPlanes;

    }

}
