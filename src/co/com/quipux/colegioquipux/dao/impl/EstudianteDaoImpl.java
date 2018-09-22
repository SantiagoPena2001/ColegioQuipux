/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.EstudianteDao;
import co.com.quipux.colegioquipux.models.entity.EstudianteEntity;
import java.util.ArrayList;

/**
 *
 * @author familia peña
 */
public class EstudianteDaoImpl implements EstudianteDao {

    private ArrayList<EstudianteEntity> listaEstudiantes = new ArrayList<EstudianteEntity>();
    int x = 0;

    @Override
    public void registrarEstudiante(EstudianteEntity estudiante) {
        x++;
        estudiante.setIdEstudiante(x);
        listaEstudiantes.add(estudiante);
    }

    @Override
    public void retiroOegresoEstudiante(int idEstudiante) {
        int x = -1, encontrado = 0;
        EstudianteEntity estudianteE = new EstudianteEntity();
        for (EstudianteEntity estudiante : listaEstudiantes) {
            x++;
            if (estudiante.getIdEstudiante() == idEstudiante) {
                encontrado = x;
                estudiante.setEstado(2);
                estudianteE = estudiante;
                break;
            }
        }
        listaEstudiantes.set(encontrado, estudianteE);
    }

    @Override
    public void modificarDatosEstudiante(EstudianteEntity estudianteMod, int idEstudiante) {
        int x = -1, encontrado = 0;
        for (EstudianteEntity estudiante : listaEstudiantes) {
            x++;
            if (estudiante.getIdEstudiante() == idEstudiante) {
                encontrado = x;
                break;
            }
        }
        listaEstudiantes.set(encontrado, estudianteMod);
    }

    @Override
    public void promocionEstudiantes(int idEstudiante) {
        int x = -1, encontrado = 0;
        EstudianteEntity estudianteE = new EstudianteEntity();
        for (EstudianteEntity estudiante : listaEstudiantes) {
            x++;
            if (estudiante.getIdEstudiante() == idEstudiante && estudiante.getIdGrado() != 11) {
                encontrado = x;
                estudiante.setIdGrado(estudiante.getIdGrado() + 1);
                estudianteE = estudiante;
                break;

            }
        }
        listaEstudiantes.set(encontrado, estudianteE);

    }

    @Override
    public EstudianteEntity consultarEstudiante(int idEstudiante) {
        for (EstudianteEntity estudiante : listaEstudiantes) {

            if (estudiante.getIdEstudiante() == idEstudiante) {
                return estudiante;
            }
        }
        return null;

    }

    @Override
    public ArrayList<EstudianteEntity> consultarEstudiantePorNombre(String nombre) {
        ArrayList<EstudianteEntity> listaEstudiantesNombre = new ArrayList<EstudianteEntity>();

        for (EstudianteEntity estudiantes : listaEstudiantes) {
            if (estudiantes.getNombre().equals(nombre)) {
                listaEstudiantesNombre.add(estudiantes);
            }
        }

        return listaEstudiantesNombre;

    }

    @Override
    public ArrayList<EstudianteEntity> consultarEstudiantePorGrupo(int idGrupo) {

        ArrayList<EstudianteEntity> listaEstudiantesGrupo = new ArrayList<EstudianteEntity>();

        for (EstudianteEntity estudiantes : listaEstudiantes) {
            if (estudiantes.getIdGrupo() == idGrupo) {
                listaEstudiantesGrupo.add(estudiantes);
            }
        }

        return listaEstudiantesGrupo;

    }

    @Override
    public ArrayList<EstudianteEntity> consultarEstudiantePorGrado(int idGrado) {
        ArrayList<EstudianteEntity> listaEstudiantesGrado = new ArrayList<EstudianteEntity>();

        for (EstudianteEntity estudiantes : listaEstudiantes) {
            if (estudiantes.getIdGrado() == idGrado) {
                listaEstudiantesGrado.add(estudiantes);
            }
        }

        return listaEstudiantesGrado;
    }

    @Override
    public ArrayList<EstudianteEntity> traerListaEstudiantes() {

        return listaEstudiantes;

    }

    @Override
    public EstudianteEntity consultarEstudianteLogin(String correo, int numeroDocumento) {
        for (EstudianteEntity estudiante : listaEstudiantes) {

            if (estudiante.getCorreo().equals(correo) && estudiante.getNumeroDocumento() == numeroDocumento) {
                return estudiante;
            }
        }
        return null;

    }

    @Override
    public EstudianteEntity consultarEstudiantePorDocumento(int numeroDocumento, String documento) {

        for (EstudianteEntity estudiante : listaEstudiantes) {

            if (estudiante.getNumeroDocumento() == numeroDocumento && estudiante.getTipoDocumento().equals(documento)) {
                return estudiante;
            }
        }
        return null;
    }

}
