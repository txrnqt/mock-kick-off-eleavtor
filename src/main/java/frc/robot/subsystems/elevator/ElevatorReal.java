package frc.robot.subsystems.elevator;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;

public class ElevatorReal implements ElevatorIO {
    public final TalonFX EleMotor = new TalonFX(1);
    public final TalonFX leftMotor = new TalonFX(2);

    public ElevatorReal() {
        leftMotor.getPosition();
        EleMotor.setControl(new Follower(2, false));
    }

    public void setMotorPower(double power) {
        EleMotor.set(power);
    }


}
