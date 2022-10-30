package edu.school21.numbers;

class NumberWorker() {
    public boolean isPrime(int number) {
        if (number <= 1) {
            throw new IllegalNumberException("Error: number can't be less than '2'");
        }
        for (int i = 2; i * i <= num; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int digitSum(int number) {
        int sum = 0;

        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }
}

class IllegalNumberException extends RuntimeException {
    public IllegalNumberException(String message) {
        System.err.println(message);
    }
}