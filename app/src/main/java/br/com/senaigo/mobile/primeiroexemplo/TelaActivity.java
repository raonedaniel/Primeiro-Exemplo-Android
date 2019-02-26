package br.com.senaigo.mobile.primeiroexemplo;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class TelaActivity extends AppCompatActivity {

    protected EditText txtNome;
    protected EditText txtTelefone;
    protected EditText txtEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela);
    }

    public void exibir(View view) {

        //Procura o componente da view pelo ID
        txtNome = (EditText)findViewById(R.id.txtNome);
        txtTelefone = findViewById(R.id.txtTelefone);
        txtEmail = findViewById(R.id.txtEmail);

        //Extrai o conteúdo(texto) do componente
        String nome,telefone,email;
        nome = txtNome.getText().toString();
        telefone = txtTelefone.getText().toString();
        email = txtEmail.getText().toString();

        //Formata a saída dos dados;
        String dados = String.format("Os dados informados foram: \n %s \n%s \n%s",
                nome,telefone,email);

        //Exibe dos dados para o usuario
        Toast.makeText(this,dados, Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),dados, Toast.LENGTH_LONG).show();
    }
}
