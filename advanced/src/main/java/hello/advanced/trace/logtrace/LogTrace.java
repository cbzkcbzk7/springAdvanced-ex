package hello.advanced.trace.logtrace;

import hello.advanced.trace.TraceStatus;

/**
 * packageName    : hello.advanced.trace.logtrace
 * fileName       : LogTrace
 * author         : Sora
 * date           : 2024-09-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-01        Sora       최초 생성
 */
public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);
}
