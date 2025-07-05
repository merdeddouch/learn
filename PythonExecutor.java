import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PythonExecutor {
    public static void main(String[] args) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("python3", args[0]);

            // Start the process
            Process process = processBuilder.start();

            // Read the output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Python Output: " + line);
            }

            // Wait for the process to finish
            int exitCode = process.waitFor();
            System.out.println("Exited with code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
