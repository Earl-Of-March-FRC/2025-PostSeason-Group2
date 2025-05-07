
package frc.robot.commands;

import frc.robot.subsystems.DrivetrainSubsystem;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;

public class DriveCMD extends Command {

  private final DrivetrainSubsystem driveSub;
  DoubleSupplier xSpeed;
  DoubleSupplier ySpeed;
  DoubleSupplier rotation;

  public DriveCMD(DrivetrainSubsystem driveSub, DoubleSupplier xSpeed, DoubleSupplier ySpeed, DoubleSupplier rotation) {
    this.driveSub = driveSub;
    this.xSpeed = xSpeed; 
    this.ySpeed = ySpeed;
    this.rotation = rotation;
    addRequirements(driveSub);
  }

  @Override
  public void initialize() {

  }

  @Override
  public void execute() {
    driveSub.drive(xSpeed, ySpeed, rotation);
  }

  @Override
  public void end(boolean interrupted) {
    
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
