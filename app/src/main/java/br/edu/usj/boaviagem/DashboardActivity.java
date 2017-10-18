package br.edu.usj.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafael on 18/10/17.
 */

public class DashboardActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dashboard);
    }

    public void selecionarOpcao(View view) {

        switch (view.getId()){
            case R.id.id_nova_viagem:
                startActivity(new Intent(this, NovaViagemActivity.class));
                break;
            case R.id.id_novo_gasto:
            case R.id.id_minhas_viagens:
            case R.id.id_configuracoes:
                TextView textView = (TextView) view;
                String opcao = "Opção: "+textView.getText().toString();
                Toast.makeText(this, opcao, Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(this, "Opção inválida" , Toast.LENGTH_LONG).show();
        }


    }
}
