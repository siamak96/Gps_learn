package development.software.gps_learn.classes;

import android.content.Context;
import android.util.Log;

import development.software.gps_learn.MapsActivity;

public class baghliMarame {

    /// sum of tables == 11
    MapsActivity mapsActivity;



    public baghliMarame(Context context) {
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

        } else if (oc >= 1 && oc < 1.5) {
            Log.e("error", "oc2");
            String[] result={"2","3","4","5","6","90","130","170","210","240"};
            return result;


        } else if (oc >= 1.5 && oc<2 ) {
            Log.e("error", "oc3");
            String[] result={"2","3","4","5","6","75","115","155","195","225"};
            return result;
        } else if(oc>=2){
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


        if(so4<7 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","110","150","190","220","250"};
            return result;

        }else if(so4>=7 && so4<9){
            String[] result={"2","3","4","5","6","95","135","175","205","235"};
            return result;

        }else if(so4>=9 && so4<10){
            String[] result={"2","3","4","5","6","80","120","160","190","220"};
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

        if(so4<300 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","0","0","80","120","150"};
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
        //table 4 colomns  6 6 *

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);




        if(oc<1){
            Log.e("error","oc1");
            String[] result={"2","3","4","5","6","7","130","180","230","280","320","360"};
            return result;

        } else if(oc>=1 && oc<1.5){
            Log.e("error","oc2");
            String[] result={"2","3","4","5","6","7","100","150","200","250","290","330"};
            return result;


        }  else if(oc>=1.5 && oc<2){
            Log.e("error","oc3");
            String[] result={"2","3","4","5","6","7","75","125","175","225","265","305"};
            return result;


        }  else if( oc>=2){
            Log.e("error","oc4");
            String[] result={"2","3","4","5","6","7","50","100","150","200","240","280"};
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


        if(so4<7 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","7","140","170","200","230","260","280"};
            return result;

        }else if(so4>=7 && so4<9){
            String[] result={"2","3","4","5","6","7","100","130","160","160","220","240"};
            return result;

        }else if(so4>=9 && so4<10){
            String[] result={"2","3","4","5","6","7","80","110","140","170","200","220"};
            return result;


        }else if(so4>=10){
            String[] result={"2","3","4","5","6","7","60","90","120","150","180","200"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }


    //////////////////////////Kolza/////////////////////////
    public String[] getOCkolza(){
        //Double[] mapDesc=Double.parseDouble(mapsActivity.mapDesc[]);

//table 6  colomns 7 7 *
        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);

        if(oc<1){
            Log.e("error","oc1");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "155", "180","205","230","255","275","295"} ;
            return result;

        } else if(oc>=1 && oc<1.5){
            Log.e("error","oc2");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "135", "160","185","210","235","255","275"} ;
            return result;


        }  else if(oc>=1.5 && oc<2){
            Log.e("error","oc3");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "95", "120","145","170","195","215","235"} ;
            return result;


        }  else if( oc>=2){
            Log.e("error","oc4");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "70", "95","120","145","170","190","210"} ;
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

//table 7
        if(so4<7 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "90", "110","130","150","170","190","205"} ;
            return result;

        }else if(so4>=7 && so4<9){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "75", "95","115","135","155","175","190"} ;
            return result;

        }else if(so4>=9 && so4<10){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "60", "80","100","120","140","160","175"} ;
            return result;


        }else if(so4>=10){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "50", "70","90","110","130","150","165"} ;
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }



    ////////////////////////////////////////Soya///////////////////////////////////////////

    public String [] getPSoya(){
//table 8 colomn * 7 *
        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }


        if(so4<7 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "35", "55","75","95","115","120","125"} ;
            return result;

        }else if(so4>=7 && so4<9){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "25", "45","65","85","105","110","115"} ;
            return result;

        }else if(so4>=9 && so4<10){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "25", "40","60","80","100","105","110"} ;
            return result;

        }else if(so4>=10){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "25", "35","55","75","95","100","105"} ;
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }


    ///////////////////////Berenj////////////////////////

    public  String[] getOcBerenj(){

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);



//table 9 clomns  6 6 6
//توصیه کودی اوره

        if(oc<1){
            Log.e("error","oc1");
            String[] result={"3","4","5","6", "7", "8", "230", "270","310","330","350","370"} ;
            return result;

        } else if(oc>=1 && oc<1.5){
            Log.e("error","oc2");
            String[] result={"3","4","5","6", "7", "8", "200", "240","280","300","320","340"} ;
            return result;


        }  else if(oc>=1.5 && oc<2 ){
            Log.e("error","oc3");
            String[] result={"3","4","5","6", "7", "8", "150", "190","230","250","270","290"} ;
            return result;


        }else if(oc>=2){
            String[] result={"3","4","5","6", "7", "8", "100", "140","180","200","220","240"} ;
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

//table 10
// دی امونیوم فسفات
        if(so4<7 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"3","4","5","6", "7", "8", "100", "130","170","220","270","310"} ;
            return result;

        }else if(so4>=7 && so4<9){
            String[] result={"3","4","5","6", "7", "8", "80", "110","150","200","250","290"} ;
            return result;

        }else if(so4>=9 && so4<10){
            String[] result={"3","4","5","6", "7", "8", "60", "90","130","175","215","250"} ;
            return result;


        }else if(so4>=10){
            String[] result={"3","4","5","6", "7", "8", "50", "80","120","160","190","220"} ;
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

    public String [] getKBerenj(){
        //table 11

        double so4 ;

        if(mapsActivity.mapDesc[8]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[8]);
        }else {
            so4=0;
        }
        if(so4<300 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"3","4","5","6", "7", "8", "120", "160","200","220","240","260"} ;
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



