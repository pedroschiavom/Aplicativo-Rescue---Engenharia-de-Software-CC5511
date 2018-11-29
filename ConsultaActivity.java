package pedro.br.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConsultaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);


        Button btn_Consultar = (Button) findViewById(R.id.button_consultar);
        btn_Consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiProProblema = new Intent(ConsultaActivity.this,ResultadoActivity.class);
                startActivity(vaiProProblema);
            }
        });
    }
}
