package amimations;

import java.util.concurrent.TimeUnit;

public class Animations {

    protected static void ripple(int duration) {
        int secondsToSleep = 80;

        while (duration > 0) {
            System.out.println("////////0////////////////0////////////////0////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("///////0////////////////0////////////////0/////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("//////0////////////////0////////////////0//////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("/////0////////////////0////////////////0///////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("//////0////////////////0////////////////0//////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("///////0////////////////0////////////////0/////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("////////0////////////////0////////////////0////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            duration--;
        }

    }

    protected static void braid() {
        int secondsToSleep = 100;
        int count = 100;

        while (count > 0) {
            System.out.println("////////0////////////////0////////////////0////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("///////0////////////////0////////////////0/////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("//////0////////////////0////////////////0//////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("/////0////////////////0////////////////0///////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("//////0////////////////0////////////////0//////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("///////0////////////////0////////////////0/////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("////////0////////////////0////////////////0////////");
            try {
                TimeUnit.MILLISECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            count--;
        }

    }

}
