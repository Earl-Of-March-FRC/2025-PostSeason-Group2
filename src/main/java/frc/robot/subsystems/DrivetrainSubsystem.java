// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.AHRS;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
public class DrivetrainSubsystem extends SubsystemBase {

  SparkMax topRight, topLeft, bottomRight, bottomLeft;
  AHRS gyro;
  public DrivetrainSubsystem() {

    topRight = new SparkMax(Constants.DriveConstants.TOP_LEFT_ID, MotorType.kBrushless);
    topLeft = new SparkMax(Constants.DriveConstants.TOP_LEFT_ID, MotorType.kBrushless);
    bottomRight = new SparkMax(Constants.DriveConstants.BOTTOM_RIGHT_ID, MotorType.kBrushless);
    bottomLeft = new SparkMax(Constants.DriveConstants.BOTTOM_LEFT_ID, MotorType.kBrushless);

  }

  @Override
  public void periodic() {
    
  }

  @Override
  public void simulationPeriodic() {
    
  }
}
