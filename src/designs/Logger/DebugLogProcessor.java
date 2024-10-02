package designs.Logger;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor next) {
        super(next);
    }

    @Override
    void log(LoggingLevel level, String message){
        if(level == LoggingLevel.DEBUG){
            System.out.printf("DEBUG: %s\n", message);
        }
        else{
            super.log(level, message);
        }
    }
}
