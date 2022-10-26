package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.array.JavaNameValidator.isNameValid;

class JavaNameValidatorTest {

    @Test
    void whenEmptyNameInvalid() {
        assertThat(isNameValid("")).isFalse();
    }

    @Test
    void whenFullLatValid() {
        assertThat(isNameValid("first")).isTrue();
    }

    @Test
    void whenFullLatAndSomeUpperCaseLettersValid() {
        assertThat(isNameValid("fIRST")).isTrue();
    }

    @Test
    void whenLatNumberValid() {
        assertThat(isNameValid("first1")).isTrue();
    }

    @Test
    void whenLatWithSpecialSymbolUnderValid() {
        assertThat(isNameValid("first_user")).isTrue();
    }

    @Test
    void whenNumberInValid() {
        assertThat(isNameValid("123")).isFalse();
    }

    @Test
    void whenFirstLatinUpperCaseIsInvalid() {
        assertThat(isNameValid("First")).isFalse();
    }

    @Test
    void whenLatNumberAndTwoSpecialSymbolsUnderValid() {
        assertThat(isNameValid("fir$t_u$er_1")).isTrue();
    }

    @Test
    void whenNotLatNumberAndTwoSpecialSymbolsUnderValid() {
        assertThat(isNameValid("яfir$t_u$er_1")).isFalse();
    }

    @Test
    void whenLatNumberAndTwoSpecialSymbolsAndNotSpecialSymbolUnderValid() {
        assertThat(isNameValid("fir$t_u$er_1%")).isFalse();
    }
}