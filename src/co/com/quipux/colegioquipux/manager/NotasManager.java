/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.NotasDTO;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface NotasManager {

    public void registrarNota(NotasDTO nota);

    public void eliminarNota(int idNota);

    public void ModificarNota(int idNota, int nota); //o int idNota y int NotaNueva

    public NotasDTO consultarNota(int idNota);

    public ArrayList<NotasDTO> traerListaNotas();

    public ArrayList<NotasDTO> consultarNotasPorEstudiante(int idEstudiante);

    public ArrayList<NotasDTO> consultarNotasPorMateria(String idMateria);

    public ArrayList<NotasDTO> consultarNotasporDescripcionPlan(int idDescripcionPlan);

    public ArrayList<NotasDTO> consultarNotasPorNombre(String nombreNota);

}
