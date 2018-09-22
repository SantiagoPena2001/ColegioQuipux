/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.DescripcionPlanEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface DescripcionPlanDao {

    public void registrarDescripcionPlan(DescripcionPlanEntity descripcion);

    public void eliminarDescripcionPlan(int idDescripcionPlan);

    public void modificarDescripcionPlan(DescripcionPlanEntity descripcionPlanMod, int idDescripcionPlan);

    public DescripcionPlanEntity consultarDescripcion(int idDescripcionPlan);
    
    public DescripcionPlanEntity consultarDescripcionV(String descripcion,int idPlan);

    public ArrayList<DescripcionPlanEntity> consultarDescripcionPorPlan(int idPlan);

    public ArrayList<DescripcionPlanEntity> traerListaDescripcionPlan();

}
