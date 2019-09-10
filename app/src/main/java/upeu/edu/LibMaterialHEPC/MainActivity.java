package upeu.edu.LibMaterialHEPC;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.telecom.Call;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import upeu.edu.modulo.R;

public class MainActivity extends AppCompatActivity {


    Spinner lista;
    String[] datos = {"Lista despegable","Juan Cama Luque","Hernan Carbajal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=(Spinner)findViewById(R.id.lista1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adapter);


    }



}
