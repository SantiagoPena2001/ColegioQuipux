/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.DescripcionDTO;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface DescripcionPlanManager {

    public void registrarDescripcionPlan(DescripcionDTO descripcion);

    public void eliminarDescripcionPlan(int idDescripcionPlan);

    public void modificarDescripcionPlan(DescripcionDTO descripcionPlanMod, int idDescripcionPlan);

    public DescripcionDTO consultarDescripcion(int idDescripcionPlan);

    public ArrayList<DescripcionDTO> consultarDescripcionPorPlan(int idPlan);

    public ArrayList<DescripcionDTO> traerListaDescripcionPlan();

}
