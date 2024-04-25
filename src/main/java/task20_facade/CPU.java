package task20_facade;

interface CPU {
    void freeze();
    void jump(Memory memory, long position);
    void execute();
}

