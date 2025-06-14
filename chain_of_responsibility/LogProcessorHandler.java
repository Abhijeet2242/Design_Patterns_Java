package Low_level_design.chain_of_responsibility;

public interface LogProcessorHandler {
    boolean canHandleRequest(LogProcessor log);
    int getPriority();

    void handle(LogProcessor log);

    String name();
}
