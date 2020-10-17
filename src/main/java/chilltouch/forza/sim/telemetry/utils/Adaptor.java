package chilltouch.forza.sim.telemetry.utils;

import chilltouch.forza.sim.telemetry.entity.FH4Entity;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class Adaptor {
    public static FH4Entity getEntity(byte[] bytes) {
        FH4Entity entity = new FH4Entity();
        entity.setIsRaceOn(readBytes(bytes, 0, 4).getShort());
        entity.setTimestampMS(readBytes(bytes, 4, 8).getInt());
        entity.setEngineMaxRpm(readBytes(bytes, 8, 12).getFloat());
        entity.setEngineIdleRpm(readBytes(bytes, 12, 16).getFloat());
        entity.setCurrentEngineRpm(readBytes(bytes, 16, 20).getFloat());
        return entity;
    }

    private static ByteBuffer readBytes(byte[] bytes, int offset, int length) {
        return ByteBuffer.wrap(Arrays.copyOfRange(bytes, offset, length)).order(ByteOrder.LITTLE_ENDIAN);
    }
}
