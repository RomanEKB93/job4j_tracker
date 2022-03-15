package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Crime and Punishement", 400);
        Book second = new Book("The Captain's Daughter", 150);
        Book third = new Book("The Count of Monte Cristo", 800);
        Book fourth = new Book("Clean code", 300);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("The book number " + index + " is \""
                    + bk.getName() + "\". It has " + bk.getVolume() + " pages");
        }
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
        System.out.println("Books after permutation:");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("The book number " + index + " is \""
                    + bk.getName() + "\". It has " + bk.getVolume() + " pages");
        }
        System.out.println("\"Clean code\" books only:");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if ("Clean code".equals(bk.getName())) {
                System.out.println("The book number " + index + " is \""
                        + bk.getName() + "\". It has " + bk.getVolume() + " pages");
            }
        }
    }
}
