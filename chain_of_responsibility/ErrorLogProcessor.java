package Low_level_design.chain_of_responsibility;

public class ErrorLogProcessor implements LogProcessorHandler{

    @Override
    public boolean canHandleRequest(LogProcessor log) {
        return log.getLoggerType() == LoggerType.ERROR;
    }

    @Override
    public int getPriority() {
        return 3;
    }

    @Override
    public void handle(LogProcessor log) {
        log.markHandled();
        System.out.println("Request handled by : " + name());
    }

    @Override
    public String name() {
        return "Error";
    }
}
