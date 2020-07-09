package lesson3.Homework;

import java.util.ArrayList;

public class PhoneDirectory {
    ArrayList<Phone> phones = new ArrayList<>();

    public PhoneDirectory() {
    }
    public void add(Phone phone){
        phones.add(phone);
    }
    public void get(String surname){
        String outPut= "";
        for (Phone phone:phones) {
            if(surname.equals(phone.surname)){
                outPut+= " " + phone.number;
            }
        }
        if(outPut.equals("")){
            System.out.println("По фамилии " + surname + " не найдено никаких номеров");
        }
        else{
            System.out.println("По фамилии " + surname + " найдены данные телефоны:"+outPut);
        }
    }
}
