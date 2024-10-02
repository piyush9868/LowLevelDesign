package designs.Logger;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor next) {
        super(next);
    }

    @Override
    void log(LoggingLevel level, String message){
        if(level == LoggingLevel.ERROR){
            System.out.printf("ERROR: %s\n", message);
        }
        else{
            super.log(level, message);
        }
    }
}
