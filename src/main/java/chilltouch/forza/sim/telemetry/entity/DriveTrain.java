package chilltouch.forza.sim.telemetry.entity;

public enum DriveTrain {
    FWD, RWD, AWD, UNKNOWN;

    public static DriveTrain getDriveTrainByIndex(int driveTrainIndex) {
        if (driveTrainIndex == 0) {
            return FWD;
        } else if (driveTrainIndex == 1) {
            return RWD;
        } else if (driveTrainIndex == 2) {
            return AWD;
        } else {
            return UNKNOWN;
        }
    }
}
