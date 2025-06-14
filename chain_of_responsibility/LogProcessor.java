package Low_level_design.chain_of_responsibility;

import lombok.Getter;

import java.util.Objects;

@Getter
public class LogProcessor {
    private final LoggerType loggerType;

    private  final String reqDescription;
    private boolean handled;

    public LogProcessor(LoggerType loggerType, String reqDescription) {
        this.loggerType = Objects.requireNonNull(loggerType);
        this.reqDescription = Objects.requireNonNull(reqDescription);
    }

    public void markHandled() {
        this.handled = true;
    }

    @Override
    public String toString() {
        return reqDescription;
    }




}
