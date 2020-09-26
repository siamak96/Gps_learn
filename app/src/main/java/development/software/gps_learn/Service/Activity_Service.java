package development.software.gps_learn.Service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.github.nkzawa.emitter.Emitter;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URISyntaxException;
import java.util.Timer;
import java.util.TimerTask;

import development.software.gps_learn.Activity_Erorr;
import development.software.gps_learn.MapsActivity;

public class Activity_Service extends Service {


    static {
        System.loadLibrary("native-lib");
    }

    public Activity_Service() {
        //Toast.makeText(Activity_Service.this.getApplicationContext(),"service",Toast.LENGTH_LONG).show();

    }

    int twice = 0;
    Context ctx;
    Intent intent;
    RequestQueue requestQueue;
    Socket socket;
    boolean status;
    private static Timer timer = new Timer();

    public native String stringFromJNI();

    @Override
    public void onCreate() {
        super.onCreate();
        String url = stringFromJNI();

        try {

            socket = IO.socket(url);
            socket.connect();
            socket.emit("join", "keshtYar");


        } catch (URISyntaxException e) {
            e.printStackTrace();

        }
        socket.on("message", new Emitter.Listener() {
            @Override
            public void call(final Object... args) {

                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {

                        SharedPreferences sharedPreferences= getBaseContext().getSharedPreferences("choose",Context.MODE_PRIVATE);
                        final SharedPreferences.Editor editor = sharedPreferences.edit();
                        JSONObject data = (JSONObject) args[0];
                        try {
                            //extract data from fired event

                            String nickname = data.getString("senderNickname");
                            String message = data.getString("message");

                            status = sharedPreferences.getBoolean("status",true);
                            Log.i("statusVar1",status+"");

                            if(message.equals("disactive") && status==true){

                                editor.putBoolean("status",false);
                                editor.commit();
                                Intent intent1 = new Intent(ctx,Activity_Erorr.class);
                                startActivity(intent1);
                                Toast.makeText(getBaseContext(), nickname+": "+message, Toast.LENGTH_LONG).show();


                            }else if(message.equals("active") && status==false){
                                editor.putBoolean("status",true);
                                editor.commit();
                                Intent intent = new Intent(ctx, MapsActivity.class);
                                ctx.startActivity(intent);
                                Toast.makeText(getBaseContext(), nickname+": "+message, Toast.LENGTH_LONG).show();

                            }

                            // make instance of message


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });





            }
        });
        try {
            SharedPreferences sharedPreferences= getBaseContext().getSharedPreferences("choose",Context.MODE_PRIVATE);
            status=sharedPreferences.getBoolean("status",true);
            socket.emit("status", status);
        }catch (Exception e){

        }



    }

    @Override
    public IBinder onBind(Intent intent) {
        this.intent = intent;
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(final Intent intent, int flags, int startId) {


        ctx = getBaseContext();
        requestQueue = Volley.newRequestQueue(getApplicationContext());
        //Toast.makeText(getApplicationContext(),"service",Toast.LENGTH_LONG).show();
       // jsonParse();

        timer.scheduleAtFixedRate(

                new TimerTask() {

                    public void run() {
                        //  Toast.makeText(getApplicationContext(),"service",Toast.LENGTH_LONG).show();


                    }
                }, 500, 1 * 5 * 1000);

        return START_NOT_STICKY;


    }

  /*  private void jsonParse() {
        final String[] activate = new String[1];
        final String url = stringFromJNI();
        //Toast.makeText(getApplicationContext(),"service",Toast.LENGTH_LONG).show();

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONArray jsonArray = response.getJSONArray("activate_respons");
                            //Toast.makeText(getApplicationContext(),,Toast.LENGTH_LONG).show();

                            // for (int i = 0; i < jsonArray.length(); i++) {
                            int i = jsonArray.length() - 1;
                            JSONObject employee = jsonArray.getJSONObject(0);

                            if(employee.getString("active").equals("1")){
                                activate[0] = employee.getString("active");
                                if(twice==0){
                                    twice=1;
                                Toast.makeText(ctx,"دسترسی غیر مجاز",Toast.LENGTH_LONG).show();
                                Intent intent1 = new Intent(ctx,Activity_Erorr.class);
                                startActivity(intent1);}
                            }



                            // mTextViewResult.append(firstName + ", " + String.valueOf(age) + ", " + mail + "\n\n");


                            //  }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        requestQueue.add(request);


    }*/


}
