package ru.ssau.tk.cherrypie.varyawarm.string;

public class PartString {
    static void Task1(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    static void Task2(String string) {
        byte[] bytes = string.getBytes();
        for (byte byt : bytes) {
            System.out.println(byt);
        }
    }

    static void Task3() {
        String string = "symbolzzzzzz";
        String string1 = new String(string);
        System.out.println(string == string1); //сравнивает ссылки
        System.out.println(string.equals(string1)); //сравнивает пул
    }

    static boolean Task4(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                return true;
            }
        }
        return false;
    }

    static int Task7(String string, String string1) {
        if (string.contains(string1)) {
            return string.indexOf(string1);
        }
        if (string1.contains(string)) {
            return string1.indexOf(string);
        } else
            return -1;
    }

    static int Task8(String string, String string1) {
        if (string.contains(string1)) {
            return string.indexOf(string1, string.length() / 2);
        }
        if (string1.contains(string)) {
            return string1.indexOf(string, string1.length() / 2);
        } else
            return -1;
    }

    static int Task9(String string, String string1) {
        if (string.contains(string1)) {
            return string.lastIndexOf(string1);
        }
        if (string1.contains(string)) {
            return string1.lastIndexOf(string);
        } else
            return -1;
    }

    static int Task10(String[] strings, String pref, String post) {
        int count = 0;
        for (String string : strings) {
            if (string.startsWith(pref) && (string.endsWith(post))) {
                count++;
            }
        }
        return count;
    }

    static String Task12(String firstStr, String secondSrt, String thirdStr) {
        for (int i = 0; i < 100; i++) {
            if (firstStr.contains(secondSrt)) {
                firstStr.replaceAll(secondSrt, thirdStr);
            } else return firstStr;
        }
        return firstStr;    }
}