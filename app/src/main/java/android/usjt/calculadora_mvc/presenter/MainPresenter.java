package android.usjt.calculadora_mvc.presenter;

import android.usjt.calculadora_mvc.model.Calculadora;
import android.usjt.calculadora_mvc.view.MainView;
import android.view.View;

/**
 * Created by Paulo Guilherme da Silva 816113977 on 02/05/2018.
 */

public class MainPresenter implements Presenter {
    private Calculadora model;
    private MainView v;

    public MainPresenter(MainView v){
        this.v = v;

    }

    @Override
    public void onCreate() {
        model = new Calculadora();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onDestroy() {

    }
    public void calculo(){
        model.setValor1(v.getValor1());
        model.setValor2(v.getValor2());
        model.setOperador(v.getOperador());
        model.calculo();
        v.setResultado(model.getResultado());
    }
}
