package android.mmt.materialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btnGoSub = findViewById(R.id.btnGoSub);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnGoSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, Sub.class));
            }
        });

    }

//    @Override
//    public void onClick(View v) {
//        FragmentManager fm = getSupportFragmentManager();
//        Drawer drawer = new Drawer();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.add(R.id.drawerHolder,drawer,"Drawer");
//        ft.commit();
//    }
}