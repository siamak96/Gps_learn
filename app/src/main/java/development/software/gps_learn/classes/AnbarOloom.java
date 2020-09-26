package development.software.gps_learn.classes;

import android.content.Context;
import android.util.Log;

import java.util.Arrays;

import development.software.gps_learn.MapsActivity;

public class AnbarOloom{
    MapsActivity mapsActivity;


   public AnbarOloom(Context context){
       mapsActivity=(MapsActivity) context;

    }


//  توصیه کودی اوره
// carbon
    public  String[] getOcpanbe(){

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);




        if(oc<0.8){
            Log.e("error","oc1");
            String[] result={"2","3","4","5","6","120","160","200","240","270"} ;
            return result;

        } else if(oc>=0.8 && oc<1){
            Log.e("error","oc2");
            String[] result={"2","3","4","5","6","110","150","190","230","260"} ;
            return result;


        }  else if(oc>=1 && oc<1.5){
            Log.e("error","oc3");
            String[] result={"2","3","4","5","6","90","130","170","210","240"} ;
            return result;


        }  else if( oc>=1.5){
            Log.e("error","oc4");
            String[] result={"2","3","4","5","6","75","115","155","195","225"} ;
            return result;
        }




        return null;
    }//توصیه کودی دی امونیوم فسفات یا سوپر فسفات تریپل (کیلو گرم در هکتار)
//متن زیر جدول دو موندش
//پتاسیم برای کود در آمونیوم فسفات
//Phosphor
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

        }else if(so4>=8 && so4<10){
            String[] result={"2","3","4","5","6","85","125","165","195","225"};
            return result;

        }else if(so4>=10 && so4<15){
            String[] result={"2","3","4","5","6","50","90","130","160","190"};
            return result;

        }else if(so4>=15 ) {
            String[] result={"2","3","4","5","6","0","40","80","110","140"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

    //توصیه کودی سولفات پتاسیم ( کیلوگرم در هکتار )
//Potasium
    public String [] getKpanbe(){

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
        }else if (so4 >= 300){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","0","0","0","0","0"};
            return result;
        }else {
            String[] result={""};
            return result;
        }

    }

    ////////////////////////////////Gandom////////////////////////////////
//anbaroloom
//table 4
public  String[] getOcGandom(){

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);




        if(oc<0.8){
            Log.e("error","oc1");
            String[] result={"2","3","4","5","6","7","150",	"200",	"250",	"300",	"340",	"380"} ;
            return result;

        } else if(oc>=0.8 && oc<1){
            Log.e("error","oc2");
            String[] result={"2","3","4","5","6","7","130",	"180",	"230",	"280",	"320",	"360"} ;
            return result;


        }  else if(oc>=1 && oc<1.5){
            Log.e("error","oc3");
            String[] result={"2","3","4","5","6","7","100",	"150",	"200",	"250",	"290",	"330"} ;
            return result;


        }  else if( oc>=1.5){
            Log.e("error","oc4");
            String[] result={"2","3","4","5","6","7",	"80",	"130",	"180",	"230",	"270",	"310"} ;
            return result;
        }




        return null;
    }
    //table 5
//دی امونیوم فسفات یا سوپر فسفات ترپیل
public String [] getPGandom(){

        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }


        if(so4<8 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"2","3","4","5","6","7","120",	"150",	"180",	"210",	"240","260"};
            return result;

        }else if(so4>=8 && so4<10){
            String[] result={"2","3","4","5","6","7",	"90",	"120",	"150",	"180",	"210","230"};
            return result;

        }else if(so4>=10 && so4<15){
            String[] result={"2","3","4","5","6","7",	"20",	"50",	"80",	"110",	"140","160"};
            return result;


        }else if(so4>=15){
            String[] result={"2","3","4","5","6","7",	"0",	"0",	"25",	"50",	"75","90"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

///////////////////////////////////////KOLZA////////////////////////

public String[] getOCkolza(){
       //Double[] mapDesc=Double.parseDouble(mapsActivity.mapDesc[]);

//table 6
    double oc = Double.parseDouble(mapsActivity.mapDesc[6]);

       if(oc<0.8){
           Log.e("error","oc1");
           String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "180", "205","230","255","280","300","320"} ;
           return result;

       } else if(oc>=0.8 && oc<1){
           Log.e("error","oc2");
           String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "160", "185","210","235","260","280","300"} ;
           return result;


       }  else if(oc>=1 && oc<1.5){
           Log.e("error","oc3");
           String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "135", "160","185","210","235","255","275"} ;
           return result;


       }  else if( oc>=1.5){
           Log.e("error","oc4");
           String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "110", "135","160","185","210","230","250"} ;
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

    }else if(so4>=8 && so4<10){
           String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "65", "85","105","125","145","165","180"} ;
        return result;

    }else if(so4>=10 && so4<15){
           String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "30", "50","70","90","110","130","145"} ;
        return result;


    }else if(so4>=15){
           String[] result={"1000","1400","1800","2200","2600", "3000", "3400", "0", "0","15","30","45","60","70"} ;
        return result;

    }else {
        String[] result={""};
        return result;
    }

}



