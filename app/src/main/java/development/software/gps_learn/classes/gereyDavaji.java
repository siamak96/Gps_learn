package development.software.gps_learn.classes;

import android.content.Context;
import android.util.Log;

import development.software.gps_learn.MapsActivity;

public class gereyDavaji {
    MapsActivity mapsActivity;



    public gereyDavaji(Context context) {
        mapsActivity = (MapsActivity) context;

    }


    /////////////////Panbe//////////////////////

    public String[] getOcpanbe() {
        //table 1 colomns 5 5 5

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);


        if (oc < 1.3) {
            Log.e("error", "oc1");
            String[] result={"2","3","4","5","6","85","125","165","205","235"};
            return result;

        } else if (oc >= 1.3 && oc < 1.5) {
            Log.e("error", "oc2");
            String[] result={"2","3","4","5","6","80","120","160","200","230"};
            return result;


        } else if (oc >= 1.5 && oc<1.6 ) {
            Log.e("error", "oc3");
            String[] result={"2","3","4","5","6","75","115","155","195","225"};
            return result;
        } else if(oc>=1.6){
            String[] result={"2","3","4","5","6","70","110","150","190","220"};
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


        if(so4<8 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","100","140","180","210","240"};
            return result;

        }else if(so4>=8 && so4<10){
            String[] result={"2","3","4","5","6","85","125","165","195","225"};
            return result;

        }else if(so4>=10 && so4<12){
            String[] result={"2","3","4","5","6","65","105","145","175","205"};
            return result;

        }else if(so4>=12 ) {
            String[] result={"2","3","4","5","6","50","90","130","160","190"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }



    ////////////////////Gandom///////////////////////////
    public  String[] getOcGandom(){
        //table 3 colomns  6 6 *

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);




        if(oc<1.3){
            Log.e("error","oc1");
            String[] result={"2","3","4","5","6","7","110","160","210","260","300","340"};
            return result;

        } else if(oc>=1.3 && oc<1.5){
            Log.e("error","oc2");
            String[] result={"2","3","4","5","6","7","95","145","195","245","285","225"};
            return result;


        }  else if(oc>=1.5 && oc<1.6){
            Log.e("error","oc3");
            String[] result={"2","3","4","5","6","7","80","130","180","230","270","310"};
            return result;


        }  else if( oc>=1.6){
            Log.e("error","oc4");
            String[] result={"2","3","4","5","6","7","70","120","170","220","260","300"};
            return result;
        }




        return null;
    }

    public String [] getPGandom(){

        //table 4

        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }


        if(so4<8 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","7","120","150","180","210","240","260"};
            return result;

        }else if(so4>=8 && so4<10){
            String[] result={"2","3","4","5","6","7","90","120","150","180","210","230"};
            return result;

        }else if(so4>=10 && so4<12){
            String[] result={"2","3","4","5","6","7","50","80","110","140","170","190"};
            return result;


        }else if(so4>=12){
            String[] result={"2","3","4","5","6","7","20","50","80","110","140","160"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }


    //////////////////////////Kolza/////////////////////////
    public String[] getOCkolza(){
        //Double[] mapDesc=Double.parseDouble(mapsActivity.mapDesc[]);

//table 5  colomns 7 7 *
        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);

        if(oc<1.3){
            Log.e("error","oc1");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "125", "150","175","200","225","245","265"} ;
            return result;

        } else if(oc>=1.3 && oc<1.5){
            Log.e("error","oc2");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "110", "135","160","185","210","230","250"} ;
            return result;


        }  else if(oc>=1.5 && oc<1.6){
            Log.e("error","oc3");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "95", "120","145","170","195","215","235"} ;
            return result;


        }  else if( oc>=1.6){
            Log.e("error","oc4");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "90", "115","140","165","190","210","230"} ;
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

//table 6
        if(so4<8 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "80", "100","120","140","160","180","195"} ;
            return result;

        }else if(so4>=8 && so4<10){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "65", "85","105","125","145","165","180"} ;
            return result;

        }else if(so4>=10 && so4<12){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "45", "65","85","105","125","145","160"} ;
            return result;


        }else if(so4>=12){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "30", "50","70","90","110","130","145"} ;

            return result;

        }else {
            String[] result={""};
            return result;
        }

    }



    ////////////////////////////////////////Soya///////////////////////////////////////////

    public String [] getPSoya(){
//table 7 colomn * 7 *
        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }


        if(so4<8 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "30", "50","70","90","110","115","120"} ;
            return result;

        }else if(so4>=8 && so4<10){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "25", "40","60","80","100","105","110"} ;
            return result;

        }else if(so4>=10 && so4<12){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "25", "30","50","70","90","95","100"} ;
            return result;

        }else if(so4>=12){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "0", "25","35","55","75","80","85"} ;
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }


    ///////////////////////Berenj////////////////////////

    public  String[] getOcBerenj(){

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);



//table 8 clomns  6 6 6
//توصیه کودی اوره

        if(oc<1.3){
            Log.e("error","oc1");
            String[] result={"3","4","5","6", "7", "8", "200", "240","280","300","320","340"} ;
            return result;

        } else if(oc>=1.3 && oc<1.5){
            Log.e("error","oc2");
            String[] result={"3","4","5","6", "7", "8", "185", "225","265","285","305","325"} ;
            return result;


        }  else if(oc>=1.5 && oc<1.6 ){
            Log.e("error","oc3");
            String[] result={"3","4","5","6", "7", "8", "170", "210","250","270","290","310"} ;
            return result;


        }else if(oc>=1.6){
            String[] result={"3","4","5","6", "7", "8", "160", "200","240","260","280","300"} ;
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

//table 9
// دی امونیوم فسفات
        if(so4<8 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"3","4","5","6", "7", "8", "85", "115","155","205","255","295"} ;
            return result;

        }else if(so4>=8 && so4<10){
            String[] result={"3","4","5","6", "7", "8", "70", "100","140","185","230","270"} ;
            return result;

        }else if(so4>=10 && so4<12){
            String[] result={"3","4","5","6", "7", "8", "50", "75","115","150","180","210"} ;
            return result;


        }else if(so4>=12){
            String[] result={"3","4","5","6", "7", "8", "50", "75","100","120","150","175"} ;
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

    public String [] getKBerenj(){
        //table 10

        double so4 ;

        if(mapsActivity.mapDesc[8]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[8]);
        }else {
            so4=0;
        }
        if(so4>=300){
            String[] result={"3","4","5","6", "7", "8", "100", "140","180","200","220","240"} ;
            return result;

        } else {
            String[] result={"0","0","0","0", "0", "0", "0", "0","0","0","0","0"} ;
            return result;
        }


    }
}

