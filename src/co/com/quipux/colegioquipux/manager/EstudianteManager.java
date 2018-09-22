/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.EstudianteDTO;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface EstudianteManager {

    public void registrarEstudiante(EstudianteDTO estudiante);

    public void retiroOegresoEstudiante(int idEstudiante);

    public void modificarDatosEstudiante(EstudianteDTO estudianteMod, int idEstudiante);

    public void promocionEstudiantes(int idEstudiante);

    public EstudianteDTO consultarEstudiante(int idEstudiante);

    public EstudianteDTO consultarEstudiantePorDocumento(int numeroDocumento, String documento);

    public ArrayList<EstudianteDTO> consultarEstudiantePorNombre(String nombre); //o nombreEstudiante

    public ArrayList<EstudianteDTO> consultarEstudiantePorGrupo(int idGrupo);

    public ArrayList<EstudianteDTO> consultarEstudiantePorGrado(int idGrado);

    public ArrayList<EstudianteDTO> traerListaEstudiantes();

}
