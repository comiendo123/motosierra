package com.example.tbs;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class miperfil extends AppCompatActivity implements View.OnClickListener,
        misamigos.OnFragmentInteractionListener,
        misfavoritos.OnFragmentInteractionListener,
        misanuncios.OnFragmentInteractionListener,
        miscitas.OnFragmentInteractionListener
        {

    private RecyclerView recyclerV;
   // private adapters adapter;

    private Spinner opcionesdisponibilidad;
    private Spinner opcionesestado;
    private TextView nombrearticulo;
    private TextView descripcion;
    private TextView precio;
    private TextView cantidaddisponible;
    private TextView movil;


    private ArrayAdapter<String> adapter;
    private ArrayList<String> arraylist;
    private RecyclerView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button misamigos, misanuncios, misfavoritos, miscitas;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miperfil);
     //   loadComponents();

// accede a ventana mis amigos
        misamigos misamigos1 = new misamigos();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedor,misamigos1);

        //habilita los botones de fragments
        misamigos = (Button) findViewById(R.id.amigos);
        misanuncios = (Button) findViewById(R.id.anuncios);
        misfavoritos = (Button) findViewById(R.id.faoritos);
        miscitas = (Button) findViewById(R.id.citas);

        misamigos.setOnClickListener(this);
        misanuncios.setOnClickListener(this);
        misfavoritos.setOnClickListener(this);
        miscitas.setOnClickListener(this);
//trae los datos

        desc= (RecyclerView)findViewById(R.id.recicler);
        Bundle miBundle=this.getIntent().getExtras();
        if(miBundle!=null){
            String nombre=miBundle.getString("eso");
        }

        //da valor a recicler view funcona cuando no tenemos un recicler especifico
    //    arraylist = new ArrayList<String>();

       // recyclerV= findViewById(R.id.recicler);
     //   recyclerV.setLayoutManager(new LinearLayoutManager(this));

      /*  adapter = new ArrayAdapter<publicar_anuncio>(getApplicationContext(), android.R.layout.simple_spinner_item, arraylist);
        recyclerV.setAdapter(adapter);*/


        opcionesdisponibilidad = (Spinner) findViewById(R.id.sCategoria);
        opcionesestado = (Spinner) findViewById(R.id.sDisponibilidad);
        nombrearticulo = (TextView) findViewById(R.id.nombrearticulo);
        descripcion = (TextView) findViewById(R.id.descripcion);
        precio = (TextView) findViewById(R.id.precio);
        cantidaddisponible = (TextView) findViewById(R.id.cantidaddisponible);
        movil = (TextView) findViewById(R.id.telefono);



            }

public List<models> obtencion(){
        List<models> datos= new ArrayList<>();
        datos.add(new models("title","esto no es una descripcionss","est","ñ","3",R.drawable.coco));
    datos.add(new models("title","descripcion","est","ñ","3",R.drawable.coco));
    datos.add(new models("title","descripcion","est","ñ","3",R.drawable.coco));

        return datos;

}

    /** este es de los fragmentos no olvidar
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.amigos:

                misamigos misamigos1 = new misamigos();
                FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.contenedor, misamigos1);
                transition.commit();

                break;

            case R.id.anuncios:

                misanuncios misanuncios1 = new misanuncios();
                FragmentTransaction transition1 = getSupportFragmentManager().beginTransaction();
                transition1.replace(R.id.contenedor, misanuncios1);
                transition1.commit();
                break;

            case R.id.citas:

                miscitas miscitas1 = new miscitas();
                FragmentTransaction transition2 = getSupportFragmentManager().beginTransaction();
                transition2.replace(R.id.contenedor, miscitas1);
                transition2.commit();
                break;

            case R.id.faoritos:

                misfavoritos misfavoritos1 = new misfavoritos();
                FragmentTransaction transition3 = getSupportFragmentManager().beginTransaction();
                transition3.replace(R.id.contenedor, misfavoritos1);
                transition3.commit();
                break;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
   /* private void loadComponents() {


//agarra las imagenes de drwable
        Integer[] image = new Integer[]{R.drawable.fresa, R.drawable.uvas, R.drawable.pina, R.drawable.coco};
        String[] titles = new String[]{"fresa", "uvas", "pina", "coco"};
        String[] descrip = new String[]{"mel", "cat", "hca", "pe"};
        String[] adicional = new String[]{"adi", "cio", "nal", "izar"};
      //crear instncia
        ArrayList<models> listdata = new ArrayList<>();
        for (int i = 0; i < image.length; i++) {
            models info = new models();
            info.setImg(image[i]);
            info.setTitle(titles[i]);
            info.setDescripcion(descrip[i]);
            info.setAdicional(adicional[i]);
            listdata.add(info);
        }


                 /*  ArrayList<String> datoslist = new ArrayList<>();
            for (int i = 0; i < 20; i++){
                datoslist.add("Item" + i);
            }
   //     ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datoslist);
            adapters adapter = new adapters(this,listdata);
            list.setAdapter(adapter);
        }
*/
}

