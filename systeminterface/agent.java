package systeminterface;



public class agent implements system_User{
    public static String FILE_PATH = "sold_data.txt";
    public static  String agentName;
    public static int agentId;


    public void displayself(){
       System.out.println(agentName+" "+ agentId);
    }
 public void showInventory(){
        CropBuymain.viewCrops();
        System.out.println();

    }

    public void buyCrop(){
        CropBuymain.buythiscrop();

       
    }
public void totalSold(){
CropBuymain.soldcropdata(FILE_PATH);

}}