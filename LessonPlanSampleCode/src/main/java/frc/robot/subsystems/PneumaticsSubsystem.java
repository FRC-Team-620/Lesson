// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.PowerDistribution.ModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticsSubsystem extends SubsystemBase {
  /** Creates a new PenumaticsSubsystem. */
  private Solenoid piston1 = new Solenoid(PneumaticsModuleType.REVPH, 1);
  public PneumaticsSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


  public void setState(boolean state){
    this.piston1.set(state);
  }
}
