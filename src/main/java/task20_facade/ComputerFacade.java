package task20_facade;

class ComputerFacade {
    private static final long kBootAddress = 0x00000101L;
    private static final long kBootSector = 0x00000010L;
    private static final int kSectorSize = 512;

    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPUImpl();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(kBootAddress, hardDrive.read(kBootSector, kSectorSize));
        cpu.jump(kBootAddress);
        cpu.execute();
    }

    private static class CPUImpl implements CPU {
        @Override
        public void freeze() {
            // Simulating freeze operation
            System.out.println("Freezing CPU");
        }

        @Override
        public void jump(long position) {
            // Simulating jump operation
            System.out.println("Jumping to memory address position: " + position);
        }

        @Override
        public void execute() {
            // Simulating execute operation
            System.out.println("Executing CPU instructions");
        }
    }
}
