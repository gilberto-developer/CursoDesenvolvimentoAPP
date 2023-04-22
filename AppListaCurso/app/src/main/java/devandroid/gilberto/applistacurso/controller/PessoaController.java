package devandroid.gilberto.applistacurso.controller;

import android.content.SharedPreferences;
import android.util.Log;

import devandroid.gilberto.applistacurso.model.Pessoa;
import devandroid.gilberto.applistacurso.view.MainActivity;

public class PessoaController {


    SharedPreferences preferences;
    SharedPreferences.Editor listavip;
    public static final String NOME_PREFRENCES = "pref_listavip";

    public PessoaController(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences(NOME_PREFRENCES, 0);
        listavip = preferences.edit();

    }

    public void salvar(Pessoa pessoa) {

        Log.i("MVC_Controller", "Salvo: " + pessoa.toString());

        listavip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listavip.putString("sobreNome", pessoa.getSobreNome());
        listavip.putString("nomeCurso", pessoa.getCursoDesejado());
        listavip.putString("telefoneContato", pessoa.getTelefoneContato());
        listavip.apply();

    }

    public Pessoa buscar(Pessoa pessoa) {
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", ""));
        pessoa.setSobreNome(preferences.getString("sobreNome", ""));
        pessoa.setCursoDesejado(preferences.getString("nomeCurso", ""));
        pessoa.setTelefoneContato(preferences.getString("telefoneContato", ""));
        return pessoa;
    }

    public void limpar() {
        listavip.clear();
        listavip.apply();

    }
}
