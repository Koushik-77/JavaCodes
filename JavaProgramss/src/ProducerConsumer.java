class A {
    int n;
    boolean valueset = false;

    synchronized int get() {
        while (!valueset) {
            try {
                Thread.sleep(2000);
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception Caught");
            }
        }
        System.out.println("Got: " + n);
        valueset = false;
        notify();
        return n;
    }

    synchronized int put(int n) {
        while (valueset) {
            try {
                Thread.sleep(2000);
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException Caught");
            }
        }
        this.n = n;
        valueset = true;
        System.out.println("Put: " + n);
        notify();
        return n;
    }
}

class Producer implements Runnable {
    A a;

    Producer(A a) {
        this.a = a;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            a.put(i++);
        }
    }
}

class Consumer implements Runnable {
    A a;

    Consumer(A a) {
        this.a = a;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true) {
            a.get();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        A a = new A();
        new Producer(a);
        new Consumer(a);
        System.out.println("Press Control C to Stop");
    }
}
