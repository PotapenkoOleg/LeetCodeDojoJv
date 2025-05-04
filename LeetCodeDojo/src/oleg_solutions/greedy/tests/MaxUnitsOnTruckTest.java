package oleg_solutions.greedy.tests;

import oleg_solutions.greedy.MaxUnitsOnTruck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxUnitsOnTruckTest {
    @Test
    void solutionTest1() {
        var boxTypes = new int[][]{{1, 3}, {2, 2}, {3, 1}};
        var truckSize = 4;
        MaxUnitsOnTruck.maximumUnits(boxTypes, truckSize);
    }
}