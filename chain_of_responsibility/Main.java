package Low_level_design.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessorManager logProcessorManager = new LogProcessorManager();

        LogProcessor log1 = new LogProcessor(LoggerType.INFO, "Printing request");
        LogProcessor log2 = new LogProcessor(LoggerType.DEBUG, "Debugging request");
        LogProcessor log3 = new LogProcessor(LoggerType.ERROR, "Error request");

        logProcessorManager.addHandler(new InfoLogProcessor());
        logProcessorManager.addHandler(new DebugLogProcessor());
        logProcessorManager.addHandler(new ErrorLogProcessor());

        logProcessorManager.process(log1);
        logProcessorManager.process(log2);
        logProcessorManager.process(log3);


    }
}
