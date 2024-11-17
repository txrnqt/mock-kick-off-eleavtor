package frc.robot.subsystems.elevator;

import org.littletonrobotics.junction.AutoLog;

public interface ElevatorIO {
    @AutoLog

    public static class ElevatorIOInput {
    }

    // sets the power or the motor itself
    public default void setMotorPower(double power) {}

    public default void setMotorPrecentage(double precent) {}

    public default void updateInputs(ElevatorIOInput inputs) {}

    // checks if elevator is down
    public default boolean ElevatorDown() {
        return ElevatorDown();
    }
}
