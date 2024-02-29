package task09;

import java.util.List;

public class LineBreaker implements ListConverter {
    private ListConverter listConverter;
    public LineBreaker(ListConverter listConverter) {
        this.listConverter = listConverter;
    }

    public String listToString(List<String> list) {
        return listConverter.listToString(list);
    }
}
