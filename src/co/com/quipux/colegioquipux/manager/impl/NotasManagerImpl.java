/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.NotasDaoImpl;
import co.com.quipux.colegioquipux.manager.NotasManager;
import co.com.quipux.colegioquipux.models.dto.NotasDTO;
import co.com.quipux.colegioquipux.models.entity.NotasEntity;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author familia peña
 */
public class NotasManagerImpl implements NotasManager {

    NotasDaoImpl notasDao = new NotasDaoImpl();

    @Override
    public void registrarNota(NotasDTO nota) {

        NotasEntity notaEntity = new NotasEntity();

        notaEntity.setIdNota(nota.getIdNota());
        notaEntity.setDescripcionNota(nota.getDescripcionNota());
        notaEntity.setIdEstudiante(nota.getIdEstudiante());
        notaEntity.setIdMateria(nota.getIdMateria());
        notaEntity.setIdDescripcionPlan(nota.getIdDescripcionPlan());
        notaEntity.setNombreNota(nota.getNombreNota());
        notaEntity.setNota(nota.getNota());

        if (notasDao.consultarNotaV(notaEntity.getIdEstudiante(), notaEntity.getNombreNota()) != null) {
            JOptionPane.showMessageDialog(null, "La nota ya esta registrada");
        } else {
            notasDao.registrarNota(notaEntity);
            JOptionPane.showMessageDialog(null, "Se ha registrado la nota");
        }

    }

    @Override
    public void eliminarNota(int idNota) {

        notasDao.eliminarNota(idNota);
    }

    @Override
    public void ModificarNota(int idNota, int nota) {
        notasDao.ModificarNota(idNota, nota);
    }

    @Override
    public NotasDTO consultarNota(int idNota) {

        NotasEntity nota = new NotasEntity();
        nota = notasDao.consultarNota(idNota);
        if (nota != null) {
            NotasDTO notaD = new NotasDTO();
            notaD.setIdNota(nota.getIdNota());
            notaD.setDescripcionNota(nota.getDescripcionNota());
            notaD.setIdEstudiante(nota.getIdEstudiante());
            notaD.setIdMateria(nota.getIdMateria());
            notaD.setIdDescripcionPlan(nota.getIdDescripcionPlan());
            notaD.setNombreNota(nota.getNombreNota());
            notaD.setNota(nota.getNota());
            return notaD;
        } else {
            return null;
        }

    }

    @Override
    public ArrayList<NotasDTO> traerListaNotas() {

        ArrayList<NotasDTO> listaNotasDTO = new ArrayList<NotasDTO>();
        ArrayList<NotasEntity> listaNotasEntity = new ArrayList<NotasEntity>();
        listaNotasEntity = notasDao.traerListaNotas();
        for (NotasEntity nota : listaNotasEntity) {
            NotasDTO notaD = new NotasDTO();
            notaD.setIdNota(nota.getIdNota());
            notaD.setDescripcionNota(nota.getDescripcionNota());
            notaD.setIdEstudiante(nota.getIdEstudiante());
            notaD.setIdMateria(nota.getIdMateria());
            notaD.setIdDescripcionPlan(nota.getIdDescripcionPlan());
            notaD.setNombreNota(nota.getNombreNota());
            notaD.setNota(nota.getNota());
            listaNotasDTO.add(notaD);
        }
        return listaNotasDTO;
    }

    @Override
    public ArrayList<NotasDTO> consultarNotasPorEstudiante(int idEstudiante) {

        ArrayList<NotasDTO> listaNotasDTOEstu = new ArrayList<NotasDTO>();
        ArrayList<NotasEntity> listaNotasEntity = new ArrayList<NotasEntity>();
        listaNotasEntity = notasDao.consultarNotasPorEstudiante(idEstudiante);
        for (NotasEntity nota : listaNotasEntity) {
            NotasDTO notaD = new NotasDTO();
            notaD.setIdNota(nota.getIdNota());
            notaD.setDescripcionNota(nota.getDescripcionNota());
            notaD.setIdEstudiante(nota.getIdEstudiante());
            notaD.setIdMateria(nota.getIdMateria());
            notaD.setIdDescripcionPlan(nota.getIdDescripcionPlan());
            notaD.setNombreNota(nota.getNombreNota());
            notaD.setNota(nota.getNota());
            listaNotasDTOEstu.add(notaD);
        }
        return listaNotasDTOEstu;

    }

    @Override
    public ArrayList<NotasDTO> consultarNotasPorMateria(String idMateria) {
        ArrayList<NotasDTO> listaNotasDTOMat = new ArrayList<NotasDTO>();
        ArrayList<NotasEntity> listaNotasEntity = new ArrayList<NotasEntity>();
        listaNotasEntity = notasDao.consultarNotasPorMateria(idMateria);
        for (NotasEntity nota : listaNotasEntity) {
            NotasDTO notaD = new NotasDTO();
            notaD.setIdNota(nota.getIdNota());
            notaD.setDescripcionNota(nota.getDescripcionNota());
            notaD.setIdEstudiante(nota.getIdEstudiante());
            notaD.setIdMateria(nota.getIdMateria());
            notaD.setIdDescripcionPlan(nota.getIdDescripcionPlan());
            notaD.setNombreNota(nota.getNombreNota());
            notaD.setNota(nota.getNota());
            listaNotasDTOMat.add(notaD);
        }
        return listaNotasDTOMat;

    }

    @Override
    public ArrayList<NotasDTO> consultarNotasporDescripcionPlan(int idDescripcionPlan) {

        ArrayList<NotasDTO> listaNotasDTODescripcion = new ArrayList<NotasDTO>();
        ArrayList<NotasEntity> listaNotasEntity = new ArrayList<NotasEntity>();
        listaNotasEntity = notasDao.consultarNotasporDescripcionPlan(idDescripcionPlan);
        for (NotasEntity nota : listaNotasEntity) {
            NotasDTO notaD = new NotasDTO();
            notaD.setIdNota(nota.getIdNota());
            notaD.setDescripcionNota(nota.getDescripcionNota());
            notaD.setIdEstudiante(nota.getIdEstudiante());
            notaD.setIdMateria(nota.getIdMateria());
            notaD.setIdDescripcionPlan(nota.getIdDescripcionPlan());
            notaD.setNombreNota(nota.getNombreNota());
            notaD.setNota(nota.getNota());
            listaNotasDTODescripcion.add(notaD);
        }
        return listaNotasDTODescripcion;

    }

    @Override
    public ArrayList<NotasDTO> consultarNotasPorNombre(String nombreNota) {

        ArrayList<NotasDTO> listaNotasDTONom = new ArrayList<NotasDTO>();
        ArrayList<NotasEntity> listaNotasEntity = new ArrayList<NotasEntity>();
        listaNotasEntity = notasDao.consultarNotasPorNombre(nombreNota);
        for (NotasEntity nota : listaNotasEntity) {
            NotasDTO notaD = new NotasDTO();
            notaD.setIdNota(nota.getIdNota());
            notaD.setDescripcionNota(nota.getDescripcionNota());
            notaD.setIdEstudiante(nota.getIdEstudiante());
            notaD.setIdMateria(nota.getIdMateria());
            notaD.setIdDescripcionPlan(nota.getIdDescripcionPlan());
            notaD.setNombreNota(nota.getNombreNota());
            notaD.setNota(nota.getNota());
            listaNotasDTONom.add(notaD);
        }
        return listaNotasDTONom;
    }

}
