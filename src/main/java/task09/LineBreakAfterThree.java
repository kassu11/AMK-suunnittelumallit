package task09;

import java.util.List;

public class LineBreakAfterThree  implements ListConverter {
    public String listToString(List<String> list) {
        String text = "";
        for (int i = 0; i < list.size(); i++) {
            text += list.get(i);
            if (i % 3 == 2) {
                text += "\n";
            }
        }

        return text;
    }
}

