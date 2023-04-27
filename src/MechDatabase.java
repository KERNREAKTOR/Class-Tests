import java.util.Objects;

public class MechDatabase {
    private String mechName;

    public String getMechId() {
        return mechId;
    }

    public void setMechId(String mechId) {
        this.mechId = mechId;
    }

    public String getMechFaction() {
        return mechFaction;
    }

    public void setMechFaction(String mechFaction) {
        this.mechFaction = mechFaction;
    }

    public String getMechChassie() {
        return mechChassie;
    }

    public void setMechChassie(String mechChassie) {
        this.mechChassie = mechChassie;
    }

    private String mechShortName;
    private String mechLongName;
    private String mechId;
    private String mechFaction;
    private String mechChassie;
    private String mechVariantType;
    private String mechMaxTons;
    private String mechBaseTons;
    private String mechMaxJumpJets;
    private String mechMinEngineRating;
    private  String mechMaxEngineRating;
    private Integer mechECM;
    private Integer mechHP;
    private Integer mechSlots;

    public Integer getMechSlots() {
        return mechSlots;
    }

    public void setMechSlots(Integer mechSlots) {
        this.mechSlots = mechSlots;
    }

    public Integer getMechHP() {
        return mechHP;
    }

    public void setMechHP(Integer mechHP) {
        this.mechHP = mechHP;
    }

    public Integer getMechECM() {
        return mechECM;
    }

    public void setMechECM(Integer mechECM) {
        this.mechECM = mechECM;
    }

    public String getMechVariantType() {
        return mechVariantType;
    }

    public void setMechVariantType(String mechVariantType) {
        this.mechVariantType = mechVariantType;
    }

    public String getMechMaxTons() {
        return mechMaxTons;
    }

    public void setMechMaxTons(String mechMaxTons) {
        this.mechMaxTons = mechMaxTons;
    }

    public String getMechBaseTons() {
        return mechBaseTons;
    }

    public void setMechBaseTons(String mechBaseTons) {
        this.mechBaseTons = mechBaseTons;
    }

    public String getMechMaxJumpJets() {
        return mechMaxJumpJets;
    }

    public void setMechMaxJumpJets(String mechMaxJumpJets) {
        this.mechMaxJumpJets = mechMaxJumpJets;
    }

    public String getMechMinEngineRating() {
        return mechMinEngineRating;
    }

    public void setMechMinEngineRating(String mechMinEngineRating) {
        this.mechMinEngineRating = mechMinEngineRating;
    }

    public String getMechMaxEngineRating() {
        return mechMaxEngineRating;
    }

    public void setMechMaxEngineRating(String mechMaxEngineRating) {
        this.mechMaxEngineRating = mechMaxEngineRating;
    }

    public MechDatabase(String mechId, String mechFaction, String mechChassie, String mechName) {
        this.mechName = mechName;
        this.mechId = mechId;
        this.mechFaction = mechFaction;
        this.mechChassie = mechChassie;
        this.mechECM = null;
        if (Objects.equals(mechName, "fnr-j")) {
            this.mechLongName = "FAFNIR FNR-J";
            this.mechShortName = "FNR-J";

        }
    }

    // Getter-Methoden in der DatabaseObject-Klasse:
    public String getMechName() {
        return mechName;
    }

    public String getMechShortName() {
        return mechShortName;
    }

    public String getMechLongName() {
        return mechLongName;
    }

    // Setter-Methoden in der DatabaseObject-Klasse:
    public void setMechName(String mechName) {
        this.mechName = mechName;
    }

    public void setMechShortName(String mechShortName) {
        this.mechShortName = mechShortName;
    }

    public void setMechLongName(String mechLongName) {
        this.mechLongName = mechLongName;
    }
}