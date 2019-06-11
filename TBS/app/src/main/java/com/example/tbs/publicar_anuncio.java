package com.example.tbs;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class publicar_anuncio extends AppCompatActivity {

    private Spinner opcionesdisponibilidad;
    private Spinner opcionesestado;

    private EditText descripcion;
    private EditText precio;
    private EditText cantidaddisponible;
    private EditText telefono;

    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arraylist;

    private EditText editText;
    private EditText nombrearticulo;
    private TextView etiquenta;
    private Button btn;

/**
     * no hayq eu olvidrnos poner un oast aqui
     */

/*
    public void irperfil (View v)  {
        Intent perfil = new Intent(this, miperfil.class);
        startActivity(perfil);

        Toast.makeText(publicar_anuncio.this, "hecho.", Toast.LENGTH_SHORT).show();
    }
*/
    public void onClick(View v){

        switch(v.getId()){
            case R.id.publicar:
                obteneinfo();
            break;

            case R.id.enviarboton:
                Intent enviabtn=new Intent(this,miperfil.class);
                
                //bundle se encargar de enviar datos de un lugar a otro
                Bundle mibundle=new Bundle();
                mibundle.putString("descripcion",descripcion.getText().toString());

                mibundle.putAll(mibundle);
                startActivity(enviabtn);

                break;
       }
    }

    @SuppressLint("SetTextI18n")
    private void obteneinfo() {
        //introduce a ingresar loa datos
        String nombrearti= nombrearticulo.getText().toString();
        String descripc=descripcion.getText().toString();

//otr forma que no me salio        int prec=Integer.parseInt(precio.getText().toString());
        String prec=precio.getText().toString();
        String cantidadd=cantidaddisponible.getText().toString();
     String tel=telefono.getText().toString();
        etiquenta.setText ("cosaaay");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicar_anuncio);
        nombrearticulo=(EditText)findViewById(R.id.nombrearticulo);
        descripcion = (EditText) findViewById(R.id.descripcion);
        precio=(EditText) findViewById(R.id.precio);
        cantidaddisponible=(EditText)findViewById(R.id.cantidaddisponible);
        telefono=(EditText)findViewById(R.id.telefono);
        etiquenta = (TextView) findViewById(R.id.nombreetiquteado);


        // crea cadena que pueda ser mostrada
        arraylist = new ArrayList<String>();

        //asigando valores a spinner disponibilidad
        opcionesdisponibilidad = (Spinner) findViewById(R.id.sCategoria);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Categoria, android.R.layout.simple_spinner_item);
        opcionesdisponibilidad.setAdapter(adapter);

        //asignando valores a spinner estado
        opcionesestado = (Spinner) findViewById(R.id.sDisponibilidad);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.Disponibilidad, android.R.layout.simple_spinner_item);
        opcionesestado.setAdapter(adapter1);



    }
/*Porsi acaso
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arraylist.add(editText.getText().toString());
                adapter.notifyDataSetChanged();

            }

        });
*/
  /*  public publicar_anuncio(@NonNull View anunciar) {
        nombrearticulo = (TextView) anunciar.findViewById(R.id.nombrearticulo);
        descripcion = (TextView) anunciar.findViewById(R.id.descripcion);
        precio = (TextView) anunciar.findViewById(R.id.precio);
        cantidaddisponible = (TextView) anunciar.findViewById(R.id.cantidaddisponible);
        movil = (TextView) anunciar.findViewById(R.id.telefono);
    }

*/
    }


