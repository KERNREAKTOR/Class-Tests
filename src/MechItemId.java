
public class MechItemId 
{
	public static void main(String[] args) 
	{
		for(int id = 840; id < 880; id++) 
		{
			
			MechIdInfo info = new MechIdInfo(id);
			
			if(info.getIsvalidid()) 
			{	
				
				System.out.println(info.getChassis());
				System.out.println(info.getFaction());
				System.out.println(info.getFullname());
				System.out.println(info.getMechclass());
				System.out.println(info.getShortname());
				System.out.println(info.getVarianttype());
				System.out.println(info.getMaxtons());
				System.out.println(info.getClass());
								
			}
			
			else 
				
			{
				
				System.out.println("MechItemId(" + id + ") ist ungültig.");
				
			}		
		}
	}
}
