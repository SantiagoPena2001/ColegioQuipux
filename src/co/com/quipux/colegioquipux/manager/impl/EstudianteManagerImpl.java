/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.EstudianteDaoImpl;
import co.com.quipux.colegioquipux.manager.EstudianteManager;
import co.com.quipux.colegioquipux.models.dto.EstudianteDTO;
import co.com.quipux.colegioquipux.models.entity.EstudianteEntity;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author familia peña
 */
public class EstudianteManagerImpl implements EstudianteManager {

    EstudianteDaoImpl estudianteDao = new EstudianteDaoImpl();

    @Override
    public void registrarEstudiante(EstudianteDTO estudiante) {

        EstudianteEntity estudianteEntity = new EstudianteEntity();

        estudianteEntity.setApellidos(estudiante.getApellidos());
        estudianteEntity.setAño(estudiante.getAño());
        estudianteEntity.setCiudadResidencia(estudiante.getCiudadResidencia());
        estudianteEntity.setCorreo(estudiante.getCorreo());
        estudianteEntity.setDireccionResidencia(estudiante.getDireccionResidencia());
        estudianteEntity.setEstado(estudiante.getEstado());
        estudianteEntity.setFechaNacimiento(estudiante.getFechaNacimiento());
        estudianteEntity.setIdEstudiante(estudiante.getIdEstudiante());
        estudianteEntity.setIdGrado(estudiante.getIdGrado());
        estudianteEntity.setIdGrupo(estudiante.getIdGrupo());
        estudianteEntity.setNombre(estudiante.getNombre());
        estudianteEntity.setNotaPromedio(estudiante.getNotaPromedio());
        estudianteEntity.setNumeroDocumento(estudiante.getNumeroDocumento());
        estudianteEntity.setSexo(estudiante.getSexo());
        estudianteEntity.setTelefonoCelular(estudiante.getTelefonoCelular());
        estudianteEntity.setTelefonoResidencia(estudiante.getTelefonoResidencia());
        estudianteEntity.setTipoDocumento(estudiante.getTipoDocumento());

        if (estudianteDao.consultarEstudiantePorDocumento(estudianteEntity.getNumeroDocumento(), estudianteEntity.getTipoDocumento()) != null) {
            JOptionPane.showMessageDialog(null, "El estudiante ya esta registrado");
        } else {
            estudianteDao.registrarEstudiante(estudianteEntity);
            JOptionPane.showMessageDialog(null, "Se ha registrado el estudiante");
        }

    }

    @Override
    public void retiroOegresoEstudiante(int idEstudiante) {
        estudianteDao.retiroOegresoEstudiante(idEstudiante);
    }

    @Override
    public void modificarDatosEstudiante(EstudianteDTO estudianteMod, int idEstudiante) {

        EstudianteEntity estudianteEntity = new EstudianteEntity();

        estudianteEntity.setApellidos(estudianteMod.getApellidos());
        estudianteEntity.setAño(estudianteMod.getAño());
        estudianteEntity.setCiudadResidencia(estudianteMod.getCiudadResidencia());
        estudianteEntity.setCorreo(estudianteMod.getCorreo());
        estudianteEntity.setDireccionResidencia(estudianteMod.getDireccionResidencia());
        estudianteEntity.setEstado(estudianteMod.getEstado());
        estudianteEntity.setFechaNacimiento(estudianteMod.getFechaNacimiento());
        estudianteEntity.setIdEstudiante(estudianteMod.getIdEstudiante());
        estudianteEntity.setIdGrado(estudianteMod.getIdGrado());
        estudianteEntity.setIdGrupo(estudianteMod.getIdGrupo());
        estudianteEntity.setNombre(estudianteMod.getNombre());
        estudianteEntity.setNotaPromedio(estudianteMod.getNotaPromedio());
        estudianteEntity.setNumeroDocumento(estudianteMod.getNumeroDocumento());
        estudianteEntity.setSexo(estudianteMod.getSexo());
        estudianteEntity.setTelefonoCelular(estudianteMod.getTelefonoCelular());
        estudianteEntity.setTelefonoResidencia(estudianteMod.getTelefonoResidencia());
        estudianteEntity.setTipoDocumento(estudianteMod.getTipoDocumento());

        estudianteDao.modificarDatosEstudiante(estudianteEntity, idEstudiante);

    }

    @Override
    public void promocionEstudiantes(int idEstudiante) {
        estudianteDao.promocionEstudiantes(idEstudiante);
    }

