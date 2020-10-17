package chilltouch.forza.sim.telemetry.entity;

public class FH4Entity {
    private short isRaceOn;
    private long timestampMS;
    private float engineMaxRpm;
    private float engineIdleRpm;
    private float currentEngineRpm;
    private float accelerationX;
    private float accelerationY;
    private float accelerationZ;
    private float velocityX;
    private float velocityY;
    private float velocityZ;
    private float angularVelocityX;
    private float angularVelocityY;
    private float angularVelocityZ;
    private float movementYaw;
    private float movementPitch;
    private float movementRoll;
    private float suspensionTravelNormalizedFL;
    private float suspensionTravelNormalizedFR;
    private float suspensionTravelNormalizedRL;
    private float suspensionTravelNormalizedRR;
    private float tireSlipRatioNormalizedFL;
    private float tireSlipRatioNormalizedFR;
    private float tireSlipRatioNormalizedRL;
    private float tireSlipRatioNormalizedRR;
    private float wheelRotationSpeedFL;
    private float wheelRotationSpeedFR;
    private float wheelRotationSpeedRL;
    private float wheelRotationSpeedRR;
    private float wheelOnRumbleStripFL;
    private float wheelOnRumbleStripFR;
    private float wheelOnRumbleStripRL;
    private float wheelOnRumbleStripRR;
    private float wheelInPuddleDepthFL;
    private float wheelInPuddleDepthFR;
    private float wheelInPuddleDepthRL;
    private float wheelInPuddleDepthRR;
    private float surfaceRumbleFL;
    private float surfaceRumbleFR;
    private float surfaceRumbleRL;
    private float surfaceRumbleRR;
    private float tireSlipAngleNormalizedFL;
    private float tireSlipAngleNormalizedFR;
    private float tireSlipAngleNormalizedRL;
    private float tireSlipAngleNormalizedRR;
    private float tireSlipCombinedNormalizedFL;
    private float tireSlipCombinedNormalizedFR;
    private float tireSlipCombinedNormalizedRL;
    private float tireSlipCombinedNormalizedRR;
    private float suspensionTravelMetersFL;
    private float suspensionTravelMetersFR;
    private float suspensionTravelMetersRL;
    private float suspensionTravelMetersRR;
    private int carOrdinal;
    private int carClass;
    private int carPerformanceIndex;
    private int driveTrainType;
    private int numOfCylinders;
    private float carPositionX;
    private float carPositionY;
    private float carPositionZ;
    private float carSpeed;
    private float carPower;
    private float carTorque;
    private float tireTempFL;
    private float tireTempFR;
    private float tireTempRL;
    private float tireTempRR;
    private float carBoost;
    private float raceFuel;
    private float raceDistanceTravelled;
    private float raceBestLap;
    private float raceLastLap;
    private float raceCurrentLap;
    private float raceCurrentRaceTime;

    private int raceLapNumber;
    private int racePosition;
    private int carAccel;
    private int carBrake;
    private int carClutch;
    private int carHandBrake;
    private int carGear;
    private int carSteer;
    private int raceNormalizedDrivingLine;
    private int raceNormalizedAIBrakeDifference;

    private float maxAcceleration;
    private float maxDeAcceleration;

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

    public float getAccelerationX() {
        return accelerationX;
    }

    public void setAccelerationX(float accelerationX) {
        this.accelerationX = accelerationX;
    }

    public float getAccelerationY() {
        return accelerationY;
    }

    public void setAccelerationY(float accelerationY) {
        this.accelerationY = accelerationY;
    }

    public float getAccelerationZ() {
        return accelerationZ;
    }

    public void setAccelerationZ(float accelerationZ) {
        this.accelerationZ = accelerationZ;
    }

    public float getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(float velocityX) {
        this.velocityX = velocityX;
    }

    public float getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(float velocityY) {
        this.velocityY = velocityY;
    }

    public float getVelocityZ() {
        return velocityZ;
    }

    public void setVelocityZ(float velocityZ) {
        this.velocityZ = velocityZ;
    }

    public float getAngularVelocityX() {
        return angularVelocityX;
    }

    public void setAngularVelocityX(float angularVelocityX) {
        this.angularVelocityX = angularVelocityX;
    }

    public float getAngularVelocityY() {
        return angularVelocityY;
    }

    public void setAngularVelocityY(float angularVelocityY) {
        this.angularVelocityY = angularVelocityY;
    }

