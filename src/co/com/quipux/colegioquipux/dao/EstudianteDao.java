/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.EstudianteEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface EstudianteDao {

    public void registrarEstudiante(EstudianteEntity estudiante);

    public void retiroOegresoEstudiante(int idEstudiante);

    public void modificarDatosEstudiante(EstudianteEntity estudianteMod, int idEstudiante);

    public void promocionEstudiantes(int idEstudiante);

    public EstudianteEntity consultarEstudiante(int idEstudiante);
    
    public EstudianteEntity consultarEstudiantePorDocumento(int numeroDocumento, String documento);

    public ArrayList<EstudianteEntity> consultarEstudiantePorNombre(String nombre); //o nombreEstudiante

    public ArrayList<EstudianteEntity> consultarEstudiantePorGrupo(int idGrupo);

    public ArrayList<EstudianteEntity> consultarEstudiantePorGrado(int idGrado);

    public ArrayList<EstudianteEntity> traerListaEstudiantes();

    public EstudianteEntity consultarEstudianteLogin(String correo, int numeroDocumento);

}
