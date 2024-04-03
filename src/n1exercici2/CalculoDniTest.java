package n1exercici2;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;


public class CalculoDniTest {
	
	@ParameterizedTest
	@CsvSource({"8511093, N", 
        "12345678, Z", 
        "98765432, M",
        "45678901, G",
        "56789012, B",
        "34567890, V",
        "89012345, E",
        "23456789, D",
        "67890123, B",
        "78901234, X"})
	
	void CalculoDni(int input, String expected) {
	    String actualValue = CalculoDni.calculoDni(input);
	    assertEquals(expected, actualValue);
	}
}
