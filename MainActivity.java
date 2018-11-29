package pedro.br.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnEmergencia = (Button) findViewById(R.id.button_emergencia);
        btnEmergencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = "0192";
                Uri uri = Uri.parse("tel:"+numero);
                Intent ligaEmergencia = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(ligaEmergencia);
            }
        });


        Button btn_Consultar = (Button) findViewById(R.id.button_consultar);
        btn_Consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiPraConsulta = new Intent(MainActivity.this,ConsultaActivity.class);
                startActivity(vaiPraConsulta);
            }
        });




    }
}
