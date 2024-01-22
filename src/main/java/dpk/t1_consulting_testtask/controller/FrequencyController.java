package dpk.t1_consulting_testtask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FrequencyController {

    /**
     * метод принимает строку и возвращает Map, где ключи представляют собой символы из строки,
     * а значения количество раз, которое каждый символ встречается в строке
     *
     * @param input        строка, для которой вычисляется частота символов
     * @param ignoreCase   флаг, указывающий нужно ли игнорировать регистр символов
     * @return Map с символами и их частотой во входной строке
     */
    @GetMapping("/calculate-frequency")
    public Map<Character, Long> calculateFrequency(
            @RequestParam String input,
            @RequestParam(required = false, defaultValue = "false") boolean ignoreCase
    ) {
        Map<Character, Long> frequencyMap = new HashMap<>();

        // проходим по каждому символу в строке
        for (char c : (ignoreCase ? input.toLowerCase() : input).toCharArray()) {
            // увеличиваем частоту символа на 1, если он есть в мапе
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0L) + 1);
        }

        return frequencyMap;
    }
}