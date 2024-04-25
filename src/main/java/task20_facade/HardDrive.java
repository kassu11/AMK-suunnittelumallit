package task20_facade;

import java.util.ArrayList;
import java.util.List;

class HardDrive {
    private static final long kBootAddress = 0x00000101L;
    private static final long kBootSector = 0x00000010L;
    private static final String[] data = new String[]{"Data from Hard Drive 1 512", "Data from Hard Drive 2 512", "Data from Hard Drive 3 512", "Data from Hard Drive 4 512"};

    String read(long lba, int size) {
        // Simulating read operation
        return "Data from Hard Drive " + String.join("", data);
    }
}
