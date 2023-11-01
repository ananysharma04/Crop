

import java.util.Scanner;





public class Farmer implements system_User {
    String fp = "sold_data.txt";
    public static String farmerName;
    public static double farmerAadharNo;
    public static int agentId = agent.agentId;
    public static String agentName = agent.agentName;
    
    public void displayself(){
        System.out.println(farmerName+" "+ farmerAadharNo);
    }
    public void displayAgents(){
        System.out.println(agentName+" "+ agentId);
    }
    public void showInventory(){
        CropBuymain.viewCrops();
    }
    public void totalSold(){
        CropBuymain.soldcropdata(fp);
    }
    public void addToInventory(){
        Scanner sc = new Scanner(System.in);
        CropBuymain.addCrop(sc);
    }
}
