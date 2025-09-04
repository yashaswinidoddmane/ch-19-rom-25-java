package company;

import project.Project;

public class CompanyRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Project project1=new Project();
        Project project2 = new Project();
        Project project3 = new Project();
        Project project4 = new Project();
        Project project5 = new Project();
        Project project6 = new Project();
        Project project7 = new Project();
        Project project8 = new Project();
        Project project9 = new Project();
        Project project10 = new Project();
        Project project11 = new Project();
        Project project12 = new Project();
        Project project13 = new Project();
        Project project14 = new Project();
        Project project15 = new Project();
        Project project16 = new Project();
        Project project17 = new Project();
        Project project18 = new Project();
        Project project19 = new Project();

        project.setProjectName("AI Assistant");
        project.setProjectId(20);
        project.setStartDate("01-01-2024");
        project.setEndDate("31-12-2024");


        project1.setProjectName("e marketing");
        project1.setProjectId(1);
        project1.setStartDate("12-2-2002");
        project1.setEndDate("23-3-2002");


        project2.setProjectName("Online Banking");
        project2.setProjectId(2);
        project2.setStartDate("01-01-2005");
        project2.setEndDate("30-06-2005");

        project3.setProjectName("Hospital Management");
        project3.setProjectId(3);
        project3.setStartDate("15-03-2008");
        project3.setEndDate("10-09-2008");

        project4.setProjectName("School ERP");
        project4.setProjectId(4);
        project4.setStartDate("10-07-2010");
        project4.setEndDate("20-12-2010");

        project5.setProjectName("E-Commerce Website");
        project5.setProjectId(5);
        project5.setStartDate("01-01-2012");
        project5.setEndDate("30-04-2012");


        project6.setProjectName("Inventory System");
        project6.setProjectId(6);
        project6.setStartDate("12-05-2013");
        project6.setEndDate("10-09-2013");


        project7.setProjectName("CRM Software");
        project7.setProjectId(7);
        project7.setStartDate("01-06-2014");
        project7.setEndDate("31-12-2014");


        project8.setProjectName("Library Management");
        project8.setProjectId(8);
        project8.setStartDate("01-01-2015");
        project8.setEndDate("30-06-2015");


        project9.setProjectName("Hotel Booking System");
        project9.setProjectId(9);
        project9.setStartDate("15-03-2016");
        project9.setEndDate("15-09-2016");


        project10.setProjectName("Food Delivery App");
        project10.setProjectId(10);
        project10.setStartDate("01-02-2017");
        project10.setEndDate("30-07-2017");


        project11.setProjectName("Social Media Platform");
        project11.setProjectId(11);
        project11.setStartDate("01-01-2018");
        project11.setEndDate("31-10-2018");


        project12.setProjectName("Travel Booking System");
        project12.setProjectId(12);
        project12.setStartDate("15-02-2019");
        project12.setEndDate("20-09-2019");


        project13.setProjectName("Online Learning Portal");
        project13.setProjectId(13);
        project13.setStartDate("01-01-2020");
        project13.setEndDate("15-06-2020");


        project14.setProjectName("Healthcare App");
        project14.setProjectId(14);
        project14.setStartDate("10-07-2020");
        project14.setEndDate("10-01-2021");

        project15.setProjectName("Job Portal");
        project15.setProjectId(15);
        project15.setStartDate("01-02-2021");
        project15.setEndDate("30-08-2021");


        project16.setProjectName("News Website");
        project16.setProjectId(16);
        project16.setStartDate("05-03-2021");
        project16.setEndDate("30-11-2021");


        project17.setProjectName("Video Streaming App");
        project17.setProjectId(17);
        project17.setStartDate("01-01-2022");
        project17.setEndDate("30-06-2022");


        project18.setProjectName("Music Player");
        project18.setProjectId(18);
        project18.setStartDate("15-07-2022");
        project18.setEndDate("31-12-2022");

        project19.setProjectName("Chat Application");
        project19.setProjectId(19);
        project19.setStartDate("01-02-2023");
        project19.setEndDate("30-07-2023");



        Company company=new Company();
        company.addProject(null);
        company.addProject(project);
        company.addProject(project1);
        company.addProject(project2);
        company.addProject(project3);
        company.addProject(project4);
        company.addProject(project5);
        company.addProject(project6);
        company.addProject(project7);
        company.addProject(project8);
        company.addProject(project8);
        company.addProject(project10);
        company.addProject(project11);
        company.addProject(project12);
        company.addProject(project13);
        company.addProject(project14);
        company.addProject(project15);
        company.addProject(project16);
        company.addProject(project17);
        company.addProject(project18);
        company.addProject(project19);



        company.getProjectDetails();

    }
}
