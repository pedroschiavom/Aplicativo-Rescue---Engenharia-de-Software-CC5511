package pedro.br.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button botaoLogar = (Button) findViewById(R.id.button_login);
        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiProMain = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(vaiProMain);
            }
        });

        Button botaoCadastrar = (Button) findViewById(R.id.button_cadastrar);
        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiProFormulario = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(vaiProFormulario);
            }
        });



    }
}
