package task09;

import java.util.List;

public class LineBreakAfterTwo implements ListConverter {
    public String listToString(List<String> list) {
        String[] listArray= new String[list.size()];
        list.toArray(listArray);
        String text = "";

        for (int i = 0; i < listArray.length; i++) {
            text += listArray[i];
            if (i % 2 == 1) {
                text += "\n";
            }
        }

        return text;
    }
}
