// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PneumaticsSubsystem;


public class SingleSelonoidCommand extends CommandBase {
  
  private PneumaticsSubsystem pneumatics;
  private boolean state;
  /** Creates a new SingleSelonoidCommand. */
  public SingleSelonoidCommand(boolean state) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.state = state;
    addRequirements(this.pneumatics);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    this.state = false;
  }
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    this.pneumatics.setState(!this.state);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    this.pneumatics.setState(false);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
