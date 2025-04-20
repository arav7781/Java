public class JavaThreadsDemo {
    // Thread class using extends Thread     static class MyThread1 extends Thread {
        @Override         public void run() {
            // Printing numbers from 1 to 5
            System.out.println("MyThread1 is printing numbers 1 to 5:");             for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-1: " + i);                 try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread-1 Interrupted");
                }
            }
        }
    }
    // Thread class implementing Runnable     static class MyThread2 implements Runnable {
        @Override         public void run() {
            // Printing characters from A to E
            System.out.println("MyThread2 is printing characters A to E:");             for (char c = 'A'; c <= 'E'; c++) {                 System.out.println("Thread-2: " + c);                 try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread-2 Interrupted");
                }
            }
        }
    }

// Thread class implementing Runnable     static class MyThread2 implements Runnable {
        @Override         public void run() {
            // Printing characters from A to E
            System.out.println("MyThread2 is printing characters A to E:");             for (char c = 'A'; c <= 'E'; c++) {                 System.out.println("Thread-2: " + c);                 try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread-2 Interrupted");
                }
            }
        }
    }
    // Start thread using class that extends Thread     public static void startThreadOne() {         MyThread1 t1 = new MyThread1();         t1.start();
    }
    // Start thread using class that implements Runnable     public static void startThreadTwo() {         Thread t2 = new Thread(new MyThread2());         t2.start();
    }
