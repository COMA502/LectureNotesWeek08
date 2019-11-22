package edu.dmacc.dsmcode.coma510.review;

public class QuizReview {
    /**
     * For questions 1 through 6, consider the following class:
     */
    public static class Counter {
        int count;

        public Counter() {
            this(0);
        }

        public Counter(int initialCount) {
            this.count = initialCount;
        }

        public void increment() {
            count++;
        }
    }

    public static void question1() {
        // 1. True or false, is this valid code?
        new Counter();
    }

    public static void question2() {
        // 2. True or false, is this valid code?
        new Counter(7);
    }

    public static void question3() {
        // 3. True or false, is this valid code?
        Counter counterA = new Counter();
//        Counter counterB = counterA.Counter();
    }

    public static void question4() {
        // 4. True or false, is this valid code?
        Counter counterA = new Counter();
        Counter counterB = new Counter();
    }

    public static void question5() {
        // 5. True or false, is this valid code?
        Counter counterA = new Counter();
        Counter counterB = counterA;
    }

    public static void main(String[] args) {
        question6();
    }

    public static void question6() {
        // 6. What will the code below print?
        Counter counterA = new Counter();
        Counter counterB = counterA;
        counterA.increment();
        System.out.print(counterB.count);
    }
}
