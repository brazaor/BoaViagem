package br.edu.usj.boaviagem;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by rafael on 18/10/17.
 */

public class NovaViagemActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_nova_viagem);
    }

    public void salvarViagem(View view) {
    }
}
