package com.xworkz.hospitalapp.patient;

public class Patient {
        private String name;
        private int age;
        private String gender;
        private String disease;
        private String admissionDate;
        private String dischargeDate;
        private String doctorAssigned;
        private String contactNumber;


        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public String getDisease() {
            return disease;
        }
        public void setDisease(String disease) {
            this.disease = disease;
        }
        public String getAdmissionDate() {
            return admissionDate;
        }
        public void setAdmissionDate(String admissionDate) {
            this.admissionDate = admissionDate;
        }
        public String getDischargeDate() {
            return dischargeDate;
        }
        public void setDischargeDate(String dischargeDate) {
            this.dischargeDate = dischargeDate;
        }
        public String getDoctorAssigned() {
            return doctorAssigned;
        }
        public void setDoctorAssigned(String doctorAssigned) {
            this.doctorAssigned = doctorAssigned;
        }
        public String getContactNumber() {
            return contactNumber;
        }
        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }
    }

