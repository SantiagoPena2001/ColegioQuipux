/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager;

import co.com.quipux.colegioquipux.models.dto.GrupoDTO;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public interface GrupoManager {

    public void registrarGrupo(GrupoDTO grupo);

    public void eliminarGrupo(int idGrupo);

    public void cambiarProfesor(int idGrupo, int idProfesor); //idProfesor o idProfesorNuevo

    public GrupoDTO consultarGrupo(int idGrupo);

    public GrupoDTO consultarGrupoPorProfesor(int idProfesor);

    public ArrayList<GrupoDTO> consultarGrupoPorGrado(int idGrado);

    public ArrayList<GrupoDTO> traerListaGrupos();
}
