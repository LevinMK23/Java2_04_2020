package lesson3.Homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory book = new PhoneDirectory();
        book.add(new Phone("1","Суров", "89457432341"));
        book.add(new Phone("2","Суров", "89457252341"));
        book.add(new Phone("3","Суров", "894357432341"));
        book.add(new Phone("4","Федотов", "89457433571" ));
        book.add(new Phone("5","Рапницкий", "89457891341" ));
        book.add(new Phone("6","Захаров", "89450002341" ));
        book.get("Суров");
        book.get("Карпухин");
        String[] words =new String[]{"represent","represent","represent","represent","present","present","reprimand","procrastinate","present","tent","tent","reprimand","reevaluate","elevate","Rip and Tear"};
        ArrayList<String> unique= new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            if(!unique.contains(words[i])){
                unique.add(words[i]);
            }
        }

        for (String word: unique) {
            int sum = 0;
            for (int i = 0; i < 15; i++) {
                if(words[i].equals(word)){
                    sum+=1;
                }
            }
            System.out.println(word + " встречается " + sum + " раз");
        }
    }
}
