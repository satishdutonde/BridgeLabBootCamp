import java.util.Scanner;
import java.util.concurrent.*;

public class InputWithTimeLimit {

    private static Scanner scanner = new Scanner(System.in);
    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
        for (char variable = 'a'; variable <= 'z'; variable++) {
            getUserInput(variable);
        }

        // Close the scanner to release resources
        scanner.close();

        // Shutdown the executor service
        executorService.shutdown();
    }

    private static void getUserInput(char variable) {
        System.out.println("Enter value for " + variable + ":");

        InputReader inputReader = new InputReader();
        Future<String> future = executorService.submit(inputReader);

        try {
            String input = future.get(15, TimeUnit.SECONDS); // Wait for the input with a time limit

            if (input != null) {
                System.out.println("Value for " + variable + ": " + input);
            } else {
                System.out.println("Time limit reached. Defaulting to next variable.");
            }

            System.out.println();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e instanceof TimeoutException) {
                System.out.println("Time limit reached. Defaulting to next variable.");
            }
        } finally {
            // Attempt to cancel the task (interrupt it) if it's still running
            future.cancel(true);
        }
    }

    private static class InputReader implements Callable<String> {
        private String input;

        public String call() {
            try {
                Thread inputThread = new Thread(() -> {
                    try {
                        input = scanner.nextLine();
                    } catch (Exception e) {
                        // Handle exception
                    }
                });

                inputThread.start();
                inputThread.join(15000); // Wait for the input thread to finish or timeout after 15 seconds

                if (inputThread.isAlive()) {
                    // Input thread is still alive, meaning the timeout occurred
                    inputThread.interrupt();  // Interrupt the input thread
                    input = null;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return input;
        }
    }
}
