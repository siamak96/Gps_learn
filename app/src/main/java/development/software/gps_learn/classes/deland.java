package development.software.gps_learn.classes;

import android.content.Context;
import android.util.Log;

import development.software.gps_learn.MapsActivity;

public class deland {

    /// sum of tables == 14
    MapsActivity mapsActivity;


    public deland(Context context) {
        mapsActivity = (MapsActivity) context;

    }


    /////////////////Panbe//////////////////////

    public String[] getOcpanbe() {
        //table 1 colomns 5 5 5

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);


        if (oc < 1.5) {
            Log.e("error", "oc1");
            String[] result={"2","3","4","5","6","80","120","160","200","230"};
            return result;

        } else if (oc >= 1.5 && oc < 1.7) {
            Log.e("error", "oc2");
            String[] result={"2","3","4","5","6","75","115","155","195","225"};
            return result;


        } else if (oc >= 1.7 && oc<1.9 ) {
            Log.e("error", "oc3");
            String[] result={"2","3","4","5","6","70","110","150","190","220"};
            return result;
        } else if(oc>=1.9){
            String[] result={"2","3","4","5","6","60","100","140","180","210"};
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


        if(so4<15 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","20","50","90","120","150"};
            return result;

        }else if(so4>=15 && so4<25){
            String[] result={"2","3","4","5","6","0","10","50","80","110"};
            return result;

        }else if(so4>=25 ) {
            String[] result={"2","3","4","5","6","0","0","0","0","0"};
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
            String[] result={"2","3","4","5","6","70","150","200","240","270"};
            return result;
        }else if (so4>=250 && so4<300){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","0","65","125","155","185"};
            return result;
        }else if (so4>=300){
            Log.e("error","oc3"+so4);
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




        if(oc<1.5){
            Log.e("error","oc1");
            String[] result={"2","3","4","5","6","7","95","145","195","245","285","325"};
            return result;

        } else if(oc>=1.5 && oc<1.7){
            Log.e("error","oc2");
            String[] result={"2","3","4","5","6","7","75","125","175","225","265","305"};
            return result;


        }  else if(oc>=1.7 && oc<1.9){
            Log.e("error","oc3");
            String[] result={"2","3","4","5","6","7","65","115","165","215","255","295"};
            return result;


        }  else if( oc>=1.9){
            Log.e("error","oc4");
            String[] result={"2","3","4","5","6","7","55","105","155","205","245","285"};
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


        if(so4<15 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","7","0","10","40","70","100","120"};
            return result;

        }else if(so4>=15 && so4<25){
            String[] result={"2","3","4","5","6","7","0","0","10","30","50","60"};
            return result;

        }else if(so4>=25){
            String[] result={"2","3","4","5","6","7","0","0","0","0","0","0"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }
    public String[] getKGandom(){
        //teble 6

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

        }else if(so4>=200 && so4<250){
            String[] result={"2","3","4","5","6","0","0","0","0","25"};
            return result;

        }else if(so4>=250){
            String[] result={"2","3","4","5","6","0","0","0","0","0"};
            return result;

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

        if(oc<1.5){
            Log.e("error","oc1");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "105", "130","155","180","205","225","245"} ;
            return result;

        } else if(oc>=1.5 && oc<1.7){
            Log.e("error","oc2");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "95", "120","145","170","195","215","235"} ;
            return result;


        }  else if(oc>=1.7 && oc<1.9){
            Log.e("error","oc3");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "80", "105","130","155","180","200","220"} ;
            return result;


        }  else if( oc>=1.9){
            Log.e("error","oc4");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "75", "100","125","150","175","195","215"} ;
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
        if(so4<15 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "10", "30","50","70","90","110","125"} ;
            return result;

        }else if(so4>=15){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "0", "0","0","0","0","0","0"} ;
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

    public String[] getKKolza(){
        //teble 9

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

        }else if(so4>=200 && so4<250){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "0", "0","0","0","15","25","35"} ;
            return result;

        }else if(so4>=250){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "0", "0","0","0","0","0","0"} ;
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

    ////////////////////////////////////////Soya///////////////////////////////////////////

    public String [] getPSoya(){
//table 10 colomn 7 7
        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }


        if(so4<15 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "0", "0","0","25","50","55","60"} ;
            return result;

        }else if(so4>=15){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "0", "0","0","0","0","0","25"} ;
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }
    public String[] getKSoya(){
        //teble 11

        double so4 ;

        if(mapsActivity.mapDesc[8]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[8]);
        }else {
            so4=0;
        }


        if(so4<200 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "0", "55","85","120","140","160","170"} ;
            return result;

        }else if(so4>=200 && so4<250){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "0", "0","0","40","60","80","90"} ;
            return result;

        }else if(so4>=250){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "0", "0","0","0","0","0","0"} ;
            return result;

        } else {
            String[] result={""};
            return result;
        }

    }

    ///////////////////////Berenj////////////////////////

    public  String[] getOcBerenj(){

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);



//table 12 clomns  6 6 6
//توصیه کودی اوره

        if(oc<1.5){
            Log.e("error","oc1");
            String[] result={"3","4","5","6", "7", "8", "180", "220","260","280","300","320"} ;
            return result;

        } else if(oc>=1.5 && oc<1.7){
            Log.e("error","oc2");
            String[] result={"3","4","5","6", "7", "8", "165", "205","245","265","285","305"} ;
            return result;


        }  else if(oc>=1.7 && oc<1.9 ){
            Log.e("error","oc3");
            String[] result={"3","4","5","6", "7", "8", "145", "185","225","245","265","285"} ;
            return result;


        }else if(oc>=1.9){
            String[] result={"3","4","5","6", "7", "8", "130", "170","210","230","250","270"} ;
            return  result;

        }




        return null;
    }

    public String [] getPBerenj(){

        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }

//table 13
// دی امونیوم فسفات
        if(so4<15 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"3","4","5","6", "7", "8", "0", "50","75","100","120","135"} ;
            return result;

        }else if(so4>=15){
            String[] result={"3","4","5","6", "7", "8", "0", "0","0","0","0","0"} ;
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

    public String [] getKBerenj(){
        //table 14

        double so4 ;

        if(mapsActivity.mapDesc[8]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[8]);
        }else {
            so4=0;
        }
        if(so4<200 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"3","4","5","6", "7", "8", "230", "270","310","330","350","370"} ;
            return result;

        }else if(so4>=200 && so4<250){
            String[] result={"3","4","5","6", "7", "8", "200", "240","280","300","320","340"} ;
            return result;

        }else if(so4>=250 &&so4<300 ){
            String[] result={"3","4","5","6", "7", "8", "150", "190","230","250","270","290"} ;
            return result;

        }else if(so4>=300){
            String[] result={"3","4","5","6", "7", "8", "100", "140","180","200","220","240"} ;
            return result;

        } else {
            String[] result={""};
            return result;
        }


    }
}
