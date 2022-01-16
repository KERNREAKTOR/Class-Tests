public class TestingClass {

    public static void main(String[] args)
    {
        Integer mechItemID =513;

        MechIdInfo mechIdInfo = new MechIdInfo();
        //
        Integer tonnage = mechIdInfo.getTonnage(mechItemID); // 90
        String faction = mechIdInfo.getFaction(mechItemID).toString(); //CLAN
        String chassis = mechIdInfo.getChassis(mechItemID);//SUPERNOVA
        String mechclass = mechIdInfo.getMechclass(mechItemID).toString();//ASSAULT
        String varianttype = mechIdInfo.getVarianttype(mechItemID);//HERO
        String fullname = mechIdInfo.getFullname(mechItemID);//BOILER
        String shortname = mechIdInfo.getShortname(mechItemID);// SNV-BR
        
        //nur ein test


       MapInfo mapname = new MapInfo();

       System.out.println(mapname.GetMapName("CapitolCity"));
       System.out.println(mechIdInfo.getFullname(45));
       System.out.println(mechIdInfo.getMechclass(45));
       System.out.println(mechIdInfo.getShortname(45));
       System.out.println(mechIdInfo.getTonnage(45));
       mapname.Unload();
       TxtProgressBar tpb = new TxtProgressBar(100,"_","-");

        System.out.println(tpb.getcurprogress(20));


    }
}
