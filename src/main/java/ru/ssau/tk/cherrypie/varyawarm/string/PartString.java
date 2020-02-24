package ru.ssau.tk.cherrypie.varyawarm.string;

public class PartString {
    static void Task1(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    static void Task2(String string) {
        byte[] bytes = string.getBytes();
        for (byte byt: bytes) {
            System.out.println(byt);
        }
    }
    static void Task3(){
        String string = "symbolzzzzzz";
        String string1 = new String(string);
        System.out.println(string==string1); //сравнивает ссылки
        System.out.println(string.equals(string1)); //сравнивает пул
    }
}
