package com.rogerestrad.listviewproductos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    private ListView lista;
    private String productos []={"computadora","mouse","dulces","hojas","lapices","lentes","reloj","cuchara ","celular","mesa ","refrigerador","horno","audifonos"};
    private String categoria []={"electronica","electronica","dulceria","papeleria","papeleria","accesorios","electronica","cubiertos","electronica","hogar","electrodomensticos","electrodomensticos","accesorios"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView)findViewById(R.id.txt1);
        lista=(ListView)findViewById(R.id.lista);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,productos);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txt.setText("Categoria elegida: "+categoria[position]);

            }
        });

    }
}
