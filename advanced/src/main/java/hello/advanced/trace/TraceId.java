package hello.advanced.trace;

import java.util.UUID;

/**
 * packageName    : hello.advanced.trace
 * fileName       : TraceId
 * author         : Sora
 * date           : 2024-08-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-28        Sora       최초 생성
 */
public class TraceId {

    private String id;
    private int level;

    public TraceId() {
        this.id = createId();
        this.level = 0;
    }

    private TraceId(String id, int level){
        this.id = id;
        this.level = level;
    }

    private String createId() {
        // 생성된 UUID 앞 8자리만 사용 --> 거의 중복되지 않고, 로그 기록용이기 때문에 괜찮음
        return UUID.randomUUID().toString().substring(0,8);
    }

    public TraceId createNextId(){
        return new TraceId(id, level+1);
    }

    public TraceId createPreviousId(){
        return new TraceId(id, level-1);
    }

    public boolean isFirstLevel(){
        return level == 0;
    }

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }
}
