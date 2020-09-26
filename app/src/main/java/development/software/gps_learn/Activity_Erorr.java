package development.software.gps_learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import development.software.gps_learn.Service.Activity_Service;

public class Activity_Erorr extends AppCompatActivity {
    int backButtonCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__erorr);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(this, Activity_Service.class);
        startService(intent);
    }

    @Override
    public void onBackPressed() {

        if(backButtonCount >= 1)
        {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "برای خروج از برنامه یک بار دیگر دکمه بک را فشار دهید.", Toast.LENGTH_SHORT).show();
            backButtonCount++;
        }
    }
}
