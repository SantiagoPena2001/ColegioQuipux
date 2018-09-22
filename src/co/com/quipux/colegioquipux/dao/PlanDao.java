/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.PlanEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface PlanDao {
    

    public void registrarPlan(PlanEntity plan);

    public void eliminarPlan(int idPlan);

    public PlanEntity consultarPlan(int idPlan);

    public ArrayList<PlanEntity> consultarPlanPorMateria(String idmateria);

    public PlanEntity consultarPlanPorNombre(String nombrePlan);

    public ArrayList<PlanEntity> traerListaPlan();

}
