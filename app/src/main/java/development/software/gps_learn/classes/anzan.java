package development.software.gps_learn.classes;

import android.content.Context;
import android.util.Log;

import development.software.gps_learn.MapsActivity;

public class anzan {

    /// sum of tables == 14
    MapsActivity mapsActivity;


    public anzan(Context context) {
        mapsActivity = (MapsActivity) context;

    }


    /////////////////Panbe//////////////////////

    public String[] getOcpanbe() {
        //table 1 colomns 5 5 5

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);


        if (oc < 1.2) {
            Log.e("error", "oc1");
            String[] result={"2","3","4","5","6","90","130","170","210","240"};
            return result;

        } else if (oc >= 1.2 && oc < 1.4) {
            Log.e("error", "oc2");
            String[] result={"2","3","4","5","6","85","125","165","205","235"};
            return result;


        } else if (oc >= 1.4 && oc<1.5 ) {
            Log.e("error", "oc3");
            String[] result={"2","3","4","5","6","80","120","160","200","230"};
            return result;
        } else if(oc>=1.5){
            String[] result={"2","3","4","5","6","75","115","155","195","225"};
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


        if(so4<10 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","80","120","160","190","220"};
            return result;

        }else if(so4>=10 && so4<15){
            String[] result={"2","3","4","5","6","50","90","130","160","190"};
            return result;

        }else if(so4>=15 && so4<20){
            String[] result={"2","3","4","5","6","0","30","70","100","130"};
            return result;

        }else if(so4>=20 ) {
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

        if(so4<70 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","240","340","380","420","450"};
            return result;
        }else if (so4>=70 && so4<100){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","220","320","360","400","430"};
            return result;
        }else if (so4>=100 && so4<130){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","180","280","320","350","380"};
            return result;
        }else if (so4>=130 && so4<150){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","155","255","295","325","355"};
            return result;
        }else if (so4>=150){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","140","240","280","310","340"};
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




        if(oc<1.2){
            Log.e("error","oc1");
            String[] result={"2","3","4","5","6","7","115",	"165",	"215",	"265",	"305",	"345"} ;
            return result;

        } else if(oc>=1.2 && oc<1.4){
            Log.e("error","oc2");
            String[] result={"2","3","4","5","6","7","100",	"150",	"200",	"250",	"290",	"330"} ;
            return result;


        }  else if(oc>=1.4 && oc<1.5){
            Log.e("error","oc3");
            String[] result={"2","3","4","5","6","7","90",	"140",	"190",	"240",	"280",	"320"} ;
            return result;


        }  else if( oc>=1.5){
            Log.e("error","oc4");
            String[] result={"2","3","4","5","6","7",	"80",	"130",	"180",	"230",	"270",	"310"} ;
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


        if(so4<10 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","7",	"80",	"110",	"140",	"170",	"200","220"};
            return result;

        }else if(so4>=10 && so4<15){
            String[] result={"2","3","4","5","6","7",	"20",	"50",	"80",	"110",	"140","160"};
            return result;

        }else if(so4>=15 && so4<20){
            String[] result={"2","3","4","5","6","7",	"0",	"0",	"25",	"50",	"75","90"};
            return result;


        }else if(so4>=20){
            String[] result={"2","3","4","5","6","7",	"0",	"0",	"0",	"0",	"0","0"};
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


        if(so4<70 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6",	"230",	"250",	"270",	"290","310"};
            return result;

        }else if(so4>=70 && so4<100){
            String[] result={"2","3","4","5","6",	"210",	"230",	"250",	"270",	"290"};
            return result;

        }else if(so4>=100 && so4<130){
            String[] result={"2","3","4","5","6",	"175",	"195",	"215",	"235",	"255"};
            return result;

        }else if(so4>=130 && so4<150){
            String[] result={"2","3","4","5","6",	"130",	"150",	"170",	"190",	"210"};
            return result;

        }else if(so4>=150){
            String[] result={"2","3","4","5","6",	"100",	"120",	"140",	"160",	"180"};
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

        if(oc<1.2){
            Log.e("error","oc1");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "135", "160","185","210","235","255","275"} ;
            return result;

        } else if(oc>=1.2 && oc<1.4){
            Log.e("error","oc2");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "120", "145","170","195","220","240","260"} ;
            return result;


        }  else if(oc>=1.4 && oc<1.5){
            Log.e("error","oc3");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "110", "135","160","185","210","230","250"} ;
            return result;


        }  else if( oc>=1.5){
            Log.e("error","oc4");
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "100", "125","150","175","200","220","240"} ;
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
        if(so4<10 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "60", "80","100","120","140","160","175"} ;
            return result;

        }else if(so4>=10 && so4<15){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "30", "50","70","90","110","130","145"} ;
            return result;

        }else if(so4>=15 && so4<20){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "0", "0","15","30","45","60","70"} ;
            return result;


        }else if(so4>=20){
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


        if(so4<70 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "115", "135","155","175","195","215","235"} ;
            return result;

        }else if(so4>=70 && so4<100){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "100", "120","140","160","180","200","220"} ;
            return result;

        }else if(so4>=100 && so4<130){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "80", "100","120","140","160","180","200"} ;
            return result;
        }else if(so4>=130 && so4<150){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "60", "80","100","120","140","160","180"} ;
            return result;

        }else if(so4>=150){
            String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "45", "65","85","105","125","145","165"} ;
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


        if(so4<10 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "25", "40","60","80","100","105","110"} ;
            return result;

        }else if(so4>=10 && so4<15){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "0", "25","35","55","75","80","85"} ;
            return result;

        }else if(so4>=15 && so4<20){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "0", "0","0","0","25","30","35"} ;
            return result;

        }else if(so4>=20){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "0", "0","0","0","0","0","0"} ;
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


        if(so4<70 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "100", "130","160","190","210","230","240"} ;
            return result;

        }else if(so4>=70 && so4<100){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "90", "120","150","180","200","220","230"} ;
            return result;

        }else if(so4>=100 &&so4<130 ){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "75", "105","135","165","185","205","215"} ;
            return result;

        }else if(so4>=130 && so4<150){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "65", "95","125","155","175","195","205"} ;

            return result;

        }else if(so4>=150){
            String[] result={"1","1.5","2","2.5","3", "3.5", "4", "55", "85","115","145","165","185","195"} ;
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

        if(oc<1.2){
            Log.e("error","oc1");
            String[] result={"3","4","5","6", "7", "8", "210", "250","290","310","330","350"} ;
            return result;

        } else if(oc>=1.2 && oc<1.4){
            Log.e("error","oc2");
            String[] result={"3","4","5","6", "7", "8", "195", "235","275","295","315","335"} ;
            return result;


        }  else if(oc>=1.4 && oc<1.5 ){
            Log.e("error","oc3");
            String[] result={"3","4","5","6", "7", "8", "180", "220","260","280","300","320"} ;
            return result;


        }else if(oc>=1.5){
            String[] result={"3","4","5","6", "7", "8", "170", "210","250","270","290","310"} ;
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
        if(so4<10 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"3","4","5","6", "7", "8", "60", "90","130","175","215","250"} ;
            return result;

        }else if(so4>=10 && so4<15){
            String[] result={"3","4","5","6", "7", "8", "50", "75","100","120","150","175"} ;
            return result;

        }else if(so4>=15 && so4<20){
            String[] result={"3","4","5","6", "7", "8", "0", "0","50","50","60","70"} ;
            return result;


        }else if(so4>=20){
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
        if(so4<70 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"3","4","5","6", "7", "8", "310", "360","410","440","470","500"} ;
            return result;

        }else if(so4>=70 && so4<100){
            String[] result={"3","4","5","6", "7", "8", "300", "350","400","430","460","490"} ;
            return result;

        }else if(so4>=100 &&so4<130 ){
            String[] result={"3","4","5","6", "7", "8", "275", "325","375","405","435","465"} ;
            return result;

        }else if(so4>=130 && so4<150){
            String[] result={"3","4","5","6", "7", "8", "260", "310","360","390","420","450"} ;

            return result;

        }else if(so4>=150){
            String[] result={"3","4","5","6", "7", "8", "255", "305","350","375","400","425"} ;
            return result;

        } else {
            String[] result={""};
            return result;
        }


    }
}


