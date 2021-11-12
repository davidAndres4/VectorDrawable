package com.practica.vectordrawable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //creamos una Activity y le asociamos un objeto View, creado en el constructor de la
        //clase DibujaImagen
        setContentView(new DibujaImagen(this));
    }

    //clase que hereda de View
    public class DibujaImagen extends View {
        //declaramos el objeto drawable
        private Drawable estrella;

        //constructor. Establece la vista mediante el contexto recibido de la actividad
        //que lo invoca
        public DibujaImagen(Context context) {
            super(context);

            //asociamos a nuestro objeto el id de recurso de la imagen almacenada en R.drawable
            //en este caso, el recurso es un vectorDrawable definido con XML
            estrella = ContextCompat.getDrawable(context, R.drawable.estrella);
            //Con este método, indicamos el rectángulo donde ha de ser dibujado el objeto,
            //es decir, establecemos sus límites
            estrella.setBounds(30,30,200,200);
        }

        //sobreescribimos el método onDraw de la clase View, que será el responsable de
        //dibujar la vista mediante un objeto de la clase Canvas que recibe como parámetro
        @Override
        protected void onDraw(Canvas canvas) {
            //dibujamos la imagen
            estrella.draw(canvas);
        }
    }
}

