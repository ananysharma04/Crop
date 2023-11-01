import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import systeminterface.*;



public class CropBuymain{  

    public static List< Crop> cropData = new ArrayList<>();
    public static List< Crop> cropDatasold = new ArrayList<>();
    public static final String FILE_PATH = "crop_data.txt";
 
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("(1) Farmer | (2) Agent");
               System.out.println("enter option: ");
               int option = scanner.nextInt();

               if(option==1){
                Farmer();
               } else if(option==2){
                Agent();
               }
        }
       loadCropData(); // Load existing data from the file
         File myFile=new File("crop_data.txt");
       // It create a new file tex or .txt file//
try{
  myFile.createNewFile();
}
catch(IOException e){
    System.out.println("Unable to create This File");
         e.printStackTrace();
}


    }

    public static void addCrop(Scanner scanner) {
        System.out.print("Enter crop name: ");
        String cropName = scanner.nextLine();

        System.out.print("Enter crop quantity (in kg): ");
        double cropQuantity = scanner.nextDouble();

        System.out.print("Enter crop price per kg: ");
        double cropPrice = scanner.nextDouble();

         Crop crop = new Crop(cropName, cropQuantity, cropPrice);
        cropData.add(crop);
        System.out.println("Crop added successfully.");
        

    }
    
    public static void Farmer(){
try (Scanner scanner = new Scanner(System.in)) {
System.out.println("enter id: ");
String id = scanner.nextLine();
System.out.println("enter password: ");
String pass = scanner.nextLine();
Boolean x=false;
if(id.equals("1234") && pass.equals("d") ){
x=true;
}else{
    x=false;
    System.out.println("invalid id and pass.");
}

    while (x==true) {
         System.out.println("Crop Buying System");
         System.out.println("1. Display self");
         System.out.println("2. display agent name");
         System.out.println("3. show inventory");
  System.out.println("4. show sold item list");
   System.out.println("5. add to inventory");
  System.out.println("6. exit");


         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume the newline
Farmer fam = new Farmer();
         switch (choice) {
    case 1:
        fam.displayself();
        break;
    case 2:
        fam.displayAgents();
        break;
    case 3:
        fam.showInventory();
        break;
    case 4:
        fam.totalSold();
        break;
    case 5:
        fam.addToInventory();
        break;
    case 6:
        System.out.println("Exiting the program.");
        System.exit(0);
        break;
    default:
        System.out.println("Invalid choice. Please try again.");
         }
      }
}

    }
        public static void Agent(){

            
            try (Scanner scanner = new Scanner(System.in)) {

                System.out.println("enter id: ");
String id = scanner.nextLine();
System.out.println("enter password: ");
String pass = scanner.nextLine();
Boolean x=false;
if(id.equals("1234agent") && pass.equals("agency") ){
x=true;
}else{
    x=false;
     System.out.println("invalid id and pass.");

}
    while (x==true) {
         System.out.println("Crop Buying System");
         System.out.println("1. Display self");
         System.out.println("2. show inventory");
  System.out.println("3. buy crop");
   System.out.println("4. total sold");
  System.out.println("5. exit");


         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume the newline
agent ag = new agent();
         switch (choice) {
    case 1:
        ag.displayself();
        break;
    case 2:
        ag.showInventory();;
        break;
    case 3:
       ag.buyCrop();
       break;
    case 4:
        ag.totalSold();
        break;
    case 5:
        System.out.println("Exiting the program.");
        System.exit(0);
        break;
    default:
        System.out.println("Invalid choice. Please try again.");
         }
      }
        
    }
        }

    public static void viewCrops() {
        if (cropData.isEmpty()) {
            System.out.println("No crops added yet.");
        } else {
            System.out.println("Crop Name\tQuantity (kg)\tPrice per kg");
            for ( Crop crop : cropData) {
                System.out.println(crop);
            }
        }
    }

    public static void loadCropData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String cropName = parts[0];
                    double cropQuantity = Double.parseDouble(parts[1]);
                    double cropPrice = Double.parseDouble(parts[2]);
                    Crop crop = new Crop(cropName, cropQuantity, cropPrice);
                    cropData.add(crop);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while loading data: " + e.getMessage());
        }
    }

    public static void soldcropdata(String FILE_PATH){
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String cropName = parts[0];
                    double cropQuantity = Double.parseDouble(parts[1]);
                    double cropPrice = Double.parseDouble(parts[2]);
                     Crop crop = new Crop(cropName, cropQuantity, cropPrice);
                    cropDatasold.add(crop);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while loading data: " + e.getMessage());
        }

        if (cropDatasold.isEmpty()) {
            System.out.println("No crops added yet.");
        } else {
            System.out.println("Crop Name\tQuantity (kg)\tPrice per kg");
            for ( Crop crop : cropDatasold) {
                System.out.println(crop);
            }
        }
}
    public static void buythiscrop(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter crop name: ");
            String cropName = sc.nextLine();

            System.out.print("Enter crop quantity (in kg): ");
            double cropQuantity = sc.nextDouble();

            System.out.print("Enter crop price per kg: ");
            double cropPrice = sc.nextDouble();

            Crop crop = new Crop(cropName, cropQuantity, cropPrice);
            CropBuymain.cropData.add(crop);
            CropBuymain.saveCropData(FILE_PATH);
        }
        System.out.println("Crop bought successfully");
    }

    public static void saveCropData(String FILE_PATH) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for ( Crop crop : cropData) {
                writer.write(crop.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while saving data: " + e.getMessage());
        }
    }
}




class Crop {
    private String name;
    private double quantity;
    private double price;

    public Crop(String name, double quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + "\t" + quantity + " kg\t$" + price;
    }

    public String toCSV() {
        return name + "," + quantity + "," + price;
    }
}
