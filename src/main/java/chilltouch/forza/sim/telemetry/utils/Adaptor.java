package chilltouch.forza.sim.telemetry.utils;

import chilltouch.forza.sim.telemetry.entity.FH4Entity;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class Adaptor {
    public static FH4Entity getEntity(byte[] bytes) {
        FH4Entity entity = new FH4Entity();
        entity.setIsRaceOn(readBytes(bytes, 0, 4).getShort());
        if (entity.getIsRaceOn() > 0) {
            entity.setTimestampMS(readBytes(bytes, 4, 8).getInt());
            entity.setEngineMaxRpm(readBytes(bytes, 8, 12).getFloat());
            entity.setEngineIdleRpm(readBytes(bytes, 12, 16).getFloat());
            entity.setCurrentEngineRpm(readBytes(bytes, 16, 20).getFloat());
            entity.setAccelerationX(readBytes(bytes, 20, 24).getFloat());
            entity.setAccelerationY(readBytes(bytes, 24, 28).getFloat());
            entity.setAccelerationZ(readBytes(bytes, 28, 32).getFloat());
            entity.setVelocityX(readBytes(bytes, 32, 36).getFloat());
            entity.setVelocityY(readBytes(bytes, 36, 40).getFloat());
            entity.setVelocityZ(readBytes(bytes, 40, 44).getFloat());
            entity.setAngularVelocityX(readBytes(bytes, 44, 48).getFloat());
            entity.setAngularVelocityY(readBytes(bytes, 48, 52).getFloat());
            entity.setAngularVelocityZ(readBytes(bytes, 52, 56).getFloat());
            entity.setMovementYaw(readBytes(bytes, 56, 60).getFloat());
            entity.setMovementPitch(readBytes(bytes, 60, 64).getFloat());
            entity.setMovementRoll(readBytes(bytes, 64, 68).getFloat());
            entity.setSuspensionTravelNormalizedFL(readBytes(bytes, 68, 72).getFloat());
            entity.setSuspensionTravelNormalizedFR(readBytes(bytes, 72, 76).getFloat());
            entity.setSuspensionTravelNormalizedRL(readBytes(bytes, 76, 80).getFloat());
            entity.setSuspensionTravelNormalizedRR(readBytes(bytes, 80, 84).getFloat());
            entity.setTireSlipRatioNormalizedFL(readBytes(bytes, 84, 88).getFloat());
            entity.setTireSlipRatioNormalizedFR(readBytes(bytes, 88, 92).getFloat());
            entity.setTireSlipRatioNormalizedRL(readBytes(bytes, 92, 96).getFloat());
            entity.setTireSlipRatioNormalizedRR(readBytes(bytes, 96, 100).getFloat());
            entity.setWheelRotationSpeedFL(readBytes(bytes, 100, 104).getFloat());
            entity.setWheelRotationSpeedFR(readBytes(bytes, 104, 108).getFloat());
            entity.setWheelRotationSpeedRL(readBytes(bytes, 108, 112).getFloat());
            entity.setWheelRotationSpeedRR(readBytes(bytes, 112, 116).getFloat());
            entity.setWheelOnRumbleStripFL(readBytes(bytes, 116, 120).getFloat());
            entity.setWheelOnRumbleStripFR(readBytes(bytes, 120, 124).getFloat());
            entity.setWheelOnRumbleStripRL(readBytes(bytes, 124, 128).getFloat());
            entity.setWheelOnRumbleStripRR(readBytes(bytes, 128, 132).getFloat());
            entity.setWheelInPuddleDepthFL(readBytes(bytes, 132, 136).getFloat());
            entity.setWheelInPuddleDepthFR(readBytes(bytes, 136, 140).getFloat());
            entity.setWheelInPuddleDepthRL(readBytes(bytes, 140, 144).getFloat());
            entity.setWheelInPuddleDepthRR(readBytes(bytes, 144, 148).getFloat());

            entity.setSurfaceRumbleFL(readBytes(bytes, 148, 152).getFloat());
            entity.setSurfaceRumbleFR(readBytes(bytes, 152, 156).getFloat());
            entity.setSurfaceRumbleRL(readBytes(bytes, 156, 160).getFloat());
            entity.setSurfaceRumbleRR(readBytes(bytes, 160, 164).getFloat());

            entity.setTireSlipAngleNormalizedFL(readBytes(bytes, 164, 168).getFloat());
            entity.setTireSlipAngleNormalizedFR(readBytes(bytes, 168, 172).getFloat());
            entity.setTireSlipAngleNormalizedRL(readBytes(bytes, 172, 176).getFloat());
            entity.setTireSlipAngleNormalizedRR(readBytes(bytes, 176, 180).getFloat());

            entity.setTireSlipCombinedNormalizedFL(readBytes(bytes, 180, 184).getFloat());
            entity.setTireSlipCombinedNormalizedFR(readBytes(bytes, 184, 188).getFloat());
            entity.setTireSlipCombinedNormalizedRL(readBytes(bytes, 188, 192).getFloat());
            entity.setTireSlipCombinedNormalizedRR(readBytes(bytes, 192, 196).getFloat());

            entity.setSuspensionTravelMetersFL(readBytes(bytes, 196, 200).getFloat());
            entity.setSuspensionTravelMetersFR(readBytes(bytes, 200, 204).getFloat());
            entity.setSuspensionTravelMetersRL(readBytes(bytes, 204, 208).getFloat());
            entity.setSuspensionTravelMetersRR(readBytes(bytes, 208, 212).getFloat());

            entity.setCarOrdinal(readBytes(bytes, 212, 216).getInt());
            entity.setCarClass(readBytes(bytes, 216, 220).getInt());
            entity.setCarPerformanceIndex(readBytes(bytes, 220, 224).getInt());
            entity.setDriveTrainType(readBytes(bytes, 224, 228).getInt());
            entity.setNumOfCylinders(readBytes(bytes, 228, 232).getInt());

            //V2 (Dash) Values
            entity.setCarPositionX(readBytes(bytes, 232, 236).getFloat());
            entity.setCarPositionY(readBytes(bytes, 236, 240).getFloat());
            entity.setCarPositionZ(readBytes(bytes, 240, 244).getFloat());

            entity.setCarSpeed(readBytes(bytes, 244, 248).getFloat());
            entity.setCarPower(readBytes(bytes, 248, 252).getFloat());
            entity.setCarTorque(readBytes(bytes, 252, 256).getFloat());

            entity.setTireTempFL(readBytes(bytes, 256, 260).getFloat());
            entity.setTireTempFR(readBytes(bytes, 260, 264).getFloat());
            entity.setTireTempRL(readBytes(bytes, 264, 268).getFloat());
            entity.setTireTempRR(readBytes(bytes, 268, 272).getFloat());

            entity.setCarBoost(readBytes(bytes, 272, 276).getFloat());
            entity.setRaceFuel(readBytes(bytes, 276, 280).getFloat());
            entity.setRaceDistanceTravelled(readBytes(bytes, 280, 284).getFloat());
            entity.setRaceBestLap(readBytes(bytes, 284, 288).getFloat());
            entity.setRaceLastLap(readBytes(bytes, 288, 292).getFloat());
            entity.setRaceCurrentLap(readBytes(bytes, 292, 296).getFloat());
            entity.setRaceCurrentRaceTime(readBytes(bytes, 296, 300).getFloat());

            entity.setRaceLapNumber((int) readBytes(bytes, 300, 302).get()); //technically unsigned
            entity.setRacePosition((int) readBytes(bytes, 302, 303).get()); //technically unsigned
            entity.setCarAccel((int) readBytes(bytes, 303, 304).get() & 0xFF); //due to being uint8
            entity.setCarBrake((int) readBytes(bytes, 304, 305).get() & 0xFF); //due to being uint8
            entity.setCarClutch((int) readBytes(bytes, 305, 306).get() & 0xFF); //due to being uint8
            entity.setCarHandBrake((int) readBytes(bytes, 306, 307).get() & 0xFF); //due to being uint8
            entity.setCarGear((int) readBytes(bytes, 307, 308).get() & 0xFF);//due to being uint8
            entity.setCarSteer((int) readBytes(bytes, 308, 309).get());

            entity.setRaceNormalizedDrivingLine((int) readBytes(bytes, 309, 310).get());
            entity.setRaceNormalizedAIBrakeDifference((int) readBytes(bytes, 310, 311).get());
        }
        return entity;
    }

    private static ByteBuffer readBytes(byte[] bytes, int offset, int length) {
        return ByteBuffer.wrap(Arrays.copyOfRange(bytes, offset, length)).order(ByteOrder.LITTLE_ENDIAN);
    }

//
//                                    if (entity.accelerationZ.getValue() < 0) {
//        entity.normalizedDecelerationTrue(entity.accelerationZ.getValue() / entity.decelerationMaxMeasured.getValue());
//        entity.normalizedAccelerationTrue(0.0);
//    } else {
//        entity.normalizedDecelerationTrue(0.0);
//        entity.normalizedAccelerationTrue(entity.accelerationZ.getValue() / entity.accelerationMaxMeasured.getValue());
//
//    }
//
//                                    entity.wheelRpmDiffFrontAbsolute((entity.wheelRotationSpeedFR.getValue() - entity.wheelRotationSpeedFL.getValue()) * 9.5493);
//                                    if (entity.wheelRotationSpeedFL.getValue() == 0.0)
//                                            entity.wheelRotationSpeedFL(0.00001);
//                                    entity.wheelRpmDiffFrontPercentage((entity.wheelRotationSpeedFR.getValue() / entity.wheelRotationSpeedFL.getValue() - 1) * 100);
//
//                                    entity.wheelRpmDiffRearAbsolute((entity.wheelRotationSpeedRR.getValue() - entity.wheelRotationSpeedRL.getValue()) * 9.5493);
//                                    if (entity.wheelRotationSpeedRL.getValue() == 0.0)
//                                            entity.wheelRotationSpeedRL(0.00001);
//                                    entity.wheelRpmDiffRearPercentage((entity.wheelRotationSpeedRR.getValue() / entity.wheelRotationSpeedRL.getValue() - 1) * 100);
//
//                                    entity.wheelRpmDiffLeftAbsolute((entity.wheelRotationSpeedRL.getValue() - entity.wheelRotationSpeedFL.getValue()) * 9.5493);
//                                    entity.wheelRpmDiffLeftPercentage((entity.wheelRotationSpeedRL.getValue() / entity.wheelRotationSpeedFL.getValue() - 1) * 100);
//
//                                    entity.wheelRpmDiffRightAbsolute((entity.wheelRotationSpeedRR.getValue() - entity.wheelRotationSpeedFR.getValue()) * 9.5493);
//                                    if (entity.wheelRotationSpeedFR.getValue() == 0.0)
//                                            entity.wheelRotationSpeedFR(0.00001);
//                                    entity.wheelRpmDiffLeftPercentage((entity.wheelRotationSpeedRR.getValue() / entity.wheelRotationSpeedFR.getValue() - 1) * 100);
//
//    //true angular Velocity
//                                    entity.angularVelocityTrue(getVector(entity.angularVelocityX.getValue(), entity.angularVelocityY.getValue(), entity.angularVelocityZ.getValue()));
//
//
//    //calculate shift indicator
//                                    if (entity.rpmCurrent.getValue() > (entity.rpmMaxMeasured.getValue() * entity.shiftWarningThresholdLow.getValue() * 0.01)) {
//        entity.shiftWarning((entity.rpmCurrent.getValue() - (entity.rpmMaxMeasured.getValue() * entity.shiftWarningThresholdLow.getValue() * 0.01)) / (entity.rpmMaxMeasured.getValue() * entity.shiftWarningThresholdHigh.getValue() * 0.01 - (entity.rpmMaxMeasured.getValue() * entity.shiftWarningThresholdLow.getValue() * 0.01)));
//    } else {
//        entity.shiftWarning(0.0);
//    }
//
//    //Enums
//                                    switch (entity.drivetrainType.getValue()) {
//        case 0:
//            entity.drivetrainTypeString("FWD");
//            break;
//        case 1:
//            entity.drivetrainTypeString("RWD");
//            break;
//        case 2:
//            entity.drivetrainTypeString("AWD");
//            break;
//    }
//                                    switch (entity.carClass.getValue()) {
//        case 0:
//            entity.carClassString("E");
//            break;
//        case 1:
//            entity.carClassString("D");
//            break;
//        case 2:
//            entity.carClassString("C");
//            break;
//        case 3:
//            entity.carClassString("B");
//            break;
//        case 4:
//            entity.carClassString("A");
//            break;
//        case 5:
//            entity.carClassString("S");
//            break;
//        case 6:
//            entity.carClassString("R");
//            break;
//        case 7:
//            entity.carClassString("P");
//            break;
//        case 8:
//            entity.carClassString("X");
//            break;
//    }
}
