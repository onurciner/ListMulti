package com.onurciner.listmulti;

import java.util.ArrayList;

/**
 * Created by Onur.Ciner on 14.12.2016.
 */

public class MultiList<O, N> {

    private ArrayList<O> o = new ArrayList<>();
    private ArrayList<N> n = new ArrayList<>();

    public void add(O o, N n) {
        if (o != null) {
            this.o.add(o);
            this.n.add(n);
        }
    }

    public O getOneData(int i) {
        if (o != null)
            if (o.size() > i) {
                return o.get(i);
            } else
                return null;
        return null;
    }


    public N getTwoData(int i) {
        if (n != null)
            if (n.size() > i) {
                return n.get(i);
            } else
                return null;
        return null;
    }

    public ArrayList<O> getOneArrayList() {
        return o;
    }

    public ArrayList<N> getTwoArrayList() {
        return n;
    }

    public int size() {
        if (o != null) {
            return o.size();
        }
        return 0;
    }


}
