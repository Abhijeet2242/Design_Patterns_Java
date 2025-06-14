package Low_level_design.chain_of_responsibility;

public class DebugLogProcessor implements LogProcessorHandler{
    @Override
    public boolean canHandleRequest(LogProcessor log) {
        return log.getLoggerType() == LoggerType.DEBUG;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handle(LogProcessor log) {
        log.markHandled();
        System.out.println("request handled by : " + name());
    }

    @Override
    public String name() {
        return "Bebugger";
    }
}
