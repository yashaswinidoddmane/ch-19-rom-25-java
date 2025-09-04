package company;

import project.Project;

public class Company {
    Project[] projects=new Project[20];
    int index;

    public boolean addProject(Project project){
        boolean isProjectAdded=false;
        if (project !=null){
            projects[index++]=project;
            isProjectAdded=true;

        }else {
            System.out.println("invalid project");
        }
        return isProjectAdded;

    }
    public void getProjectDetails() {
        for (Project project : projects) {
            System.out.println("project name is " + project.getProjectName());
            System.out.println("project id is :  " + project.getProjectId());
            System.out.println("project tart date is" + project.getStartDate());
            System.out.println("project end date is : " + project.getEndDate());
            System.out.println("-------------------------------------------");
        }
    }
}
