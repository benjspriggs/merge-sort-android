package com.sprico.bspriggs.mergesorthelper;

import android.util.Pair;

/**
 * Created by bspriggs on 12/5/2016.
 */

public final class Bifurcator {
    static Pair<String, String> bifurcate(){
        return new Pair<>("A", "H");
    }
    static Pair<String, String> bifurcate(final String string){
        String newbegin = string;
        String newend = string;
        // do stuff here
        return new Pair<>(newbegin, newend);
    }

    static String lastChar(final String s){
        return s.substring(s.length() - 1);
    }
}
