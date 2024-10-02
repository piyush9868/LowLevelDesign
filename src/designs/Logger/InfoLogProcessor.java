package designs.Logger;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor next) {
        super(next);
    }

    @Override
    void log(LoggingLevel level, String message){
        if(level == LoggingLevel.INFO){
            System.out.printf("INFO: %s\n", message);
        }
        else{
            super.log(level, message);
        }
    }
}
