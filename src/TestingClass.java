
public class TestingClass {

    public static void main(String[] args) {
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


       MapInfo mapname = new MapInfo();

       System.out.println(mapname.GetMapName("CapitolCity"));
       System.out.println(mechIdInfo.getFullname(45));
       System.out.println(mechIdInfo.getMechclass(45));
       System.out.println(mechIdInfo.getShortname(45));

       //int fisize = new URL("https://www.clanwolf.net/apps/C3/client/C3-Client-6.1.2_install.exe").openConnection().getContentLength();
       TxtProgressBar tpb = new TxtProgressBar(100,"□","■");

       //System.out.println(fisize);
       System.out.println(tpb.getcurprogress(99));




       mapname.Unload();
       mechIdInfo.Unload();

    }
}
