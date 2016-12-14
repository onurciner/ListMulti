package com.onurciner.listmulti;

import java.util.ArrayList;

/**
 * Created by Onur.Ciner on 14.12.2016.
 */

public class MultiListFour<O, N, U, R> {

    private ArrayList<O> o = new ArrayList<>();
    private ArrayList<N> n = new ArrayList<>();
    private ArrayList<U> u = new ArrayList<>();
    private ArrayList<R> r = new ArrayList<>();

    public void add(O o, N n, U u, R r) {
        if (o != null) {
            this.o.add(o);
            this.n.add(n);
            this.u.add(u);
            this.r.add(r);
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

    public U getThreeData(int i) {
        if (u != null)
            if (u.size() > i) {
                return u.get(i);
            } else
                return null;
        return null;
    }

    public R getFourData(int i) {
        if (r != null)
            if (r.size() > i) {
                return r.get(i);
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

    public ArrayList<U> getThreeArrayList() {
        return u;
    }

    public ArrayList<R> getFourArrayList() {
        return r;
    }

    public int size() {
        if (o != null) {
            return o.size();
        }
        return 0;
    }
}