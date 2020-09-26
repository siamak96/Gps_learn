package development.software.gps_learn;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class learn extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        toolbar=(Toolbar)findViewById(R.id.learn_toolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            toolbar.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            toolbar.setTextDirection(View.TEXT_DIRECTION_FIRST_STRONG_RTL);
        }

        toolbar.setTitle("کشت یار");
        toolbar.setLogo(R.mipmap.icon);


    }
}
