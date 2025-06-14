package Low_level_design.chain_of_responsibility;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LogProcessorManager {
    private List<LogProcessorHandler> handlers = new ArrayList<>();

    public void addHandler(LogProcessorHandler handler) {
        handlers.add(handler);
        handlers.sort(Comparator.comparingInt(LogProcessorHandler::getPriority));
    }

    public  void process(LogProcessor log) {
        for(LogProcessorHandler handler : handlers) {
            if(handler.canHandleRequest(log)) {
                handler.handle(log);
                return;
            }
        }
        System.out.println("No handler found for request: " + log.getReqDescription());
    }
}