    @Override
    public EstudianteDTO consultarEstudiante(int idEstudiante) {

        EstudianteEntity estudiante = new EstudianteEntity();
        estudiante = estudianteDao.consultarEstudiante(idEstudiante);
        if (estudiante != null) {
            EstudianteDTO estudianteD = new EstudianteDTO();
            estudianteD.setApellidos(estudiante.getApellidos());
            estudianteD.setAño(estudiante.getAño());
            estudianteD.setCiudadResidencia(estudiante.getCiudadResidencia());
            estudianteD.setCorreo(estudiante.getCorreo());
            estudianteD.setDireccionResidencia(estudiante.getDireccionResidencia());
            estudianteD.setEstado(estudiante.getEstado());
            estudianteD.setFechaNacimiento(estudiante.getFechaNacimiento());
            estudianteD.setIdEstudiante(estudiante.getIdEstudiante());
            estudianteD.setIdGrado(estudiante.getIdGrado());
            estudianteD.setIdGrupo(estudiante.getIdGrupo());
            estudianteD.setNombre(estudiante.getNombre());
            estudianteD.setNotaPromedio(estudiante.getNotaPromedio());
            estudianteD.setNumeroDocumento(estudiante.getNumeroDocumento());
            estudianteD.setSexo(estudiante.getSexo());
            estudianteD.setTelefonoCelular(estudiante.getTelefonoCelular());
            estudianteD.setTelefonoResidencia(estudiante.getTelefonoResidencia());
            estudianteD.setTipoDocumento(estudiante.getTipoDocumento());

            return estudianteD;
        } else {
            return null;
        }

    }

