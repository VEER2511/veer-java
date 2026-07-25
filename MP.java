import java.util.Scanner;
import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class MP {
    Scanner sc = new Scanner(System.in);
    String criminalName;
    int age;
    String crime;
    String gender;
    String address;
    final String FILE_NAME = "criminal_records.txt";

  
    void new_case() {
        System.out.println("Enter Criminal name: ");
        criminalName = sc.nextLine();

        System.out.println("Enter the age: ");
        age = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter gender of Criminal: ");
        gender = sc.nextLine();

        System.out.println("Enter the address: ");
        address = sc.nextLine();

        System.out.println("Enter the Crime: ");
        crime = sc.nextLine();

        saveToFile();
        System.out.println("\nCase Registered Successfully and Saved to File!");
    }

 
    void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(criminalName + "," + age + "," + gender + "," + address + "," + crime);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
//---------------------------------------------------------------------------------------------------------------------
    
    void updateDetails() {
        if (!new File("criminal_records.txt").exists()) {
            System.out.println("\nNo record found! Please register a case first.");
            return;
        }

        System.out.println("Enter the name of the criminal to update: ");
        String searchName = sc.nextLine();
        boolean found = false;

        try {
            File inputFile = new File("criminal_records.txt");
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] details = currentLine.split(",");
                if (details[0].equalsIgnoreCase(searchName)) {
                    found = true;
                    System.out.println("\nUpdating details for: " + searchName);
                    System.out.println("1. Update Name");
                    System.out.println("2. Update Age");
                    System.out.println("3. Update Gender");
                    System.out.println("4. Update Address");
                    System.out.println("5. Update Crime");
                    System.out.println("6. Cancel");
                    System.out.print("Enter your choice: ");

                    int updateChoice = sc.nextInt();
                    sc.nextLine(); 

                    switch (updateChoice) {
                        case 1:
                            System.out.print("Enter new name: ");
                            details[0] = sc.nextLine();
                            break;
                        case 2:
                            System.out.print("Enter new age: ");
                            details[1] = String.valueOf(sc.nextInt());
                            sc.nextLine();
                            break;
                        case 3:
                            System.out.print("Enter new gender: ");
                            details[2] = sc.nextLine();
                            break;
                        case 4:
                            System.out.print("Enter new address: ");
                            details[3] = sc.nextLine();
                            break;
                        case 5:
                            System.out.print("Enter new crime details: ");
                            details[4] = sc.nextLine();
                            break;
                        case 6:
                            System.out.println("Update canceled.");
                            return;
                        default:
                            System.out.println("Invalid choice! Please try again.");
                            return;
                    }

                    writer.write(String.join(",", details));
                    writer.newLine();
                    System.out.println("\nCriminal details updated successfully!");
                } else {
                    writer.write(currentLine);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            
            inputFile.delete();
            tempFile.renameTo(inputFile);

            if (!found) {
                System.out.println("\nCriminal not found in records.");
            }

        } catch (IOException e) {
            System.out.println("Error updating data: " + e.getMessage());
        }
    }
//-----------------------------------------------------------------------------------------------------------------------
   
void courtHiring() {
    if (!new File(FILE_NAME).exists()) {
        System.out.println("\nNo case registered yet! Please register a case first.");
        return;
    }

    System.out.println("Enter the name of the criminal: ");
    String searchName = sc.nextLine();
    boolean found = false;

    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            String[] details = currentLine.split(",");
            if (details[0].equalsIgnoreCase(searchName)) {
                found = true;

                // Generate a random court date
                Random rand = new Random();
                LocalDate today = LocalDate.now();
                int daysToAdd = rand.nextInt(30) + 1; 
                LocalDate courtDate = today.plusDays(daysToAdd);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
                String formattedDate = courtDate.format(formatter);

                System.out.println("\nThe court hearing for " + searchName + " is scheduled on: " + formattedDate);
                break;
            }
        }

        if (!found) {
            System.out.println("\nCriminal not found in records.");
        }

    } catch (IOException e) {
        System.out.println("Error reading data: " + e.getMessage());
    }
}

