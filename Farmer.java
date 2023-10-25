package CropManagement;

public class Farmer extends Agent {
    private String farmerName;
    private double farmerAadharNo;
    private String agentName;
    private int agentId;
    public Farmer(String agentName,int agentId,String farmerName,double farmerAadharNo) {
        super(agentName,agentId);
        this.farmerName=farmerName;
        this.farmerAadharNo = farmerAadharNo;
    }
    void display(){
        System.out.println(farmerName+" "+ farmerAadharNo);
    }
    public void displayAgent(){
        System.out.println(agentName+" "+ agentId);
    }
    public String getName(){
     return agentName;
    }
    public int getId(){
        return agentId;
    }
}
