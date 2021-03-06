package ufop.br.futmansamuel.sort;

import java.util.Comparator;

import ufop.br.futmansamuel.other.Players;

/**
 * @author Samuel Neves
 *         Created on 01/07/17.
 */

public class OrderByNickStatInv implements Comparator<Players> {

    @Override
    public int compare(Players o2, Players o1) {
        return o1.getNickName().compareTo(o2.getNickName());
    }
}
