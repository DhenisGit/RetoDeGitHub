package dhenis.example.subir_github;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.TxtTexto);

    }

    public void Envio(View view) {
        String texto = et1.getText().toString();

        if (texto.length() == 0) {
            Toast.makeText(this, "Error no escribiste nada :c", Toast.LENGTH_SHORT).show();
        } else {
            Intent envio = new Intent(this, DatosActivity.class);
            envio.putExtra("dato", et1.getText().toString());
            startActivity(envio);
        }

    }
}