package task5;


import java.util.HashMap;
import java.util.Map;

public class task5 {
    static HashMap<Character, Integer> hashMap = new HashMap<>();

    static {
        for (int i = 'а'; i <= 'я'; i++)
            hashMap.put((char)i, 0);
        hashMap.put('ё', 0);
    }
    public static void main(String[] args) {
        check("абв");
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }

    static void check(String str) {
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int value = hashMap.get(character);
            hashMap.put(character, ++value);
        }
    }
}