    public float getAngularVelocityZ() {
        return angularVelocityZ;
    }

    public void setAngularVelocityZ(float angularVelocityZ) {
        this.angularVelocityZ = angularVelocityZ;
    }

    public float getMovementYaw() {
        return movementYaw;
    }

    public void setMovementYaw(float movementYaw) {
        this.movementYaw = movementYaw;
    }

    public float getMovementPitch() {
        return movementPitch;
    }

    public void setMovementPitch(float movementPitch) {
        this.movementPitch = movementPitch;
    }

    public float getMovementRoll() {
        return movementRoll;
    }

    public void setMovementRoll(float movementRoll) {
        this.movementRoll = movementRoll;
    }

    public float getSuspensionTravelNormalizedFL() {
        return suspensionTravelNormalizedFL;
    }

    public void setSuspensionTravelNormalizedFL(float suspensionTravelNormalizedFL) {
        this.suspensionTravelNormalizedFL = suspensionTravelNormalizedFL;
    }

    public float getSuspensionTravelNormalizedFR() {
        return suspensionTravelNormalizedFR;
    }

    public void setSuspensionTravelNormalizedFR(float suspensionTravelNormalizedFR) {
        this.suspensionTravelNormalizedFR = suspensionTravelNormalizedFR;
    }

    public float getSuspensionTravelNormalizedRL() {
        return suspensionTravelNormalizedRL;
    }

    public void setSuspensionTravelNormalizedRL(float suspensionTravelNormalizedRL) {
        this.suspensionTravelNormalizedRL = suspensionTravelNormalizedRL;
    }

    public float getSuspensionTravelNormalizedRR() {
        return suspensionTravelNormalizedRR;
    }

    public void setSuspensionTravelNormalizedRR(float suspensionTravelNormalizedRR) {
        this.suspensionTravelNormalizedRR = suspensionTravelNormalizedRR;
    }

    public float getTireSlipRatioNormalizedFL() {
        return tireSlipRatioNormalizedFL;
    }

    public void setTireSlipRatioNormalizedFL(float tireSlipRatioNormalizedFL) {
        this.tireSlipRatioNormalizedFL = tireSlipRatioNormalizedFL;
    }

    public float getTireSlipRatioNormalizedFR() {
        return tireSlipRatioNormalizedFR;
    }

    public void setTireSlipRatioNormalizedFR(float tireSlipRatioNormalizedFR) {
        this.tireSlipRatioNormalizedFR = tireSlipRatioNormalizedFR;
    }

    public float getTireSlipRatioNormalizedRL() {
        return tireSlipRatioNormalizedRL;
    }

    public void setTireSlipRatioNormalizedRL(float tireSlipRatioNormalizedRL) {
        this.tireSlipRatioNormalizedRL = tireSlipRatioNormalizedRL;
    }

    public float getTireSlipRatioNormalizedRR() {
        return tireSlipRatioNormalizedRR;
    }

    public void setTireSlipRatioNormalizedRR(float tireSlipRatioNormalizedRR) {
        this.tireSlipRatioNormalizedRR = tireSlipRatioNormalizedRR;
    }

    public float getWheelRotationSpeedFL() {
        return wheelRotationSpeedFL;
    }

    public void setWheelRotationSpeedFL(float wheelRotationSpeedFL) {
        this.wheelRotationSpeedFL = wheelRotationSpeedFL;
    }

    public float getWheelRotationSpeedFR() {
        return wheelRotationSpeedFR;
    }

    public void setWheelRotationSpeedFR(float wheelRotationSpeedFR) {
        this.wheelRotationSpeedFR = wheelRotationSpeedFR;
    }

    public float getWheelRotationSpeedRL() {
        return wheelRotationSpeedRL;
    }

    public void setWheelRotationSpeedRL(float wheelRotationSpeedRL) {
        this.wheelRotationSpeedRL = wheelRotationSpeedRL;
    }

    public float getWheelRotationSpeedRR() {
        return wheelRotationSpeedRR;
    }

    public void setWheelRotationSpeedRR(float wheelRotationSpeedRR) {
        this.wheelRotationSpeedRR = wheelRotationSpeedRR;
    }

    public float getWheelOnRumbleStripFL() {
        return wheelOnRumbleStripFL;
    }

    public void setWheelOnRumbleStripFL(float wheelOnRumbleStripFL) {
        this.wheelOnRumbleStripFL = wheelOnRumbleStripFL;
    }

