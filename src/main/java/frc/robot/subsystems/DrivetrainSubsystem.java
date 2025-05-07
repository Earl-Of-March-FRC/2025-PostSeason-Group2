// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.studica.frc.AHRS;
import com.studica.frc.AHRS.NavXComType;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkMaxConfig;

import java.util.function.DoubleSupplier;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.servohub.ServoHub.ResetMode;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
public class DrivetrainSubsystem extends SubsystemBase {

  SparkMax topRight, topLeft, bottomRight, bottomLeft;
  RelativeEncoder topRightE, topLeftE, bottomRightE, bottomLeftE;
  AHRS gyro;
  MecanumDrive drive;
  public DrivetrainSubsystem() {

    topRight = new SparkMax(Constants.DriveConstants.TOP_RIGHT_ID, MotorType.kBrushless);
    topLeft = new SparkMax(Constants.DriveConstants.TOP_LEFT_ID, MotorType.kBrushless);
    bottomRight = new SparkMax(Constants.DriveConstants.BOTTOM_RIGHT_ID, MotorType.kBrushless);
    bottomLeft = new SparkMax(Constants.DriveConstants.BOTTOM_LEFT_ID, MotorType.kBrushless);

    SparkMaxConfig bottomRightConfig = new SparkMaxConfig();
    SparkMaxConfig topLeftConfig = new SparkMaxConfig();
    topLeftConfig.inverted(true);
    bottomRightConfig.inverted(true);
    //topLeft.configure(topLeftConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    topRightE = topRight.getEncoder();
    topLeftE = topLeft.getEncoder();
    bottomRightE = bottomRight.getEncoder();
    bottomLeftE = bottomLeft.getEncoder();

    topRightE.setPosition(0);
    topLeftE.setPosition(0);
    bottomRightE.setPosition(0);
    bottomLeftE.setPosition(0);
    
    drive = new MecanumDrive(topLeft, bottomLeft, topRight, bottomRight);

    gyro = new AHRS(NavXComType.kMXP_SPI);
    
  }

  @Override
  public void periodic() {
    
  }

  public void drive(DoubleSupplier xSpeed, DoubleSupplier ySpeed, DoubleSupplier rotation){
    drive.driveCartesian(xSpeed.getAsDouble(), -ySpeed.getAsDouble(), rotation.getAsDouble());
  }

  @Override
  public void simulationPeriodic() {
    
  }
}
