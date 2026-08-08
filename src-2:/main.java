import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Welcome Screen
        System.out.println("========================================================");
        System.out.println("                    CAMPUSTRACK                         ");
        System.out.println("========================================================");
        System.out.println("           Student Academic Management System           ");
        System.out.println("--------------------------------------------------------");

        // Student Profile
        System.out.print("Enter student ID: ");
        String studentID = scanner.next();
        scanner.nextLine();

        System.out.print("Enter full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        while (age <= 15 || age >= 35) {
            System.out.print("Invalid age.Enter a value between 16 and 30");
            System.out.println("\nEnter age : ");
            age = scanner.nextInt();
            System.out.println("Enter age: " + age);
        } 

        System.out.println("Enter email: ");
        String email = scanner.next();
        
         //Select a course
        System.out.println("\nSelect Course");
        System.out.println("1. BCA");
        System.out.println("2. B.Sc Computer Science");
        System.out.println("3. B.E/B.Tech");
        System.out.println("4. MCA");
        System.out.println("5.Other");
        System.out.println("");

        System.out.println("Enter course choice: ");
        int course =scanner.nextInt();
        while(course != 1 && course != 2 && course != 3 && course != 4 && course != 5) {
            System.out.println("Invalid course choice.Enter a value from 1 to 5");
            System.out.println("\nEnter course choice: ");
            course =scanner.nextInt();
            System.out.println("Enter course choice: " + course);
        }  

        System.out.println("Enter semester (1-8): ");
        int semester = scanner.nextInt();
        while(semester != 1 && semester != 2 && semester != 3 && semester != 4 && semester != 5 && semester != 6 && semester != 7 && semester != 8) {
            System.out.println("Invalid semester.Enter a value between 1 and 8.");
            System.out.println("\nEnter semester (1-8): ");
            semester = scanner.nextInt();
            System.out.println("Enter semester (1-8): " + semester);
        } 

        String careergoal = "Become a Java backend developer";
        System.out.println("Career goal             : " + careergoal);

        double semesterfee = 0;
        switch(course){
            case 1:
                semesterfee = 35000.00;
                break;
            case 2:
                semesterfee = 30000.00;
                break;
            case 3:
                semesterfee = 50000.00;
                break;
            case 4:
                semesterfee = 45000.00;
                break;
            case 5:
                semesterfee = 25000.00;
                break;
        }

       // Subject marks
       System.out.println("Enter java marks: ");
        int javamarks = scanner.nextInt();
        while (javamarks < 0 || javamarks > 100){
            System.out.println("Invalid marks. Enter a value between 0 and 100");
            System.out.println("\nEnter java marks: ");
            javamarks = scanner.nextInt();
            System.out.println("Enter java marks: " + javamarks);
        }
         
        System.out.println("Enter SQL marks: ");
        int sqlmarks = scanner.nextInt();
        while(sqlmarks < 0 || sqlmarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100");
            System.out.println("\nEnter SQL marks: ");
            sqlmarks = scanner.nextInt();
            System.out.println("Enter SQL marks: " + sqlmarks);
        }

        System.out.println("Enter Web Technology marks: ");
        int webtechnologymarks = scanner.nextInt();
        while(webtechnologymarks < 0 || webtechnologymarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100");
            System.out.println("\nEnter Web Technology marks: ");
            webtechnologymarks = scanner.nextInt();
            System.out.println("Enter Web Technology marks: " + webtechnologymarks);
        }

        System.out.println("Enter Aptitude marks: ");
        int aptitudemarks = scanner.nextInt();
        while(aptitudemarks < 0 || aptitudemarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100");
            System.out.println("\nEnter Aptitude marks: ");
            aptitudemarks = scanner.nextInt();
            System.out.println("Enter Aptitude marks: " + aptitudemarks);
        }

        System.out.println("Enter Communication marks: ");
        int communicationmarks = scanner.nextInt();
        while(communicationmarks < 0 || communicationmarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100");
            System.out.println("\nEnter Communication marks: ");
            communicationmarks = scanner.nextInt();
            System.out.println("Enter Communication marks: " + communicationmarks);
        }
        
        //Total and Percentage

        int totalmarks = javamarks + sqlmarks + webtechnologymarks + aptitudemarks + communicationmarks;
        double percentage = (double) totalmarks / 5;

        //Subject and Academic Result
         
         String result = (javamarks >= 35 && sqlmarks >= 35 && webtechnologymarks >= 35 && aptitudemarks >= 35 && communicationmarks >= 35 && percentage >= 40) ? "PASSED" : "FAILED";
        
        //Attendance

        System.out.println("Enter total classes conducted: ");
        int totalclassesconducted = scanner.nextInt();
        while(totalclassesconducted < 0 || totalclassesconducted >= 300) {
            System.out.println("Invalid number of classes. Enter a value between 0 and 300");
            System.out.println("\nEnter total classes conducted: ");
            totalclassesconducted = scanner.nextInt();
            System.out.println("Enter total classes conducted: " + totalclassesconducted);
        }

        System.out.println("Enter classes attended: ");
        int classesattended = scanner.nextInt();
        while(classesattended < 0 || classesattended >= totalclassesconducted) {
            System.out.println("Invalid number of classes. Enter a value between 0 and " + totalclassesconducted);
            System.out.println("\nEnter classes attended: ");
            classesattended = scanner.nextInt();
            System.out.println("Enter  classes attended: " + classesattended);
        }

        double attendance = (double) classesattended / totalclassesconducted * 100;
        String status = (attendance >= 75) ? "REGULAR" : "SHORTAGE";

        //Assignment Score Processing
        System.out.println("How many assignment scores do you want to enter?: ");
        int numberofassignments = scanner.nextInt();
        int totalscore =0;
        int validcount =0;
        for (int i=1;i<=numberofassignments ;i++){
            System.out.println("Enter score for assignment "+i +": ");
            int score = scanner.nextInt();
            if(score == -1){
                break;
            }
            if (score < -1 || score > 11){
                continue;
            }else{
                totalscore += score;
                validcount++;
            }   
        }

        double average = 0;
        if(validcount == 0){
            average = 0.00;
        }else{
            average = (double) totalscore / validcount;
        }
        String assignmentstatus = (validcount > 0  && average >= 5.0 )? "SATISFACTORY" : "NEEDS IMPROVEMENT";
       
       //Scholarship Calculation
       double scholarship = 0.0;
       if(result == "PASSED" && percentage >= 85 && attendance >= 80 ) {
        scholarship = 10.00;   
       }
       else if(result == "PASSED" && percentage >= 75 && attendance >= 75 ) {
        scholarship = 5.00;
       }else{
        scholarship = 0.00;
       }
       double scholarshipamount = (semesterfee * scholarship)/100;
       double finalpayablefee = semesterfee - scholarshipamount;
    
       //Fee Payment

       System.out.println("Final payable fee: " + finalpayablefee);

       System.out.println("Enter amount paid: ");
       double amountpaid = scanner.nextDouble();
       while(amountpaid < 0 || amountpaid > finalpayablefee){
        System.out.println("Invalid amount paid. Enter a value between 0 and " + finalpayablefee);
        System.out.println("\nEnter amount paid: ");
        amountpaid = scanner.nextDouble();
        System.out.println("Enter amount paid: " + amountpaid);
       }
       double feebalance = finalpayablefee - amountpaid;
       String feestatus = (feebalance == 0) ? "PAID" : "PENDING";

       //Final Semester Clearance
       String finalstatus = (result == "PASSED" && attendance >= 75 && assignmentstatus == "SATISFACTORY")? "CLEARED FOR NEXT SEMESTER" : "ACTION REQUIRED";
       
       // Process Another Student
      
       int Choice;
       do{
        System.out.println(" Do you want to process another student?");
       System.out.println("1. Yes");
       System.out.println("0. No");
       System.out.println("Enter your choice: ");
        Choice = scanner.nextInt();
       }
        while(Choice != 1 && Choice != 0);
        if(Choice == 0){
            System.out.println("Thank you for using CampusTrack.");
        }

        //Report Format
        System.out.println("========================================================");
        System.out.println("                  STUDENT SEMESTER REPORT                ");
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Student ID                 : " + studentID);
        System.out.println("Student Name               : " + name);
        System.out.println("Age                        : " + age);
        System.out.println("Email                      : " + email);
         switch (course){
            case 1:
                System.out.println("Course                     : BCA");            
                break;
            case 2:
                System.out.println("Course                     : B.Sc Computer Science");
                break;
            case 3:
                System.out.println("Course                     : B.E/B.Tech");
                break;
            case 4:
                System.out.println("Course                     : MCA");
                break;
            case 5:
                System.out.println("Course                     : Other");
                break;
        }
        System.out.println("Semester                   : " + semester);
        System.out.println("Career Goal                : " + careergoal);
        System.out.println("");
        System.out.println("---------------- ACADEMIC SUMMARY --------------------");
        System.out.println("Java Marks                 : " + javamarks);
        System.out.println("SQL Marks                  : " + sqlmarks);
        System.out.println("Webtechnology Marks        : " + webtechnologymarks);
        System.out.println("Aptitude Marks             : " + aptitudemarks);
        System.out.println("Communication Marks        : " + communicationmarks);
        System.out.println("Total Marks                : " + totalmarks + "/500");
        System.out.printf("Percentage                 : %.2f%%%n", percentage);
        System.out.println("Academic Result            : " + result);
         //Grade Classification

        if(result == "FAILED"){
            System.out.println("Grade                      : F"); 
        }else if(percentage >=85){
            System.out.println("Grade                      : A+");
        }else if(percentage >=75){
            System.out.println("Grade                      : A");
        }else if(percentage >=65){
            System.out.println("Grade                      : B");
        }else if(percentage >=50){
            System.out.println("Grade                      : C");
        }else{
            System.out.println("Grade                      : D");
        }

        System.out.println("");
        System.out.println("---------------- ATTENDANCE SUMMARY ------------------");
        System.out.println("Classes Conducted          : " + totalclassesconducted);
        System.out.println("Classes Attended           : " + classesattended);
        System.out.printf("Attendance Percentage      : %.2f%%%n" , attendance);
        System.out.println("Attendance Status          : " + status);
        System.out.println("");
        System.out.println("---------------- ASSIGNMENT SUMMARY ------------------");
        System.out.println("Valid Assignments          : " + validcount);
        System.out.println("Assignment Total           : " + totalscore);
        System.out.printf("Assignment Average         : %.2f%n" , average);
        System.out.println("Assignment Status          : " + assignmentstatus);

        System.out.println("");
        System.out.println("---------------- FEE SUMMARY -------------------------");
        System.out.println("Base Semester Fee          : " + semesterfee);
        System.out.println("Scholarship Percentage     : " + scholarship+ "%");  
        System.out.println("Scholarship Amount         : " + scholarshipamount);
        System.out.println("Final Payable Fee          : " + finalpayablefee);
        System.out.println("Amount Paid                : " + amountpaid);
        System.out.println("Fee Balance                : " + feebalance);
        System.out.println("Fee Status                 : " + feestatus);

        System.out.println("");
        System.out.println("---------------- FINAL STATUS ------------------------");
        System.out.println("Semester Clearance         : " + finalstatus);
        System.out.println("");
        System.out.println("---------------- FAILED CONDITIONS -------------------");
        //Failed Conditions

       if(finalstatus == "ACTION REQUIRED"){
        System.out.println("Expected failed conditions: "); 
       }
       if(javamarks < 35){
        System.out.println("- Java marks are below 35.");
       }
       if(sqlmarks < 35){
        System.out.println("- SQL marks are below 35.");
       }
       if(webtechnologymarks < 35){
        System.out.println("- webtechnology marks are below 35.");
       }
       if(aptitudemarks < 35){
        System.out.println("- aptitude marks are below 35.");
       }
       if(communicationmarks < 35){
        System.out.println("- communication marks are below 35.");
       }
       if(percentage < 40){
        System.out.println("- Overall percentage is below 40%.");
       }
       if(attendance < 75){
        System.out.println("- attendance is below 75%.");
       }
       if(assignmentstatus == "NEEDS IMPROVEMENT"){
        System.out.println("- No valid assignment score was entered.");
       }
       if(feestatus == "PENDING"){
        System.out.println("- semesterfee is PENDING.");
       }
       if(finalstatus == "CLEARED FOR NEXT SEMESTER"){
        System.out.println("Failed Conditions : None");
       }

       System.out.println("");
       System.out.println("---------------- RECOMMENDATIONS ---------------------");
       //Recommendations
       if(javamarks < 35 || sqlmarks < 35 || webtechnologymarks < 35 || aptitudemarks < 35 || communicationmarks < 35 ){
        System.out.println("Revisit the failed subject and complete additional practice.");   
       }
       if (percentage < 40){
        System.out.println("Improve overall academic performance.");
       }
       if(attendance < 75){
        System.out.println("Attend classes regularly and clear the attendance shortage.");
       }
       if(assignmentstatus == "NEEDS IMPROVEMENT"){
        System.out.println("Complete assignments consistently and maintain an average of at least 5.00.");
       }
       if(feestatus == "PENDING"){
        System.out.println("Pay the pending semester fee before clearance.");
       }
       if(finalstatus == "CLEARED FOR NEXT SEMESTER"){
        System.out.println("Maintain the current performance in the next semester.");
       }
       System.out.println("========================================================");   

    }   
}
