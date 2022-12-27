package test;

import main.General.Validation.ValidationValue;
import main.Menu.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputStringTest {
    ExitApp _menuItemExit = new ExitApp();
    HelloWorld _menuItemHello_World = new HelloWorld();
    Calculator _menuItemCal = new Calculator();
    RecursionDate _menuItemRecursionDate = new RecursionDate();
    InputString _menuItemInputSting = new InputString();

    @Test
    void InputString() {
        assertEquals("Строки", _menuItemInputSting.getTitle());
    }
    @Test
    void RecursionDate() {
        assertEquals("Рекурсивный калькулятор", _menuItemRecursionDate.getTitle());
    }
    @Test
    void ExitApp() {
        assertEquals("Выход из программы", _menuItemExit.getTitle());
    }

    @Test
    void HelloWorld() {
        assertEquals("Hello world", _menuItemHello_World.getTitle());
    }

    @Test
    void Calculator() {
        assertEquals("расчёт формулы", _menuItemCal.getTitle());
    }

    @Test
    @DisplayName("Сравнение строк true")
    public void vStringComparisonTrue() {
        String resOne = "dfdf";
        String resTwo = "dfdf";
        String expected = "true";

        Assertions.assertEquals(expected, ValidationValue.vStringComparison(resOne, resTwo));
    }

    @Test
    @DisplayName("Сравнение строк исключения")
    public void vStringComparisonException() {
        String resOne = "dfdf";
        String resTwo = "dfdfsssss";
        String expected = "false";
        Assertions.assertEquals(expected, ValidationValue.vStringComparison(resOne, resTwo));
    }

    @Test
    @DisplayName("Строка перевертыш true ")
    public void vReverseSequenceTrue() {
        String resOne = "dfdf";
        String resTwo = "fdfd";
        String expected = "true";

        Assertions.assertEquals(expected, ValidationValue.vReverseSequence(resOne, resTwo));
    }

    @Test
    @DisplayName("Строка перевертыш исключения")
    public void vReverseSequenceException() {
        String resOne = "dfddf";
        String resTwo = "dfddfdasdasa";
        String expected = "false";

        Assertions.assertEquals(expected, ValidationValue.vReverseSequence(resOne, resTwo));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+919367788755", "8989829304", "+16308520397", "786-307-3615"})
    public void vPhoneNumberTrue(String candidate) {
        String expected = "true";
        Assertions.assertEquals(expected, ValidationValue.vPhoneNumber(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+ddsdadsa",})
    public void vPhoneNumberException(String candidate) {
        String expected = "false";
        Assertions.assertEquals(expected, ValidationValue.vPhoneNumber(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"geon@ihateregex.io", "test@gmail.com mail@test.org", "mail@testing.com"})
    public void vEmailTrue(String candidate) {
        String expected = "true";
        Assertions.assertEquals(expected, ValidationValue.vEmail(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"@.io"})
    public void vEmailException(String candidate) {
        String expected = "false";
        Assertions.assertEquals(expected, ValidationValue.vEmail(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"192.168.1.1", "127.0.0.1", "0.0.0.0", "255.255.255.255"})
    public void vIpAddressTrue(String candidate) {
        String expected = "true";
        Assertions.assertEquals(expected, ValidationValue.vIpAddress(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"@.io"})
    public void vIpAddressException(String candidate) {
        String expected = "false";
        Assertions.assertEquals(expected, ValidationValue.vIpAddress(candidate));
    }

}