//////////////////////////////SOYA///////////////////////////////



//table 8
public String [] getPSoya(){

        double so4 ;

        if(mapsActivity.mapDesc[7]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[7]);
        }else {
            so4=0;
        }


        if(so4<8 && so4!=0){
            Log.e("error","oc1"+so4);
            String[] result={"1","1.5","2","2.5","3","3.5","4","30","50","70","90","110","115","120"};
            return result;

        }else if(so4>=8 && so4<10){
            Log.e("error","oc2"+so4);
            String[] result={"1","1.5","2","2.5","3","3.5","4","25","40","60","80","100","105","110"};
            return result;

        }else if(so4>=10 && so4<15){
            Log.e("error","oc33"+so4);
            String[] result={"1","1.5","2","2.5","3","3.5","4",	"0","25","35","55","75","80","85"};
            return result;

        }else if(so4>=15){

            String[] result={"1","1.5","2","2.5","3","3.5","4",	"0","0","0","0","40","45","50"};
            Log.e("error","oc4:"+result[13]);
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }

/////////////////////////////////BERENJ//////////////////////////



public  String[] getOcBerenj(){

        double oc = Double.parseDouble(mapsActivity.mapDesc[6]);



//table 9
//توصیه کودی اوره

        if(oc<0.8){
            Log.e("error","oc1");
            String[] result={"3","4","5","6","7","8","250","290","330","350","370","390"} ;
            return result;

        } else if(oc>=0.8 && oc<1){
            Log.e("error","oc2");
            String[] result={"3","4","5","6","7","8","235","275","315","335","355","375"} ;
            return result;


        }  else if(oc>=1 && oc<1.5){
            Log.e("error","oc3");
            String[] result={"3","4","5","6","7","8","200","240","280","300","320","340"} ;
            return result;


        }  else if( oc>=1.5){
            Log.e("error","oc4");
            String[] result={"3","4","5","6","7","8","170","210","250","270","290","310"} ;
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
            String[] result={"3","4","5","6","7","8","85","115","155","205","255","295"};
            return result;

        }else if(so4>=8 && so4<10){
            String[] result={"3","4","5","6","7","8","70","100","140","185","230","270"};
            return result;

        }else if(so4>=10 && so4<15){
            String[] result={"3","4","5","6","7","8","50","75","100","120","150","175"};
            return result;


        }else if(so4>=15){
            String[] result={"3","4","5","6","7","8","0","50","50","75","95","110"};
            return result;

        }else {
            String[] result={""};
            return result;
        }

    }
	
	//table 11
	//سولفات پتاسیم
public String [] getKBerenj(){

        double so4 ;

        if(mapsActivity.mapDesc[8]!=null){

            so4= Double.parseDouble(mapsActivity.mapDesc[8]);
        }else {
            so4=0;
        }
        if(so4<300 && so4!=0){
            Log.e("error","oc3"+so4);
            String[] result={"3","4","5","6","7","8","120","160","200","220","240","260"};
            return result;
        }else if (so4 >= 300){
            Log.e("error","oc3"+so4);
            String[] result={"3","4","5","6","7","8","100","140","180","200","220","240"};
            return result;
         }else {
            String[] result={""};
            return result;
        }

    }



}




