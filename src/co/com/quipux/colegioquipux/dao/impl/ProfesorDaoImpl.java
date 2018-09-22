/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.models.entity.ProfesorEntity;
import java.util.ArrayList;
import co.com.quipux.colegioquipux.dao.ProfesorDao;

/**
 *
 * @author salim.castellanos
 */
public class ProfesorDaoImpl implements ProfesorDao {

    private ArrayList<ProfesorEntity> listaProfesores = new ArrayList<ProfesorEntity>();
    int x = 0;
    @Override
    public void registrarProfesor(ProfesorEntity profesor) {
        x++;
        profesor.setIdProfesor(x);
        listaProfesores.add(profesor);
    }

    @Override
    public void eliminarProfesor(int idProfesor) {
        int x = -1, encontrado = 0;
        for (ProfesorEntity profesor : listaProfesores) {
            x++;
            if (profesor.getIdProfesor() == idProfesor) {
                encontrado = x;
                break;
            }
        }
        listaProfesores.remove(encontrado);
    }

    @Override
    public ProfesorEntity consultarProfesor(int idProfesor) {
        for (ProfesorEntity profesor : listaProfesores) {
            if (profesor.getIdProfesor() == idProfesor) {
                return profesor;
            }
        }
        return null;

    }

    @Override
    public ProfesorEntity consultarProfesorPorDocumento(int idDocumento, String documento) {
        for (ProfesorEntity profesor : listaProfesores) {
            if (profesor.getIdDocumento() == idDocumento && profesor.getDocumento().equals(documento)) {
                return profesor;
            }
        }
        return null;

    }

    @Override
    public ArrayList<ProfesorEntity> consultarProfesorPorNombre(String nombreProfesor) {
        ArrayList<ProfesorEntity> listaProfesorNombre = new ArrayList<ProfesorEntity>();

        for (ProfesorEntity profesor : listaProfesores) {
            if (profesor.getNombre().equals(nombreProfesor)) {
                listaProfesorNombre.add(profesor);
            }
        }

        return listaProfesorNombre;
    }

    @Override
    public ArrayList<ProfesorEntity> traerListaProfesores() {

        return listaProfesores;

    }

    @Override
    public ProfesorEntity consultarProfesorLogin(String correo, int numeroDocumento) {

        for (ProfesorEntity profesor : listaProfesores) {
            if (profesor.getCorreo().equals(correo) && profesor.getDocumento().equals(numeroDocumento)) {
                return profesor;
            }
        }
        return null;

    }

}
