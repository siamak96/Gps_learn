package development.software.gps_learn.database;

/**
 * Created by SoftWare on 11/7/2018.
 */
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.util.Log;

import java.io.File;

/**
 * Created by SoftWare on 11/6/2018.
 */

public class DatabaseAccess {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    double x , y ,smallest;


    private static DatabaseAccess instance;
    Cursor c = null;

    private DatabaseAccess(Context context ){
        this.openHelper=new dataBase(context);


        smallest=0;

    }

    public static DatabaseAccess getInstance(Context context){

        if(instance==null){
            instance=new DatabaseAccess(context);
        }
        return instance;
    }

    public  void open(){
      /*  File outFile = new File(Environment.getDataDirectory(), "FarmDataBase.db.zip");
        outFile.setWritable(true);
        SQLiteDatabase.openDatabase(outFile.getAbsolutePath(), null, SQLiteDatabase.OPEN_READWRITE);*/
        this.db=this.openHelper.getReadableDatabase();

    }

    public void close(){
        if(db!=null){
            this.db.close();
        }
    }

    public String[] getAddress(String n, double x2 , double y2){

        c=db.rawQuery("select * from farm ",new String[]{});
        StringBuffer buffer = new StringBuffer();
        StringBuffer result = new StringBuffer();
        String Mresult[] = new String[24];
        int i =0;
        int j=0;

        double distance[]=new double[5000];

        while (c.moveToNext()){
            i=0;
            // while (2>i){
            double x1 = c.getDouble(0);

            double y1 = c.getDouble(1);

            distance[j] = nearestPoint(x2,x1,y2,y1);
            if(j==0){
                smallest=distance[0];
            }

            buffer.append(distance[j]+"....");
            Log.i("database", "getAddress: "+distance[j]);
            i++;

            if(distance[j]<smallest){
                smallest=distance[j];
                i=j;
            }
            //}

            j++;
        }
        c.moveToPosition(i);
        for(int k = 0 ; k<24 ; k++){
        Mresult[k] = c.getString(k);
        }
       // result.append(smallest+"\n");
        //result.append("x="+x1+"\n"+"y="+y1+"\n LOCATION="+l);


        return Mresult;

    }


    public double nearestPoint(double x1, double x2 , double y1, double y2){

        double result ;

        result=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));


        return result;


    }
}
