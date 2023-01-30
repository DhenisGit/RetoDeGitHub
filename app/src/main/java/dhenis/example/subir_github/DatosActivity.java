package dhenis.example.subir_github;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DatosActivity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        tv1 = (TextView) findViewById(R.id.tvRecibir);

        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Hola " + dato);

    }

    public void Retroceder(View view) {
        Intent retroceder = new Intent(this, MainActivity.class);
        startActivity(retroceder);
    }
}