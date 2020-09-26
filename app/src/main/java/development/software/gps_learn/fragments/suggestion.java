package development.software.gps_learn.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import development.software.gps_learn.R;
import development.software.gps_learn.classes.AnbarOloom;
import development.software.gps_learn.classes.Nokandeh;
import development.software.gps_learn.classes.aghAbad;
import development.software.gps_learn.classes.aghBand;
import development.software.gps_learn.classes.aghGhala;
import development.software.gps_learn.classes.aliAbad;
import development.software.gps_learn.classes.anzan;
import development.software.gps_learn.classes.baghliMarame;
import development.software.gps_learn.classes.bandarTorkman;
import development.software.gps_learn.classes.chehelChay;
import development.software.gps_learn.classes.deland;
import development.software.gps_learn.classes.fajr;
import development.software.gps_learn.classes.fazelAbad;
import development.software.gps_learn.classes.fenderSek;
import development.software.gps_learn.classes.galehMiran;
import development.software.gps_learn.classes.galiKesh;
import development.software.gps_learn.classes.gereyDavaji;
import development.software.gps_learn.classes.gomishan;
import development.software.gps_learn.classes.gorgan;
import development.software.gps_learn.classes.gorjiMahaleh;
import development.software.gps_learn.classes.jelin;
import development.software.gps_learn.classes.kordKouy;
import development.software.gps_learn.classes.mazraehKatoul;
import development.software.gps_learn.classes.neginShahr;
import development.software.gps_learn.classes.nodehMalak;
import development.software.gps_learn.classes.pishkamar;
import development.software.gps_learn.classes.siminShahr;
import development.software.gps_learn.classes.soltanAli;
import development.software.gps_learn.classes.sorkhanKalateh;


