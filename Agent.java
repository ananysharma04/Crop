package CropManagement;

public abstract class Agent {
    private String agentName;
    private int agentId;

    public Agent(String agentName,int agentId) {
        this.agentName= agentName;
        this.agentId= agentId;
    }

   abstract void displayAgent();
       // System.out.println(agentName+" "+ agentId);
    

   abstract public String getName();
       // return agentName;
    
  abstract public int getId();
       // return agentId;
    
}
