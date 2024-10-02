package designs.Logger;

public class Client {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LoggingLevel.ERROR, "Error parsing string.");
    }
}
