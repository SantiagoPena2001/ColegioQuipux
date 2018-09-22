/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.DescripcionPlanDaoImpl;
import co.com.quipux.colegioquipux.manager.DescripcionPlanManager;
import co.com.quipux.colegioquipux.models.dto.DescripcionDTO;
import co.com.quipux.colegioquipux.models.entity.DescripcionPlanEntity;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author familia peña
 */
public class DescripcionManagerImpl implements DescripcionPlanManager {

    DescripcionPlanDaoImpl descripcionDao = new DescripcionPlanDaoImpl();

    @Override
    public void registrarDescripcionPlan(DescripcionDTO descripcion) {

        DescripcionPlanEntity descripcionEntity = new DescripcionPlanEntity();

        descripcionEntity.setDescripcion(descripcion.getDescripcion());
        descripcionEntity.setIdDescripcionPlan(descripcion.getIdDescripcionPlan());
        descripcionEntity.setIdPlan(descripcion.getIdPlan());

        if (descripcionDao.consultarDescripcionV(descripcionEntity.getDescripcion(), descripcionEntity.getIdPlan()) != null) {
            JOptionPane.showMessageDialog(null, "Esta descripcion ya esta registrada");
        } else {
            descripcionDao.registrarDescripcionPlan(descripcionEntity);
            JOptionPane.showMessageDialog(null, "Se ha registrado la descripcion");
        }

    }

    @Override
    public void eliminarDescripcionPlan(int idDescripcionPlan) {

        descripcionDao.eliminarDescripcionPlan(idDescripcionPlan);
    }

    @Override
    public void modificarDescripcionPlan(DescripcionDTO descripcionPlanMod, int idDescripcionPlan) {

        DescripcionPlanEntity descripcionEntity = new DescripcionPlanEntity();

        descripcionEntity.setDescripcion(descripcionPlanMod.getDescripcion());
        descripcionEntity.setIdDescripcionPlan(descripcionPlanMod.getIdDescripcionPlan());
        descripcionEntity.setIdPlan(descripcionPlanMod.getIdPlan());

        descripcionDao.modificarDescripcionPlan(descripcionEntity, idDescripcionPlan);

    }

    @Override
    public DescripcionDTO consultarDescripcion(int idDescripcionPlan) {

        DescripcionPlanEntity descripcion = new DescripcionPlanEntity();
        descripcion = descripcionDao.consultarDescripcion(idDescripcionPlan);
        if (descripcion != null) {
            DescripcionDTO descripcionD = new DescripcionDTO();
            descripcionD.setDescripcion(descripcion.getDescripcion());
            descripcionD.setIdDescripcionPlan(descripcion.getIdDescripcionPlan());
            descripcionD.setIdPlan(descripcion.getIdPlan());

            return descripcionD;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<DescripcionDTO> consultarDescripcionPorPlan(int idPlan) {

        ArrayList<DescripcionDTO> listaDescripcionDtoPlan = new ArrayList<DescripcionDTO>();
        ArrayList<DescripcionPlanEntity> listaDescripcionEntity = new ArrayList<DescripcionPlanEntity>();
        listaDescripcionEntity = descripcionDao.consultarDescripcionPorPlan(idPlan);
        for (DescripcionPlanEntity descripcion : listaDescripcionEntity) {
            DescripcionDTO descripcionD = new DescripcionDTO();
            descripcionD.setDescripcion(descripcion.getDescripcion());
            descripcionD.setIdDescripcionPlan(descripcion.getIdDescripcionPlan());
            descripcionD.setIdPlan(descripcion.getIdPlan());
            listaDescripcionDtoPlan.add(descripcionD);
        }
        return listaDescripcionDtoPlan;
    }

    @Override
    public ArrayList<DescripcionDTO> traerListaDescripcionPlan() {

        ArrayList<DescripcionDTO> listaDescripcionDto = new ArrayList<DescripcionDTO>();
        ArrayList<DescripcionPlanEntity> listaDescripcionEntity = new ArrayList<DescripcionPlanEntity>();
        listaDescripcionEntity = descripcionDao.traerListaDescripcionPlan();
        for (DescripcionPlanEntity descripcion : listaDescripcionEntity) {
            DescripcionDTO descripcionD = new DescripcionDTO();
            descripcionD.setDescripcion(descripcion.getDescripcion());
            descripcionD.setIdDescripcionPlan(descripcion.getIdDescripcionPlan());
            descripcionD.setIdPlan(descripcion.getIdPlan());
            listaDescripcionDto.add(descripcionD);
        }
        return listaDescripcionDto;

    }

}
