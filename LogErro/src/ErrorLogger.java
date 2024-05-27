import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ErrorLogger {

    private static final String LOG_FILE_PATH = "logs/error_log.txt";

    public static void main(String[] args) {    
       createLogDirectory();

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            logError(e, "int result = 10 / 0;");
        }

        try {
            int result = 10 / 2;
            logMessage("Resultado da operação sem erro: " + result);
        } catch (Exception e) {
            logError(e, "int result = 10 / 2;");
        }

        System.out.println("Programa continuando normalmente...");
    }  
    private static void createLogDirectory() {
        File logDirectory = new File("logs");
        if (!logDirectory.exists()) {
            logDirectory.mkdirs();
        }
    }

    public static void logError(Exception e, String code) {
        try (FileWriter fw = new FileWriter(LOG_FILE_PATH, true); 
             PrintWriter pw = new PrintWriter(fw)) {
            
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = now.format(formatter);

            pw.println("Timestamp: " + timestamp);
            pw.println("Erro: " + e.toString());
            pw.println("Código executado: " + code);
            pw.println(); 

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    public static void logMessage(String message) {
        try (FileWriter fw = new FileWriter(LOG_FILE_PATH, true); 
             PrintWriter pw = new PrintWriter(fw)) {
            
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = now.format(formatter);

            pw.println("Timestamp: " + timestamp);
            pw.println("Mensagem: " + message);
            pw.println(); 

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
