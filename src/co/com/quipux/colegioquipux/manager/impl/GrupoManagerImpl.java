/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.GrupoDaoImpl;
import co.com.quipux.colegioquipux.manager.GrupoManager;
import co.com.quipux.colegioquipux.models.dto.GrupoDTO;
import co.com.quipux.colegioquipux.models.entity.GrupoEntity;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author familia peña
 */
public class GrupoManagerImpl implements GrupoManager {

    GrupoDaoImpl grupoDao = new GrupoDaoImpl();

    @Override
    public void registrarGrupo(GrupoDTO grupo) {

        GrupoEntity grupoEntity = new GrupoEntity();

        grupoEntity.setIdGrado(grupo.getIdGrado());
        grupoEntity.setIdGrupo(grupo.getIdGrupo());
        grupoEntity.setIdProfesor(grupo.getIdProfesor());
        grupoEntity.setJornada(grupo.getJornada());

        if (grupoDao.consultarGrupoV(grupoEntity.getIdGrupo(), grupoEntity.getIdGrado()) != null && grupoDao.consultarGrupoPorProfesor(grupoEntity.getIdProfesor()) != null) {
            JOptionPane.showMessageDialog(null, "El grupo ya esta registrado o el profesor ya tiene un grupo");
        } else {
            grupoDao.registrarGrupo(grupoEntity);
            JOptionPane.showMessageDialog(null, "Se ha registrado el grupo");
        }

    }

    @Override
    public void eliminarGrupo(int idGrupo) {
        grupoDao.eliminarGrupo(idGrupo);
    }

    @Override
    public void cambiarProfesor(int idGrupo, int idProfesor) {

        grupoDao.cambiarProfesor(idGrupo, idProfesor);

    }

    @Override
    public GrupoDTO consultarGrupo(int idGrupo) {
        GrupoEntity grupo = new GrupoEntity();
        grupo = grupoDao.consultarGrupo(idGrupo);
        if (grupo != null) {
            GrupoDTO grupoD = new GrupoDTO();
            grupoD.setIdGrado(grupo.getIdGrado());
            grupoD.setIdGrupo(grupo.getIdGrupo());
            grupoD.setIdProfesor(grupo.getIdProfesor());
            grupoD.setJornada(grupo.getJornada());
            return grupoD;
        } else {
            return null;
        }

    }

    @Override
    public GrupoDTO consultarGrupoPorProfesor(int idProfesor) {

        GrupoEntity grupo = new GrupoEntity();
        grupo = grupoDao.consultarGrupoPorProfesor(idProfesor);
        if (grupo != null) {
            GrupoDTO grupoD = new GrupoDTO();
            grupoD.setIdGrado(grupo.getIdGrado());
            grupoD.setIdGrupo(grupo.getIdGrupo());
            grupoD.setIdProfesor(grupo.getIdProfesor());
            grupoD.setJornada(grupo.getJornada());
            return grupoD;
        } else {
            return null;
        }

    }

    @Override
    public ArrayList<GrupoDTO> consultarGrupoPorGrado(int idGrado) {

        ArrayList<GrupoDTO> listaGrupoDtoGrado = new ArrayList<GrupoDTO>();
        ArrayList<GrupoEntity> listaGrupoEntity = new ArrayList<GrupoEntity>();
        listaGrupoEntity = grupoDao.consultarGrupoPorGrado(idGrado);
        for (GrupoEntity grupo : listaGrupoEntity) {
            GrupoDTO grupoD = new GrupoDTO();
            grupoD.setIdGrado(grupo.getIdGrado());
            grupoD.setIdGrupo(grupo.getIdGrupo());
            grupoD.setIdProfesor(grupo.getIdProfesor());
            grupoD.setJornada(grupo.getJornada());
            listaGrupoDtoGrado.add(grupoD);
        }
        return listaGrupoDtoGrado;

    }

    @Override
    public ArrayList<GrupoDTO> traerListaGrupos() {
        ArrayList<GrupoDTO> listaGrupoDto = new ArrayList<GrupoDTO>();
        ArrayList<GrupoEntity> listaGrupoEntity = new ArrayList<GrupoEntity>();
        listaGrupoEntity = grupoDao.traerListaGrupos();
        for (GrupoEntity grupo : listaGrupoEntity) {
            GrupoDTO grupoD = new GrupoDTO();
            grupoD.setIdGrado(grupo.getIdGrado());
            grupoD.setIdGrupo(grupo.getIdGrupo());
            grupoD.setIdProfesor(grupo.getIdProfesor());
            grupoD.setJornada(grupo.getJornada());
            listaGrupoDto.add(grupoD);
        }
        return listaGrupoDto;
    }

}
