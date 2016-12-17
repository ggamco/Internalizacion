package com.gmbdesign.s39_004_internalizacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /*
     * Para INTERNALIZACIÓN nos vamos a la carpeta RES -> Values -> strings.xml
     *
     * Aquí es donde podemos crear claves/valor para usar con la app y recuperar info de
     * recursos.
     *
     * Para trabajar con el podemos irnos a Open Editor y pulsar sobre el planeta, ahí cargamos
     * los nuevos paises a crear. Trabajamos traduciendo los valores de las diferentes claves.
     *
     * Tambien podemos crear la carpeta desde el gestor de proyecto añadiendo la denominacion
     * del pais concreto del tipo values-fr (Frances)
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Si queremos ver el valor de una clave del fichero string.xml podemos recuperarla
         * gracias el siguiente metodo getResources().getString(R.string.CLAVE)
         */

        String valorStringSaludo = getResources().getString(R.string.saludo);
        Log.d("S39_004_Lenguajes", "El valor del string saludo es: " + valorStringSaludo);
    }
}
