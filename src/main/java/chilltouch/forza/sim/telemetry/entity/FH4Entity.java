package chilltouch.forza.sim.telemetry.entity;

public class FH4Entity {
    private short isRaceOn;
    private long timestampMS;
//    f32 EngineMaxRpm;
    private float engineMaxRpm;
//    f32 EngineIdleRpm;
    private float engineIdleRpm;
//    f32 CurrentEngineRpm;
    private float currentEngineRpm;


    public short getIsRaceOn() {
        return isRaceOn;
    }

    public void setIsRaceOn(short isRaceOn) {
        this.isRaceOn = isRaceOn;
    }

    public long getTimestampMS() {
        return timestampMS;
    }

    public void setTimestampMS(long timestampMS) {
        this.timestampMS = timestampMS;
    }

    public float getEngineMaxRpm() {
        return engineMaxRpm;
    }

    public void setEngineMaxRpm(float engineMaxRpm) {
        this.engineMaxRpm = engineMaxRpm;
    }

    public float getEngineIdleRpm() {
        return engineIdleRpm;
    }

    public void setEngineIdleRpm(float engineIdleRpm) {
        this.engineIdleRpm = engineIdleRpm;
    }

    public float getCurrentEngineRpm() {
        return currentEngineRpm;
    }

    public void setCurrentEngineRpm(float currentEngineRpm) {
        this.currentEngineRpm = currentEngineRpm;
    }

    @Override
    public String toString() {
        return "FH4Entity{" +
                "isRaceOn=" + isRaceOn +
                ", timestampMS=" + timestampMS +
                ", engineMaxRpm=" + engineMaxRpm +
                ", engineIdleRpm=" + engineIdleRpm +
                ", currentEngineRpm=" + currentEngineRpm +
                '}';
    }
}
