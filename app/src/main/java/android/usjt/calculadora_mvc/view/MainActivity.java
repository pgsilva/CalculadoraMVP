package android.usjt.calculadora_mvc.view;

import android.app.Activity;
import android.os.Bundle;
import android.usjt.calculadora_mvc.R;
import android.usjt.calculadora_mvc.model.Calculadora;
import android.usjt.calculadora_mvc.presenter.MainPresenter;
import android.usjt.calculadora_mvc.presenter.Presenter;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity implements MainView{
    EditText valor1, valor2, operador, resultado;
    MainPresenter presenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = (EditText)findViewById(R.id.valor1);
        valor2 = (EditText)findViewById(R.id.valor2);
        operador = (EditText)findViewById(R.id.operador);
        resultado = (EditText)findViewById(R.id.resultado);
        presenter.onCreate();

    }

    public void calcular(View view){
        presenter.calculo();

    }



    @Override
    public String getValor1(){
        return valor1.getText().toString();
    }

    @Override
    public String getValor2(){
        return valor2.getText().toString();
    }

    @Override
    public String getOperador(){
        return operador.getText().toString();
    }

    @Override
    public String getResultado(){ return resultado.getText().toString();}

    @Override
    public void setValor1(String valor1) {
            this.valor1.setText(valor1);
    }

    @Override
    public void setResultado(String resultado){
        this.resultado.setText(resultado);
    }
}
