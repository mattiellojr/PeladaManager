package ufop.br.futmansamuel.sort;

import android.util.Log;

import java.util.Comparator;

import ufop.br.futmansamuel.other.Players;

/**
 * @author Samuel Neves
 *         Created on 07/07/17.
 */

public class OrderByWinRate implements Comparator<Players> {
    @Override
    public int compare(Players o1, Players o2) {
        return (int)(o1.getWinRateFloat()-o2.getWinRateFloat());
    }
}
