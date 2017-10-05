package br.edu.usj.boaviagem;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by rafael on 04/10/17.
 */

public class BoaViagemActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
    }

    public void logar(View view) {
        //Aqui terá a implementacao do evento onClick
    }
}
