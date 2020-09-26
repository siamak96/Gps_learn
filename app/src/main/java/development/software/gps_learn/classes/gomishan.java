package development.software.gps_learn.classes;

import android.content.Context;
import android.util.Log;

import development.software.gps_learn.MapsActivity;

public class gomishan {
    /// sum of tables == 9
    MapsActivity mapsActivity;



    public gomishan(Context context) {
        mapsActivity = (MapsActivity) context;

    }


    /////////////////Panbe//////////////////////

    public String[] getOcpanbe() {
        //table 1 colomns 5 5 5

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);


        if (oc < 1) {
            Log.e("error", "oc1");
            String[] result={"2","3","4","5","6","110","150","190","230","260"};
            return result;

        } else if (oc >= 1 && oc < 1.1) {
            Log.e("error", "oc2");
            String[] result={"2","3","4","5","6","100","140","180","220","250"};
            return result;


        } else if (oc >= 1.1 && oc<1.2 ) {
            Log.e("error", "oc3");
            String[] result={"2","3","4","5","6","90","130","170","210","240"};
            return result;
        } else if(oc>=1.2){
            String[] result={"2","3","4","5","6","80","120","160","200","230"};
            return  result;

        }





        return null;
    }

    public String [] getPpanbe(){
//پتاسیم
        //table 2
        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }


        if(so4<5 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","130","170","210","240","270"};
            return result;

        }else if(so4>=5 && so4<7){
            String[] result={"2","3","4","5","6","115","155","195","225","255"};
            return result;

        }else if(so4>=7 && so4<10){
            String[] result={"2","3","4","5","6","90","130","170","200","230"};
            return result;

        }else if(so4>=10 ) {
            String[] result={"2","3","4","5","6","70","110","150","180","210"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

    public String[] getKPanbe(){
        //table 3
        double so4 ;

        if(mapsActivity.mapDesc[8]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[8]);
        }else {
            so4=0;
        }

        if(so4<200 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","90","170","230","260","290"};
            return result;
        }else if (so4>=200 && so4<250){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","70","150","200","240","270"};;
            return result;
        }else if (so4>=250 && so4<300){
            String[] result={"2","3","4","5","6","0","65","125","155","185"};
            return  result;

        }else if (so4>=300){
            String[] result={"2","3","4","5","6","0","0","0","0","0"};
            return result;

        }else {
            String[] result={""};
            return result;
        }




    }

    ////////////////////Gandom///////////////////////////
    public  String[] getOcGandom(){
        //table 4 colomns  6 6 5

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);




        if(oc<1){
            Log.e("error","oc1");
            String[] result={"2","3","4","5","6","7","130","180","230","280","320","360"};
            return result;

        } else if(oc>=1 && oc<1.1){
            Log.e("error","oc2");
            String[] result={"2","3","4","5","6","7","120","170","220","270","310","350"};
            return result;


        }  else if(oc>=1.1 && oc<1.2){
            Log.e("error","oc3");
            String[] result={"2","3","4","5","6","7","110","160","210","260","300","340"};
            return result;


        }  else if( oc>=1.2){
            Log.e("error","oc4");
            String[] result={"2","3","4","5","6","7","100","150","200","250","290","330"};
            return result;
        }




        return null;
    }

    public String [] getPGandom(){

        //table 5

        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }


        if(so4<5 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","7","170","200","230","260","290","310"};
            return result;

        }else if(so4>=5 && so4<7){
            String[] result={"2","3","4","5","6","7","150","180","210","240","270","290"};
            return result;

        }else if(so4>=7 && so4<10){
            String[] result={"2","3","4","5","6","7","100","130","160","190","220","240"};
            return result;


        }else if(so4>=10){
            String[] result={"2","3","4","5","6","7","60","90","120","150","180","200"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

    public String[] getKGandom(){
        //table 6
        double so4 ;

        if(mapsActivity.mapDesc[8]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[8]);
        }else {
            so4=0;
        }

        if(so4<200 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","0","20","40","60","80"};
            return result;
        }else if (so4>=200 && so4<250){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","0","0","0","0","25"};
            return result;
        }else if (so4>=250){
            String[] result={"2","3","4","5","6","0","0","0","0","0"};
            return  result;

        }else {
            String[] result={""};
            return result;
        }



    }


    //////////////////////////Kolza/////////////////////////
    public String[] getOCkolza(){
        //Double[] mapDesc=Double.parseDouble(mapsActivity.mapDesc[]);

//table 7  colomns 7 7 7
        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);

        if(oc<1.1){
            Log.e("error","oc1");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "155", "180","205","230","255","275","295"} ;
            return result;

        } else if(oc>=1.1 && oc<1.2){
            Log.e("error","oc2");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "145", "170","195","220","245","265","285"} ;
            return result;


        }  else if(oc>=1.2 && oc<1.2){
            Log.e("error","oc3");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "135", "160","185","210","235","255","275"} ;
            return result;


        }  else if( oc>=1.2){
            Log.e("error","oc4");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "125", "150","175","200","225","245","265"} ;
            return result;
        }

        return null;
    }

    public String [] getPKolza(){

        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }

//table 8
        if(so4<5 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "110", "130","150","170","190","210","225"} ;
            return result;

        }else if(so4>=5 && so4<7){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "95", "115","135","155","175","195","210"} ;
            return result;

        }else if(so4>=7 && so4<10){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "70", "90","110","130","150","170","185"} ;
            return result;


        }else if(so4>=10){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "50", "70","90","110","130","150","165"} ;
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

    public String[] getKKolza(){
        //table 9
        double so4 ;

        if(mapsActivity.mapDesc[8]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[8]);
        }else {
            so4=0;
        }

        if(so4<200 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "0", "10","20","30","40","50","60"} ;
            return result;
        }else if (so4>=200 && so4<250){
            Log.e("error","oc3"+so4);
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "0", "0","0","0","15","25","35"} ;
            return result;
        }else if (so4>=250){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "0", "0","0","0","0","0","0"} ;
            return  result;

        }else {
            String[] result={""};
            return result;
        }



    }



}




