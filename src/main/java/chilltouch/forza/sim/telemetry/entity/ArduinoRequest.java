package chilltouch.forza.sim.telemetry.entity;

public class ArduinoRequest {
    private short raceOn;
    private float engineMaxRpm;
    private float engineIdleRpm;
    private float currentEngineRpm;
    private int driveTrainType;
    private int numOfCylinders;
    private float carSpeed;
    private float carPower;
    private float carTorque;
    private float carBoost;

    public short getRaceOn() {
        return raceOn;
    }

    public void setRaceOn(short raceOn) {
        this.raceOn = raceOn;
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

    public int getDriveTrainType() {
        return driveTrainType;
    }

    public void setDriveTrainType(int driveTrainType) {
        this.driveTrainType = driveTrainType;
    }

    public int getNumOfCylinders() {
        return numOfCylinders;
    }

    public void setNumOfCylinders(int numOfCylinders) {
        this.numOfCylinders = numOfCylinders;
    }

    public float getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(float carSpeed) {
        this.carSpeed = carSpeed;
    }

    public float getCarPower() {
        return carPower;
    }

    public void setCarPower(float carPower) {
        this.carPower = carPower;
    }

    public float getCarTorque() {
        return carTorque;
    }

    public void setCarTorque(float carTorque) {
        this.carTorque = carTorque;
    }

    public float getCarBoost() {
        return carBoost;
    }

    public void setCarBoost(float carBoost) {
        this.carBoost = carBoost;
    }

    @Override
    public String toString() {
        return "ArduinoRequest{" +
                "raceOn=" + raceOn +
                ", engineMaxRpm=" + engineMaxRpm +
                ", engineIdleRpm=" + engineIdleRpm +
                ", currentEngineRpm=" + currentEngineRpm +
                ", driveTrainType=" + driveTrainType +
                ", numOfCylinders=" + numOfCylinders +
                ", carSpeed=" + carSpeed +
                ", carPower=" + carPower +
                ", carTorque=" + carTorque +
                ", carBoost=" + carBoost +
                '}';
    }
}
