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
        System.out.println(searchTheLongest(array));
        System.out.println(isPalindrome("ШаЛаш"));
        System.out.println(wordReplacer("сука бля"));
        System.out.println(checkRepeats("привет сука привет", "привет"));
    }

    public static String searchTheLongest(String[] in) {
        int maxLength = 0, longestLine = -1;
        for (int i = 0; i < in.length; i++) {
            if (in[i].length() > maxLength) {
                maxLength = in[i].length();
                longestLine = i;
            }
        }
        return in[longestLine];
    }
    public static boolean isPalindrome(String in) {
        StringBuilder reverse = new StringBuilder();
        for (int i = in.length() - 1; i >= 0; i--)
            reverse.append(in.charAt(i));
        return reverse.toString().equalsIgnoreCase(in);
    }

    public static String wordReplacer(String in) {
        int position = 0;
        StringBuilder out = new StringBuilder();
        while (true){
            int prevPosition = position;
            position = in.toLowerCase().indexOf("бля", position);
            if (position != -1) {
                out.append(in, prevPosition, position).append("блин");
                position += 3;
            } else {
                out.append(in, prevPosition, in.length());
                break;
            }
        }
        return out.toString();
    }

    public static int checkRepeats(String str, String subStr) {
        int counter = 0, position = 0;
        while (position != -1) {
            position = str.indexOf(subStr, position);
            if (position != -1) {
                counter++;
                position += subStr.length();
            }
        }
        return counter;
    }
}