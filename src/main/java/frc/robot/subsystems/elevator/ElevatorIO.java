package frc.robot.subsystems.elevator;

import org.littletonrobotics.junction.AutoLog;

public interface ElevatorIO {
    @AutoLog

    public static class ElevatorIOInput {
    }

    public default void setMotorPower(double power) {}

    public default void setMotorPrecentage(double precent) {}

    public default void updateInputs(ElevatorIOInput inputs) {}

    public default boolean ElevatorDown() {
        return ElevatorDown();
    }
}
