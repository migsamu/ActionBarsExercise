package org.iesfm.actionbarsexercise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected static final String TEXTO_ENVIADO = "org.iesfm.actionbarsexercise.MainActivity.enviado";

    private TextView tvRecibido;
    private EditText etEnviado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void init() {
        tvRecibido = (TextView) findViewById(R.id.ma_tvRecibido);
        etEnviado = (EditText) findViewById(R.id.ma_etEnviado);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mm_compartir:
                Toast.makeText(this, "Ha pulsado la opcion compartir del menú", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mm_imprimir:
                Toast.makeText(this, "Ha pulsado la opcion imprimir del menú", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mm_marcar:
                Toast.makeText(this, "Ha pulsado la opcion marcar como pagada del menú", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mm_pdf:
                Toast.makeText(this, "Ha pulsado la opcion generar PDF del menú", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mm_enviar:
                Toast.makeText(this, "Ha pulsado la opcion enviar del menú", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mm_siguiente:
                Toast.makeText(this, "Ha pulsado la opcion siguiente del menú", Toast.LENGTH_SHORT).show();
                Intent segndaPantalla = new Intent(this, SegundaPantalla.class);
                segndaPantalla.putExtra(TEXTO_ENVIADO, etEnviado.getText().toString());
                startActivity(segndaPantalla);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}