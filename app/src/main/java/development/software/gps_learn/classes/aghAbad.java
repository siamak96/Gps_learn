package development.software.gps_learn.classes;

import android.content.Context;
import android.util.Log;

import development.software.gps_learn.MapsActivity;

public class aghAbad {

    MapsActivity mapsActivity;


    public aghAbad(Context context) {
        mapsActivity = (MapsActivity) context;

    }

    public String[] getOcpanbe() {

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);


        if (oc < 0.9) {
            Log.e("error", "oc1");
            String[] result={"2","3","4","5","6","115","155","195","235","265"};
            return result;

        } else if (oc >= 0.9 && oc < 1) {
            Log.e("error", "oc2");
            String[] result={"2","3","4","5","6","110","150","190","230","260"};
            return result;


        } else if (oc >= 1) {
            Log.e("error", "oc3");
            String[] result={"2","3","4","5","6","90","130","170","210","240"};
            return result;}





        return null;
    }

    public String [] getPpanbe(){
//پتاسیم
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

        }else if(so4>=8 && so4<9){
             String[] result={"2","3","4","5","6","90","130","170","200","230"};
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

    ////////////////////Gandom///////////////////////////
    public  String[] getOcGandom(){

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);




        if(oc<0.9){
            Log.e("error","oc1");
            String[] result={"2","3","4","5","6","7","140","190","240","290","330","370"};
            return result;

        } else if(oc>=0.9 && oc<1){
            Log.e("error","oc2");
            String[] result={"2","3","4","5","6","7","130","180","230","280","320","360"};
            return result;


        }  else if(oc>=1 ){
            Log.e("error","oc3");
            String[] result={"2","3","4","5","6","7","120","170","220","270","310","350"};
            return result;


        }




        return null;
    }

    public String [] getPGandom(){

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

        }else if(so4>=8 && so4<9){
            String[] result={"2","3","4","5","6","7","100","130","160","190","220","240"};
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

//table 6
        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);

        if(oc<0.9){
            Log.e("error","oc1");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "170", "195","220","245","270","290","310"} ;
            return result;

        } else if(oc>=0.9 && oc<1){
            Log.e("error","oc2");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "150", "175","200","225","250","270","290"} ;
            return result;


        }  else if(oc>=1 ){
            Log.e("error","oc3");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "135", "160","185","210","235","255","275"} ;
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
        if(so4<8 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "80", "100","120","140","160","180","195"} ;
            return result;

        }else if(so4>=8 && so4<9){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "70", "90","110","130","150","170","185"} ;
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

        }else if(so4>=8 && so4<9){
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



//table 9
//توصیه کودی اوره

        if(oc<0.9){
            Log.e("error","oc1");
            String[] result={"3","4","5","6", "7", "8", "240", "280","320","340","360","380"} ;
            return result;

        } else if(oc>=0.9 && oc<1){
            Log.e("error","oc2");
            String[] result={"3","4","5","6", "7", "8", "230", "270","310","330","350","370"} ;
            return result;


        }  else if(oc>=1 ){
            Log.e("error","oc3");
            String[] result={"3","4","5","6", "7", "8", "220", "260","300","320","340","360"} ;
            return result;


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
        if(so4<8 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"3","4","5","6", "7", "8", "85", "115","155","205","255","295"} ;
            return result;

        }else if(so4>=8 && so4<9){
            String[] result={"3","4","5","6", "7", "8", "75", "105","145","195","245","285"} ;
            return result;

        }else if(so4>=9 && so4<10){
            String[] result={"3","4","5","6", "7", "8", "60", "90","130","170","215","250"} ;
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

        double so4 ;

        if(mapsActivity.mapDesc[8]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[8]);
        }else {
            so4=0;
        }
        if(so4>300 ){
            Log.e("error","oc3"+so4);
            String[] result={"3","4","5","6", "7", "8", "100", "140","180","200","220","240"} ;
            return result;
        }

        return null;

    }



}
