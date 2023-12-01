package fr.caensup.lsts.smb116.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lvMat;
    private Model model = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMat = findViewById( R.id.listMatView );
        ModelAdapter modelAdapter = new ModelAdapter( this );
        modelAdapter.setModel( model );
        lvMat.setAdapter( modelAdapter );
    }
}