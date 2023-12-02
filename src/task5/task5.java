package task5;

import java.util.LinkedHashMap;
import java.util.Map;

public class task5 {
    static Map<Character, Integer> hashMap = new LinkedHashMap<>();

    static {
        for (int i = 'а'; i <= 'е'; i++)
            hashMap.put((char)i, 0);
        hashMap.put('ё', 0);
        for (int i = 'ж'; i <= 'я'; i++)
            hashMap.put((char)i, 0);
    }
    public static void main(String[] args) {
        check("Привет");
        check("Как дела?");
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }

    static void check(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            try {
                int value = hashMap.get(character);
                hashMap.put(character, ++value);
            }
            catch (Exception ignored) {}
        }
    }
}
