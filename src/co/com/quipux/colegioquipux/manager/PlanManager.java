/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.PlanDTO;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface PlanManager {

    public void registrarPlan(PlanDTO plan);


    public void eliminarPlan(int idPlan);

    public PlanDTO consultarPlan(int idPlan);

    public ArrayList<PlanDTO> consultarPlanPorMateria(String idmateria);

    public ArrayList<PlanDTO> traerListaPlan();
    
    public PlanDTO consultarPlanNombre(String nombrePlan);
}
