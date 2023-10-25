package CropManagement;
 import java.util.*;
public class CropBuyingSystem2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //taking input agent details
        System.out.print("Enter your Agent Name: ");
        String agentName = sc.nextLine();
        System.out.print("Enter your Agent Id: ");
        int agentId=sc.nextInt();
        //taking input farmer details
        System.out.print("Enter Farmer's Name: ");
        String farmerName = sc.next();
        System.out.print("Enter Farmer's Aadhar Number: ");
        double farmerAadharNo=sc.nextDouble();
        Farmer token =new Farmer(agentName, agentId, farmerName, farmerAadharNo);
        //taking input for crop to be sell

        String [] cropsList = {"1.Wheat","2.Rice","3.Bean","4.Maize","5.Soyabeen"};
        String [] cropsPrice = {"800","960","1080","1440","2140"};

        while (true) {
            System.out.println("Crop Buying System: ");
            System.out.println("1. Choose Crop the farmer want to sell:");
            System.out.println("2. View Crops");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                   // purchaseCrop(sc);//
                    break;
                case 2:
                    System.out.println(Arrays.toString(cropsList));
                    System.out.println(Arrays.toString(cropsPrice) + " (cost per unit in Rupees)");
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.🙏");
            }
            
            
        // String cropToSell = sc.next();
        

        
        // }
    }
     /*private static void purchaseCrop(Scanner scanner) {*/

             /*     System.out.println("Enter crop no.: ");
                int cropNo = sc.nextInt();
        
                System.out.print("Enter crop quantity (in units): ");
                int  cropQuantity = sc.nextDouble();

                switch (cropNo) {
                case 1:
                    Wheat w = new Wheat();
                    break;
                    double totalAmount=(cropQuantity*w.getPrice());
                    // save to file 
                    // agent name,agent id ,farmer name ,farmer Aadhar, <cropname> (w.getName),<crop quantity>(cropQuantity),
                    //  total amount (cropQuantity*w.getPrice), 
                  /*   String agentName;
                     int agentId;
                     String farmerName;
                     double farmerAadhar;
                     String cropName;
                     int cropQuantity; */

                 /* 
                case 2:
                    Rice r= new Rice();
                    break;
                  //  String agentName;//
                   /*   int agentId;
                     String farmerName;
                     double farmerAadhar;
                     String cropName;
                     int cropQuantity;
                     double totalAmount=(cropQuantity*w.getPrice());

                case 3:
                    Bean b= new Bean();
                    break;
                     String agentName;
                     int agentId;
                     String farmerName;
                     double farmerAadhar;
                     String cropName;
                     int cropQuantity;
                     double totalAmount=(cropQuantity*w.getPrice());
                    
                case 4:
                    Maize m= new Maize();
                    break;
                    String agentName;
                     int agentId;
                     String farmerName;
                     double farmerAadhar;
                     String cropName;
                     int cropQuantity;
                     double totalAmount=(cropQuantity*w.getPrice());
                    
                case 5:
                    Soyabean s= new Soyabean();
                    break;
                     String agentName;
                     int agentId;
                     String farmerName;
                     double farmerAadhar;
                     String cropName;
                     int cropQuantity;
                     double totalAmount=(cropQuantity*w.getPrice());

                default:
                    System.out.println("Invalid choice. Please try again.🙏");
            }
                
                
                System.out.println("Crop successfully.");
            }
}
   */
    }
}
