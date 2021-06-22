import br.com.calc.Calc;
import br.com.calc.LanguageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.NoSuchElementException;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@ExtendWith(SpringExtension.class)
public class CalcTest {

    @Mock
    private LanguageService languageService;

    List<String> list = mock(List.class);

    Calc calculator;

    @BeforeEach
    public void setup() {
        this.calculator = new Calc();
        given(list.get(ArgumentMatchers.anyInt())).willReturn("Java");
        given(languageService.getMainLang(ArgumentMatchers.anyString())).willReturn(asList("Java"));
    }

    @Test
    @DisplayName("Test calculator sum")
    void givenGenericCalculator_whenSum_thenReturn() {
        Double expectedSum = Double.valueOf(10);
        assertThat(expectedSum).isEqualTo(calculator.sum(5, 5));
    }

    @Test
    @DisplayName("Test exception calculator sum")
    void givenGenericCalculator_whenSumWithInvalidNumber_thenThrowException() {
        assertThrows(NoSuchElementException.class, () -> calculator.sum(null, null));
    }

    @Test
    @DisplayName("Test exception ArrayIndexOutOfBoundsException")
    void givenList_whenTryToAccessIndexOutOfBound_thenException() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> printNumber().get(1));
    }

    @Test
    @DisplayName("Test mock to find in list")
    void givenList_whenTryToAccessValidIndex_thenReturn() {
        assertThat(list.get(1)).isEqualTo("Java");
    }

    @Test
    @DisplayName("Test mock to method")
    void givenList_whenSetValidIndex_thenReturn() {
        List<String> mainLang = languageService.getMainLang("J");
        assertThat(mainLang).isEqualTo(asList("Java"));
    }

    public List<Double> printNumber() {
        return asList(calculator.multiplication(5, 5).doubleValue());
    }
}
