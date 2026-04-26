package opgave03;

import opgave03.primenumbers.SieveOfEratosthenes;

public class Opgave03 {
    public static void main(String[] args) {

        SieveOfEratosthenes sieve = new SieveOfEratosthenes();
        sieve.findPrimeNumbers(10000000);
    }
}