    @Override
    public EstudianteDTO consultarEstudiantePorDocumento(int numeroDocumento, String documento) {

        EstudianteEntity estudiante = new EstudianteEntity();
        estudiante = estudianteDao.consultarEstudiantePorDocumento(numeroDocumento, documento);
        if (estudiante != null) {
            EstudianteDTO estudianteD = new EstudianteDTO();
            estudianteD.setApellidos(estudiante.getApellidos());
            estudianteD.setAño(estudiante.getAño());
            estudianteD.setCiudadResidencia(estudiante.getCiudadResidencia());
            estudianteD.setCorreo(estudiante.getCorreo());
            estudianteD.setDireccionResidencia(estudiante.getDireccionResidencia());
            estudianteD.setEstado(estudiante.getEstado());
            estudianteD.setFechaNacimiento(estudiante.getFechaNacimiento());
            estudianteD.setIdEstudiante(estudiante.getIdEstudiante());
            estudianteD.setIdGrado(estudiante.getIdGrado());
            estudianteD.setIdGrupo(estudiante.getIdGrupo());
            estudianteD.setNombre(estudiante.getNombre());
            estudianteD.setNotaPromedio(estudiante.getNotaPromedio());
            estudianteD.setNumeroDocumento(estudiante.getNumeroDocumento());
            estudianteD.setSexo(estudiante.getSexo());
            estudianteD.setTelefonoCelular(estudiante.getTelefonoCelular());
            estudianteD.setTelefonoResidencia(estudiante.getTelefonoResidencia());
            estudianteD.setTipoDocumento(estudiante.getTipoDocumento());

            return estudianteD;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<EstudianteDTO> consultarEstudiantePorNombre(String nombre) {

        ArrayList<EstudianteDTO> listaEstudiantesDtoNom = new ArrayList<EstudianteDTO>();
        ArrayList<EstudianteEntity> listaEstudantesEntity = new ArrayList<EstudianteEntity>();
        listaEstudantesEntity = estudianteDao.consultarEstudiantePorNombre(nombre);
        for (EstudianteEntity estudiante : listaEstudantesEntity) {
            EstudianteDTO estudianteD = new EstudianteDTO();
            estudianteD.setApellidos(estudiante.getApellidos());
            estudianteD.setAño(estudiante.getAño());
            estudianteD.setCiudadResidencia(estudiante.getCiudadResidencia());
            estudianteD.setCorreo(estudiante.getCorreo());
            estudianteD.setDireccionResidencia(estudiante.getDireccionResidencia());
            estudianteD.setEstado(estudiante.getEstado());
            estudianteD.setFechaNacimiento(estudiante.getFechaNacimiento());
            estudianteD.setIdEstudiante(estudiante.getIdEstudiante());
            estudianteD.setIdGrado(estudiante.getIdGrado());
            estudianteD.setIdGrupo(estudiante.getIdGrupo());
            estudianteD.setNombre(estudiante.getNombre());
            estudianteD.setNotaPromedio(estudiante.getNotaPromedio());
            estudianteD.setNumeroDocumento(estudiante.getNumeroDocumento());
            estudianteD.setSexo(estudiante.getSexo());
            estudianteD.setTelefonoCelular(estudiante.getTelefonoCelular());
            estudianteD.setTelefonoResidencia(estudiante.getTelefonoResidencia());
            estudianteD.setTipoDocumento(estudiante.getTipoDocumento());
            listaEstudiantesDtoNom.add(estudianteD);
        }
        return listaEstudiantesDtoNom;
    }

    @Override
    public ArrayList<EstudianteDTO> consultarEstudiantePorGrupo(int idGrupo) {

        ArrayList<EstudianteDTO> listaEstudiantesDtoGrupo = new ArrayList<EstudianteDTO>();
        ArrayList<EstudianteEntity> listaEstudantesEntity = new ArrayList<EstudianteEntity>();
        listaEstudantesEntity = estudianteDao.consultarEstudiantePorGrupo(idGrupo);
        for (EstudianteEntity estudiante : listaEstudantesEntity) {
            EstudianteDTO estudianteD = new EstudianteDTO();
            estudianteD.setApellidos(estudiante.getApellidos());
            estudianteD.setAño(estudiante.getAño());
            estudianteD.setCiudadResidencia(estudiante.getCiudadResidencia());
            estudianteD.setCorreo(estudiante.getCorreo());
            estudianteD.setDireccionResidencia(estudiante.getDireccionResidencia());
            estudianteD.setEstado(estudiante.getEstado());
            estudianteD.setFechaNacimiento(estudiante.getFechaNacimiento());
            estudianteD.setIdEstudiante(estudiante.getIdEstudiante());
            estudianteD.setIdGrado(estudiante.getIdGrado());
            estudianteD.setIdGrupo(estudiante.getIdGrupo());
            estudianteD.setNombre(estudiante.getNombre());
            estudianteD.setNotaPromedio(estudiante.getNotaPromedio());
            estudianteD.setNumeroDocumento(estudiante.getNumeroDocumento());
            estudianteD.setSexo(estudiante.getSexo());
            estudianteD.setTelefonoCelular(estudiante.getTelefonoCelular());
            estudianteD.setTelefonoResidencia(estudiante.getTelefonoResidencia());
            estudianteD.setTipoDocumento(estudiante.getTipoDocumento());
            listaEstudiantesDtoGrupo.add(estudianteD);
        }
        return listaEstudiantesDtoGrupo;

    }

    @Override
    public ArrayList<EstudianteDTO> consultarEstudiantePorGrado(int idGrado) {

        ArrayList<EstudianteDTO> listaEstudiantesDtoGrado = new ArrayList<EstudianteDTO>();
        ArrayList<EstudianteEntity> listaEstudantesEntity = new ArrayList<EstudianteEntity>();
        listaEstudantesEntity = estudianteDao.consultarEstudiantePorGrado(idGrado);
        for (EstudianteEntity estudiante : listaEstudantesEntity) {
            EstudianteDTO estudianteD = new EstudianteDTO();
            estudianteD.setApellidos(estudiante.getApellidos());
            estudianteD.setAño(estudiante.getAño());
            estudianteD.setCiudadResidencia(estudiante.getCiudadResidencia());
            estudianteD.setCorreo(estudiante.getCorreo());
            estudianteD.setDireccionResidencia(estudiante.getDireccionResidencia());
            estudianteD.setEstado(estudiante.getEstado());
            estudianteD.setFechaNacimiento(estudiante.getFechaNacimiento());
            estudianteD.setIdEstudiante(estudiante.getIdEstudiante());
            estudianteD.setIdGrado(estudiante.getIdGrado());
            estudianteD.setIdGrupo(estudiante.getIdGrupo());
            estudianteD.setNombre(estudiante.getNombre());
            estudianteD.setNotaPromedio(estudiante.getNotaPromedio());
            estudianteD.setNumeroDocumento(estudiante.getNumeroDocumento());
            estudianteD.setSexo(estudiante.getSexo());
            estudianteD.setTelefonoCelular(estudiante.getTelefonoCelular());
            estudianteD.setTelefonoResidencia(estudiante.getTelefonoResidencia());
            estudianteD.setTipoDocumento(estudiante.getTipoDocumento());
            listaEstudiantesDtoGrado.add(estudianteD);
        }
        return listaEstudiantesDtoGrado;

    }

    @Override
    public ArrayList<EstudianteDTO> traerListaEstudiantes() {

        ArrayList<EstudianteDTO> listaEstudiantesDto = new ArrayList<EstudianteDTO>();
        ArrayList<EstudianteEntity> listaEstudantesEntity = new ArrayList<EstudianteEntity>();
        listaEstudantesEntity = estudianteDao.traerListaEstudiantes();
        for (EstudianteEntity estudiante : listaEstudantesEntity) {
            EstudianteDTO estudianteD = new EstudianteDTO();
            estudianteD.setApellidos(estudiante.getApellidos());
            estudianteD.setAño(estudiante.getAño());
            estudianteD.setCiudadResidencia(estudiante.getCiudadResidencia());
            estudianteD.setCorreo(estudiante.getCorreo());
            estudianteD.setDireccionResidencia(estudiante.getDireccionResidencia());
            estudianteD.setEstado(estudiante.getEstado());
            estudianteD.setFechaNacimiento(estudiante.getFechaNacimiento());
            estudianteD.setIdEstudiante(estudiante.getIdEstudiante());
            estudianteD.setIdGrado(estudiante.getIdGrado());
            estudianteD.setIdGrupo(estudiante.getIdGrupo());
            estudianteD.setNombre(estudiante.getNombre());
            estudianteD.setNotaPromedio(estudiante.getNotaPromedio());
            estudianteD.setNumeroDocumento(estudiante.getNumeroDocumento());
            estudianteD.setSexo(estudiante.getSexo());
            estudianteD.setTelefonoCelular(estudiante.getTelefonoCelular());
            estudianteD.setTelefonoResidencia(estudiante.getTelefonoResidencia());
            estudianteD.setTipoDocumento(estudiante.getTipoDocumento());
            listaEstudiantesDto.add(estudianteD);
        }
        return listaEstudiantesDto;

    }

}
