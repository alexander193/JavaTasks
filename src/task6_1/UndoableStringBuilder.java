package task6_1;

import java.util.Stack;

public class UndoableStringBuilder {
    private StringBuilder stringBuilder;
    private final Stack<String> actions;

    public UndoableStringBuilder() {
        stringBuilder = new StringBuilder();
        actions = new Stack<>();
    }

    public void append(String string) {
        stringBuilder.append(string);
        actions.add(string);
    }
    public void undo() {
        if (!actions.empty()) {
            String action = actions.pop();
            stringBuilder = new StringBuilder(stringBuilder.substring(0, stringBuilder.length() - action.length()));
        }
    }
    public String toString() {
        return stringBuilder.toString();
    }
}
