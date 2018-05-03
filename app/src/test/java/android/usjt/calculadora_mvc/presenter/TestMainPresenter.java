package android.usjt.calculadora_mvc.presenter;

import android.usjt.calculadora_mvc.view.MainView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestMainPresenter {
    private MainPresenter pres ;

    @Mock
    private MainView view;

    @Before
    public void setUp(){
        pres = new MainPresenter(view);
        pres.onCreate() ;
    }

    @Test
    public void testCalculo(){
        when(view.getValor1()).thenReturn("1");
        when(view.getValor2()).thenReturn("5");
        when(view.getOperador()).thenReturn("+");
        pres.calculo();
        assertEquals("6",pres.getResultado());
    }
}
