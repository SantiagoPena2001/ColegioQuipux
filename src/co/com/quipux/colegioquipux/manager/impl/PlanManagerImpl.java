/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.PlanDaoImpl;
import co.com.quipux.colegioquipux.manager.PlanManager;
import co.com.quipux.colegioquipux.models.dto.PlanDTO;
import co.com.quipux.colegioquipux.models.entity.PlanEntity;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author familia peña
 */
public class PlanManagerImpl implements PlanManager {

    PlanDaoImpl planDao = new PlanDaoImpl();

    @Override
    public void registrarPlan(PlanDTO plan) {
        PlanEntity planEntity = new PlanEntity();

        planEntity.setIdPlan(plan.getIdPlan());
        planEntity.setIdMateria(plan.getIdMateria());
        planEntity.setNombrePlan(plan.getNombrePlan());

        if (planDao.consultarPlanPorNombre(planEntity.getNombrePlan()) != null) {
            JOptionPane.showMessageDialog(null, "Ese plan ya se encuentra registrado");
        } else {
            planDao.registrarPlan(planEntity);
            JOptionPane.showMessageDialog(null, "Se ha registrado el plan");
        }

    }

    @Override
    public void eliminarPlan(int idPlan) {
        planDao.eliminarPlan(idPlan);
    }

    @Override
    public PlanDTO consultarPlan(int idPlan) {
        PlanEntity plan = new PlanEntity();
        plan = planDao.consultarPlan(idPlan);
        if (plan != null) {
            PlanDTO pland = new PlanDTO();
            pland.setIdPlan(plan.getIdPlan());
            pland.setIdMateria(plan.getIdMateria());
            pland.setNombrePlan(plan.getNombrePlan());

            return pland;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<PlanDTO> consultarPlanPorMateria(String idmateria) {

        ArrayList<PlanDTO> listaPlanDTOMat = new ArrayList<PlanDTO>();
        ArrayList<PlanEntity> listaPlanEntity = new ArrayList<PlanEntity>();
        listaPlanEntity = planDao.consultarPlanPorMateria(idmateria);
        for (PlanEntity plan : listaPlanEntity) {
            PlanDTO pland = new PlanDTO();
            pland.setIdPlan(plan.getIdPlan());
            pland.setIdMateria(plan.getIdMateria());
            pland.setNombrePlan(plan.getNombrePlan());
            listaPlanDTOMat.add(pland);
        }
        return listaPlanDTOMat;

    }

    @Override
    public ArrayList<PlanDTO> traerListaPlan() {

        ArrayList<PlanDTO> listaPlanDTO = new ArrayList<PlanDTO>();
        ArrayList<PlanEntity> listaPlanEntity = new ArrayList<PlanEntity>();
        listaPlanEntity = planDao.traerListaPlan();
        for (PlanEntity plan : listaPlanEntity) {
            PlanDTO pland = new PlanDTO();
            pland.setIdPlan(plan.getIdPlan());
            pland.setIdMateria(plan.getIdMateria());
            pland.setNombrePlan(plan.getNombrePlan());
            listaPlanDTO.add(pland);
        }
        return listaPlanDTO;

    }

    @Override
    public PlanDTO consultarPlanNombre(String nombrePlan) {

        PlanEntity plan = new PlanEntity();
        plan = planDao.consultarPlanPorNombre(nombrePlan);
        if (plan != null) {
            PlanDTO pland = new PlanDTO();
            pland.setIdPlan(plan.getIdPlan());
            pland.setIdMateria(plan.getIdMateria());
            pland.setNombrePlan(plan.getNombrePlan());

            return pland;
        } else {
            return null;
        }
    }

}
