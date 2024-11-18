package frc.robot.subsystems.elevator;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;

public class ElevatorReal implements ElevatorIO {
    public final TalonFX rightMotor = new TalonFX(1);
    public final TalonFX leftMotor = new TalonFX(2);
    public final DigitalInput limitSwitch = new DigitalInput(1);
    public final Counter counter = new Counter(limitSwitch);

    // sets both motors to follow each other
    public ElevatorReal() {
        leftMotor.getPosition();
        rightMotor.setControl(new Follower(2, false));
    }

    // checks if elevator is down
    public boolean ElevatorDown() {
        return counter.get() > 1;
    }

    // sets the power or the motor itself
    public void setMotorPower(double power) {
        rightMotor.set(power);
    }


}
