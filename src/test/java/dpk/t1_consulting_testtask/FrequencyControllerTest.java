package dpk.t1_consulting_testtask;

import dpk.t1_consulting_testtask.controller.FrequencyController;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FrequencyControllerTest {

    @Test
    void testCalculateFrequency() {
        FrequencyController frequencyController = new FrequencyController();

        String input1 = "aaaaabcccc";
        Map<Character, Long> result1 = frequencyController.calculateFrequency(input1, false);

        assertEquals(5, result1.get('a'));
        assertEquals(4, result1.get('c'));
        assertEquals(1, result1.get('b'));


        String input2 = "rrrrrraanddddddoooooooooooooommmmm";
        Map<Character, Long> result2 = frequencyController.calculateFrequency(input2, false);

        assertEquals(6, result2.get('r'));
        assertEquals(2, result2.get('a'));
        assertEquals(1, result2.get('n'));
        assertEquals(6, result2.get('d'));
        assertEquals(14, result2.get('o'));
        assertEquals(5, result2.get('m'));

    }

    @Test
    void testCalculateFrequencyWithEmptyString() {
        FrequencyController frequencyController = new FrequencyController();

        String input = "";
        Map<Character, Long> result = frequencyController.calculateFrequency(input, false);

        assertTrue(result.isEmpty(), "Expected an empty map for an empty input string");
    }

    @Test
    void testCalculateFrequencyWithMixedCase() {
        FrequencyController frequencyController = new FrequencyController();

        String input = "AbCdeE";
        Map<Character, Long> result = frequencyController.calculateFrequency(input, true);

        assertEquals(1, result.get('a'));
        assertEquals(1, result.get('b'));
        assertEquals(1, result.get('c'));
        assertEquals(1, result.get('d'));
        assertEquals(2, result.get('e'));
    }

    @Test
    void testCalculateFrequencyWithSpecialCharacters() {
        FrequencyController frequencyController = new FrequencyController();

        String input = "abc123!@#$";
        Map<Character, Long> result = frequencyController.calculateFrequency(input, false);

        assertEquals(1, result.get('a'));
        assertEquals(1, result.get('b'));
        assertEquals(1, result.get('c'));
        assertEquals(1, result.get('1'));
        assertEquals(1, result.get('2'));
    }
}
