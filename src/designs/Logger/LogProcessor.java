package designs.Logger;

public class LogProcessor {

    LogProcessor nextProcessor;

    LogProcessor(LogProcessor next){
        this.nextProcessor = next;
    }

    void log(LoggingLevel level, String message){
        if(nextProcessor!=null){
            nextProcessor.log(level, message);
        }
    }
}
