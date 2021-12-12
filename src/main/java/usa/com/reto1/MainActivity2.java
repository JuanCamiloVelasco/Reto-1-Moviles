package usa.com.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    Drawable drawable1, drawable2, drawable3, drawable4, drawable5;
    ImageView imagen1, imagen2, imagen3, imagen4, imagen5;
    Button btnperro1, btnperro2, btngato1, btngato2, btnperroygato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_bonnys);

        btnperro1 = (Button) findViewById(R.id.btnperro1);
        btnperro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Precio: 97000 COP - DIMENSIONES: 70 x 40 cm - PESO MAXIMO: 30 Kg", Toast.LENGTH_LONG).show();
            }
        });

        btnperro2 = (Button) findViewById(R.id.btnperro2);
        btnperro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Precio: 46000 COP - Contenido: 5 Litros - *USO SOLO PARA PERROS NO USAR EN GATOS*", Toast.LENGTH_LONG).show();
            }
        });

        btngato1 = (Button) findViewById(R.id.btngato1);
        btngato1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Precio: 106000 COP - DIMENSIONES: 50 x 70 cm - PESO MAXIMO: 15 Kg", Toast.LENGTH_LONG).show();
            }
        });

        btngato2 = (Button) findViewById(R.id.btngato2);
        btngato2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Precio: 130000 COP - DIMENSIONES: 40 X 100 cm - Garantia de 3 meses al momento de recibir el producto", Toast.LENGTH_LONG).show();
            }
        });

        btnperroygato = (Button) findViewById(R.id.btnperroygato);
        btnperroygato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Precio: 30000 COP - INDICACIONES: Uso para perros de 20+kg y Gatos 5-15Kg *NO APLICAR A ANIMALES FUERA DEL RANGO DE PESO*", Toast.LENGTH_LONG).show();
            }
        });


        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.perros1, getTheme());
        drawable2 = res.getDrawable(R.drawable.perros2, getTheme());
        drawable3 = res.getDrawable(R.drawable.gatos1, getTheme());
        drawable4 = res.getDrawable(R.drawable.gatos2, getTheme());
        drawable5 = res.getDrawable(R.drawable.perrosygatos, getTheme());


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