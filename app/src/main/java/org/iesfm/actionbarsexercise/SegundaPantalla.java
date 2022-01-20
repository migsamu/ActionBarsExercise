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

public class SegundaPantalla extends AppCompatActivity {

    protected static final String TEXTO_ENVIADO = "org.iesfm.actionbarsexercise.SegundaPantalla.enviado";

    private TextView tvRecibido;
    private EditText etEnviado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
        init();
        getInfo();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_segunda, menu);
        return true;
    }

    public void init(){
        tvRecibido = (TextView) findViewById(R.id.sp_tvRecibido);
        etEnviado = (EditText) findViewById(R.id.sp_etEnviado);
    }

    public void getInfo() {
        String textoRecibido = getIntent().getStringExtra(MainActivity.TEXTO_ENVIADO);
        tvRecibido.setText(textoRecibido);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ms_anterior:
                Toast.makeText(this, "Ha pulsado la opcion anterior del menú", Toast.LENGTH_SHORT).show();
                Intent main = new Intent(this,MainActivity.class);
                main.putExtra(TEXTO_ENVIADO,etEnviado.getText().toString());
                startActivity(main);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}