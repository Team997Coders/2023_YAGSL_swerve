package frc.robot.commands.swervedrive.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.swervedrive.SwerveSubsystem;

public class Zeros extends CommandBase {
    private SwerveSubsystem swerve;
    
    Zeros(SwerveSubsystem swerve) {
        this.swerve = swerve;
    }


    
}
