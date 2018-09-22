/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.GrupoDao;
import co.com.quipux.colegioquipux.models.entity.GrupoEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public class GrupoDaoImpl implements GrupoDao {

    private ArrayList<GrupoEntity> listaGrupos = new ArrayList<GrupoEntity>();
    int x = 0;

    @Override
    public void registrarGrupo(GrupoEntity grupo) {
        x++;
        grupo.setIdGrupo(x);
        listaGrupos.add(grupo);
    }

    @Override
    public void eliminarGrupo(int idGrupo) {
        int x = -1, encontrado = 0;
        for (GrupoEntity grupo : listaGrupos) {
            x++;
            if (grupo.getIdGrupo() == idGrupo) {
                encontrado = x;
                break;
            }
        }
        listaGrupos.remove(encontrado);
    }

    @Override
    public void cambiarProfesor(int idGrupo, int idProfesor) {
        int x = -1, encontrado = 0;
        GrupoEntity grupoe = new GrupoEntity();
        for (GrupoEntity grupo : listaGrupos) {
            x++;
            if (grupo.getIdGrupo() == idGrupo) {
                encontrado = x;
                grupo.setIdProfesor(idProfesor);
                grupoe = grupo;
                break;
            }
        }
        listaGrupos.set(encontrado, grupoe);

    }

    @Override
    public GrupoEntity consultarGrupo(int idGrupo) {
        for (GrupoEntity grupo : listaGrupos) {
            if (grupo.getIdGrupo() == idGrupo) {
                return grupo;
            }
        }
        return null;
    }

    @Override
    public ArrayList<GrupoEntity> consultarGrupoPorGrado(int idGrado) {

        ArrayList<GrupoEntity> listaGrupoGrado = new ArrayList<GrupoEntity>();

        for (GrupoEntity grupo : listaGrupos) {
            if (grupo.getIdGrado()== idGrado) {
                listaGrupoGrado.add(grupo);
            }
        }

        return listaGrupoGrado;

    }

    @Override
    public ArrayList<GrupoEntity> traerListaGrupos() {

        return listaGrupos;

    }

    @Override
    public GrupoEntity consultarGrupoPorProfesor(int idProfesor) {

        for (GrupoEntity grupo : listaGrupos) {
            if (grupo.getIdProfesor() == idProfesor) {
                return grupo;
            }
        }
        return null;
    }

    @Override
    public GrupoEntity consultarGrupoV(int idGrupo, int idGrado) {
        for (GrupoEntity grupo : listaGrupos) {
            if (grupo.getIdGrupo() == idGrupo && grupo.getIdGrado() == idGrado) {
                return grupo;
            }
        }
        return null;

    }
}