public class suggestion extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    TextView suggest, so4Not, KNot, OcNot, suggest_P, suggest_K;
    TableLayout table, table1, table2;


    public suggestion() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // create ContextThemeWrapper from the original Activity Context with the custom theme
        //final Context contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.fragmentTheme);

        // clone the inflater using the ContextThemeWrapper
        //LayoutInflater localInflater = inflater.cloneInContext(contextThemeWrapper);
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_suggestion, container, false);
        inflater.getContext().setTheme(R.style.fragmentTheme);


        suggest = (TextView) view.findViewById(R.id.suggest_OC);
        suggest_P = (TextView) view.findViewById(R.id.suggest_P);
        suggest_K = (TextView) view.findViewById(R.id.suggest_K);
        OcNot = (TextView) view.findViewById(R.id.OcNot);
        so4Not = (TextView) view.findViewById(R.id.so4Not);
        KNot = (TextView) view.findViewById(R.id.so4Not1);
        table = (TableLayout) view.findViewById(R.id.table);
        table1 = (TableLayout) view.findViewById(R.id.table1);
        table2 = (TableLayout) view.findViewById(R.id.table2);
        getLocation();


        return view;
    }


    private void getLocation() {

        SharedPreferences sharedPreferences = getContext().getSharedPreferences("choose", Context.MODE_PRIVATE);
        int locat = sharedPreferences.getInt("numlocation", -1);
        String type = sharedPreferences.getString("type", "non");
        Log.i("locatedtest", locat + "");

        switch (locat) {

            case 0: {
                Log.i("locateTest", "nokandeh");
                Log.i("type", type);

                if (type.equals("panbe")) {
                    Nokandeh nokandeh = new Nokandeh(getContext());
                    String[] co = nokandeh.getOC();
                    String[] so4 = nokandeh.getSO4();
                    setTable(co, so4, new String[]{""}, 5, 5, 5);
                    break;
                } else if (type.equals("berenj")) {
                    Nokandeh nokandeh = new Nokandeh(getContext());
                    String[] co = nokandeh.getOcBerenj();
                    String[] so4 = nokandeh.getSO4Berenj();
                    setTable(co, so4, new String[]{""}, 6, 6, 6);
                    break;

                } else if (type.equals("gandom")) {
                    Nokandeh nokandeh = new Nokandeh(getContext());
                    String[] co = nokandeh.getOcGandom();
                    String[] so4 = nokandeh.getSO4Gandom();
                    setTable(co, so4, new String[]{""}, 6, 5, 5);
                    break;

                } else if (type.equals("kolza")) {
                    Nokandeh nokandeh = new Nokandeh(getContext());
                    String[] co = nokandeh.getOcKolza();
                    String[] so4 = nokandeh.getSO4Kolza();
                    setTable(co, so4, new String[]{""}, 7, 7, 7);
                    break;

                } else if (type.equals("lobia")) {
                    Nokandeh nokandeh = new Nokandeh(getContext());
                    String[] so4 = nokandeh.getSO4Soya();
                    setTable(new String[]{""}, so4, new String[]{""}, 7, 7, 7);
                    break;
                }
            }
            case 1:
                //14 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    sorkhanKalateh sorkhanKalateh = new sorkhanKalateh(getContext());
                    String[] co = sorkhanKalateh.getOcpanbe();
                    String[] p = sorkhanKalateh.getPpanbe();
                    String[] k = sorkhanKalateh.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    sorkhanKalateh sorkhanKalateh = new sorkhanKalateh(getContext());
                    String[] co = sorkhanKalateh.getOcGandom();
                    String[] p = sorkhanKalateh.getPGandom();
                    String[] k = sorkhanKalateh.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    sorkhanKalateh sorkhanKalateh = new sorkhanKalateh(getContext());
                    String[] co = sorkhanKalateh.getOCkolza();
                    String[] p = sorkhanKalateh.getPKolza();
                    String[] k = sorkhanKalateh.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    sorkhanKalateh sorkhanKalateh = new sorkhanKalateh(getContext());
                    String[] p = sorkhanKalateh.getPSoya();
                    String[] k = sorkhanKalateh.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    sorkhanKalateh sorkhanKalateh = new sorkhanKalateh(getContext());
                    String[] co = sorkhanKalateh.getOcBerenj();
                    String[] p = sorkhanKalateh.getPBerenj();
                    String[] k = sorkhanKalateh.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }
            case 2:
                // 11 tables
            {
                Log.i("type", type);

                if (type.equals("panbe")) {
                    soltanAli soltanAli = new soltanAli(getContext());
                    String[] co = soltanAli.getOcpanbe();
                    String[] p = soltanAli.getPpanbe();
                    String[] k = soltanAli.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    soltanAli soltanAli = new soltanAli(getContext());
                    String[] co = soltanAli.getOcGandom();
                    String[] p = soltanAli.getPGandom();


                    setTable(co, p, new String[]{""}, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    soltanAli soltanAli = new soltanAli(getContext());
                    String[] co = soltanAli.getOCkolza();
                    String[] p = soltanAli.getPKolza();


                    setTable(co, p, new String[]{""}, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    soltanAli soltanAli = new soltanAli(getContext());
                    String[] p = soltanAli.getPSoya();


                    setTable(new String[]{""}, p, new String[]{""}, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    soltanAli soltanAli = new soltanAli(getContext());
                    String[] co = soltanAli.getOcBerenj();
                    String[] p = soltanAli.getPBerenj();
                    String[] k = soltanAli.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }
            case 3:
                //14 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    siminShahr siminShahr = new siminShahr(getContext());
                    String[] co = siminShahr.getOcpanbe();
                    String[] p = siminShahr.getPpanbe();
                    String[] k = siminShahr.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    siminShahr siminShahr = new siminShahr(getContext());
                    String[] co = siminShahr.getOcGandom();
                    String[] p = siminShahr.getPGandom();
                    String[] k = siminShahr.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    siminShahr siminShahr = new siminShahr(getContext());
                    String[] co = siminShahr.getOCkolza();
                    String[] p = siminShahr.getPKolza();
                    String[] k = siminShahr.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    siminShahr siminShahr = new siminShahr(getContext());
                    String[] p = siminShahr.getPSoya();
                    String[] k = siminShahr.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    siminShahr siminShahr = new siminShahr(getContext());
                    String[] co = siminShahr.getOcBerenj();
                    String[] p = siminShahr.getPBerenj();
                    String[] k = siminShahr.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }
            case 4:
                // 11 tables
            {
                Log.i("type", type);

                if (type.equals("panbe")) {
                    pishkamar pishkamar = new pishkamar(getContext());
                    String[] co = pishkamar.getOcpanbe();
                    String[] p = pishkamar.getPpanbe();
                    String[] k = pishkamar.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    pishkamar pishkamar = new pishkamar(getContext());
                    String[] co = pishkamar.getOcGandom();
                    String[] p = pishkamar.getPGandom();


                    setTable(co, p, new String[]{""}, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    pishkamar pishkamar = new pishkamar(getContext());
                    String[] co = pishkamar.getOCkolza();
                    String[] p = pishkamar.getPKolza();


                    setTable(co, p, new String[]{""}, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    pishkamar pishkamar = new pishkamar(getContext());
                    String[] p = pishkamar.getPSoya();


                    setTable(new String[]{""}, p, new String[]{""}, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    pishkamar pishkamar = new pishkamar(getContext());
                    String[] co = pishkamar.getOcBerenj();
                    String[] p = pishkamar.getPBerenj();
                    String[] k = pishkamar.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }
            case 5:
                //14 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    nodehMalak nodehMalak = new nodehMalak(getContext());
                    String[] co = nodehMalak.getOcpanbe();
                    String[] p = nodehMalak.getPpanbe();
                    String[] k = nodehMalak.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    nodehMalak nodehMalak = new nodehMalak(getContext());
                    String[] co = nodehMalak.getOcGandom();
                    String[] p = nodehMalak.getPGandom();
                    String[] k = nodehMalak.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    nodehMalak nodehMalak = new nodehMalak(getContext());
                    String[] co = nodehMalak.getOCkolza();
                    String[] p = nodehMalak.getPKolza();
                    String[] k = nodehMalak.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    nodehMalak nodehMalak = new nodehMalak(getContext());
                    String[] p = nodehMalak.getPSoya();
                    String[] k = nodehMalak.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    nodehMalak nodehMalak = new nodehMalak(getContext());
                    String[] co = nodehMalak.getOcBerenj();
                    String[] p = nodehMalak.getPBerenj();
                    String[] k = nodehMalak.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }
            case 6:
                //14 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    neginShahr neginShahr = new neginShahr(getContext());
                    String[] co = neginShahr.getOcpanbe();
                    String[] p = neginShahr.getPpanbe();
                    String[] k = neginShahr.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    neginShahr neginShahr = new neginShahr(getContext());
                    String[] co = neginShahr.getOcGandom();
                    String[] p = neginShahr.getPGandom();
                    String[] k = neginShahr.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    neginShahr neginShahr = new neginShahr(getContext());
                    String[] co = neginShahr.getOCkolza();
                    String[] p = neginShahr.getPKolza();
                    String[] k = neginShahr.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    neginShahr neginShahr = new neginShahr(getContext());
                    String[] p = neginShahr.getPSoya();
                    String[] k = neginShahr.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    neginShahr neginShahr = new neginShahr(getContext());
                    String[] co = neginShahr.getOcBerenj();
                    String[] p = neginShahr.getPBerenj();
                    String[] k = neginShahr.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }
            case 7:
                // 11 tables
            {
                Log.i("type", type);

                if (type.equals("panbe")) {
                    mazraehKatoul mazraehKatoul = new mazraehKatoul(getContext());
                    String[] co = mazraehKatoul.getOcpanbe();
                    String[] p = mazraehKatoul.getPpanbe();
                    String[] k = mazraehKatoul.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    mazraehKatoul mazraehKatoul = new mazraehKatoul(getContext());
                    String[] co = mazraehKatoul.getOcGandom();
                    String[] p = mazraehKatoul.getPGandom();


                    setTable(co, p, new String[]{""}, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    mazraehKatoul mazraehKatoul = new mazraehKatoul(getContext());
                    String[] co = mazraehKatoul.getOCkolza();
                    String[] p = mazraehKatoul.getPKolza();


                    setTable(co, p, new String[]{""}, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    mazraehKatoul mazraehKatoul = new mazraehKatoul(getContext());
                    String[] p = mazraehKatoul.getPSoya();


                    setTable(new String[]{""}, p, new String[]{""}, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    mazraehKatoul mazraehKatoul = new mazraehKatoul(getContext());
                    String[] co = mazraehKatoul.getOcBerenj();
                    String[] p = mazraehKatoul.getPBerenj();
                    String[] k = mazraehKatoul.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }

            case 8:
                //14 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    kordKouy kordKouy = new kordKouy(getContext());
                    String[] co = kordKouy.getOcpanbe();
                    String[] p = kordKouy.getPpanbe();
                    String[] k = kordKouy.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    kordKouy kordKouy = new kordKouy(getContext());
                    String[] co = kordKouy.getOcGandom();
                    String[] p = kordKouy.getPGandom();
                    String[] k = kordKouy.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    kordKouy kordKouy = new kordKouy(getContext());
                    String[] co = kordKouy.getOCkolza();
                    String[] p = kordKouy.getPKolza();
                    String[] k = kordKouy.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    kordKouy kordKouy = new kordKouy(getContext());
                    String[] p = kordKouy.getPSoya();
                    String[] k = kordKouy.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    kordKouy kordKouy = new kordKouy(getContext());
                    String[] co = kordKouy.getOcBerenj();
                    String[] p = kordKouy.getPBerenj();
                    String[] k = kordKouy.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }
            case 9:
                //14 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    jelin jelin = new jelin(getContext());
                    String[] co = jelin.getOcpanbe();
                    String[] p = jelin.getPpanbe();
                    String[] k = jelin.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    jelin jelin = new jelin(getContext());
                    String[] co = jelin.getOcGandom();
                    String[] p = jelin.getPGandom();
                    String[] k = jelin.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    jelin jelin = new jelin(getContext());
                    String[] co = jelin.getOCkolza();
                    String[] p = jelin.getPKolza();
                    String[] k = jelin.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    jelin jelin = new jelin(getContext());
                    String[] p = jelin.getPSoya();
                    String[] k = jelin.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    jelin jelin = new jelin(getContext());
                    String[] co = jelin.getOcBerenj();
                    String[] p = jelin.getPBerenj();
                    String[] k = jelin.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }

            case 10:
                //14 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    gorjiMahaleh gorjiMahaleh = new gorjiMahaleh(getContext());
                    String[] co = gorjiMahaleh.getOcpanbe();
                    String[] p = gorjiMahaleh.getPpanbe();
                    String[] k = gorjiMahaleh.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    gorjiMahaleh gorjiMahaleh = new gorjiMahaleh(getContext());
                    String[] co = gorjiMahaleh.getOcGandom();
                    String[] p = gorjiMahaleh.getPGandom();
                    String[] k = gorjiMahaleh.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    gorjiMahaleh gorjiMahaleh = new gorjiMahaleh(getContext());
                    String[] co = gorjiMahaleh.getOCkolza();
                    String[] p = gorjiMahaleh.getPKolza();
                    String[] k = gorjiMahaleh.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    gorjiMahaleh gorjiMahaleh = new gorjiMahaleh(getContext());
                    String[] p = gorjiMahaleh.getPSoya();
                    String[] k = gorjiMahaleh.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    gorjiMahaleh gorjiMahaleh = new gorjiMahaleh(getContext());
                    String[] co = gorjiMahaleh.getOcBerenj();
                    String[] p = gorjiMahaleh.getPBerenj();
                    String[] k = gorjiMahaleh.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }
            case 11:
                //14 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    gorgan gorgan = new gorgan(getContext());
                    String[] co = gorgan.getOcpanbe();
                    String[] p = gorgan.getPpanbe();
                    String[] k = gorgan.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    gorgan gorgan = new gorgan(getContext());
                    String[] co = gorgan.getOcGandom();
                    String[] p = gorgan.getPGandom();
                    String[] k = gorgan.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    gorgan gorgan = new gorgan(getContext());
                    String[] co = gorgan.getOCkolza();
                    String[] p = gorgan.getPKolza();
                    String[] k = gorgan.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    gorgan gorgan = new gorgan(getContext());
                    String[] p = gorgan.getPSoya();
                    String[] k = gorgan.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    gorgan gorgan = new gorgan(getContext());
                    String[] co = gorgan.getOcBerenj();
                    String[] p = gorgan.getPBerenj();
                    String[] k = gorgan.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }
            case 12:
                //9 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    gomishan gomishan = new gomishan(getContext());
                    String[] co = gomishan.getOcpanbe();
                    String[] p = gomishan.getPpanbe();
                    String[] k = gomishan.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    gomishan gomishan = new gomishan(getContext());
                    String[] co = gomishan.getOcGandom();
                    String[] p = gomishan.getPGandom();
                    String[] k = gomishan.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    gomishan gomishan = new gomishan(getContext());
                    String[] co = gomishan.getOCkolza();
                    String[] p = gomishan.getPKolza();
                    String[] k = gomishan.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    Toast.makeText(getContext(), "توصیه کودی برای زراعت سویا وجود ندارد.", Toast.LENGTH_LONG).show();
                    break;

                } else if (type.equals("berenj")) {
                    Toast.makeText(getContext(), "توصیه کودی برای زراعت برنج وجود ندارد.", Toast.LENGTH_LONG).show();
                    break;


                }
            }
            case 13:
                //14 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    galehMiran galehMiran = new galehMiran(getContext());
                    String[] co = galehMiran.getOcpanbe();
                    String[] p = galehMiran.getPpanbe();
                    String[] k = galehMiran.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    galehMiran galehMiran = new galehMiran(getContext());
                    String[] co = galehMiran.getOcGandom();
                    String[] p = galehMiran.getPGandom();


                    setTable(co, p, new String[]{""}, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    galehMiran galehMiran = new galehMiran(getContext());
                    String[] co = galehMiran.getOCkolza();
                    String[] p = galehMiran.getPKolza();


                    setTable(co, p, new String[]{""}, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    galehMiran galehMiran = new galehMiran(getContext());
                    String[] p = galehMiran.getPSoya();


                    setTable(new String[]{""}, p, new String[]{""}, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    galehMiran galehMiran = new galehMiran(getContext());
                    String[] co = galehMiran.getOcBerenj();
                    String[] p = galehMiran.getPBerenj();
                    String[] k = galehMiran.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }
            case 14:
                //10 tables
            {
                Log.i("type", type);

                if (type.equals("panbe")) {
                    gereyDavaji gereyDavaji = new gereyDavaji(getContext());
                    String[] co = gereyDavaji.getOcpanbe();
                    String[] p = gereyDavaji.getPpanbe();


                    setTable(co, p, new String[]{""}, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    gereyDavaji gereyDavaji = new gereyDavaji(getContext());
                    String[] co = gereyDavaji.getOcGandom();
                    String[] p = gereyDavaji.getPGandom();


                    setTable(co, p, new String[]{""}, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    gereyDavaji gereyDavaji = new gereyDavaji(getContext());
                    String[] co = gereyDavaji.getOCkolza();
                    String[] p = gereyDavaji.getPKolza();


                    setTable(co, p, new String[]{""}, 7, 7, 7);
                    break;

                } else if (type.equals("lobia")) {

                    gereyDavaji gereyDavaji = new gereyDavaji(getContext());
                    String[] p = gereyDavaji.getPSoya();


                    setTable(new String[]{""}, p, new String[]{""}, 7, 7, 7);
                    break;
                } else if (type.equals("berenj")) {
                    gereyDavaji gereyDavaji = new gereyDavaji(getContext());
                    String[] co = gereyDavaji.getOcBerenj();
                    String[] p = gereyDavaji.getPBerenj();
                    String[] k = gereyDavaji.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;

                }
            }

            case 15:
                //14 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    galiKesh galiKesh = new galiKesh(getContext());
                    String[] co = galiKesh.getOcpanbe();
                    String[] p = galiKesh.getPpanbe();
                    String[] k = galiKesh.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    galiKesh galiKesh = new galiKesh(getContext());
                    String[] co = galiKesh.getOcGandom();
                    String[] p = galiKesh.getPGandom();
                    String[] k = galiKesh.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    galiKesh galiKesh = new galiKesh(getContext());
                    String[] co = galiKesh.getOCkolza();
                    String[] p = galiKesh.getPKolza();
                    String[] k = galiKesh.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    galiKesh galiKesh = new galiKesh(getContext());
                    String[] p = galiKesh.getPSoya();
                    String[] k = galiKesh.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    galiKesh galiKesh = new galiKesh(getContext());
                    String[] co = galiKesh.getOcBerenj();
                    String[] p = galiKesh.getPBerenj();
                    String[] k = galiKesh.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }
            case 16:
                //14 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    fenderSek fenderSek = new fenderSek(getContext());
                    String[] co = fenderSek.getOcpanbe();
                    String[] p = fenderSek.getPpanbe();
                    String[] k = fenderSek.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    fenderSek fenderSek = new fenderSek(getContext());
                    String[] co = fenderSek.getOcGandom();
                    String[] p = fenderSek.getPGandom();
                    String[] k = fenderSek.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    fenderSek fenderSek = new fenderSek(getContext());
                    String[] co = fenderSek.getOCkolza();
                    String[] p = fenderSek.getPKolza();
                    String[] k = fenderSek.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    fenderSek fenderSek = new fenderSek(getContext());
                    String[] p = fenderSek.getPSoya();
                    String[] k = fenderSek.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    fenderSek fenderSek = new fenderSek(getContext());
                    String[] co = fenderSek.getOcBerenj();
                    String[] p = fenderSek.getPBerenj();
                    String[] k = fenderSek.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }
            case 17:
                //14 tables
            {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    fazelAbad fazelAbad = new fazelAbad(getContext());
                    String[] co = fazelAbad.getOcpanbe();
                    String[] p = fazelAbad.getPpanbe();
                    String[] k = fazelAbad.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    fazelAbad fazelAbad = new fazelAbad(getContext());
                    String[] co = fazelAbad.getOcGandom();
                    String[] p = fazelAbad.getPGandom();
                    String[] k = fazelAbad.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    fazelAbad fazelAbad = new fazelAbad(getContext());
                    String[] co = fazelAbad.getOCkolza();
                    String[] p = fazelAbad.getPKolza();
                    String[] k = fazelAbad.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    fazelAbad fazelAbad = new fazelAbad(getContext());
                    String[] p = fazelAbad.getPSoya();
                    String[] k = fazelAbad.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    fazelAbad fazelAbad = new fazelAbad(getContext());
                    String[] co = fazelAbad.getOcBerenj();
                    String[] p = fazelAbad.getPBerenj();
                    String[] k = fazelAbad.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }

            case 18:
                //10 tables
            {
                Log.i("type", type);

                if (type.equals("panbe")) {
                    fajr fajr = new fajr(getContext());
                    String[] co = fajr.getOcpanbe();
                    String[] p = fajr.getPpanbe();


                    setTable(co, p, new String[]{""}, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    fajr fajr = new fajr(getContext());
                    String[] co = fajr.getOcGandom();
                    String[] p = fajr.getPGandom();


                    setTable(co, p, new String[]{""}, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    fajr fajr = new fajr(getContext());
                    String[] co = fajr.getOCkolza();
                    String[] p = fajr.getPKolza();


                    setTable(co, p, new String[]{""}, 7, 7, 7);
                    break;

                } else if (type.equals("lobia")) {

                    fajr fajr = new fajr(getContext());
                    String[] p = fajr.getPSoya();


                    setTable(new String[]{""}, p, new String[]{""}, 7, 7, 7);
                    break;
                } else if (type.equals("berenj")) {
                    fajr fajr = new fajr(getContext());
                    String[] co = fajr.getOcBerenj();
                    String[] p = fajr.getPBerenj();
                    String[] k = fajr.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;

                }
            }

            case 19: {
                //14 tables
                Log.i("type", type);

                if (type.equals("panbe")) {
                    deland deland = new deland(getContext());
                    String[] co = deland.getOcpanbe();
                    String[] p = deland.getPpanbe();
                    String[] k = deland.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    deland deland = new deland(getContext());
                    String[] co = deland.getOcGandom();
                    String[] p = deland.getPGandom();
                    String[] k = deland.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    deland deland = new deland(getContext());
                    String[] co = deland.getOCkolza();
                    String[] p = deland.getPKolza();
                    String[] k = deland.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    deland deland = new deland(getContext());
                    String[] p = deland.getPSoya();
                    String[] k = deland.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    deland deland = new deland(getContext());
                    String[] co = deland.getOcBerenj();
                    String[] p = deland.getPBerenj();
                    String[] k = deland.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }

            case 20:
                // 11 tables
            {
                Log.i("type", type);

                if (type.equals("panbe")) {
                    chehelChay chehelChay = new chehelChay(getContext());
                    String[] co = chehelChay.getOcpanbe();
                    String[] p = chehelChay.getPpanbe();
                    String[] k = chehelChay.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    chehelChay chehelChay = new chehelChay(getContext());
                    String[] co = chehelChay.getOcGandom();
                    String[] p = chehelChay.getPGandom();


                    setTable(co, p, new String[]{""}, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    chehelChay chehelChay = new chehelChay(getContext());
                    String[] co = chehelChay.getOCkolza();
                    String[] p = chehelChay.getPKolza();


                    setTable(co, p, new String[]{""}, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    chehelChay chehelChay = new chehelChay(getContext());
                    String[] p = chehelChay.getPSoya();


                    setTable(new String[]{""}, p, new String[]{""}, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    chehelChay chehelChay = new chehelChay(getContext());
                    String[] co = chehelChay.getOcBerenj();
                    String[] p = chehelChay.getPBerenj();
                    String[] k = chehelChay.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }

            case 21:
                //14 tables
            {
                Log.i("type", type);

                if (type.equals("panbe")) {
                    bandarTorkman bandarTorkman = new bandarTorkman(getContext());
                    String[] co = bandarTorkman.getOcpanbe();
                    String[] p = bandarTorkman.getPpanbe();
                    String[] k = bandarTorkman.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    bandarTorkman bandarTorkman = new bandarTorkman(getContext());
                    String[] co = bandarTorkman.getOcGandom();
                    String[] p = bandarTorkman.getPGandom();
                    String[] k = bandarTorkman.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    bandarTorkman bandarTorkman = new bandarTorkman(getContext());
                    String[] co = bandarTorkman.getOCkolza();
                    String[] p = bandarTorkman.getPKolza();
                    String[] k = bandarTorkman.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    bandarTorkman bandarTorkman = new bandarTorkman(getContext());
                    String[] p = bandarTorkman.getPSoya();
                    String[] k = bandarTorkman.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    bandarTorkman bandarTorkman = new bandarTorkman(getContext());
                    String[] co = bandarTorkman.getOcBerenj();
                    String[] p = bandarTorkman.getPBerenj();
                    String[] k = bandarTorkman.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }
            }

            case 22:
                //11 tables
            {
                Log.i("type", type);

                if (type.equals("panbe")) {
                    baghliMarame baghliMarame = new baghliMarame(getContext());
                    String[] co = baghliMarame.getOcpanbe();
                    String[] p = baghliMarame.getPpanbe();
                    String[] k = baghliMarame.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    baghliMarame baghliMarame = new baghliMarame(getContext());
                    String[] co = baghliMarame.getOcGandom();
                    String[] p = baghliMarame.getPGandom();


                    setTable(co, p, new String[]{""}, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    baghliMarame baghliMarame = new baghliMarame(getContext());
                    String[] co = baghliMarame.getOCkolza();
                    String[] p = baghliMarame.getPKolza();


                    setTable(co, p, new String[]{""}, 7, 7, 7);
                    break;


                } else if (type.equals("lobia")) {

                    baghliMarame baghliMarame = new baghliMarame(getContext());
                    String[] p = baghliMarame.getPSoya();


                    setTable(new String[]{""}, p, new String[]{""}, 7, 7, 7);
                    break;

                } else if (type.equals("berenj")) {
                    baghliMarame baghliMarame = new baghliMarame(getContext());
                    String[] co = baghliMarame.getOcBerenj();
                    String[] p = baghliMarame.getPBerenj();
                    String[] k = baghliMarame.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;


                }


            }

            case 23:
                //14 tables
            {
                //11 tables
                Log.i("locateTest", "anzan");
                Log.i("type", type);

                if (type.equals("panbe")) {
                    anzan anzan = new anzan(getContext());
                    String[] co = anzan.getOcpanbe();
                    String[] p = anzan.getPpanbe();
                    String[] k = anzan.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;


                } else if (type.equals("gandom")) {
                    anzan anzan = new anzan(getContext());
                    String[] co = anzan.getOcGandom();
                    String[] p = anzan.getPGandom();
                    String[] k = anzan.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;


                } else if (type.equals("kolza")) {
                    anzan anzan = new anzan(getContext());
                    String[] co = anzan.getOCkolza();
                    String[] p = anzan.getPKolza();
                    String[] k = anzan.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("lobia")) {

                    anzan anzan = new anzan(getContext());
                    String[] p = anzan.getPSoya();
                    String[] k = anzan.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;
                } else if (type.equals("berenj")) {
                    anzan anzan = new anzan(getContext());
                    String[] co = anzan.getOcBerenj();
                    String[] p = anzan.getPBerenj();
                    String[] k = anzan.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;

                }
            }

            case 24:
                //14 tables
            {
                Log.i("type", type);

                if (type.equals("panbe")) {
                    aliAbad aliAbad = new aliAbad(getContext());
                    String[] co = aliAbad.getOcpanbe();
                    String[] p = aliAbad.getPpanbe();
                    String[] k = aliAbad.getKPanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;

                } else if (type.equals("gandom")) {
                    aliAbad aliAbad = new aliAbad(getContext());
                    String[] co = aliAbad.getOcGandom();
                    String[] p = aliAbad.getPGandom();
                    String[] k = aliAbad.getKGandom();


                    setTable(co, p, k, 6, 6, 5);
                    break;

                } else if (type.equals("kolza")) {
                    aliAbad aliAbad = new aliAbad(getContext());
                    String[] co = aliAbad.getOCkolza();
                    String[] p = aliAbad.getPKolza();
                    String[] k = aliAbad.getKKolza();


                    setTable(co, p, k, 7, 7, 7);
                    break;

                } else if (type.equals("lobia")) {

                    aliAbad aliAbad = new aliAbad(getContext());
                    String[] p = aliAbad.getPSoya();
                    String[] k = aliAbad.getKSoya();


                    setTable(new String[]{""}, p, k, 7, 7, 7);
                    break;
                } else if (type.equals("berenj")) {
                    aliAbad aliAbad = new aliAbad(getContext());
                    String[] co = aliAbad.getOcBerenj();
                    String[] p = aliAbad.getPBerenj();
                    String[] k = aliAbad.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);
                    break;

                }
            }

            case 25:
                //11 tables
            {
                Log.i("type", type);

                if (type.equals("panbe")) {
                    AnbarOloom anbarOloom = new AnbarOloom(getContext());
                    String[] co = anbarOloom.getOcpanbe();
                    String[] p = anbarOloom.getPpanbe();
                    String[] k = anbarOloom.getKpanbe();

                    setTable(co, p, k, 5, 5, 5);
                    break;

                } else if (type.equals("berenj")) {
                    AnbarOloom anbarOloom = new AnbarOloom(getContext());
                    String[] co = anbarOloom.getOcBerenj();
                    String[] p = anbarOloom.getPBerenj();
                    String[] k = anbarOloom.getKBerenj();

                    setTable(co, p, k, 6, 6, 6);

                    break;
                } else if (type.equals("gandom")) {
                    AnbarOloom anbarOloom = new AnbarOloom(getContext());
                    String[] co = anbarOloom.getOcGandom();
                    String[] p = anbarOloom.getPGandom();


                    setTable(co, p, new String[]{""}, 6, 6, 6);
                    break;

                } else if (type.equals("kolza")) {
                    AnbarOloom anbarOloom = new AnbarOloom(getContext());
                    String[] co = anbarOloom.getOCkolza();
                    String[] p = anbarOloom.getPKolza();


                    setTable(co, p, new String[]{""}, 7, 7, 7);

                    break;
                } else if (type.equals("lobia")) {

                    AnbarOloom anbarOloom = new AnbarOloom(getContext());
                    String[] p = anbarOloom.getPSoya();


                    setTable(new String[]{""}, p, new String[]{""}, 7, 7, 7);
                    break;
                }
            }

            case 26:
                //11 tables
            {

                Log.i("type", type);

                if (type.equals("panbe")) {
                    aghGhala aghGhala = new aghGhala(getContext());
                    String[] co = aghGhala.getOcpanbe();
                    String[] p = aghGhala.getPpanbe();
                    String[] k = aghGhala.getKPanbe();
                    //Toast.makeText(getContext(),p.toString(),Toast.LENGTH_SHORT).show();

                    setTable(co, p, k, 5, 5, 5);
                    break;

                } else if (type.equals("berenj")) {
                    aghGhala aghGhala = new aghGhala(getContext());

                    String[] co = aghGhala.getOcBerenj();
                    String[] p = aghGhala.getPBerenj();
                    String[] k = aghGhala.getKBerenj();
                    //Toast.makeText(getContext(),co.toString(),Toast.LENGTH_SHORT).show();
                    setTable(co, p, k, 6, 6, 6);
                    break;

                } else if (type.equals("gandom")) {
                    aghGhala aghGhala = new aghGhala(getContext());

                    String[] co = aghGhala.getOcGandom();
                    String[] p = aghGhala.getPGandom();


                    setTable(co, p, new String[]{""}, 6, 6, 0);
                    break;

                } else if (type.equals("kolza")) {
                    aghGhala aghGhala = new aghGhala(getContext());

                    String[] co = aghGhala.getOCkolza();
                    String[] p = aghGhala.getPKolza();


                    setTable(co, p, new String[]{""}, 7, 7, 0);
                    break;

                } else if (type.equals("lobia")) {

                    aghGhala aghGhala = new aghGhala(getContext());

                    String[] p = aghGhala.getPSoya();


                    setTable(new String[]{""}, p, new String[]{""}, 7, 7, 0);
                    break;
                }
            }

            case 27:
                //11 tables
            {

                Log.i("typetest", type);

                if (type.equals("panbe")) {
                    aghBand aghBand = new aghBand(getContext());
                    String[] co = aghBand.getOcpanbe();
                    String[] p = aghBand.getPpanbe();
                    String[] k = aghBand.getKPanbe();
                    //Toast.makeText(getContext(),p.toString(),Toast.LENGTH_SHORT).show();

                    setTable(co, p, k, 5, 5, 5);
                    break;

                } else if (type.equals("berenj")) {
                    aghBand aghBand = new aghBand(getContext());

                    String[] co = aghBand.getOcBerenj();
                    String[] p = aghBand.getPBerenj();
                    String[] k = aghBand.getKBerenj();
                    //Toast.makeText(getContext(),co.toString(),Toast.LENGTH_SHORT).show();
                    setTable(co, p, k, 6, 6, 6);
                    break;

                } else if (type.equals("gandom")) {
                    aghBand aghBand = new aghBand(getContext());

                    String[] co = aghBand.getOcGandom();
                    String[] p = aghBand.getPGandom();


                    setTable(co, p, new String[]{""}, 6, 6, 0);
                    break;

                } else if (type.equals("kolza")) {
                    aghBand aghBand = new aghBand(getContext());

                    String[] co = aghBand.getOCkolza();
                    String[] p = aghBand.getPKolza();


                    setTable(co, p, new String[]{""}, 7, 7, 0);

                    break;
                } else if (type.equals("lobia")) {

                    aghBand aghBand = new aghBand(getContext());

                    String[] p = aghBand.getPSoya();


                    setTable(new String[]{""}, p, new String[]{""}, 7, 7, 0);
                    break;
                }
            }

            case 28:
                //10 tables
            {

                Log.i("type", type);

                if (type.equals("panbe")) {
                    aghAbad aghAbad = new aghAbad(getContext());
                    String[] co = aghAbad.getOcpanbe();
                    String[] p = aghAbad.getPpanbe();
                    //Toast.makeText(getContext(),p.toString(),Toast.LENGTH_SHORT).show();

                    setTable(co, p, new String[]{""}, 5, 5, 5);
                    break;

                } else if (type.equals("berenj")) {
                    aghAbad aghAbad = new aghAbad(getContext());

                    String[] co = aghAbad.getOcBerenj();
                    String[] p = aghAbad.getPBerenj();
                    String[] k = aghAbad.getKBerenj();
                    //Toast.makeText(getContext(),co.toString(),Toast.LENGTH_SHORT).show();
                    setTable(co, p, k, 6, 6, 6);
                    break;

                } else if (type.equals("gandom")) {
                    aghAbad aghAbad = new aghAbad(getContext());

                    String[] co = aghAbad.getOcGandom();
                    String[] p = aghAbad.getPGandom();


                    setTable(co, p, new String[]{""}, 6, 6, 0);
                    break;

                } else if (type.equals("kolza")) {
                    aghAbad aghAbad = new aghAbad(getContext());

                    String[] co = aghAbad.getOCkolza();
                    String[] p = aghAbad.getPKolza();


                    setTable(co, p, new String[]{""}, 7, 7, 0);
                    break;

                } else if (type.equals("lobia")) {

                    aghAbad aghAbad = new aghAbad(getContext());

                    String[] p = aghAbad.getPSoya();


                    setTable(new String[]{""}, p, new String[]{""}, 7, 7, 0);
                    break;
                }
            }

            default:
                Toast.makeText(getContext(), "دیتابیس منطقه مورد نظر وارد نشده است.", Toast.LENGTH_LONG).show();
                break;

        }


    }

    private void setTable(String[] first, String[] second, String[] third, int colmn1, int colmn2, int colmn3) {

        boolean head=false;

        SharedPreferences sharedPreferences = getContext().getSharedPreferences("choose", Context.MODE_PRIVATE);
        String type = sharedPreferences.getString("type", "non");

        TableLayout.LayoutParams params = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT);
        //params.topMargin=20;
        params.gravity = Gravity.CENTER;
        int k = 0;

        //////////carbon Ali(OC)///////////////////

        Log.i("information type", "first: " + first[0] + "///second: " + second[0] + "///third: " + third[0]);

        if (first[0] != "") {



            table.setVisibility(View.VISIBLE);


            for (int i = 0; i < 2; i++) {
                //Toast.makeText(getContext(),"i="+i+"  first="+first,Toast.LENGTH_LONG).show();
                TableRow row = new TableRow(getContext());
                row.setLayoutParams(params);
                if(i==0){
                    String value = "تن";
                    TextView tv = new TextView(getContext());
                    tv.setText(String.valueOf(value));
                    tv.setPadding(20, 0, 20, 0);
                    row.addView(tv);
                }else if (i==1){
                    String value = "کیلوگرم";
                    TextView tv = new TextView(getContext());
                    tv.setText(String.valueOf(value));
                    tv.setPadding(20, 0, 20, 0);
                    row.addView(tv);

                }

                for (int j = 0; j < colmn1; j++) {

                    String value = first[k];
                    TextView tv = new TextView(getContext());
                    tv.setText(String.valueOf(value));
                    tv.setPadding(20, 0, 20, 0);
                    row.addView(tv);
                    k++;
                }
                table.addView(row);
            }

            table.getChildAt(0).setBackgroundColor(Color.GRAY);
            table.getChildAt(1).setBackgroundColor(Color.WHITE);


            //TableLayout table = new TableLayout(getContext());
            if (type.equals("panbe")) {
                suggest.setText("  جدول 1- توصیه کودی اوره (کیلوگرم در هکتار) برای زراعت پنبه آبی  ");

            } else if (type.equals("berenj")) {
                suggest.setText("  جدول 1- توصیه کودی اوره (کیلوگرم در هکتار) برای زراعت برنج  ");


            } else if (type.equals("gandom")) {
                suggest.setText("  جدول 1- توصیه کودی اوره (کیلوگرم در هکتار) برای زراعت گندم  ");


            } else if (type.equals("kolza")) {
                suggest.setText("  جدول 1- توصیه کودی اوره (کیلوگرم در هکتار) برای زراعت کلزا  ");


            } else if (type.equals("lobia")) {
                suggest.setText("  جدول 1- توصیه کودی اوره (کیلوگرم در هکتار) برای زراعت سویا  ");


            }
        } else {

            table.setVisibility(View.GONE);
            suggest.setVisibility(View.GONE);
            OcNot.setText("این جدول به دلیل عدم وجود نمونه ی کربن آلی، موجود نمیباشد");


        }

        k = 0;

        ///////////////phosphor(P)//////////////

        if (second[0] != "") {
            table1.setVisibility(View.VISIBLE);
            for (int i = 0; i < 2; i++) {
                TableRow row = new TableRow(getContext());
                row.setLayoutParams(params);
                if(i==0){
                    String value = "تن";
                    TextView tv = new TextView(getContext());
                    tv.setText(String.valueOf(value));
                    tv.setPadding(20, 0, 20, 0);
                    row.addView(tv);
                }else if (i==1){
                    String value = "کیلوگرم";
                    TextView tv = new TextView(getContext());
                    tv.setText(String.valueOf(value));
                    tv.setPadding(20, 0, 20, 0);
                    row.addView(tv);

                }

                for (int j = 0; j < colmn2; j++) {
                    Log.i("Pinfo", "second[" + k + "]: " + second[k]);
                    String value = second[k];
                    TextView tv = new TextView(getContext());
                    tv.setText(String.valueOf(value));
                    tv.setPadding(20, 0, 20, 0);
                    row.addView(tv);
                    k++;
                }
                table1.addView(row);
            }

            table1.getChildAt(0).setBackgroundColor(Color.GRAY);
            table1.getChildAt(1).setBackgroundColor(Color.WHITE);

            if (type.equals("panbe")) {
                suggest_P.setText("   جدول 2- توصیه کودی دی آمونیوم فسفات یا سوپرفسفات تریپل (کیلوگرم در هکتار) برای زراعت پنبه آبی  ");

            } else if (type.equals("berenj")) {
                suggest_P.setText("   جدول 2- توصیه کودی دی آمونیوم فسفات یا سوپرفسفات تریپل (کیلوگرم در هکتار) برای زراعت برنج  ");


            } else if (type.equals("gandom")) {
                suggest_P.setText("  جدول 2- توصیه کودی دی آمونیوم فسفات یا سوپرفسفات تریپل (کیلوگرم در هکتار) برای زراعت گندم  ");


            } else if (type.equals("kolza")) {
                suggest_P.setText("  جدول 2- توصیه کودی دی آمونیوم فسفات یا سوپرفسفات تریپل (کیلوگرم در هکتار) برای زراعت کلزا  ");


            } else if (type.equals("lobia")) {
                suggest_P.setText("  جدول 2- توصیه کودی دی آمونیوم فسفات یا سوپرفسفات تریپل (کیلوگرم در هکتار) برای زراعت سویا  ");


            }

        } else {
            table1.setVisibility(View.GONE);
            suggest_P.setVisibility(View.GONE);
            so4Not.setText("این جدول به دلیل عدم وجود نمونه ی سولفات پتاسیم، موجود نمیباشد");
        }

        k = 0;
        //////////////potasium(K)////////////////

        if (third[0] != "") {
            table2.setVisibility(View.VISIBLE);
            for (int i = 0; i < 2; i++) {
                TableRow row = new TableRow(getContext());
                row.setLayoutParams(params);
                if(i==0){
                    String value = "تن";
                    TextView tv = new TextView(getContext());
                    tv.setText(String.valueOf(value));
                    tv.setPadding(20, 0, 20, 0);
                    row.addView(tv);
                }else if (i==1){
                    String value = "کیلوگرم";
                    TextView tv = new TextView(getContext());
                    tv.setText(String.valueOf(value));
                    tv.setPadding(20, 0, 20, 0);
                    row.addView(tv);

                }

                for (int j = 0; j < colmn3; j++) {
                    String value = third[k];
                    TextView tv = new TextView(getContext());
                    tv.setText(String.valueOf(value));
                    tv.setPadding(20, 0, 20, 0);
                    row.addView(tv);
                    k++;
                }
                table2.addView(row);
            }

            table2.getChildAt(0).setBackgroundColor(Color.GRAY);
            table2.getChildAt(1).setBackgroundColor(Color.WHITE);
            if (type.equals("panbe")) {
                suggest_K.setText("   جدول 3- توصیه کودی سولفات پتاسیم (کیلوگرم در هکتار) برای زراعت پنبه آبی  ");

            } else if (type.equals("berenj")) {
                suggest_K.setText("   جدول 3- توصیه کودی سولفات پتاسیم (کیلوگرم در هکتار) برای زراعت برنج  ");


            } else if (type.equals("gandom")) {
                suggest_K.setText("  جدول 3- توصیه کودی سولفات پتاسیم (کیلوگرم در هکتار) برای زراعت گندم  ");


            } else if (type.equals("kolza")) {
                suggest_K.setText("  جدول 3- توصیه کودی سولفات پتاسیم (کیلوگرم در هکتار) برای زراعت کلزا  ");


            } else if (type.equals("lobia")) {
                suggest_K.setText("  جدول 3- توصیه کودی سولفات پتاسیم (کیلوگرم در هکتار) برای زراعت سویا  ");


            }


        } else {
            table2.setVisibility(View.GONE);
            suggest_K.setVisibility(View.GONE);
            KNot.setText("این جدول به دلیل عدم وجود نمونه ی پتاسیم، موجود نمیباشد");
        }

    }


}
