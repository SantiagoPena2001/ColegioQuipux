/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.ProfesorDaoImpl;
import co.com.quipux.colegioquipux.manager.ProfesorManager;
import co.com.quipux.colegioquipux.models.dto.ProfesorDTO;
import co.com.quipux.colegioquipux.models.entity.ProfesorEntity;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Verde
 */
public class ProfesorManagerImpl implements ProfesorManager {

    ProfesorDaoImpl profesorDao = new ProfesorDaoImpl();

    @Override
    public void registrarProfesor(ProfesorDTO profesor) {

        ProfesorEntity profesorEntity = new ProfesorEntity();

        profesorEntity.setIdProfesor(profesor.getIdProfesor());
        profesorEntity.setNombre(profesor.getNombre());
        profesorEntity.setApellidos(profesor.getApellidos());
        profesorEntity.setDocumento(profesor.getDocumento());
        profesorEntity.setCorreo(profesor.getCorreo());
        profesorEntity.setIdDocumento(profesor.getIdDocumento());

        if (profesorDao.consultarProfesorPorDocumento(profesorEntity.getIdDocumento(), profesorEntity.getDocumento()) != null) {
            JOptionPane.showMessageDialog(null, "El profesor ya esta registrado");
        } else {
            profesorDao.registrarProfesor(profesorEntity);
            JOptionPane.showMessageDialog(null, "Se ha registrado el profesor");

        }

    }

    @Override
    public ArrayList<ProfesorDTO> traerLista() {
        ArrayList<ProfesorDTO> listaProfesorDTO = new ArrayList<ProfesorDTO>();
        ArrayList<ProfesorEntity> listaProfesorEntity = new ArrayList<ProfesorEntity>();
        listaProfesorEntity = profesorDao.traerListaProfesores();
        for (ProfesorEntity profesor : listaProfesorEntity) {
            ProfesorDTO profesord = new ProfesorDTO();
            profesord.setNombre(profesor.getNombre());
            profesord.setApellidos(profesor.getApellidos());
            profesord.setDocumento(profesor.getDocumento());
            profesord.setIdDocumento(profesor.getIdDocumento());
            profesord.setCorreo(profesor.getCorreo());
            profesord.setIdProfesor(profesor.getIdProfesor());
            listaProfesorDTO.add(profesord);
        }
        return listaProfesorDTO;
    }

    @Override
    public void eliminarProfesor(int idProfesor) {
        profesorDao.eliminarProfesor(idProfesor);
    }

    @Override
    public ProfesorDTO consultarProfesor(int idProfesor) {
        ProfesorEntity profesor = new ProfesorEntity();
        profesor = profesorDao.consultarProfesor(idProfesor);
        if (profesor != null) {
            ProfesorDTO profesord = new ProfesorDTO();
            profesord.setNombre(profesor.getNombre());
            profesord.setApellidos(profesor.getApellidos());
            profesord.setDocumento(profesor.getDocumento());
            profesord.setIdDocumento(profesor.getIdDocumento());
            profesord.setCorreo(profesor.getCorreo());
            profesord.setIdProfesor(profesor.getIdProfesor());
            return profesord;
        } else {
            return null;
        }

    }

    @Override
    public ProfesorDTO consultarProfesorPorDocumento(int idDocumento, String documento) {
        ProfesorEntity profesor = new ProfesorEntity();
        profesor = profesorDao.consultarProfesorPorDocumento(idDocumento, documento);
        if (profesor != null) {
            ProfesorDTO profesord = new ProfesorDTO();
            profesord.setNombre(profesor.getNombre());
            profesord.setApellidos(profesor.getApellidos());
            profesord.setDocumento(profesor.getDocumento());
            profesord.setIdDocumento(profesor.getIdDocumento());
            profesord.setCorreo(profesor.getCorreo());
            profesord.setIdProfesor(profesor.getIdProfesor());
            return profesord;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<ProfesorDTO> consultarProfesorPorNombre(String nombreProfesor) {
        ArrayList<ProfesorDTO> listaProfesorDTO = new ArrayList<ProfesorDTO>();
        ArrayList<ProfesorEntity> listaProfesorEntity = new ArrayList<ProfesorEntity>();
        listaProfesorEntity = profesorDao.consultarProfesorPorNombre(nombreProfesor);
        for (ProfesorEntity profesor : listaProfesorEntity) {
            ProfesorDTO profesord = new ProfesorDTO();
            profesord.setNombre(profesor.getNombre());
            profesord.setApellidos(profesor.getApellidos());
            profesord.setDocumento(profesor.getDocumento());
            profesord.setIdDocumento(profesor.getIdDocumento());
            profesord.setCorreo(profesor.getCorreo());
            profesord.setIdProfesor(profesor.getIdProfesor());
            listaProfesorDTO.add(profesord);
        }
        return listaProfesorDTO;
    }

    @Override
    public ProfesorDTO consultarProfesorLogin(String correo, int numeroDocumento) {
        ProfesorEntity profesor = new ProfesorEntity();
        profesor = profesorDao.consultarProfesorLogin(correo, numeroDocumento);
        if (profesor != null) {
            ProfesorDTO profesord = new ProfesorDTO();
            profesord.setNombre(profesor.getNombre());
            profesord.setApellidos(profesor.getApellidos());
            profesord.setDocumento(profesor.getDocumento());
            profesord.setIdDocumento(profesor.getIdDocumento());
            profesord.setCorreo(profesor.getCorreo());
            profesord.setIdProfesor(profesor.getIdProfesor());
            return profesord;
        } else {
            return null;
        }
    }

}
