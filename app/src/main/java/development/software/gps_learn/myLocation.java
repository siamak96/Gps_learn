package development.software.gps_learn;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by SoftWare on 10/4/2018.
 */

public class myLocation implements LocationListener {
    MapsActivity context;
    public static Location location;
    public myLocation(Context context){
        this.context= (MapsActivity) context;

    }

    @Override
    public void onLocationChanged(Location location) {
        this.location=location;
        context.setLocation(location);
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {
       // Toast.makeText(context,"changed",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onProviderEnabled(String s) {
      //  Toast.makeText(context,"Enable",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onProviderDisabled(String s) {
        //Toast.makeText(context,"Disable",Toast.LENGTH_SHORT).show();


    }
}
