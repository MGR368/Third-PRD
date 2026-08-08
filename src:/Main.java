import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Display the Welcome Screen
        System.out.println("==================================================");
        System.out.println("                 CAMPUSTRACK                      ");
        System.out.println("==================================================");
        System.out.println("      Simple Student Result Management System     ");
        System.out.println("--------------------------------------------------");

        //Read student details
        System.out.print("Enter student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        while (age < 16 || age > 30) {
            System.out.print("Invalid age.Enter a value between 16 and 30");
            System.out.println("\nEnter age : ");
            age = scanner.nextInt();
            System.out.println("Enter age: " + age);
        } 
       

        //Select a course
        System.out.println("\nSelect Course");
        System.out.println("1. BCA");
        System.out.println("2. B.Sc Computer Science");
        System.out.println("3. B.E/B.Tech");
        System.out.println("");
    
        System.out.println("Enter course choice: ");
        int course =scanner.nextInt();
        while(course != 1 && course != 2 && course != 3) {
            System.out.println("Invalid course choice.Enter a value from 1 to 3");
            System.out.println("\nEnter course choice: ");
            course =scanner.nextInt();
            System.out.println("Enter course choice: " + course);
        }
        
        
        // Read subject marks
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
        

        System.out.println("Enter Aptitude marks: ");
        int aptitudemarks = scanner.nextInt();
        while(aptitudemarks < 0 || aptitudemarks > 100) {
            System.out.println("Invalid marks. Enter a value between 0 and 100");
            System.out.println("\nEnter Aptitude marks: ");
            aptitudemarks = scanner.nextInt();
            System.out.println("Enter Aptitude marks: " + aptitudemarks);
        }
        

        //Calculate Total and Average
        
        int totalmarks = javamarks + sqlmarks + aptitudemarks;
       
        double average = totalmarks / 3.0;
       

        // Determine the Academic Result

        String result = (javamarks >= 35 && sqlmarks >= 35 && aptitudemarks >= 35) ? "PASSED" : "FAILED";
        

        

        //Check Attendance

        System.out.print("Enter attendance percentage: ");
        double attendance = scanner.nextDouble();
        while(attendance < 0 || attendance > 100){
            System.out.println("Invalid attendance. Enter a value between 0 and 100.");
            System.out.println("\nEnter attendance percentage: ");
            attendance = scanner.nextDouble();
            System.out.println("Enter attendance percentage: " + attendance + ".00%");
        }
        String status = (attendance >= 75) ? "SUFFICIENT" : "SHORTAGE";
        
        
        //Calculate the fee balance
        
        double semesterfee = 0;
        switch(course){
            case 1:
                semesterfee = 30000.00;
                break;
            case 2:
                semesterfee = 35000.00;
                break;
            case 3:
                semesterfee = 50000.00;
                break;
        }
       

        System.out.println("Enter fee paid: ");
        double feepaid = scanner.nextDouble();
        while(feepaid < 0 || feepaid > semesterfee){
            System.out.println("Enter fee paid: " + feepaid);
        }
        double feebalance = semesterfee - feepaid; 
        

        String Status = (feebalance == 0) ? "CLEARED" : "PENDING";
       

        //Determine the Final Semester Status

        String academicstatus =(result == "PASSED" && attendance >= 75 && feebalance == 0) ? "SEMESTER CLEARED" : "SEMESTER NOT CLEARED";
        
        
        
        
        System.out.println("==================================================");
        System.out.println("            STUDENT SEMESTER REPORT               ");
        System.out.println("==================================================");
       
        System.out.println("");
        System.out.println("Student ID          : " + studentID);
        System.out.println("Student Name        : " + name);
        System.out.println("Age                 : " + age);

        
        switch (course){
            case 1:
                System.out.println("Course              : BCA");            
                break;
            case 2:
                System.out.println("Course              : B.Sc Computer Science");
                break;
            case 3:
                System.out.println("Course              : B.E/B.Tech");
                break;
        }

        System.out.println("");
        System.out.println("--------------- ACADEMIC DETAILS -----------------");
        System.out.println("Java Marks          : " + javamarks);
        System.out.println("SQL Marks           : " + sqlmarks);
        System.out.println("Aptitude Marks      : " + aptitudemarks);
        System.out.println("Total Marks         : " + totalmarks + "/300");
        System.out.println("Average             : " + average);
        System.out.println("Academic Result     : " + result);

        //Determine the grade

        if(result == "FAILED"){
            System.out.println("Grade               : F");   
        }else if(average >= 75){
            System.out.println("Grade               : A");
        }else if (average >= 60){
            System.out.println("Grade               : B");
        }else if(average >= 50){
            System.out.println("Grade               : C");
        }else {
            System.out.println("Grade               : D");
        }
       

        System.out.println("");
        System.out.println("--------------- ATTENDANCE DETAILS ---------------");
        System.out.println("Attendance          : " + attendance +"0%");
        System.out.println("Attendance Status   : " + status);

        System.out.println("");
        System.out.println("--------------- FEE DETAILS ---------------------");
        System.out.println("Semester Fee        : " + "₹" + semesterfee);
        System.out.println("Fee Paid            : " + "₹" + feepaid);
        System.out.println("Fee Balance         : " + "₹" + feebalance);
        System.out.println("Fee Status          : " + Status);

        System.out.println("");
        System.out.println("----------------- FINAL STATUS --------------------");
        System.out.println("Semester Status     : " + academicstatus);
        System.out.println("");


        if(academicstatus == "SEMESTER NOT CLEARED"){
            System.out.println("Reasons: ");  
        }
        if(javamarks < 35){
            System.out.println("- Java marks are below 35.");
        }
        if(sqlmarks < 35){
            System.out.println("- SQL marks are below 35.");
        }
        if(aptitudemarks < 35){
            System.out.println("- Aptitude marks are below 35.");
        }
        if(attendance < 75){
            System.out.println("- Attendance is below 75%.");
        }
        if(feebalance > 0){
            System.out.println("- Semester fee is pending.");
        }      
    }
}
    