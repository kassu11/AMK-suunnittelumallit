package task20_facade;

class HardDrive {
    String read(long lba, int size) {
        // Simulating read operation
        return "Data from Hard Drive " + lba + " " + size;
    }
}
