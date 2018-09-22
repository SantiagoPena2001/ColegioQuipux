/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.GrupoEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface GrupoDao {

    public void registrarGrupo(GrupoEntity grupo);

    public void eliminarGrupo(int idGrupo);

    public void cambiarProfesor(int idGrupo, int idProfesor); //idProfesor o idProfesorNuevo

    public GrupoEntity consultarGrupo(int idGrupo);

    public GrupoEntity consultarGrupoPorProfesor(int idProfesor);
    
    public GrupoEntity consultarGrupoV(int idGrupo ,int idGrado);

    public ArrayList<GrupoEntity> consultarGrupoPorGrado(int idGrado);

    public ArrayList<GrupoEntity> traerListaGrupos();

}
