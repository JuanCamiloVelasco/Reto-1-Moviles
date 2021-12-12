package usa.com.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    Drawable drawable1, drawable2, drawable3, drawable4, drawable5;
    ImageView imagen1, imagen2, imagen3, imagen4, imagen5;
    Button btnperro1, btnperro2, btngato1, btngato2, btnperroygato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_bonnys);

        btnperro1 = (Button) findViewById(R.id.btnperro1);
        btnperro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "DIRECCION: Cl 314 No. 315-08, C.P 660031 CONTACTO: 2083921-3458920345", Toast.LENGTH_LONG).show();
            }
        });

        btnperro2 = (Button) findViewById(R.id.btnperro2);
        btnperro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "DIRECCION: Av 3 A No. 23 C-823, C.P 760023 CONTACTO: 3405931-3149563021 ", Toast.LENGTH_LONG).show();
            }
        });

        btngato1 = (Button) findViewById(R.id.btngato1);
        btngato1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "DIRECCION: Cl 64 No. 25-270, C.P 27270027 CONTACTO: 2752495-3652469477", Toast.LENGTH_LONG).show();
            }
        });

        btngato2 = (Button) findViewById(R.id.btngato2);
        btngato2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "DIRECCION: Cl 70 No. 70-07 AV4 CRESPO, C.P 2030020 CONTACTO: 3850472- 3166083342", Toast.LENGTH_LONG).show();
            }
        });

        btnperroygato = (Button) findViewById(R.id.btnperroygato);
        btnperroygato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "DIRECCION: Cra. 12 No. 17-87 CONTACTO: 47312643-3649742488", Toast.LENGTH_LONG).show();
            }
        });

        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.local1, getTheme());
        drawable2 = res.getDrawable(R.drawable.local2, getTheme());
        drawable3 = res.getDrawable(R.drawable.local3, getTheme());
        drawable4 = res.getDrawable(R.drawable.local4, getTheme());
        drawable5 = res.getDrawable(R.drawable.local5, getTheme());


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