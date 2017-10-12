package br.edu.usj.boaviagem;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by rafael on 04/10/17.
 */

public class BoaViagemActivity extends Activity {

    private EditText usuario, senha;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        this.usuario = (EditText) findViewById(R.id.id_usuario);
        this.senha = (EditText) findViewById(R.id.id_senha);
    }

    public void logar(View view) {
        String usuarioInformado = this.usuario.getText().toString();
        String senhaInformada = this.senha.getText().toString();

        if(usuarioInformado.equals("usj")
                && senhaInformada.equals("usj")){
            //efetuar login
        }
        else{
            //exibir mensagem erro
            String msg = getString(R.string.erro_autenticacao);
            Toast t = Toast.makeText(this,msg, Toast.LENGTH_LONG);
            t.show();
        }

    }
}
