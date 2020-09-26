package development.software.gps_learn.classes;

import android.content.Context;
import android.util.Log;

import java.util.Arrays;

import development.software.gps_learn.MapsActivity;

public class Nokandeh {
    MapsActivity mapsActivity;


   public Nokandeh(Context context){
       mapsActivity=(MapsActivity) context;



    }

public String[] getOC(){
       //Double[] mapDesc=Double.parseDouble(mapsActivity.mapDesc[]);


    double oc = Double.parseDouble(mapsActivity.mapDesc[6]);




       if(oc<1.3){
           Log.e("error","oc1");
           String[] result={""} ;
           return result;

       } else if(oc>=1.3 && oc<1.5){
           Log.e("error","oc2");
           String[] result={""} ;
           return result;


       }  else if(oc>=1.5 && oc<1.7){
           Log.e("error","oc3");
           String[] result={""} ;
           return result;


       }  else if( oc>=1.7){
           Log.e("error","oc4");
           String[] result={"2","3","4","5","6","215", "185", "145", "105", "65"} ;
           return result;
       }




       return null;


}

public String [] getSO4(){

    double so4 ;

    if(mapsActivity.mapDesc[7]!=null){

      so4= Double.parseDouble(mapsActivity.mapDesc[7]);
    }else {
        so4=0;
    }


    if(so4<130 && so4!=0){
        Log.e("error","oc3"+so4);
        String[] result={"2","3","4","5","6","170","270","310",	"350","380"};
        return result;

    }else if(so4>=130 && so4<150){
        String[] result={"2","3","4","5","6","155",	"255",	"295",	"335",	"365"};
        return result;

    }else if(so4>=150 && so4<180){
        String[] result={"2","3","4","5","6","120",	"220",	"260",	"300",	"330"};
        return result;

    }else if(so4>=180 && so4<200) {
        String[] result={"2","3","4","5","6",	"100",	"190",	"240",	"280",	"310"};
        return result;

    }else if(so4>=200){
        String[] result={"2","3","4","5","6",	"90",	"170",	"220",	"260",	"290"};
        return result;

    }else {
        String[] result={""};
        return result;
    }

}

public  String[] getOcGandom(){

    double oc = Double.parseDouble(mapsActivity.mapDesc[6]);




    if(oc<1.3){
        Log.e("error","oc1");
        String[] result={"2","3","4","5","6","7","110",	"160",	"210",	"260",	"300",	"340"} ;
        return result;

    } else if(oc>=1.3 && oc<1.5){
        Log.e("error","oc2");
        String[] result={"2","3","4","5","6","7","95",	"145",	"195",	"245",	"285",	"225"} ;
        return result;


    }  else if(oc>=1.5 && oc<1.7){
        Log.e("error","oc3");
        String[] result={"2","3","4","5","6","7","80",	"130",	"180",	"230",	"270",	"310"} ;
        return result;


    }  else if( oc>=1.7){
        Log.e("error","oc4");
        String[] result={"2","3","4","5","6","7",	"65",	"115",	"165",	"215",	"255",	"295"} ;
        return result;
    }




    return null;
}

    public String [] getSO4Gandom(){

        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }


