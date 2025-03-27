package com.bridgelabz.AIResumeScreening;


import java.util.List;
public class ResumeScreening {
    public static void main(String[] args) {
        // Create resumes for different job roles
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Akshit Chauhan", 1, "Java, C++, Python");
        DataScientist dataScientist = new DataScientist("Harshit", 2, "C, Power BI, SQL");
        ProductManager productManager = new ProductManager("Harsh", 1, "Product Management, Business Development");

        // Processing resumes
        Resume<SoftwareEngineer> resumeSE = new Resume<>(softwareEngineer);
        Resume<DataScientist> resumeDS = new Resume<>(dataScientist);
        Resume<ProductManager> resumePM = new Resume<>(productManager);

        resumeSE.processResume();
        resumeDS.processResume();
        resumePM.processResume();

        // Screen multiple resumes using wildcard
        System.out.println("\n------ Screening Multiple Resumes ------");
        screenResumes(List.of(softwareEngineer, dataScientist, productManager));
    }

    // Wildcard method to screen resumes for any job role
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayResume();
        }
    }
}