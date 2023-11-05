/*
* Напишите метод для поиска самой длинной строки в массиве.
* Напишите метод, который проверяет является ли слово палиндромом.
* Напишите метод, заменяющий в тексте все вхождения слова «бля» на «[блин]».
* Имеются две строки. Напишите метод, возвращающий количество вхождений одной строки в другую.
*/

package taskString;

public class taskString {
    public static void main(String[] args) {
        String[] array = {"a", "as", "aasdasdsd", "asdf", "asdfg"};
        System.out.println(searchThwLongest(array));
    }

    public static String searchThwLongest(String[] in) {
        int maxLength = 0, longestLine = -1;
        for (int i = 0; i < in.length; i++) {
            if (in[i].length() > maxLength) {
                maxLength = in[i].length();
                longestLine = i;
            }
        }
        return in[longestLine];
    }
}
