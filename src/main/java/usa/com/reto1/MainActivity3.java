package usa.com.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Drawable drawable1, drawable2, drawable3, drawable4, drawable5;
    ImageView imagen1, imagen2, imagen3, imagen4, imagen5;
    Button btnperro1, btnperro2, btngato1, btngato2, btnperroygato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_bonnys);

        btnperro1 = (Button) findViewById(R.id.btnperro1);
        btnperro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Tiempos estimados de entrega: BOGOTA, MEDELLIN, CALI: 24H habiles, RESTO DEL PAIS: 48H+ habiles", Toast.LENGTH_LONG).show();
            }
        });

        btnperro2 = (Button) findViewById(R.id.btnperro2);
        btnperro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Lineas de atencion: 3185643733/2041446 - Horarios de atencion: lunes a viernes de 8am a 3pm ", Toast.LENGTH_LONG).show();
            }
        });

        btngato1 = (Button) findViewById(R.id.btngato1);
        btngato1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Nuestras clinicas cuentan con veterinarios disponibles 24/7", Toast.LENGTH_LONG).show();
            }
        });

        btngato2 = (Button) findViewById(R.id.btngato2);
        btngato2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Droguerias abiertas 24 horas en nuestras clinicas", Toast.LENGTH_LONG).show();
            }
        });

        btnperroygato = (Button) findViewById(R.id.btnperroygato);
        btnperroygato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Horarios de atencion: Peluqueria: lunes a viernes de 8am a 6pm - Baños y aseo: lunes a sabados de 9am a 5pm", Toast.LENGTH_LONG).show();
            }
        });


        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.domicilio, getTheme());
        drawable2 = res.getDrawable(R.drawable.servicioalcliente, getTheme());
        drawable3 = res.getDrawable(R.drawable.veterinaria, getTheme());
        drawable4 = res.getDrawable(R.drawable.drogueriaveterinaria, getTheme());
        drawable5 = res.getDrawable(R.drawable.esteticaanimal, getTheme());


        imagen1 = (ImageView) findViewById(R.id.imagenperro1);
        imagen1.setImageDrawable(drawable1);

        imagen2 = (ImageView) findViewById(R.id.img2);
        imagen2.setImageDrawable(drawable2);

        imagen3 = (ImageView) findViewById(R.id.imgSucursales);
        imagen3.setImageDrawable(drawable3);

        imagen4 = (ImageView) findViewById(R.id.imggatos2);
        imagen4.setImageDrawable(drawable4);

        imagen5 = (ImageView) findViewById(R.id.imgServicios);
        imagen5.setImageDrawable(drawable5);

    }
}