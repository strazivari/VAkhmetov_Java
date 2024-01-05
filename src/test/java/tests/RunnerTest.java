package tests;

import org.junit.jupiter.api.Test;

import static tasks.AstonTasks.*;

public class RunnerTest {
    @Test
    public void AstonTest() {
        task1(8);
        task2("Вячеслав");
        task3(new int[]{50, 51, 55, 123, 564, 999, 1005, 102, 1326, 989, 815, 651, 7512});
        task4();
    }
}
