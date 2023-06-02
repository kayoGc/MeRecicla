package br.com.etecia.merecicla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    TextView cadastrar;
    TextInputEditText txtusuario, txtsenha;
    Button entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        cadastrar = findViewById(R.id.txtcadastrar);
        entrar = findViewById(R.id.btnentrar);
        txtusuario = findViewById(R.id.txtusuario);
        txtsenha =  findViewById(R.id.txtsenha);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario, senha;

                usuario = txtusuario.getText().toString();
                senha = txtsenha.getText().toString();

                if (usuario.equals("Mario") && senha.equals("Sonic") ){

                    startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                }else {

                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos, burro.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),CadastrarActivity.class));
            }
        });


    }
}