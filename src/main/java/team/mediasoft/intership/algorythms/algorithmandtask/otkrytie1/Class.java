package team.mediasoft.intership.algorythms.algorithmandtask.otkrytie1;

public class Class {
    private static int COUNTER_ID = 0;
    private final int id;

    public Class() {
        this.id = COUNTER_ID;
        COUNTER_ID++;
    }

    public int getId() {
        return id;
    }
}