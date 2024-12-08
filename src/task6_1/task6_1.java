/*
* Напишите свой класс StringBuilder с поддержкой операции undo.
* Для этого делегируйте все методы стандартному StringBuilder,
* а в собственном классе храните список всех операций для выполнения undo().
* Это будет реализацией шаблона «Команда».
*/

package task6_1;

public class task6_1 {
    public static void main(String[] args) {
        UndoableStringBuilder builder = new UndoableStringBuilder();
        builder.undo();
        builder.append("Привет!");
        builder.append("Как дела?");
        builder.undo();
        builder.append("Пока");
        System.out.println(builder);
    }
}
