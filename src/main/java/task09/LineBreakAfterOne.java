package task09;

import java.util.List;

public class LineBreakAfterOne implements ListConverter {
    public String listToString(List<String> list) {
        return String.join("\n", list);
    }
}