//------------------------------------------------------------------------------------------------------------------
    void adminPanel() {
        final String ADMIN_KEY = "nothing"; 
    
        System.out.print("Enter Admin Key: ");
        String inputKey = sc.nextLine();
    
        if (!inputKey.equals(ADMIN_KEY)) {
            System.out.println("Access Denied! Incorrect Key.");
            return;
        }
    
        int choice;
        while (true) {
            System.out.println("\nAdmin Panel");
            System.out.println("1. Display All Criminals");
            System.out.println("2. Close Case (Remove from Records)");
            System.out.println("3. Filter Cases by Crime Category");
            System.out.println("4. Search Criminal by Name");
            System.out.println("5. Basic Report Generation ");
            System.out.println("6. Exit Admin Panel");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); 
    
            switch (choice) {
                case 1:
                    displayAllCriminals();
                    break;
                case 2:
                    closeCase();
                    break;
                case 3:
                    filterByCrimeCategory();
                    break;
                case 4:
                    searchCriminalByName();
                    break;
                case 5:
                    generateReport();
                    break;
                case 6:
                    System.out.println("Exiting Admin Panel...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
//--------------------------------------------------------------------------------------------------------------------------    

void displayAllCriminals() {
    File file = new File(FILE_NAME);
    if (!file.exists()) {
        System.out.println("No records found!");
        return;
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        String line;
        System.out.println("\nList of Criminals:");
        while ((line = reader.readLine()) != null) {
            String[] details = line.split(",");
            System.out.println("Name: " + details[0] + ", Age: " + details[1] +
                    ", Gender: " + details[2] + ", Address: " + details[3] + ", Crime: " + details[4]);
        }
    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }
}
//---------------------------------------------------------------------------------------------------------------------

void closeCase() {
    if (!new File(FILE_NAME).exists()) {
        System.out.println("\nNo case records found!");
        return;
    }

    System.out.print("Enter the name of the criminal whose case you want to close: ");
    String searchName = sc.nextLine();
    boolean found = false;

    try {
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            String[] details = currentLine.split(",");

            if (details[0].equalsIgnoreCase(searchName)) {
                found = true;
                if (details.length == 5) {  
                    writer.write(currentLine + ",closed");
                } else {
                    details[5] = "closed";  
                    writer.write(String.join(",", details));
                }
                System.out.println("\nCase for " + searchName + " has been closed.");
            } else {
                writer.write(currentLine);
            }
            writer.newLine();
        }

        reader.close();
        writer.close();

        
        inputFile.delete();
        tempFile.renameTo(inputFile);

        if (!found) {
            System.out.println("\nCriminal not found in records.");
        }

    } catch (IOException e) {
        System.out.println("Error updating data: " + e.getMessage());
    }
}

//---------------------------------------------------------------------------------------------------------------

void filterByCrimeCategory() {
    System.out.print("Enter crime category to filter: ");
    String crimeCategory = sc.nextLine();
    boolean found = false;

    File file = new File(FILE_NAME);
    if (!file.exists()) {
        System.out.println("No records found!");
        return;
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        String line;
        System.out.println("\nCriminals involved in " + crimeCategory + ":");
        while ((line = reader.readLine()) != null) {
            String[] details = line.split(",");
            if (details[4].equalsIgnoreCase(crimeCategory)) {
                System.out.println("Name: " + details[0] + ", Age: " + details[1] +
                        ", Gender: " + details[2] + ", Address: " + details[3]);
                found = true;
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }

    if (!found) {
        System.out.println("No records found for this crime category.");
    }
}
//---------------------------------------------------------------------------------------------------------

void searchCriminalByName() {
    System.out.print("Enter the name of the criminal to search: ");
    String searchName = sc.nextLine();
    boolean found = false;

    File file = new File(FILE_NAME);
    if (!file.exists()) {
        System.out.println("No records found!");
        return;
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] details = line.split(",");
            if (details[0].equalsIgnoreCase(searchName)) {
                System.out.println("\nCriminal Found:");
                System.out.println("Name: " + details[0] + ", Age: " + details[1] +
                        ", Gender: " + details[2] + ", Address: " + details[3] + ", Crime: " + details[4]);
                found = true;
                break;
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }

    if (!found) {
        System.out.println("Criminal not found in records.");
    }
}
//---------------------------------------------------------------------------------------------------------------------------
void generateReport() {
    if (!new File(FILE_NAME).exists()) {
        System.out.println("\nNo case records found!");
        return;
    }

    int totalCrimes = 0;
    int openCases = 0;
    int closedCases = 0;

    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            totalCrimes++;
            String[] details = currentLine.split(",");
            if (details.length > 5 && details[5].equalsIgnoreCase("closed")) {
                closedCases++;
            } else {
                openCases++;
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading data: " + e.getMessage());
    }

    System.out.println("\n===== Crime Report =====");
    System.out.println("Total Crimes Registered: " + totalCrimes);
    System.out.println("Open Cases: " + openCases);
    System.out.println("Closed Cases: " + closedCases);
}
//------------------------------------------------------------------------------------------------------------------------

void generateCriminalReport() {
    if (!new File(FILE_NAME).exists()) {
        System.out.println("\nNo case records found!");
        return;
    }

    System.out.print("Enter the name of the criminal for the report: ");
    String searchName = sc.nextLine();
    boolean found = false;

    try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            String[] details = currentLine.split(",");

            if (details[0].equalsIgnoreCase(searchName)) {
                found = true;
                System.out.println("\n===================================");
                System.out.println("        CRIMINAL REPORT");
                System.out.println("===================================");
                System.out.println("-> Name       : " + details[0]);
                System.out.println("-> Age        : " + details[1]);
                System.out.println("-> Gender     : " + details[2]);
                System.out.println("-> Address    : " + details[3]);
                System.out.println("-> Crime      : " + details[4]);
                if (details.length > 5) {
                    System.out.println("Case Status: " + details[5]); 
                } else {
                    System.out.println("Case Status: Open");
                }
                System.out.println("===================================\n");
                break;
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading data: " + e.getMessage());
    }

    if (!found) {
        System.out.println("\nCriminal not found in records.");
    }
}

//-----------------------------------------------------------------------------------------------------------------------
public static void main(String[] args) {
        MP obj = new MP();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nCrime Investigation System");
            System.out.println("1. Register a New Case");
            System.out.println("2. Update Details of Criminal");
            System.out.println("3. Court Hearing");
            System.out.println("4. Admin Panel");
            System.out.println("5. Criminal Report");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    obj.new_case();
                    break;
                case 2:
                    obj.updateDetails();
                    break;
                case 3:
                    obj.courtHiring();
                    break;
                case 4:
                    obj.adminPanel();
                    break;
                case 5:
                    obj.generateCriminalReport();
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Wrong choice! Please try again.");
                    break;
            }
        }
    }
}
