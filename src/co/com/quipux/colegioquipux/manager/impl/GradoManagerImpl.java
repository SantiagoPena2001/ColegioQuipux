/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.manager.impl;

import co.com.quipux.colegioquipux.dao.impl.GradoDaoImpl;
import co.com.quipux.colegioquipux.manager.GradoManager;
import co.com.quipux.colegioquipux.models.dto.GradoDTO;
import co.com.quipux.colegioquipux.models.entity.GradoEntity;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author familia peña
 */
public class GradoManagerImpl implements GradoManager {

    GradoDaoImpl gradoDao = new GradoDaoImpl();

    @Override
    public void registrarGrado(GradoDTO grado) {

        GradoEntity gradoEntity = new GradoEntity();

        gradoEntity.setDescripcionGrado(grado.getDescripcionGrado());
        gradoEntity.setIdGrado(grado.getIdGrado());

        if (gradoDao.consultarGrado(gradoEntity.getIdGrado()) != null) {
            JOptionPane.showMessageDialog(null, "El grado ya esta registrado");
        } else {
            gradoDao.registrarGrado(gradoEntity);
            JOptionPane.showMessageDialog(null, "Se ha registrado el grado");
        }

    }

    @Override
    public void eliminarGrado(int idGrado) {
        gradoDao.eliminarGrado(idGrado);
    }

    @Override
    public GradoDTO consultarGrado(int idGrado) {

        GradoEntity grado = new GradoEntity();
        grado = gradoDao.consultarGrado(idGrado);
        if (grado != null) {
            GradoDTO gradoD = new GradoDTO();
            gradoD.setDescripcionGrado(grado.getDescripcionGrado());
            gradoD.setIdGrado(grado.getIdGrado());

            return gradoD;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<GradoDTO> traerListaGrados() {

        ArrayList<GradoDTO> listaGradosDto = new ArrayList<GradoDTO>();
        ArrayList<GradoEntity> listaGradosEntity = new ArrayList<GradoEntity>();
        listaGradosEntity = gradoDao.traerListaGrados();
        for (GradoEntity grado : listaGradosEntity) {
            GradoDTO gradoD = new GradoDTO();
            gradoD.setDescripcionGrado(grado.getDescripcionGrado());
            gradoD.setIdGrado(grado.getIdGrado());

            listaGradosDto.add(gradoD);
        }
        return listaGradosDto;

    }

}
