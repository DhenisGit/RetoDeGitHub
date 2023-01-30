package dhenis.example.subir_github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Mensaje(View view){
        Toast.makeText(this, "Buenas Tardes Bienvenido", Toast.LENGTH_SHORT).show();
    }
}