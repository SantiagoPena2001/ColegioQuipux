/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.EstuNotDesPlanMatEntity;

/**
 *
 * @author familia peña
 */
public interface EstuNotDesPlanMatDao {

    public void registrarEstuNotDesPlanMat(EstuNotDesPlanMatEntity estuNotDesPlanMat);

    public void eliminarEstuNotDesPlanMat(int idEstuNotDesPlanMat);

    public EstuNotDesPlanMatEntity consultarEstuNotDesPlanMat(int idEstuNotDesPlanMat);

    public EstuNotDesPlanMatEntity consultarEstuNotDesPlanMatPorEstudiante(int idEstudiante);

    public EstuNotDesPlanMatEntity consultarEstuNotDesPlanMatPorNota(int idNota);

    public EstuNotDesPlanMatEntity consultarEstuNotDesPlanMatPorDescripcionPlan(int idDescripcionPlan);

    public void consultarEstuNotDesPlanMatPorMateria(String idMateria);

}
