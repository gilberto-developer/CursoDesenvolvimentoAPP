package devandroid.gilberto.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.gilberto.applistacurso.model.Curso;

public class CursoController {

    private List listCursos;
    public List getListaDeCursos(){

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso("BCP"));
        listCursos.add(new Curso("BCS"));
        listCursos.add(new Curso("BM"));
        listCursos.add(new Curso("INJETOR"));
        listCursos.add(new Curso("PRODUTOR"));
        listCursos.add(new Curso("SURGENTE"));
        listCursos.add(new Curso("Flutter"));
        listCursos.add(new Curso("Dart"));

        return listCursos;
    }

    public ArrayList<String> daddosParaSpinner(){
        ArrayList<String> dados = new ArrayList<>();
        for (int i = 0; i < getListaDeCursos().size() ; i++) {
           Curso objeto =(Curso)getListaDeCursos().get(i);

           dados.add(objeto.getNomeDoCursoDesejado());
        }
       return dados;

    }

}
