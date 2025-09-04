package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;
//import com.xworkz.instituteapp.validation.TraineeValidation;

public class Institute {
    Trainee[] trainees= new Trainee[15];
    int index;

    public boolean addTrainee(Trainee trainee) {
        boolean isTraineeAdded = false;
        if (trainee != null) {
            trainees[index++] = trainee;
            isTraineeAdded = true;
        } else {
            System.out.println("Invalid trainee details");
        }
        return isTraineeAdded;
    }

    public void getTrineeDetails(){
        System.out.println("list of trainee's are");
        for(Trainee trainee: trainees){
            System.out.println("Trainee name is: "+ trainee.getTraineeName());
            System.out.println("Trainee Id is:"+ trainee.getTraineeId());
            System.out.println("Trainee dender is:"+ trainee.getGender());
            System.out.println("Trainee DOB is:"+ trainee.getDob());
            System.out.println("Trainee phone number is:"+ trainee.getPhoneNumber());
            System.out.println("Trainee email is:"+ trainee.getEmail());
            System.out.println("---------------------------------------------");
        }
    }

    /*
    Trainee trainee;

    public  boolean createTraineeInfo(Trainee trainee){
        boolean isTraineeInfoCreated = false;

        boolean isTraineeInfoValidated;
        TraineeValidation traineeValid = new TraineeValidation();
        isTraineeInfoValidated = traineeValid.validateTrainee(trainee);
        if (isTraineeInfoValidated){
            isTraineeInfoCreated = true;
            this.trainee = trainee;
        }

        return  isTraineeInfoCreated;
    }

    public void fetchTraineeDetails() {
        System.out.println("Name : "+trainee.getTraineeName());
        System.out.println("Trainee Id : "+trainee.getTraineeId());
        System.out.println("gender : "+trainee.getGender());
        System.out.println("Date of birth : "+trainee.getDob());
        System.out.println("Phone number : "+trainee.getPhoneNumber());
        System.out.println("Email : "+trainee.getEmail());
    }

     */
}
