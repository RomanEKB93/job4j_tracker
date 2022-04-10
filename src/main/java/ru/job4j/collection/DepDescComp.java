package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        StringBuilder sb1 = new StringBuilder(o1);
        int separatorIndex1 = sb1.indexOf("/");
        String head1 = o1;
        String rest1 = "";
        if (separatorIndex1 != -1) {
            head1 = sb1.substring(0, separatorIndex1);
            rest1 = sb1.substring(separatorIndex1 + 1);
        }
        StringBuilder sb2 = new StringBuilder(o2);
        int separatorIndex2 = sb2.indexOf("/");
        String head2 = o2;
        String rest2 = "";
        if (separatorIndex2 != -1) {
            head2 = sb2.substring(0, separatorIndex2);
            rest2 = sb2.substring(separatorIndex2 + 1);
        }
        int headCompare = head2.compareTo(head1);
        if (headCompare != 0) {
            return headCompare;
        }
        return rest1.compareTo(rest2);
    }
}
