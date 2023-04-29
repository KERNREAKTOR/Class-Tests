import java.io.IOException;


public class TestingClass {

    public static void main(String[] args) throws IOException {
        //LBK PRIME MechItemID 470
        //F = 22
        //7 = 7
        String MechBuild = "AF7D<:@1|XRph0mQ7|<C|XR|XR|XRqh0kQ7|<C|XR|XR|lR|l^rX0JR7|<C|<CsX0NR7|<C|<Ctl0oQ7ul00R7vB0iQ7w404040";

        MechIdInfo mymech = new MechIdInfo("AF7D<:@1|XRph0mQ7|<C|XR|XR|XRqh0kQ7|<C|XR|XR|lR|l^rX0JR7|<C|<CsX0NR7|<C|<Ctl0oQ7ul00R7vB0iQ7w404040");

        System.out.println(mymech.getFullname());
        System.out.println(mymech.getMechCost());
        System.out.println(mymech.getRepairCost(50));


        if (MechBuild.charAt(0) == 'A') {

            char[] Base24IndexTable = new char[64];

            for (int i = 48; i < 112; i++) {

                Base24IndexTable[i - 48] = (char) (i);

            }

            if ((new String(Base24IndexTable).indexOf(MechBuild.charAt(1))) >= 0 && (new String(Base24IndexTable).indexOf(MechBuild.charAt(2))) >= 0) {

                char firstchar = (char) new String(Base24IndexTable).indexOf(MechBuild.charAt(1));
                char secondchar = (char) new String(Base24IndexTable).indexOf(MechBuild.charAt(2));

                Integer MechItemID = firstchar + (secondchar * 64);
                MechIdInfo mii = new MechIdInfo(16);

                String[] splitter = MechBuild.split("p");
                String[] weaponcentertorso = splitter[0].split("\\|");

                System.out.println(mii.getFullname());
                System.out.println(mii.getMechCost());
                System.out.println(weaponcentertorso[1]);
                System.out.println(weaponcentertorso.length);

            }
        }
    }
}
