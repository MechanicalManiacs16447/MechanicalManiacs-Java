package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;

@Disabled
public class Robot {

    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backLeft;
    DcMotor backRight;

    public Robot(DcMotor fL, DcMotor fR, DcMotor bL, DcMotor bR)
    {
        frontLeft = fL;
        frontRight = fR;
        backLeft = bL;
        backRight = bR;
    }

    public void Strafe(int power)
    {
        frontLeft.setPower(power);
        backRight.setPower(power);
        frontRight.setPower(-power);
        backLeft.setPower(-power);
    }

    public void Stop()
    {
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
        backLeft.setPower(0);
    }
<<<<<<< HEAD
    public void DriveForwardDistance(double inches, double power){
=======
    public void DriveForwardDistance(double inches, double power)
    {
>>>>>>> 30e61260dde27a6360155718746af703f82ef06d
        int diameter = 1;

        //Rest Encoders.
        frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        //Calculate tick value that the motors need to turn.
        double circumference = 3.14*diameter;
        double rotationsNeeded = inches/circumference;
        int encoderDrivingTarget = (int)(rotationsNeeded*1120);

        //Set tick value to the motors' target position.
        frontLeft.setTargetPosition(encoderDrivingTarget);
        frontRight.setTargetPosition(encoderDrivingTarget);
        backLeft.setTargetPosition(encoderDrivingTarget);
        backRight.setTargetPosition(encoderDrivingTarget);

        //Set the desired power
        frontLeft.setPower(power);
        frontRight.setPower(power);
        backLeft.setPower(power);
        backRight.setPower(power);

        //Set the mode of the motors to run to the target position.
        frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

<<<<<<< HEAD
        while(frontLeft.isBusy() || frontRight.isBusy() || backLeft.isBusy() || backRight.isBusy() )
        {
            //Do nothing until motors catch up.
        }
=======

>>>>>>> 30e61260dde27a6360155718746af703f82ef06d

        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);

<<<<<<< HEAD
=======
        while(frontLeft.isBusy() || frontRight.isBusy() || backLeft.isBusy() || backRight.isBusy() )
        {
            //Do nothing until all motors catch up.
        }

        
>>>>>>> 30e61260dde27a6360155718746af703f82ef06d
    }


}
