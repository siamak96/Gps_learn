package development.software.gps_learn;


import android.app.Dialog;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import development.software.gps_learn.Service.Activity_Service;
import development.software.gps_learn.database.DatabaseAccess;
import development.software.gps_learn.classes.buttons;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ImageView expand;
    double x, y;
    String status = "first";
    boolean MarkPermision = false;
    LinearLayout lay;
    public Toolbar toolbar;
    ViewGroup.LayoutParams layoutParamsoutParams;
    public int check;
    TextView[] tv = new TextView[24];
    Location currentLocation;
    FusedLocationProviderClient fusedLocationProviderClient;
    Update_Location update_location;


    public NavigationView nav;
    public String[] mapDesc;
    public String[] address;
    public DrawerLayout drawer;
    public Location location = null;
    public SharedPreferences sharedPreferences;
    public CircleImageView circleImageView;
    public FrameLayout mapFram;
    public CardView layoutBottomSheet, layoutBottomSheet1;
    public BottomSheetBehavior sheetBehavior, sheetBehavior1;
    boolean checkGPS = false;
    boolean checkNetwork = false;
    boolean canGetLocation = false;
    myLocation locationListener;
    LocationManager locationManager;
    buttons btn;

    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 0;
    private static final long MIN_TIME_BW_UPDATES = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        SharedPreferences sharedPreferences = getBaseContext().getSharedPreferences("choose", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        boolean status = sharedPreferences.getBoolean("status", true);
        Log.i("statusVar", status + "");
        if (status == false) {
            Intent intent1 = new Intent(MapsActivity.this, Activity_Erorr.class);
            startActivity(intent1);
        }
        settoolbBar();

        Log.i("kjah", "kuas");

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        final SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        lay = (LinearLayout) findViewById(R.id.lay);
        expand = (ImageView) findViewById(R.id.image);
        layoutBottomSheet = (CardView) findViewById(R.id.bottom_sheet1);
        sheetBehavior = BottomSheetBehavior.from(layoutBottomSheet);
        layoutBottomSheet1 = (CardView) findViewById(R.id.bottom_sheet2);
        sheetBehavior1 = BottomSheetBehavior.from(layoutBottomSheet1);
        circleImageView = (CircleImageView) findViewById(R.id.rice);
        mapFram = (FrameLayout) findViewById(R.id.mapfram);
        layoutParamsoutParams = lay.getLayoutParams();
        btn = new buttons(MapsActivity.this);


        sheetBehavior1.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View view, int i) {
                switch (i) {

                    case BottomSheetBehavior.STATE_HIDDEN: {
                        // sheetBehavior1.setPeekHeight(0);
                        break;
                    }
                    case BottomSheetBehavior.STATE_EXPANDED: {
                        expand.setImageResource(R.drawable.exo);

                    }
                    break;
                    case BottomSheetBehavior.STATE_COLLAPSED: {
                        sheetBehavior1.setState(BottomSheetBehavior.STATE_COLLAPSED);
                        break;
                    }

                    case BottomSheetBehavior.STATE_DRAGGING: {
                        sheetBehavior1.setPeekHeight(sheetBehavior1.getPeekHeight());
                        expand.setImageResource(R.drawable.ex);

                        break;
                    }
                    case BottomSheetBehavior.STATE_SETTLING:
                        break;
                }
            }

            @Override
            public void onSlide(@NonNull View view, float v) {

            }
        });
        sheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                switch (newState) {
                    case BottomSheetBehavior.STATE_HIDDEN: {
                        //  layoutParamsoutParams.height=100;
                        // lay.setLayoutParams(layoutParamsoutParams);
                        break;
                    }
                    case BottomSheetBehavior.STATE_EXPANDED: {

                        // layoutParamsoutParams.height=360;

                        // lay.setLayoutParams(layoutParamsoutParams);
                        // btnBottomSheet.setText("Close Sheet");
                    }
                    break;
                    case BottomSheetBehavior.STATE_COLLAPSED: {
                        //  layoutParamsoutParams.height=100;
                        //  lay.setLayoutParams(layoutParamsoutParams);
                        //  btnBottomSheet.setText("Expand Sheet");
                        break;
                    }

                    case BottomSheetBehavior.STATE_DRAGGING: {
                        //layoutParamsoutParams.height=newState+500;
                        //lay.setLayoutParams(layoutParamsoutParams);
                        break;
                    }
                    case BottomSheetBehavior.STATE_SETTLING:
                        break;
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });
    }

    @Override
    protected void onStart() {
        check = 1;
        //Toast.makeText(this,"start",Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, Activity_Service.class);
        startService(intent);
        super.onStart();
    }

    @Override
    protected void onResume() {
        //Intent intent = new Intent(this, Activity_Service.class);
        // startService(intent);
        super.onResume();
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
        if (mapFram.getVisibility() == View.GONE) {
            mapFram.setVisibility(View.VISIBLE);
            btn.op.setVisibility(View.VISIBLE);
            btn.op1.setVisibility(View.VISIBLE);
        }
        // exit app
        else {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }

    }

    public static int dpToPx(Context context, float dp) {
        // Reference http://.com/questions/8309354/formula-px-to-dp-dp-to-px-android
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) ((dp * scale) + 0.5f);
    }


    public void setDialoge(String title, String suggest) {
        final Dialog dialog = new Dialog(MapsActivity.this);
        // Include dialog.xml file
        dialog.setContentView(R.layout.costum_dialog);
        // Set dialog title
        // dialog.setTitle(title);

        // set values for custom dialog components - text, image and button
        Toolbar toolbar1 = (Toolbar) dialog.findViewById(R.id.Dtoolbar);
        TextView text = (TextView) dialog.findViewById(R.id.textDialog);
        TextView close = (TextView) dialog.findViewById(R.id.close);

        text.setText("مختصات زمین :" + "\nx= " + Double.toString(x) + "    " + "\ny= " + Double.toString(y) + "\n\n" + suggest);
        toolbar1.setTitle(title);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            toolbar1.setTextDirection(View.TEXT_DIRECTION_RTL);
            toolbar1.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);

        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.show();

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


    }

    public void settoolbBar() {

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        nav = (NavigationView) findViewById(R.id.nav);
        toolbar = (Toolbar) findViewById(R.id.toolBar);
        toolbar.inflateMenu(R.menu.main_menu);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            toolbar.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
            toolbar.setTextDirection(View.TEXT_DIRECTION_RTL);
        }
      /*  if (Build.VERSION.SDK_INT <= 21) {
            btn.op1 = (FloatingActionButton)findViewById(R.id.fab1);

            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) btn.op1.getLayoutParams();
            p.setMargins(dpToPx(getBaseContext(), 8), 0, 0, dpToPx(getBaseContext(), 8) - 50); // get rid of margins since shadow area is now the margin
            btn.op1.setLayoutParams(p);
        }*/


        toolbar.setTitle("کشت یار");
        toolbar.setLogo(R.mipmap.icon);
        final ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(MapsActivity.this, drawer, toolbar, R.string.open, R.string.close);

        drawer.addDrawerListener(actionBarDrawerToggle);


        drawer.post(new Runnable() {
            @Override
            public void run() {
                toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (drawer.isDrawerOpen(Gravity.RIGHT)) {
                            drawer.closeDrawer(Gravity.RIGHT);
                        } else
                            drawer.openDrawer(Gravity.RIGHT);
                    }
                });
                actionBarDrawerToggle.syncState();
            }
        });

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    public void CheckUserPermsions() {
        Log.i("from op1", "CheckUserPermsions");
        if (Build.VERSION.SDK_INT >= 23) {
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) !=
                    PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{
                                android.Manifest.permission.ACCESS_FINE_LOCATION},
                        REQUEST_CODE_ASK_PERMISSIONS);
                return;
            }
            firstLocation();
        }

        firstLocation();// init the contact list

    }

    //get acces to location permsion
    final private int REQUEST_CODE_ASK_PERMISSIONS = 123;


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CODE_ASK_PERMISSIONS:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    firstLocation();// init the contact list
                } else {
                    // Permission Denied
                    Toast.makeText(this, "your message", Toast.LENGTH_SHORT)
                            .show();
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    public void firstLocation() {
        Log.i("from op1", "firstLocation");

        // Location location = getLocation();

        //setLocation(location);

        //location=
        //Log.i("from op1", "firstLocation  "+location.getAltitude());


        // Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        status = "first";
        getLocationFinal();
        //getLocation();
        //update_location = new Update_Location();
        //update_location.start();


    }

    public void setLocation(Location location) {
        Log.i("from op1", "setLocation");
        if (location != null && mMap!=null) {


            mMap.clear();
           // Toast.makeText(getBaseContext(), location.getLatitude() + "  " + location.getLongitude(), Toast.LENGTH_LONG).show();
            LatLng sydney = new LatLng(location.getLatitude(), location.getLongitude());
            mMap.addMarker(new MarkerOptions().position(sydney).title("موقعیت کاربر"));

            if(status.equals("first")){
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 16));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
                DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                databaseAccess.open();
                address = databaseAccess.getAddress("aj", location.getLatitude(), location.getLongitude());
                mapDesc = address;
                databaseAccess.close();
                Toast.makeText(getBaseContext(),location.getLatitude()+"\n"+location.getLongitude(),Toast.LENGTH_SHORT).show();
                status="second";
                if(btn.op.getVisibility()==View.GONE){
                    btn.op.setVisibility(View.VISIBLE);
                }

            }

        }else if(location!=null){
            Toast.makeText(getBaseContext(),location.getLatitude()+"\n"+location.getLongitude(),Toast.LENGTH_SHORT).show();

        }
    }


    public Location getLocation() {
        Log.i("from op1", "getLocation");
        try {

            final myLocation myLocation = new myLocation(this);
            LocationManager lm = (LocationManager) getSystemService(MapsActivity.LOCATION_SERVICE);

            // get GPS status
            checkGPS = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);

            // get network provider status
            checkNetwork = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
            if (!checkGPS && !checkNetwork) {
                Toast.makeText(this, "No Service Provider is available", Toast.LENGTH_SHORT).show();
            } else {
                if (Build.VERSION.SDK_INT >= 23) {
                        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) !=
                                PackageManager.PERMISSION_GRANTED) {
                            requestPermissions(new String[]{
                                            android.Manifest.permission.ACCESS_FINE_LOCATION},
                                    REQUEST_CODE_ASK_PERMISSIONS);

                        }

                }
                if(checkNetwork){

                    lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, MIN_TIME_BW_UPDATES,
                            MIN_DISTANCE_CHANGE_FOR_UPDATES, myLocation);
                    Criteria criteria = new Criteria();
                    criteria.setAccuracy(Criteria.ACCURACY_COARSE);
                    String provider = lm.getBestProvider(criteria, true);


                    Toast.makeText(getBaseContext(),lm.getLastKnownLocation(provider)+"  "+
                            ""+lm.GPS_PROVIDER+"  "+lm.getLastKnownLocation(lm.GPS_PROVIDER),Toast.LENGTH_SHORT).show();
                }else if (checkGPS){
                    lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, MIN_TIME_BW_UPDATES,
                            MIN_DISTANCE_CHANGE_FOR_UPDATES, myLocation);
                }




            }


        } catch (Exception e) {

        }


        return myLocation.location;
    }


    //this for test
    public Location getUpdateLocation() {
        try {
            Log.i("from op1", "getUpdateLocation try");

            final myLocation myLocation = new myLocation(this);
            LocationManager lm = (LocationManager) getSystemService(LOCATION_SERVICE);


            // get GPS status
            checkGPS = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);

            // get network provider status
            checkNetwork = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
            if (!checkGPS) {
                Toast.makeText(this, "No Service Provider is available", Toast.LENGTH_SHORT).show();
            } else {
                Log.i("from op1", "getUpdateLocation else");

               /* lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, MIN_TIME_BW_UPDATES,
                        MIN_DISTANCE_CHANGE_FOR_UPDATES, myLocation);*/
                if (Build.VERSION.SDK_INT >= 23) {
                    if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) !=
                            PackageManager.PERMISSION_GRANTED) {
                        requestPermissions(new String[]{
                                        android.Manifest.permission.ACCESS_FINE_LOCATION},
                                REQUEST_CODE_ASK_PERMISSIONS);

                    }

                }

                myLocation.location = lm.getLastKnownLocation(lm.GPS_PROVIDER);
                Log.i("from op1","latitude: "+myLocation.location.getLatitude()+"--longitude: "+myLocation.location.getLongitude());



                return myLocation.location;




            }


        } catch (Exception e) {

        }

        return myLocation.location;
    }

    public void getLocationFinal(){

        locationListener = new myLocation(MapsActivity.this);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        checkGPS = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

        // get network provider status
        checkNetwork = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        if (!checkGPS ) {
            Toast.makeText(this, "No Service Provider is available", Toast.LENGTH_SHORT).show();
        } else {

            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
            Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);


            if(location==null){
                Toast.makeText(getBaseContext(),location+"",Toast.LENGTH_SHORT).show();
                location=getLastKnownLocation();
                setLocation(location);
                //Toast.makeText(getBaseContext(),location+"",Toast.LENGTH_SHORT).show();
            }else {
                setLocation(location);
            }
        }

    }
    private Location getLastKnownLocation() {
        LocationManager mLocationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        List<String> providers = mLocationManager.getProviders(true);
        Location bestLocation = null;
        for (String provider : providers) {
            Location l = mLocationManager.getLastKnownLocation(provider);

            // Log.d("last known location, provider: %s, location: %s", provider, l);

            if (l == null) {
                continue;
            }
            if (bestLocation == null
                    || l.getAccuracy() < bestLocation.getAccuracy()) {
                //Log.d("found best last known location: %s", l);
                bestLocation = l;
            }
        }
        if (bestLocation == null) {
            return null;
        }
        return bestLocation;
    }



    class Update_Location extends Thread {

        @Override
        public void run() {
           // while (status.equals("first")) {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        /*Location location = getUpdateLocation();
                       Log.i("from op1", "Update_Location");

                        // Toast.makeText(getBaseContext(),"1",Toast.LENGTH_LONG).show();
                        if (myLocation.location != null && status.equals("first")) {
                            //Toast.makeText(getBaseContext(),"2",Toast.LENGTH_LONG).show();
                           setLocation(location);
                            status="second";


                        }*/
                    }
                });

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

          //  }

        }

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        tv[0] = (TextView) findViewById(R.id.tv1);
        tv[1] = (TextView) findViewById(R.id.tv2);
        tv[2] = (TextView) findViewById(R.id.tv3);
        tv[3] = (TextView) findViewById(R.id.tv4);
        tv[4] = (TextView) findViewById(R.id.tv5);
        tv[5] = (TextView) findViewById(R.id.tv6);
        tv[6] = (TextView) findViewById(R.id.tv7);
        tv[7] = (TextView) findViewById(R.id.tv8);
        tv[8] = (TextView) findViewById(R.id.tv9);
        tv[9] = (TextView) findViewById(R.id.tv10);
        tv[10] = (TextView) findViewById(R.id.tv11);
        tv[11] = (TextView) findViewById(R.id.tv12);
        tv[12] = (TextView) findViewById(R.id.tv13);
        tv[13] = (TextView) findViewById(R.id.tv14);
        tv[14] = (TextView) findViewById(R.id.tv15);
        tv[15] = (TextView) findViewById(R.id.tv16);
        tv[16] = (TextView) findViewById(R.id.tv17);
        tv[17] = (TextView) findViewById(R.id.tv18);
        tv[18] = (TextView) findViewById(R.id.tv19);
        tv[19] = (TextView) findViewById(R.id.tv20);
        tv[20] = (TextView) findViewById(R.id.tv21);
        tv[21] = (TextView) findViewById(R.id.tv22);
        tv[22] = (TextView) findViewById(R.id.tv23);
        tv[23] = (TextView) findViewById(R.id.tv24);
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                if (sheetBehavior1.getState() != BottomSheetBehavior.STATE_EXPANDED) {

                   /* DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
                    databaseAccess.open();
                    String[] address = databaseAccess.getAddress("aj",x,y);
                    mapDesc=address;*/
                    for (int i = 0; i < 24; i++) {
                        tv[i].setText(address[i]);

                    }

                    //  dialog.setContentView(R.layout.table_row);

                    //  dialog.show();


                    sheetBehavior1.setState(BottomSheetBehavior.STATE_EXPANDED);
                    //sheetBehavior1.setPeekHeight(0);
                    sheetBehavior1.setPeekHeight(600);
                    Log.i("close", "open");

                } else {
                    sheetBehavior1.setPeekHeight(0);
                    sheetBehavior1.setState(BottomSheetBehavior.STATE_COLLAPSED);

                    Log.i("close", "close");

                    // btnBottomSheet.setText("Expand sheet");
                }
                return false;

            }
        });
        // Add a marker in Sydney and move the camera

    }


}