    public float getWheelOnRumbleStripFR() {
        return wheelOnRumbleStripFR;
    }

    public void setWheelOnRumbleStripFR(float wheelOnRumbleStripFR) {
        this.wheelOnRumbleStripFR = wheelOnRumbleStripFR;
    }

    public float getWheelOnRumbleStripRL() {
        return wheelOnRumbleStripRL;
    }

    public void setWheelOnRumbleStripRL(float wheelOnRumbleStripRL) {
        this.wheelOnRumbleStripRL = wheelOnRumbleStripRL;
    }

    public float getWheelOnRumbleStripRR() {
        return wheelOnRumbleStripRR;
    }

    public void setWheelOnRumbleStripRR(float wheelOnRumbleStripRR) {
        this.wheelOnRumbleStripRR = wheelOnRumbleStripRR;
    }

    public float getWheelInPuddleDepthFL() {
        return wheelInPuddleDepthFL;
    }

    public void setWheelInPuddleDepthFL(float wheelInPuddleDepthFL) {
        this.wheelInPuddleDepthFL = wheelInPuddleDepthFL;
    }

    public float getWheelInPuddleDepthFR() {
        return wheelInPuddleDepthFR;
    }

    public void setWheelInPuddleDepthFR(float wheelInPuddleDepthFR) {
        this.wheelInPuddleDepthFR = wheelInPuddleDepthFR;
    }

    public float getWheelInPuddleDepthRL() {
        return wheelInPuddleDepthRL;
    }

    public void setWheelInPuddleDepthRL(float wheelInPuddleDepthRL) {
        this.wheelInPuddleDepthRL = wheelInPuddleDepthRL;
    }

    public float getWheelInPuddleDepthRR() {
        return wheelInPuddleDepthRR;
    }

    public void setWheelInPuddleDepthRR(float wheelInPuddleDepthRR) {
        this.wheelInPuddleDepthRR = wheelInPuddleDepthRR;
    }

    public float getSurfaceRumbleFL() {
        return surfaceRumbleFL;
    }

    public void setSurfaceRumbleFL(float surfaceRumbleFL) {
        this.surfaceRumbleFL = surfaceRumbleFL;
    }

    public float getSurfaceRumbleFR() {
        return surfaceRumbleFR;
    }

    public void setSurfaceRumbleFR(float surfaceRumbleFR) {
        this.surfaceRumbleFR = surfaceRumbleFR;
    }

    public float getSurfaceRumbleRL() {
        return surfaceRumbleRL;
    }

    public void setSurfaceRumbleRL(float surfaceRumbleRL) {
        this.surfaceRumbleRL = surfaceRumbleRL;
    }

    public float getSurfaceRumbleRR() {
        return surfaceRumbleRR;
    }

    public void setSurfaceRumbleRR(float surfaceRumbleRR) {
        this.surfaceRumbleRR = surfaceRumbleRR;
    }

    public float getTireSlipAngleNormalizedFL() {
        return tireSlipAngleNormalizedFL;
    }

    public void setTireSlipAngleNormalizedFL(float tireSlipAngleNormalizedFL) {
        this.tireSlipAngleNormalizedFL = tireSlipAngleNormalizedFL;
    }

    public float getTireSlipAngleNormalizedFR() {
        return tireSlipAngleNormalizedFR;
    }

    public void setTireSlipAngleNormalizedFR(float tireSlipAngleNormalizedFR) {
        this.tireSlipAngleNormalizedFR = tireSlipAngleNormalizedFR;
    }

    public float getTireSlipAngleNormalizedRL() {
        return tireSlipAngleNormalizedRL;
    }

    public void setTireSlipAngleNormalizedRL(float tireSlipAngleNormalizedRL) {
        this.tireSlipAngleNormalizedRL = tireSlipAngleNormalizedRL;
    }

    public float getTireSlipAngleNormalizedRR() {
        return tireSlipAngleNormalizedRR;
    }

    public void setTireSlipAngleNormalizedRR(float tireSlipAngleNormalizedRR) {
        this.tireSlipAngleNormalizedRR = tireSlipAngleNormalizedRR;
    }

    public float getTireSlipCombinedNormalizedFL() {
        return tireSlipCombinedNormalizedFL;
    }

    public void setTireSlipCombinedNormalizedFL(float tireSlipCombinedNormalizedFL) {
        this.tireSlipCombinedNormalizedFL = tireSlipCombinedNormalizedFL;
    }

