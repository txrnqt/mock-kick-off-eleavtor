package frc.robot.subsystems.elevator;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase {
    private ElevatorIO io;

    public Elevator(ElevatorIO io) {
        this.io = io;
    }

    public void setMotorPower(double power) {
        io.setMotorPower(power);
    }

    public void ElevatorUp() {
        setMotorPower(1);
    }

    public boolean isDown() {
        return io.ElevatorDown();
    }

    public Command ElevatorUpOne() {
        return startEnd(() -> ElevatorUp(), () -> setMotorPower(0)).withTimeout(3.0);
    }

    public Command ElevatorHome() {
        return run(() -> setMotorPower(-1).until(isDown()));
    }

}
