package edu.school21.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberWorkerTest() {
    private static NumberWorker x = new NumberWorker();

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 7, 13, 2147483647})
    void isPrimeForPrimes(int number) {
        Assertions.assertTrue(x.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = { 4, 9, 15, 291, 2147483646 })
    void isPrimeForNotPrimes(int number) {
        Assertions.assertFalse(x.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {-2147483648, -1500, -11, 0, 1})
    void isPrimeForIncorrectNumbers(int number) {
        Assertions.assertThrows(IllegalNumberException.class, () -> x.isPrime(number));
    }

    @ParameterizedTest
    @CsvFileSource{resources = {"/data.csv"}, delimiter = ','}
    void digitsSum(int x, int sum) {
        Assertions.assertEquals(x.digitsSum(x), sum);
    }

}