    public float getTireSlipCombinedNormalizedFR() {
        return tireSlipCombinedNormalizedFR;
    }

    public void setTireSlipCombinedNormalizedFR(float tireSlipCombinedNormalizedFR) {
        this.tireSlipCombinedNormalizedFR = tireSlipCombinedNormalizedFR;
    }

    public float getTireSlipCombinedNormalizedRL() {
        return tireSlipCombinedNormalizedRL;
    }

    public void setTireSlipCombinedNormalizedRL(float tireSlipCombinedNormalizedRL) {
        this.tireSlipCombinedNormalizedRL = tireSlipCombinedNormalizedRL;
    }

    public float getTireSlipCombinedNormalizedRR() {
        return tireSlipCombinedNormalizedRR;
    }

    public void setTireSlipCombinedNormalizedRR(float tireSlipCombinedNormalizedRR) {
        this.tireSlipCombinedNormalizedRR = tireSlipCombinedNormalizedRR;
    }

    public float getSuspensionTravelMetersFL() {
        return suspensionTravelMetersFL;
    }

    public void setSuspensionTravelMetersFL(float suspensionTravelMetersFL) {
        this.suspensionTravelMetersFL = suspensionTravelMetersFL;
    }

    public float getSuspensionTravelMetersFR() {
        return suspensionTravelMetersFR;
    }

    public void setSuspensionTravelMetersFR(float suspensionTravelMetersFR) {
        this.suspensionTravelMetersFR = suspensionTravelMetersFR;
    }

    public float getSuspensionTravelMetersRL() {
        return suspensionTravelMetersRL;
    }

    public void setSuspensionTravelMetersRL(float suspensionTravelMetersRL) {
        this.suspensionTravelMetersRL = suspensionTravelMetersRL;
    }

    public float getSuspensionTravelMetersRR() {
        return suspensionTravelMetersRR;
    }

    public void setSuspensionTravelMetersRR(float suspensionTravelMetersRR) {
        this.suspensionTravelMetersRR = suspensionTravelMetersRR;
    }

    public int getCarOrdinal() {
        return carOrdinal;
    }

    public void setCarOrdinal(int carOrdinal) {
        this.carOrdinal = carOrdinal;
    }

    public int getCarClass() {
        return carClass;
    }

    public void setCarClass(int carClass) {
        this.carClass = carClass;
    }

    public int getCarPerformanceIndex() {
        return carPerformanceIndex;
    }

