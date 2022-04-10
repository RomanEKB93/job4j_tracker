package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("Petya", 100),
                new Attachment("Anya", 34),
                new Attachment("Kolya", 13)
        );
        System.out.println("исходное состояние attachments:");
        System.out.println(attachments);
        Comparator<Attachment> sizeComparator =  new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return Integer.compare(left.getSize(), right.getSize());
            }
        };
        attachments.sort(sizeComparator);
        System.out.println("attachments после сортировки по size:");
        System.out.println(attachments);
        Comparator<Attachment> nameComparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getName().compareTo(right.getName());
            }
        };
        attachments.sort(nameComparator);
        System.out.println("attachments после сортировки по name:");
        System.out.println(attachments);
    }
}