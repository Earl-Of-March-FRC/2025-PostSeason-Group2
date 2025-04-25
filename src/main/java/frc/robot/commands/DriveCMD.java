
package frc.robot.commands;

import frc.robot.subsystems.DrivetrainSubsystem;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;

public class DriveCMD extends Command {

  private final DrivetrainSubsystem driveSub;

  public DriveCMD(DrivetrainSubsystem driveSub, DoubleSupplier xSpeed, DoubleSupplier ySpeed) {
    this.driveSub = driveSub;
    addRequirements(driveSub);
  }

  @Override
  public void initialize() {

  }

  @Override
  public void execute() {
    
  }

  @Override
  public void end(boolean interrupted) {
    
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