    public void setCarPerformanceIndex(int carPerformanceIndex) {
        this.carPerformanceIndex = carPerformanceIndex;
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

    public float getCarPositionX() {
        return carPositionX;
    }

    public void setCarPositionX(float carPositionX) {
        this.carPositionX = carPositionX;
    }

    public float getCarPositionY() {
        return carPositionY;
    }

    public void setCarPositionY(float carPositionY) {
        this.carPositionY = carPositionY;
    }

    public float getCarPositionZ() {
        return carPositionZ;
    }

    public void setCarPositionZ(float carPositionZ) {
        this.carPositionZ = carPositionZ;
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

    public float getTireTempFL() {
        return tireTempFL;
    }

    public void setTireTempFL(float tireTempFL) {
        this.tireTempFL = tireTempFL;
    }

    public float getTireTempFR() {
        return tireTempFR;
    }

    public void setTireTempFR(float tireTempFR) {
        this.tireTempFR = tireTempFR;
    }

    public float getTireTempRL() {
        return tireTempRL;
    }

    public void setTireTempRL(float tireTempRL) {
        this.tireTempRL = tireTempRL;
    }

    public float getTireTempRR() {
        return tireTempRR;
    }

    public void setTireTempRR(float tireTempRR) {
        this.tireTempRR = tireTempRR;
    }

    public float getCarBoost() {
        return carBoost;
    }

    public void setCarBoost(float carBoost) {
        this.carBoost = carBoost;
    }

    public float getRaceFuel() {
        return raceFuel;
    }

    public void setRaceFuel(float raceFuel) {
        this.raceFuel = raceFuel;
    }

    public float getRaceDistanceTravelled() {
        return raceDistanceTravelled;
    }

    public void setRaceDistanceTravelled(float raceDistanceTravelled) {
        this.raceDistanceTravelled = raceDistanceTravelled;
    }

    public float getRaceBestLap() {
        return raceBestLap;
    }

    public void setRaceBestLap(float raceBestLap) {
        this.raceBestLap = raceBestLap;
    }

    public float getRaceLastLap() {
        return raceLastLap;
    }

    public void setRaceLastLap(float raceLastLap) {
        this.raceLastLap = raceLastLap;
    }

    public float getRaceCurrentLap() {
        return raceCurrentLap;
    }

    public void setRaceCurrentLap(float raceCurrentLap) {
        this.raceCurrentLap = raceCurrentLap;
    }

    public float getRaceCurrentRaceTime() {
        return raceCurrentRaceTime;
    }

    public void setRaceCurrentRaceTime(float raceCurrentRaceTime) {
        this.raceCurrentRaceTime = raceCurrentRaceTime;
    }

    public int getRaceLapNumber() {
        return raceLapNumber;
    }

    public void setRaceLapNumber(int raceLapNumber) {
        this.raceLapNumber = raceLapNumber;
    }

    public int getRacePosition() {
        return racePosition;
    }

    public void setRacePosition(int racePosition) {
        this.racePosition = racePosition;
    }

    public int getCarAccel() {
        return carAccel;
    }

    public void setCarAccel(int carAccel) {
        this.carAccel = carAccel;
    }

    public int getCarBrake() {
        return carBrake;
    }

    public void setCarBrake(int carBrake) {
        this.carBrake = carBrake;
    }

    public int getCarClutch() {
        return carClutch;
    }

    public void setCarClutch(int carClutch) {
        this.carClutch = carClutch;
    }

    public int getCarHandBrake() {
        return carHandBrake;
    }

    public void setCarHandBrake(int carHandBrake) {
        this.carHandBrake = carHandBrake;
    }

    public int getCarGear() {
        return carGear;
    }

    public void setCarGear(int carGear) {
        this.carGear = carGear;
    }

    public int getCarSteer() {
        return carSteer;
    }

    public void setCarSteer(int carSteer) {
        this.carSteer = carSteer;
    }

    public int getRaceNormalizedDrivingLine() {
        return raceNormalizedDrivingLine;
    }

    public void setRaceNormalizedDrivingLine(int raceNormalizedDrivingLine) {
        this.raceNormalizedDrivingLine = raceNormalizedDrivingLine;
    }

    public int getRaceNormalizedAIBrakeDifference() {
        return raceNormalizedAIBrakeDifference;
    }

    public void setRaceNormalizedAIBrakeDifference(int raceNormalizedAIBrakeDifference) {
        this.raceNormalizedAIBrakeDifference = raceNormalizedAIBrakeDifference;
    }

    public float getMaxAcceleration() {
        return maxAcceleration;
    }

    public void setMaxAcceleration(float maxAcceleration) {
        this.maxAcceleration = maxAcceleration;
    }

    public float getMaxDeAcceleration() {
        return maxDeAcceleration;
    }

    public void setMaxDeAcceleration(float maxDeAcceleration) {
        this.maxDeAcceleration = maxDeAcceleration;
    }

    @Override
    public String toString() {
        return "{" +
                "isRaceOn=" + isRaceOn +
                ", timestampMS=" + timestampMS +
                ", engineMaxRpm=" + engineMaxRpm +
                ", engineIdleRpm=" + engineIdleRpm +
                ", currentEngineRpm=" + currentEngineRpm +
                ", accelerationX=" + accelerationX +
                ", accelerationY=" + accelerationY +
                ", accelerationZ=" + accelerationZ +
                ", velocityX=" + velocityX +
                ", velocityY=" + velocityY +
                ", velocityZ=" + velocityZ +
                ", angularVelocityX=" + angularVelocityX +
                ", angularVelocityY=" + angularVelocityY +
                ", angularVelocityZ=" + angularVelocityZ +
                ", movementYaw=" + movementYaw +
                ", movementPitch=" + movementPitch +
                ", movementRoll=" + movementRoll +
                ", suspensionTravelNormalizedFL=" + suspensionTravelNormalizedFL +
                ", suspensionTravelNormalizedFR=" + suspensionTravelNormalizedFR +
                ", suspensionTravelNormalizedRL=" + suspensionTravelNormalizedRL +
                ", suspensionTravelNormalizedRR=" + suspensionTravelNormalizedRR +
                ", tireSlipRatioNormalizedFL=" + tireSlipRatioNormalizedFL +
                ", tireSlipRatioNormalizedFR=" + tireSlipRatioNormalizedFR +
                ", tireSlipRatioNormalizedRL=" + tireSlipRatioNormalizedRL +
                ", tireSlipRatioNormalizedRR=" + tireSlipRatioNormalizedRR +
                ", wheelRotationSpeedFL=" + wheelRotationSpeedFL +
                ", wheelRotationSpeedFR=" + wheelRotationSpeedFR +
                ", wheelRotationSpeedRL=" + wheelRotationSpeedRL +
                ", wheelRotationSpeedRR=" + wheelRotationSpeedRR +
                ", wheelOnRumbleStripFL=" + wheelOnRumbleStripFL +
                ", wheelOnRumbleStripFR=" + wheelOnRumbleStripFR +
                ", wheelOnRumbleStripRL=" + wheelOnRumbleStripRL +
                ", wheelOnRumbleStripRR=" + wheelOnRumbleStripRR +
                ", wheelInPuddleDepthFL=" + wheelInPuddleDepthFL +
                ", wheelInPuddleDepthFR=" + wheelInPuddleDepthFR +
                ", wheelInPuddleDepthRL=" + wheelInPuddleDepthRL +
                ", wheelInPuddleDepthRR=" + wheelInPuddleDepthRR +
                ", surfaceRumbleFL=" + surfaceRumbleFL +
                ", surfaceRumbleFR=" + surfaceRumbleFR +
                ", surfaceRumbleRL=" + surfaceRumbleRL +
                ", surfaceRumbleRR=" + surfaceRumbleRR +
                ", tireSlipAngleNormalizedFL=" + tireSlipAngleNormalizedFL +
                ", tireSlipAngleNormalizedFR=" + tireSlipAngleNormalizedFR +
                ", tireSlipAngleNormalizedRL=" + tireSlipAngleNormalizedRL +
                ", tireSlipAngleNormalizedRR=" + tireSlipAngleNormalizedRR +
                ", tireSlipCombinedNormalizedFL=" + tireSlipCombinedNormalizedFL +
                ", tireSlipCombinedNormalizedFR=" + tireSlipCombinedNormalizedFR +
                ", tireSlipCombinedNormalizedRL=" + tireSlipCombinedNormalizedRL +
                ", tireSlipCombinedNormalizedRR=" + tireSlipCombinedNormalizedRR +
                ", suspensionTravelMetersFL=" + suspensionTravelMetersFL +
                ", suspensionTravelMetersFR=" + suspensionTravelMetersFR +
                ", suspensionTravelMetersRL=" + suspensionTravelMetersRL +
                ", suspensionTravelMetersRR=" + suspensionTravelMetersRR +
                ", carOrdinal=" + carOrdinal +
                ", carClass=" + carClass +
                ", carPerformanceIndex=" + carPerformanceIndex +
                ", driveTrainType=" + driveTrainType +
                ", numOfCylinders=" + numOfCylinders +
                ", carPositionX=" + carPositionX +
                ", carPositionY=" + carPositionY +
                ", carPositionZ=" + carPositionZ +
                ", carSpeed=" + carSpeed +
                ", carPower=" + carPower +
                ", carTorque=" + carTorque +
                ", tireTempFL=" + tireTempFL +
                ", tireTempFR=" + tireTempFR +
                ", tireTempRL=" + tireTempRL +
                ", tireTempRR=" + tireTempRR +
                ", carBoost=" + carBoost +
                ", raceFuel=" + raceFuel +
                ", raceDistanceTravelled=" + raceDistanceTravelled +
                ", raceBestLap=" + raceBestLap +
                ", raceLastLap=" + raceLastLap +
                ", raceCurrentLap=" + raceCurrentLap +
                ", raceCurrentRaceTime=" + raceCurrentRaceTime +
                ", raceLapNumber=" + raceLapNumber +
                ", racePosition=" + racePosition +
                ", carAccel=" + carAccel +
                ", carBrake=" + carBrake +
                ", carClutch=" + carClutch +
                ", carHandBrake=" + carHandBrake +
                ", carGear=" + carGear +
                ", carSteer=" + carSteer +
                ", raceNormalizedDrivingLine=" + raceNormalizedDrivingLine +
                ", raceNormalizedAIBrakeDifference=" + raceNormalizedAIBrakeDifference +
                ", maxAcceleration=" + maxAcceleration +
                ", maxDeAcceleration=" + maxDeAcceleration +
                '}';
    }
}
