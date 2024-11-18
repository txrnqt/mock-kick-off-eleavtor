package frc.robot.subsystems.elevator;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class Elevator extends SubsystemBase {
    private ElevatorIO io;

    public Elevator(ElevatorIO io) {
        this.io = io;
    }


    // sets the power or the motor itself
    public void setMotorPower(double power) {
        io.setMotorPower(power);
    }

    // checks if elevator is down
    public boolean isDown() {
        return io.ElevatorDown();
    }

    // command to controll elevator manualy with joystick
    public Command ElevatorContollerMan(CommandXboxController controller) {
        return startEnd(() -> setMotorPower(controller.getRightY()), () -> setMotorPower(0))
            .withTimeout(3.0);
    }

    // brings elevator to home
    public Command ElevatorHome() {
        Command checkHome = 
        return run(() -> setMotorPower(-1).untill, () -> setMotorPower(0));
    }

}
