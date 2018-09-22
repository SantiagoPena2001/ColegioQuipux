/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.EstuNotDesPlanMatDao;
import co.com.quipux.colegioquipux.models.entity.EstuNotDesPlanMatEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public class EstuNotDesPlanMatDaoImpl implements EstuNotDesPlanMatDao{
    private ArrayList<EstuNotDesPlanMatDao> listaEstuNotDesPlanMatDao = new ArrayList<EstuNotDesPlanMatDao>();

    @Override
    public void registrarEstuNotDesPlanMat(EstuNotDesPlanMatEntity estuNotDesPlanMat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarEstuNotDesPlanMat(int idEstuNotDesPlanMat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstuNotDesPlanMatEntity consultarEstuNotDesPlanMat(int idEstuNotDesPlanMat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstuNotDesPlanMatEntity consultarEstuNotDesPlanMatPorEstudiante(int idEstudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstuNotDesPlanMatEntity consultarEstuNotDesPlanMatPorNota(int idNota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstuNotDesPlanMatEntity consultarEstuNotDesPlanMatPorDescripcionPlan(int idDescripcionPlan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultarEstuNotDesPlanMatPorMateria(String idMateria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
