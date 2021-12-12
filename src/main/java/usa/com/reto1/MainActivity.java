package usa.com.reto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button btn1;
    TextView txt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_bonnys);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Proximamente se implementara un Menu dinamico! :D", Toast.LENGTH_LONG).show();
            }
        });

        txt1 = (TextView) findViewById(R.id.txt1);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.opcion1){
            Toast.makeText(getApplicationContext(), "Productos Bonnys", Toast.LENGTH_SHORT).show();
            Intent segundaPantalla = new Intent(this, MainActivity2.class);
            startActivity(segundaPantalla);
        }
        if (id == R.id.opcion2){
            Toast.makeText(getApplicationContext(), "Servicios Bonnys", Toast.LENGTH_SHORT).show();
            Intent TerceraPantalla = new Intent(this, MainActivity3.class);
            startActivity(TerceraPantalla);
        }
        if (id == R.id.opcion3){
            Toast.makeText(getApplicationContext(), "Sucursales Bonnys", Toast.LENGTH_SHORT).show();
            Intent CuartaPantalla = new Intent(this, MainActivity4.class);
            startActivity(CuartaPantalla);
        }
        return super.onOptionsItemSelected(item);
    }
}