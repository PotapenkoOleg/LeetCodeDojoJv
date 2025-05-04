package oleg_solutions.graphs.bfs.tests;

import oleg_solutions.graphs.bfs.MinimumGeneticMutation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumGeneticMutationTest {

    @Test
    void solutionTest1() {
        var startGene = "AACCGGTT";
        var endGene = "AAACGGTA";
        var bank = new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        var actual = MinimumGeneticMutation.solution(startGene, endGene, bank);
        var expected = 2;
        assertEquals(expected, actual);
    }
}