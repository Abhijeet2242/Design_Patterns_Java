package Low_level_design.chain_of_responsibility;

public class InfoLogProcessor implements LogProcessorHandler {

    @Override
    public boolean canHandleRequest(LogProcessor log) {
        return log.getLoggerType() == LoggerType.INFO;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handle(LogProcessor log) {
        log.markHandled();
        System.out.println("Method Successfully handle by : " + name());
    }

    @Override
    public String name() {
        return "Logger";
    }
}
