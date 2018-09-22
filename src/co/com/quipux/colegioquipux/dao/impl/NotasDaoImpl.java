/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.NotasDao;
import co.com.quipux.colegioquipux.models.entity.NotasEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public class NotasDaoImpl implements NotasDao {

    private ArrayList<NotasEntity> listaNotas = new ArrayList<NotasEntity>();
    int x = 0;

    @Override
    public void registrarNota(NotasEntity nota) {
        x++;
        nota.setIdNota(x);
        listaNotas.add(nota);

    }

    @Override
    public void eliminarNota(int idNota) {
        int x = -1, encontrado = 0;
        for (NotasEntity nota : listaNotas) {
            x++;
            if (nota.getIdNota() == idNota) {
                encontrado = x;
                break;
            }
        }
        listaNotas.remove(encontrado);

    }

    @Override
    public void ModificarNota(int idNota, int nota) {
        int x = -1, encontrado = 0;
        NotasEntity note = new NotasEntity();
        for (NotasEntity not : listaNotas) {
            x++;
            if (not.getIdNota() == idNota) {
                encontrado = x;
                not.setNota(nota);
                note = not;
                break;
            }
        }
        listaNotas.set(encontrado, note);

    }

    @Override
    public NotasEntity consultarNota(int idNota) {
        for (NotasEntity nota : listaNotas) {
            if (nota.getIdNota()== idNota) {
                return nota;
            }
        }
        return null;
    }

    @Override
    public ArrayList<NotasEntity> traerListaNotas() {

        return listaNotas;

    }

    @Override
    public NotasEntity consultarNotaV(int idEstudiante, String nombreNota) {
        for (NotasEntity nota : listaNotas) {
            if (nota.getIdEstudiante() == idEstudiante && nota.getNombreNota().equals(nombreNota)) {
                return nota;
            }
        }
        return null;
    }



    @Override
    public ArrayList<NotasEntity> consultarNotasPorEstudiante(int idEstudiante) {

        ArrayList<NotasEntity> listaNotasEntity = new ArrayList<NotasEntity>();

        for (NotasEntity nota : listaNotas) {
            if (nota.getIdEstudiante() == idEstudiante) {
                listaNotasEntity.add(nota);
            }
        }

        return listaNotasEntity;

    }

    @Override
    public ArrayList<NotasEntity> consultarNotasPorMateria(String idMateria) {

        ArrayList<NotasEntity> listaNotasEntity = new ArrayList<NotasEntity>();

        for (NotasEntity nota : listaNotas) {
            if (nota.getIdMateria().equals(idMateria)) {
                listaNotasEntity.add(nota);
            }
        }

        return listaNotasEntity;

    }

    @Override
    public ArrayList<NotasEntity> consultarNotasporDescripcionPlan(int idDescripcionPlan) {

        ArrayList<NotasEntity> listaNotasEntity = new ArrayList<NotasEntity>();

        for (NotasEntity nota : listaNotas) {
            if (nota.getIdDescripcionPlan()== idDescripcionPlan) {
                listaNotasEntity.add(nota);
            }
        }

        return listaNotasEntity;

    }

    @Override
    public ArrayList<NotasEntity> consultarNotasPorNombre(String nombre) {

        ArrayList<NotasEntity> listaNotasEntity = new ArrayList<NotasEntity>();

        for (NotasEntity nota : listaNotas) {
            if (nota.getNombreNota().equals(nombre)) {
                listaNotasEntity.add(nota);
            }
        }

        return listaNotasEntity;

    }
}
