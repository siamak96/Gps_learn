package development.software.gps_learn.classes;

import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;
import development.software.gps_learn.MapsActivity;

import development.software.gps_learn.R;
import development.software.gps_learn.fragments.suggestion;
import development.software.gps_learn.learn;

public class buttons {
    MapsActivity mapsActivity;
    CircleImageView berenj , panbe , gandom , kolza ,lobia;
    public FloatingActionButton op1;
    public  FloatingActionButton op;

    public buttons(Context context){

        mapsActivity=(MapsActivity)context;
        berenj = (CircleImageView)mapsActivity.findViewById(R.id.rice);
        panbe = (CircleImageView)mapsActivity.findViewById(R.id.panbe);
        gandom = (CircleImageView)mapsActivity.findViewById(R.id.gandom);
        lobia = (CircleImageView)mapsActivity.findViewById(R.id.lobia);
        kolza = (CircleImageView)mapsActivity.findViewById(R.id.kolza);
        op = (FloatingActionButton) mapsActivity.findViewById(R.id.fab);
        op1 = (FloatingActionButton) mapsActivity.findViewById(R.id.fab1);
        ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) op1.getLayoutParams();
        p.setMargins(dpToPx(mapsActivity.getBaseContext(), 15), 0, 0, dpToPx(mapsActivity.getBaseContext(), 25) - 50); // get rid of margins since shadow area is now the margin
        op1.setLayoutParams(p);
        SharedPreferences sharedPreferences= mapsActivity.getSharedPreferences("choose",Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        floatingButton();
        toolBarClickListener();
        navSetOnClickListener();
        lobia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("type","lobia");
                editor.commit();
                suggestion fragment ;
                fragment = new suggestion();
                mapsActivity.mapFram.setVisibility(View.GONE);
                op.setVisibility(View.GONE);
                op1.setVisibility(View.GONE);
                mapsActivity.sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                suggestion sg = new suggestion();
                FragmentManager fragmentManager=mapsActivity.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fram,sg);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        kolza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("type","kolza");
                editor.commit();
                suggestion fragment ;
                fragment = new suggestion();
                mapsActivity.mapFram.setVisibility(View.GONE);
                op.setVisibility(View.GONE);
                op1.setVisibility(View.GONE);
                mapsActivity.sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                suggestion sg = new suggestion();
                FragmentManager fragmentManager=mapsActivity.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fram,sg);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        berenj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("type","berenj");
                editor.commit();
                suggestion fragment ;
                fragment = new suggestion();
                mapsActivity.mapFram.setVisibility(View.GONE);
                op.setVisibility(View.GONE);
                op1.setVisibility(View.GONE);
                mapsActivity.sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                suggestion sg = new suggestion();
                FragmentManager fragmentManager=mapsActivity.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fram,sg);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        panbe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("type","panbe");
                editor.commit();
                suggestion fragment ;
                fragment = new suggestion();
                mapsActivity.mapFram.setVisibility(View.GONE);
                op.setVisibility(View.GONE);
                op1.setVisibility(View.GONE);
                mapsActivity.sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                suggestion sg = new suggestion();
                FragmentManager fragmentManager=mapsActivity.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fram,sg);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        gandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("type","gandom");
                editor.commit();
                suggestion fragment ;
                fragment = new suggestion();
                mapsActivity.mapFram.setVisibility(View.GONE);
                op.setVisibility(View.GONE);
                op1.setVisibility(View.GONE);
                mapsActivity.sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                suggestion sg = new suggestion();
                FragmentManager fragmentManager=mapsActivity.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fram,sg);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

    }

    public static int dpToPx(Context context, float dp) {
        // Reference http://.com/questions/8309354/formula-px-to-dp-dp-to-px-android
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) ((dp * scale) + 0.5f);
    }

    public void floatingButton(){
        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mapsActivity.sheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                    mapsActivity.sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                    //layoutParamsoutParams.height=370;
                    // lay.setLayoutParams(layoutParamsoutParams);
                    // btnBottomSheet.setText("Close sheet");
                } else {
                    mapsActivity.sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    Log.i("close","close");

                    // btnBottomSheet.setText("Expand sheet");
                }

            }
        });


        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("from op1","op1");
                mapsActivity.check = 1;
                mapsActivity.CheckUserPermsions();

            }
        });

    }

    public void toolBarClickListener(){

        mapsActivity.toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                int id=item.getItemId();
                switch (id){

                    case R.id.save:
                        mapsActivity.setDialoge("ذخیره","غیر فعال است");
                        break;

                    case R.id.exit:
                        mapsActivity.moveTaskToBack(true);
                        Process.killProcess(Process.myPid());
                        System.exit(1);
                        Toast.makeText(mapsActivity,"از برنامه خارج شدید",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.user_location:
                        mapsActivity.sharedPreferences = mapsActivity.getSharedPreferences("choose",Context.MODE_PRIVATE);
                        final SharedPreferences.Editor editor = mapsActivity.sharedPreferences.edit();
                        int num =mapsActivity.sharedPreferences.getInt("numlocation",0);
                        int i=0;
                        final int[] numLocation = new int[1];
                        //final Nokandeh Nokandeh = new Nokandeh(mapsActivity);


                        final Dialog userDialog = new Dialog(mapsActivity);
                        userDialog.setContentView(R.layout.activity_user_location_dialog);
                        Button loc_ok = (Button)userDialog.findViewById(R.id.location_ok);
                        //userDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT);
                        param.gravity= Gravity.RIGHT;
                        final RadioGroup user_location_radioGroip=(RadioGroup)userDialog.findViewById(R.id.user_location_radioGroip);


                        String[]  array_names= mapsActivity.getResources().getStringArray(R.array.user_dialog);
                        for ( String array_name: array_names ) {
                            RadioButton rb = new RadioButton(mapsActivity);
                            rb.setId(i);
                            rb.setGravity(Gravity.RIGHT);
                            rb.setLayoutParams(param);
                            rb.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
                            i++;
                            rb.setText(array_name);
                            user_location_radioGroip.addView(rb);
                        }
                        user_location_radioGroip.check(num);

                        userDialog.show();
                        // *********************Dialog Click Listeners*********************

                        loc_ok.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                RadioButton rb ;
                                rb = (RadioButton) user_location_radioGroip.getChildAt(numLocation[0]);

                                editor.putInt("numlocation",numLocation[0]);
                                editor.commit();
                                userDialog.dismiss();
                                Toast.makeText(mapsActivity,"موقعیت مکانی ثبت شد: "+rb.getText(),Toast.LENGTH_LONG).show();
                            }
                        });

                        user_location_radioGroip.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                numLocation[0] =checkedId;
                                //Toast.makeText(getBaseContext(),Nokandeh.get(),Toast.LENGTH_LONG).show();
                            }
                        });
                }


                return false;
            }
        });
    }

    public void navSetOnClickListener(){

        mapsActivity.nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.pass:
                        Toast.makeText(mapsActivity,"متد فعال نیست",Toast.LENGTH_LONG).show();
                        mapsActivity.drawer.closeDrawer(Gravity.RIGHT);
                        break;
                    case R.id.recently:
                        Toast.makeText(mapsActivity,"متد فعال نیست",Toast.LENGTH_LONG).show();
                        mapsActivity.drawer.closeDrawer(Gravity.RIGHT);
                        break;
                    case R.id.member:
                        Toast.makeText(mapsActivity,"متد فعال نیست",Toast.LENGTH_LONG).show();
                        mapsActivity.drawer.closeDrawer(Gravity.RIGHT);
                        break;
                    case R.id.pro:
                        Toast.makeText(mapsActivity,"متد فعال نیست",Toast.LENGTH_LONG).show();
                        mapsActivity.drawer.closeDrawer(Gravity.RIGHT);
                        break;
                    case R.id.learn:
                        mapsActivity.startActivity(new Intent(mapsActivity, learn.class));
                        mapsActivity.drawer.closeDrawer(Gravity.RIGHT);
                        break;

                }

                return true;
            }
        });
    }


}
