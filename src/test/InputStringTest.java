package test;

import main.General.Validation.ValidationValue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.testng.AssertJUnit.assertEquals;

class InputStringTest {

    ValidationValue v = new ValidationValue();

    @Test
    @DisplayName("Сравнение строк true")
    public void vStringComparison() {
        String resOne = "dfdf";
        String resTwo = "dfdf";
        String expected = "true";

        assertEquals(expected, ValidationValue.vStringComparison(resOne, resTwo));
    } @Test
    @DisplayName("Сравнение строк false")
    public void vStringComparisonTwo() {
        String resOne = "dfdf";
        String resTwo = "dfdfs";
        String expected = "false";

        assertEquals(expected, ValidationValue.vStringComparison(resOne, resTwo));
    }

    @Test
    @DisplayName("Строка перевертыш true ")
    public void vReverseSequence() {
        String resOne = "dfdf";
        String resTwo = "fdfd";
        String expected = "true";

        assertEquals(expected, ValidationValue.vReverseSequence(resOne, resTwo));
    }    @Test
    @DisplayName("Строка перевертыш false ")
    public void vReverseSequenceTwo() {
        String resOne = "dfddf";
        String resTwo = "dfddf";
        String expected = "false";

        assertEquals(expected, ValidationValue.vReverseSequence(resOne, resTwo));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+919367788755", "8989829304", "+16308520397", "786-307-3615"})
    public void vPhoneNumber(String candidate) {
        String expected = "true";
        assertEquals(expected, v.vPhoneNumber(candidate));
    }
    @ParameterizedTest
    @ValueSource(strings = {"+982", "1-1-1", "123765", })
    public void vPhoneNumberTwo(String candidate) {
        String expected = "false";
        assertEquals(expected, v.vPhoneNumber(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"geon@ihateregex.io", "test@gmail.com mail@test.org", "mail@testing.com"})
    public void vEmail(String candidate) {
        String expected = "true";
        assertEquals(expected, v.vEmail(candidate));
    }
    @ParameterizedTest
    @ValueSource(strings = {"mail with@space.com", "theproblem@test@gmail.com"})
    public void vEmailTwo(String candidate) {
        String expected = "true";
        assertEquals(expected, v.vEmail(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"192.168.1.1", "127.0.0.1", "0.0.0.0", "255.255.255.255"})
    public void vIpAddress(String candidate) {
        String expected = "true";
        assertEquals(expected, v.vIpAddress(candidate));
    }    @ParameterizedTest
    @ValueSource(strings = {"999.999.999.999", "1.2.3", "256.256.256.256"})
    public void vIpAddressTwo(String candidate) {
        String expected = "false";
        assertEquals(expected, v.vIpAddress(candidate));
    }

}