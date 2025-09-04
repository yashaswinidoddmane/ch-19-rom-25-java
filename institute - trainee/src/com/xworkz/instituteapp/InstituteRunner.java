package com.xworkz.instituteapp;

import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.Trainee;
//import com.xworkz.instituteapp.validation.TraineeValidation;

public class InstituteRunner {

    public static void main(String[] args) {

        Trainee trainee = new Trainee();
        Trainee trainee1 = new Trainee();
        Trainee trainee2 = new Trainee();
        Trainee trainee3 = new Trainee();
        Trainee trainee4 = new Trainee();
        Trainee trainee5 = new Trainee();
        Trainee trainee6 = new Trainee();
        Trainee trainee7 = new Trainee();
        Trainee trainee8 = new Trainee();
        Trainee trainee9 = new Trainee();
        Trainee trainee10 = new Trainee();
        Trainee trainee11 = new Trainee();
         Trainee trainee12 = new Trainee();
         Trainee trainee13 = new Trainee();
         Trainee trainee14 = new Trainee();

        trainee.setTraineeName("Yashaswini");
        trainee1.setTraineeName("chaithanya");
        trainee2.setTraineeName("vaishu");
        trainee3.setTraineeName("shashank");
        trainee4.setTraineeName("devendra");
        trainee5.setTraineeName("vinu");
        trainee6.setTraineeName("vinayak");
        trainee7.setTraineeName("supreeth");
        trainee8.setTraineeName("nishu");
        trainee9.setTraineeName("thanu");
        trainee10.setTraineeName("yashh");
        trainee11.setTraineeName("siri");
        trainee12.setTraineeName("teju");
        trainee13.setTraineeName("avi");
        trainee14.setTraineeName("abhi");

        trainee.setTraineeId(1);
        trainee1.setTraineeId(2);
        trainee2.setTraineeId(3);
        trainee3.setTraineeId(4);
        trainee4.setTraineeId(5);
        trainee5.setTraineeId(6);
        trainee6.setTraineeId(7);
        trainee7.setTraineeId(8);
        trainee8.setTraineeId(9);
        trainee9.setTraineeId(10);
        trainee10.setTraineeId(11);
        trainee11.setTraineeId(12);
        trainee12.setTraineeId(13);
        trainee13.setTraineeId(14);
        trainee14.setTraineeId(15);

        trainee.setGender("female");
        trainee1.setGender("female");
        trainee2.setGender("female");
        trainee3.setGender("male");
        trainee4.setGender("male");
        trainee5.setGender("male");
        trainee6.setGender("male");
        trainee7.setGender("male");
        trainee8.setGender("female");
        trainee9.setGender("female");
        trainee10.setGender("female");
        trainee11.setGender("female");
        trainee12.setGender("female");
        trainee13.setGender("male");
        trainee14.setGender("male");

        trainee.setDob("14-01-2004");
        trainee1.setDob("27-06-2003");
        trainee2.setDob("27-7-2002");
        trainee3.setDob("16-07-2003");
        trainee4.setDob("21-12-2000");
        trainee5.setDob("20-12-2002");
        trainee6.setDob("20-12-2003");
        trainee7.setDob("26-06-2006");
        trainee8.setDob("20-08-2000");
        trainee9.setDob("30-01-1999");
        trainee10.setDob("01-01-1998");
        trainee11.setDob("21-07-2001");
        trainee12.setDob("16-01-2002");
        trainee13.setDob("12-04-2004");
        trainee14.setDob("11-04-2005");

        trainee.setPhoneNumber("8123819984");
        trainee1.setPhoneNumber("8105504916");
        trainee2.setPhoneNumber("8123532286");
        trainee3.setPhoneNumber("9740139275");
        trainee4.setPhoneNumber("7019086325");
        trainee5.setPhoneNumber("8104402563");
        trainee6.setPhoneNumber("8073292994");
        trainee7.setPhoneNumber("8123539984");
        trainee8.setPhoneNumber("8123819932");
        trainee9.setPhoneNumber("7019086345");
        trainee10.setPhoneNumber("8019037834");
        trainee11.setPhoneNumber("8105504916");
        trainee12.setPhoneNumber("8123819984");
        trainee13.setPhoneNumber("2233445566");
        trainee14.setPhoneNumber("8123819966");


        trainee.setEmail("yashu@gmail.com");
        trainee1.setEmail("chaithanya@gmail.com");
        trainee2.setEmail("vaishu@gmail.com");
        trainee3.setEmail("shashank@gmail.com");
        trainee4.setEmail("dev@gmail.com");
        trainee5.setEmail("vinu@gmail.com");
        trainee6.setEmail("vinayak@gmail.com");
        trainee7.setEmail("supreeth@gmail.com");
        trainee8.setEmail("nishu@gmail.com");
        trainee9.setEmail("thanu@gmail.com");
        trainee10.setEmail("yashh@gmail.com");
        trainee11.setEmail("siri@gmail.com");
        trainee12.setEmail("teju@gmail.com");
        trainee13.setEmail("avi@gmail.com");
        trainee14.setEmail("abhi@gmail.com");


        Institute institute = new Institute();
        institute.addTrainee(trainee);
        institute.addTrainee(trainee1);
        institute.addTrainee(trainee2);
        institute.addTrainee(trainee3);
        institute.addTrainee(trainee4);
        institute.addTrainee(trainee5);
        institute.addTrainee(trainee6);
        institute.addTrainee(trainee7);
        institute.addTrainee(trainee8);
        institute.addTrainee(trainee9);
        institute.addTrainee(trainee10);
        institute.addTrainee(trainee11);
        institute.addTrainee(trainee12);
        institute.addTrainee(trainee13);
        institute.addTrainee(trainee14);

        institute.getTrineeDetails();

        /*
        Trainee trainee = new Trainee();
        trainee.setTraineeId("1C7");
        trainee.setTraineeName("yashaswini");
        trainee.setDob("21/07/2003");
        trainee.setEmail("yy4911505@gmail.com");
        trainee.setGender("female");
        trainee.setPhoneNumber("7411348257");


        Institute institute = new Institute();
        institute.createTraineeInfo(trainee);
        institute.fetchTraineeDetails();

         */
    }
}
