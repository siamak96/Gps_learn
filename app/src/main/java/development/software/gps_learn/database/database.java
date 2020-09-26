package development.software.gps_learn.database;

/**
 * Created by SoftWare on 11/7/2018.
         */

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


/**
 * Created by SoftWare on 11/6/2018.
 */

class dataBase extends SQLiteAssetHelper {
    private static final String Db_name  = "data.db";
    private static final int version = 1;

    public dataBase(Context context) {
        super(context,Db_name,null, version);

    }


}
