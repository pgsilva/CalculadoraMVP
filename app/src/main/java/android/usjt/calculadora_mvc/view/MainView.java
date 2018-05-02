package android.usjt.calculadora_mvc.view;

/**
 * Created by Paulo Guilherme da Silva 816613977 on 02/05/2018.
 */

public interface MainView {
    String getValor1();
    String getValor2();
    String getOperador();
    void setResultado(String resultado);
}
