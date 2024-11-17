package frc.robot.subsystems.elevator;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;

public class ElevatorReal implements ElevatorIO {
    public final TalonFX EleMotor = new TalonFX(1);
    public final TalonFX leftMotor = new TalonFX(2);
    public final DigitalInput limitSwitch = new DigitalInput(1);
    public final Counter counter = new Counter(limitSwitch);

    public ElevatorReal() {
        leftMotor.getPosition();
        EleMotor.setControl(new Follower(2, false));
    }

    public boolean ElevatorDown() {
        return counter.get() > 1;
    }

    public void setMotorPower(double power) {
        EleMotor.set(power);
    }


}
