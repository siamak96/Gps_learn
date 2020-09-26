package development.software.gps_learn;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    }

    public void splash(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this,MapsActivity.class));
                Splash.this.finish();

            }
        },2000);
    }

    @Override
    protected void onStart() {
        super.onStart();
        splash();
    }

    @Override
    protected void onResume() {
        super.onResume();
        splash();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        splash();
    }

}
