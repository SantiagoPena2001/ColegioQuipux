/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.NotasEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface NotasDao {
    public void registrarNota(NotasEntity nota);
    public void eliminarNota(int idNota);
    public void ModificarNota(int idNota,int nota); //o int idNota y int NotaNueva
    
    public NotasEntity consultarNota(int idNota);
    public NotasEntity consultarNotaV(int idEstudiante,String nombreNota);
    
    public ArrayList<NotasEntity> traerListaNotas();
    public ArrayList<NotasEntity> consultarNotasPorEstudiante(int idEstudiante);
    public ArrayList<NotasEntity> consultarNotasPorMateria(String idMateria);
    public ArrayList<NotasEntity> consultarNotasporDescripcionPlan(int idDescripcionPlan);
    public ArrayList<NotasEntity> consultarNotasPorNombre(String nombre);

}