        if(so4<130 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6",	"160",	"180",	"200",	"220",	"240"};
            return result;

        }else if(so4>=130 && so4<150){
            String[] result={"2","3","4","5","6","130",	"150",	"170",	"190",	"210"};
            return result;

        }else if(so4>=150 && so4<180){
            String[] result={"2","3","4","5","6","80","100","120","140","160"};
            return result;

        }else if(so4>=180 && so4<200) {
            String[] result={"2","3","4","5","6","15","35","55","75","95"};
            return result;

        }else if(so4>=200){
            String[] result={"2","3","4","5","6",	"0",	"0",	"15"	,"35"	,"55"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

    public  String[] getOcKolza(){

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);




        if(oc<1.3){
            Log.e("error","oc1");
            String[] result={"1000","1400","1800","2200","2600","3000","3400","125","150","175","200","225","245","265"} ;
            return result;

        } else if(oc>=1.3 && oc<1.5){
            Log.e("error","oc2");
            String[] result={"1000","1400","1800","2200","2600","3000","3400","110","135","160","185","210","230","250"} ;
            return result;


        }  else if(oc>=1.5 && oc<1.7){
            Log.e("error","oc3");
            String[] result={"1000","1400","1800","2200","2600","3000","3400","95","120","145","170","195","215","235"} ;
            return result;


        }  else if( oc>=1.7){
            Log.e("error","oc4");
            String[] result={"1000","1400","1800","2200","2600","3000","3400","80","105","130","155","180","200","220"} ;
            return result;
        }




        return null;
    }

    public String [] getSO4Kolza(){

        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }


        if(so4<130 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1000","1400","1800","2200","2600","3000","3400","70","90","110","130","150","170","190"};
            return result;

        }else if(so4>=130 && so4<150){
            String[] result={"1000","1400","1800","2200","2600","3000","3400","60","80","100","120","140","160","180"};
            return result;

        }else if(so4>=150 && so4<180){
            String[] result={"1000","1400","1800","2200","2600","3000","3400","40","60","80","100","120","140","160"};
            return result;

        }else if(so4>=180 && so4<200) {
            String[] result={"1000","1400","1800","2200","2600","3000","3400","20","35","50","65","80","95","110"};
            return result;

        }else if(so4>=200){
            String[] result={"1000","1400","1800","2200","2600","3000","3400","0","0","0","20","30","40","50"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

    public String [] getSO4Soya(){

        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }


        if(so4<130 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1","1.5","2","2.5","3","3.5","4","70","100","130","160","180","200","210"};
            return result;

        }else if(so4>=130 && so4<150){
            String[] result={"1","1.5","2","2.5","3","3.5","4","65","95","125","155","175","195","205"};
            return result;

        }else if(so4>=150 && so4<180){
            String[] result={"1","1.5","2","2.5","3","3.5","4",	"50","80","110","140","160","180","190"};
            return result;

        }else if(so4>=180 && so4<200) {
            String[] result={"1","1.5","2","2.5","3","3.5","4","0","55","85","120","140","160","170"};
            return result;

        }else if(so4>=200){
            String[] result={"1","1.5","2","2.5","3","3.5","4",	"0","45","65","100","120","140","150"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

    public  String[] getOcBerenj(){

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);




        if(oc<1.3){
            Log.e("error","oc1");
            String[] result={"3","4","5","6","7","8","200","240","280","300","320","340"} ;
            return result;

        } else if(oc>=1.3 && oc<1.5){
            Log.e("error","oc2");
            String[] result={"3","4","5","6","7","8","95","185","225","265","285","305","325"} ;
            return result;


        }  else if(oc>=1.5 && oc<1.7){
            Log.e("error","oc3");
            String[] result={"3","4","5","6","7","8","165","205","245","265","285","305"} ;
            return result;


        }  else if( oc>=1.7){
            Log.e("error","oc4");
            String[] result={"3","4","5","6","7","8","150","190","230","250","270","290"} ;
            return result;
        }




        return null;
    }

    public String [] getSO4Berenj(){

        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }


        if(so4<130 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"3","4","5","6","7","8","150","190","230","250","270","290"};
            return result;

        }else if(so4>=130 && so4<150){
            String[] result={"3","4","5","6","7","8","260","310","360","390","420","450"};
            return result;

        }else if(so4>=150 && so4<180){
            String[] result={"3","4","5","6","7","8","250","300","340","360","380","400"};
            return result;

        }else if(so4>=180 && so4<200) {
            String[] result={"3","4","5","6","7","8","230","270","310","330","350","370"};
            return result;

        }else if(so4>=200){
            String[] result={"3","4","5","6","7","8","220","260","300","320","340","360"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }



}




