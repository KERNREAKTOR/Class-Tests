/* ---------------------------------------------------------------- |
 *    ____ _____                                                    |
 *   / ___|___ /                   Communicate - Command - Control  |
 *  | |     |_ \                   MK V "Cerberus"                  |
 *  | |___ ___) |                                                   |
 *   \____|____/                                                    |
 *                                                                  |
 * ---------------------------------------------------------------- |
 * Info        : https://www.clanwolf.net                           |
 * GitHub      : https://github.com/ClanWolf                        |
 * ---------------------------------------------------------------- |
 * Licensed under the Apache License, Version 2.0 (the "License");  |
 * you may not use this file except in compliance with the License. |
 * You may obtain a copy of the License at                          |
 * http://www.apache.org/licenses/LICENSE-2.0                       |
 *                                                                  |
 * Unless required by applicable law or agreed to in writing,       |
 * software distributed under the License is distributed on an "AS  |
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either  |
 * express or implied. See the License for the specific language    |
 * governing permissions and limitations under the License.         |
 *                                                                  |
 * C3 includes libraries and source code by various authors.        |
 * Copyright (c) 2001-2022, ClanWolf.net                            |
 * ---------------------------------------------------------------- |
 */


import java.util.HashMap;
import java.util.Map;

/**
 * Diese Klasse weist der MechItemId die von der MWO Api ausgelesen wird,
 * einen Mech' zu und diese Eigenschaften des Mech's können ausgelesen werden.
 *
 * @author KERNREAKTOR
 * @version 14-12-2021
 */
public class MechIdInfo {

    private final Map<Integer, MechIdInfo> mechids = new HashMap<>();
    private final String msginvalidid = "Invalid MechItemID";

    private EFaction faction;
    private String chassis;
    private Integer tonnage;
    private EMechclass mechclass;
    private EVariantType varianttype;
    private String fullname;
    private String shortname;

    private MechIdInfo(EFaction faction, String chassis, Integer tonnage, EMechclass mechclass, EVariantType varianttype, String fullname, String shortname) {
        this.faction = faction;
        this.chassis = chassis;
        this.tonnage = tonnage;
        this.mechclass = mechclass;
        this.varianttype = varianttype;
        this.fullname = fullname;
        this.shortname = shortname;
    }

    /**
     * Mechklassen die es in MWO gibt.
     */
    public enum EMechclass
    {
        LIGHT, MEDIUM,	HEAVY,	ASSAULT, UNKNOWN
    }

    /**
     * Gibt die Variante des Mech's an.
     */
    public enum EVariantType {

        CHAMPION, HERO, SPECIAL, STANDARD, UNKNOWN

    }
    /**
     * Die Fraktionen die es in MWO gibt.
     */
    public enum EFaction
    {
        INNERSPHERE, CLAN, UNKNOWN
    }

    /**
     * Alle Mech's die es gibt werden in einer (HashMap) initialesiert.
     */
    public MechIdInfo() {

        this.mechids.put(1,new MechIdInfo(EFaction.INNERSPHERE,"HUNCHBACK",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNCHBACK HBK-4G","HBK-4G"));
        this.mechids.put(2,new MechIdInfo(EFaction.INNERSPHERE,"HUNCHBACK",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNCHBACK HBK-4P","HBK-4P"));
        this.mechids.put(3,new MechIdInfo(EFaction.INNERSPHERE,"JENNER",35,EMechclass.LIGHT, EVariantType.STANDARD,"JENNER JR7-D","JR7-D"));
        this.mechids.put(4,new MechIdInfo(EFaction.INNERSPHERE,"JENNER",35,EMechclass.LIGHT, EVariantType.STANDARD,"JENNER JR7-F","JR7-F"));
        this.mechids.put(5,new MechIdInfo(EFaction.INNERSPHERE,"COMMANDO",25,EMechclass.LIGHT, EVariantType.STANDARD,"COMMANDO COM-2D","COM-2D"));
        this.mechids.put(6,new MechIdInfo(EFaction.INNERSPHERE,"COMMANDO",25,EMechclass.LIGHT, EVariantType.STANDARD,"COMMANDO COM-3A","COM-3A"));
        this.mechids.put(7,new MechIdInfo(EFaction.INNERSPHERE,"CENTURION",50,EMechclass.MEDIUM, EVariantType.STANDARD,"CENTURION CN9-A","CN9-A"));
        this.mechids.put(8,new MechIdInfo(EFaction.INNERSPHERE,"CENTURION",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"CENTURION CN9-AH(L)","CN9-AH(L)"));
        this.mechids.put(9,new MechIdInfo(EFaction.INNERSPHERE,"HUNCHBACK",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNCHBACK HBK-4H","HBK-4H"));
        this.mechids.put(10,new MechIdInfo(EFaction.INNERSPHERE,"DRAGON",60,EMechclass.HEAVY, EVariantType.STANDARD,"DRAGON DRG-1N","DRG-1N"));
        this.mechids.put(11,new MechIdInfo(EFaction.INNERSPHERE,"DRAGON",60,EMechclass.HEAVY, EVariantType.STANDARD,"DRAGON DRG-1C","DRG-1C"));
        this.mechids.put(12,new MechIdInfo(EFaction.INNERSPHERE,"CATAPULT",65,EMechclass.HEAVY, EVariantType.STANDARD,"CATAPULT CPLT-C1","CPLT-C1"));
        this.mechids.put(13,new MechIdInfo(EFaction.INNERSPHERE,"CATAPULT",65,EMechclass.HEAVY, EVariantType.STANDARD,"CATAPULT CPLT-A1","CPLT-A1"));
        this.mechids.put(14,new MechIdInfo(EFaction.INNERSPHERE,"AWESOME",80,EMechclass.ASSAULT, EVariantType.STANDARD,"AWESOME AWS-8Q","AWS-8Q"));
        this.mechids.put(15,new MechIdInfo(EFaction.INNERSPHERE,"AWESOME",80,EMechclass.ASSAULT, EVariantType.STANDARD,"AWESOME AWS-8R","AWS-8R"));
        this.mechids.put(16,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.STANDARD,"ATLAS AS7-D","AS7-D"));
        this.mechids.put(17,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.STANDARD,"ATLAS AS7-D-DC","AS7-D-DC"));
        this.mechids.put(18,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.STANDARD,"ATLAS AS7-RS","AS7-RS"));
        this.mechids.put(19,new MechIdInfo(EFaction.INNERSPHERE,"CATAPULT",65,EMechclass.HEAVY, EVariantType.STANDARD,"CATAPULT CPLT-K2","CPLT-K2"));
        this.mechids.put(20,new MechIdInfo(EFaction.INNERSPHERE,"JENNER",35,EMechclass.LIGHT, EVariantType.STANDARD,"JENNER JR7-K","JR7-K"));
        this.mechids.put(21,new MechIdInfo(EFaction.INNERSPHERE,"HUNCHBACK",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNCHBACK HBK-4J","HBK-4J"));
        this.mechids.put(22,new MechIdInfo(EFaction.INNERSPHERE,"HUNCHBACK",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNCHBACK HBK-4SP","HBK-4SP"));
        this.mechids.put(23,new MechIdInfo(EFaction.INNERSPHERE,"DRAGON",60,EMechclass.HEAVY, EVariantType.STANDARD,"DRAGON DRG-5N","DRG-5N"));
        this.mechids.put(24,new MechIdInfo(EFaction.INNERSPHERE,"CATAPULT",65,EMechclass.HEAVY, EVariantType.STANDARD,"CATAPULT CPLT-C4","CPLT-C4"));
        this.mechids.put(25,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.STANDARD,"ATLAS AS7-K","AS7-K"));
        this.mechids.put(26,new MechIdInfo(EFaction.INNERSPHERE,"COMMANDO",25,EMechclass.LIGHT, EVariantType.STANDARD,"COMMANDO COM-1B","COM-1B"));
        this.mechids.put(27,new MechIdInfo(EFaction.INNERSPHERE,"COMMANDO",25,EMechclass.LIGHT, EVariantType.STANDARD,"COMMANDO COM-1D","COM-1D"));
        this.mechids.put(28,new MechIdInfo(EFaction.INNERSPHERE,"CENTURION",50,EMechclass.MEDIUM, EVariantType.STANDARD,"CENTURION CN9-AL","CN9-AL"));
        this.mechids.put(29,new MechIdInfo(EFaction.INNERSPHERE,"CENTURION",50,EMechclass.MEDIUM, EVariantType.STANDARD,"CENTURION CN9-D","CN9-D"));
        this.mechids.put(30,new MechIdInfo(EFaction.INNERSPHERE,"AWESOME",80,EMechclass.ASSAULT, EVariantType.STANDARD,"AWESOME AWS-8T","AWS-8T"));
        this.mechids.put(31,new MechIdInfo(EFaction.INNERSPHERE,"AWESOME",80,EMechclass.ASSAULT, EVariantType.STANDARD,"AWESOME AWS-8V","AWS-8V"));
        this.mechids.put(32,new MechIdInfo(EFaction.INNERSPHERE,"AWESOME",80,EMechclass.ASSAULT, EVariantType.STANDARD,"AWESOME AWS-9M","AWS-9M"));
        this.mechids.put(33,new MechIdInfo(EFaction.INNERSPHERE,"RAVEN",35,EMechclass.LIGHT, EVariantType.STANDARD,"RAVEN RVN-3L","RVN-3L"));
        this.mechids.put(34,new MechIdInfo(EFaction.INNERSPHERE,"RAVEN",35,EMechclass.LIGHT, EVariantType.STANDARD,"RAVEN RVN-2X","RVN-2X"));
        this.mechids.put(35,new MechIdInfo(EFaction.INNERSPHERE,"RAVEN",35,EMechclass.LIGHT, EVariantType.STANDARD,"RAVEN RVN-4X","RVN-4X"));
        this.mechids.put(36,new MechIdInfo(EFaction.INNERSPHERE,"CICADA",40,EMechclass.MEDIUM, EVariantType.STANDARD,"CICADA CDA-3M","CDA-3M"));
        this.mechids.put(37,new MechIdInfo(EFaction.INNERSPHERE,"CICADA",40,EMechclass.MEDIUM, EVariantType.STANDARD,"CICADA CDA-2A","CDA-2A"));
        this.mechids.put(38,new MechIdInfo(EFaction.INNERSPHERE,"CICADA",40,EMechclass.MEDIUM, EVariantType.STANDARD,"CICADA CDA-2B","CDA-2B"));
        this.mechids.put(39,new MechIdInfo(EFaction.INNERSPHERE,"CICADA",40,EMechclass.MEDIUM, EVariantType.STANDARD,"CICADA CDA-3C","CDA-3C"));
        this.mechids.put(40,new MechIdInfo(EFaction.INNERSPHERE,"CATAPHRACT",70,EMechclass.HEAVY, EVariantType.STANDARD,"CATAPHRACT CTF-3D","CTF-3D"));
        this.mechids.put(41,new MechIdInfo(EFaction.INNERSPHERE,"CATAPHRACT",70,EMechclass.HEAVY, EVariantType.STANDARD,"CATAPHRACT CTF-1X","CTF-1X"));
        this.mechids.put(42,new MechIdInfo(EFaction.INNERSPHERE,"CATAPHRACT",70,EMechclass.HEAVY, EVariantType.STANDARD,"CATAPHRACT CTF-2X","CTF-2X"));
        this.mechids.put(43,new MechIdInfo(EFaction.INNERSPHERE,"CATAPHRACT",70,EMechclass.HEAVY, EVariantType.STANDARD,"CATAPHRACT CTF-3L","CTF-3L"));
        this.mechids.put(44,new MechIdInfo(EFaction.INNERSPHERE,"CATAPHRACT",70,EMechclass.HEAVY, EVariantType.STANDARD,"CATAPHRACT CTF-4X","CTF-4X"));
        this.mechids.put(45,new MechIdInfo(EFaction.INNERSPHERE,"CENTURION",50,EMechclass.MEDIUM, EVariantType.HERO,"YEN-LO-WANG","CN9-YLW"));
        this.mechids.put(46,new MechIdInfo(EFaction.INNERSPHERE,"STALKER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"STALKER STK-5M","STK-5M"));
        this.mechids.put(47,new MechIdInfo(EFaction.INNERSPHERE,"STALKER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"STALKER STK-3F","STK-3F"));
        this.mechids.put(48,new MechIdInfo(EFaction.INNERSPHERE,"STALKER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"STALKER STK-3H","STK-3H"));
        this.mechids.put(49,new MechIdInfo(EFaction.INNERSPHERE,"STALKER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"STALKER STK-4N","STK-4N"));
        this.mechids.put(50,new MechIdInfo(EFaction.INNERSPHERE,"STALKER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"STALKER STK-5S","STK-5S"));
        this.mechids.put(51,new MechIdInfo(EFaction.INNERSPHERE,"SPIDER",30,EMechclass.LIGHT, EVariantType.STANDARD,"SPIDER SDR-5V","SDR-5V"));
        this.mechids.put(52,new MechIdInfo(EFaction.INNERSPHERE,"SPIDER",30,EMechclass.LIGHT, EVariantType.STANDARD,"SPIDER SDR-5D","SDR-5D"));
        this.mechids.put(53,new MechIdInfo(EFaction.INNERSPHERE,"SPIDER",30,EMechclass.LIGHT, EVariantType.STANDARD,"SPIDER SDR-5K","SDR-5K"));
        this.mechids.put(54,new MechIdInfo(EFaction.INNERSPHERE,"CATAPHRACT",70,EMechclass.HEAVY, EVariantType.HERO,"ILYA MUROMETS","CTF-IM"));
        this.mechids.put(55,new MechIdInfo(EFaction.INNERSPHERE,"DRAGON",60,EMechclass.HEAVY, EVariantType.HERO,"FANG","DRG-FANG"));
        this.mechids.put(56,new MechIdInfo(EFaction.INNERSPHERE,"DRAGON",60,EMechclass.HEAVY, EVariantType.HERO,"FLAME","DRG-FLAME"));
        this.mechids.put(57,new MechIdInfo(EFaction.INNERSPHERE,"COMMANDO",25,EMechclass.LIGHT, EVariantType.HERO,"THE DEATH'S KNELL","COM-TDK"));
        this.mechids.put(58,new MechIdInfo(EFaction.INNERSPHERE,"AWESOME",80,EMechclass.ASSAULT, EVariantType.HERO,"PRETTY BABY","AWS-PB"));
        this.mechids.put(59,new MechIdInfo(EFaction.INNERSPHERE,"TREBUCHET",50,EMechclass.MEDIUM, EVariantType.STANDARD,"TREBUCHET TBT-7M","TBT-7M"));
        this.mechids.put(60,new MechIdInfo(EFaction.INNERSPHERE,"TREBUCHET",50,EMechclass.MEDIUM, EVariantType.STANDARD,"TREBUCHET TBT-3C","TBT-3C"));
        this.mechids.put(61,new MechIdInfo(EFaction.INNERSPHERE,"TREBUCHET",50,EMechclass.MEDIUM, EVariantType.STANDARD,"TREBUCHET TBT-5J","TBT-5J"));
        this.mechids.put(62,new MechIdInfo(EFaction.INNERSPHERE,"TREBUCHET",50,EMechclass.MEDIUM, EVariantType.STANDARD,"TREBUCHET TBT-5N","TBT-5N"));
        this.mechids.put(63,new MechIdInfo(EFaction.INNERSPHERE,"TREBUCHET",50,EMechclass.MEDIUM, EVariantType.STANDARD,"TREBUCHET TBT-7K","TBT-7K"));
        this.mechids.put(64,new MechIdInfo(EFaction.INNERSPHERE,"CICADA",40,EMechclass.MEDIUM, EVariantType.HERO,"THE X-5","CDA-X5"));
        this.mechids.put(65,new MechIdInfo(EFaction.INNERSPHERE,"JAGERMECH",65,EMechclass.HEAVY, EVariantType.STANDARD,"JAGERMECH JM6-DD","JM6-DD"));
        this.mechids.put(66,new MechIdInfo(EFaction.INNERSPHERE,"JAGERMECH",65,EMechclass.HEAVY, EVariantType.STANDARD,"JAGERMECH JM6-A","JM6-A"));
        this.mechids.put(67,new MechIdInfo(EFaction.INNERSPHERE,"JAGERMECH",65,EMechclass.HEAVY, EVariantType.STANDARD,"JAGERMECH JM6-S","JM6-S"));
        this.mechids.put(69,new MechIdInfo(EFaction.INNERSPHERE,"HIGHLANDER",90,EMechclass.ASSAULT, EVariantType.HERO,"HEAVY METAL","HGN-HM"));
        this.mechids.put(70,new MechIdInfo(EFaction.INNERSPHERE,"HIGHLANDER",90,EMechclass.ASSAULT, EVariantType.STANDARD,"HIGHLANDER HGN-732","HGN-732"));
        this.mechids.put(71,new MechIdInfo(EFaction.INNERSPHERE,"HIGHLANDER",90,EMechclass.ASSAULT, EVariantType.STANDARD,"HIGHLANDER HGN-733","HGN-733"));
        this.mechids.put(72,new MechIdInfo(EFaction.INNERSPHERE,"HIGHLANDER",90,EMechclass.ASSAULT, EVariantType.STANDARD,"HIGHLANDER HGN-733C","HGN-733C"));
        this.mechids.put(73,new MechIdInfo(EFaction.INNERSPHERE,"HIGHLANDER",90,EMechclass.ASSAULT, EVariantType.STANDARD,"HIGHLANDER HGN-733P","HGN-733P"));
        this.mechids.put(74,new MechIdInfo(EFaction.INNERSPHERE,"DRAGON",60,EMechclass.HEAVY, EVariantType.CHAMPION,"DRAGON DRG-5N(C)","DRG-5N(C)"));
        this.mechids.put(75,new MechIdInfo(EFaction.INNERSPHERE,"STALKER",85,EMechclass.ASSAULT, EVariantType.HERO,"MISERY","STK-M"));
        this.mechids.put(76,new MechIdInfo(EFaction.INNERSPHERE,"JENNER",35,EMechclass.LIGHT, EVariantType.CHAMPION,"JENNER JR7-F(C)","JR7-F(C)"));
        this.mechids.put(77,new MechIdInfo(EFaction.INNERSPHERE,"BLACKJACK",45,EMechclass.MEDIUM, EVariantType.STANDARD,"BLACKJACK BJ-1","BJ-1"));
        this.mechids.put(78,new MechIdInfo(EFaction.INNERSPHERE,"BLACKJACK",45,EMechclass.MEDIUM, EVariantType.STANDARD,"BLACKJACK BJ-1DC","BJ-1DC"));
        this.mechids.put(79,new MechIdInfo(EFaction.INNERSPHERE,"BLACKJACK",45,EMechclass.MEDIUM, EVariantType.STANDARD,"BLACKJACK BJ-1X","BJ-1X"));
        this.mechids.put(80,new MechIdInfo(EFaction.INNERSPHERE,"BLACKJACK",45,EMechclass.MEDIUM, EVariantType.STANDARD,"BLACKJACK BJ-3","BJ-3"));
        this.mechids.put(81,new MechIdInfo(EFaction.INNERSPHERE,"JAGERMECH",65,EMechclass.HEAVY, EVariantType.HERO,"FIREBRAND","JM6-FB"));
        this.mechids.put(82,new MechIdInfo(EFaction.INNERSPHERE,"QUICKDRAW",60,EMechclass.HEAVY, EVariantType.STANDARD,"QUICKDRAW QKD-4G","QKD-4G"));
        this.mechids.put(83,new MechIdInfo(EFaction.INNERSPHERE,"QUICKDRAW",60,EMechclass.HEAVY, EVariantType.STANDARD,"QUICKDRAW QKD-4H","QKD-4H"));
        this.mechids.put(84,new MechIdInfo(EFaction.INNERSPHERE,"QUICKDRAW",60,EMechclass.HEAVY, EVariantType.STANDARD,"QUICKDRAW QKD-5K","QKD-5K"));
        this.mechids.put(85,new MechIdInfo(EFaction.INNERSPHERE,"HUNCHBACK",50,EMechclass.MEDIUM, EVariantType.CHAMPION,"HUNCHBACK HBK-4P(C)","HBK-4P(C)"));
        this.mechids.put(86,new MechIdInfo(EFaction.INNERSPHERE,"JENNER",35,EMechclass.LIGHT, EVariantType.SPECIAL,"JENNER JR7-D(S)","JR7-D(S)"));
        this.mechids.put(87,new MechIdInfo(EFaction.INNERSPHERE,"VICTOR",80,EMechclass.ASSAULT, EVariantType.HERO,"DRAGON SLAYER","VTR-DS"));
        this.mechids.put(88,new MechIdInfo(EFaction.INNERSPHERE,"VICTOR",80,EMechclass.ASSAULT, EVariantType.STANDARD,"VICTOR VTR-9K","VTR-9K"));
        this.mechids.put(89,new MechIdInfo(EFaction.INNERSPHERE,"VICTOR",80,EMechclass.ASSAULT, EVariantType.STANDARD,"VICTOR VTR-9B","VTR-9B"));
        this.mechids.put(90,new MechIdInfo(EFaction.INNERSPHERE,"VICTOR",80,EMechclass.ASSAULT, EVariantType.STANDARD,"VICTOR VTR-9S","VTR-9S"));
        this.mechids.put(91,new MechIdInfo(EFaction.INNERSPHERE,"CATAPULT",65,EMechclass.HEAVY, EVariantType.CHAMPION,"CATAPULT CPLT-A1(C)","CPLT-A1(C)"));
        this.mechids.put(92,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.CHAMPION,"ATLAS AS7-RS(C)","AS7-RS(C)"));
        this.mechids.put(93,new MechIdInfo(EFaction.INNERSPHERE,"KINTARO",55,EMechclass.MEDIUM, EVariantType.HERO,"GOLDEN BOY","KTO-GB"));
        this.mechids.put(94,new MechIdInfo(EFaction.INNERSPHERE,"KINTARO",55,EMechclass.MEDIUM, EVariantType.STANDARD,"KINTARO KTO-20","KTO-20"));
        this.mechids.put(95,new MechIdInfo(EFaction.INNERSPHERE,"KINTARO",55,EMechclass.MEDIUM, EVariantType.STANDARD,"KINTARO KTO-18","KTO-18"));
        this.mechids.put(96,new MechIdInfo(EFaction.INNERSPHERE,"KINTARO",55,EMechclass.MEDIUM, EVariantType.STANDARD,"KINTARO KTO-19","KTO-19"));
        this.mechids.put(97,new MechIdInfo(EFaction.INNERSPHERE,"ORION",75,EMechclass.HEAVY, EVariantType.HERO,"PROTECTOR","ON1-P"));
        this.mechids.put(98,new MechIdInfo(EFaction.INNERSPHERE,"ORION",75,EMechclass.HEAVY, EVariantType.STANDARD,"ORION ON1-M","ON1-M"));
        this.mechids.put(99,new MechIdInfo(EFaction.INNERSPHERE,"ORION",75,EMechclass.HEAVY, EVariantType.STANDARD,"ORION ON1-K","ON1-K"));
        this.mechids.put(100,new MechIdInfo(EFaction.INNERSPHERE,"ORION",75,EMechclass.HEAVY, EVariantType.STANDARD,"ORION ON1-V","ON1-V"));
        this.mechids.put(101,new MechIdInfo(EFaction.INNERSPHERE,"ORION",75,EMechclass.HEAVY, EVariantType.STANDARD,"ORION ON1-VA","ON1-VA"));
        this.mechids.put(102,new MechIdInfo(EFaction.INNERSPHERE,"CENTURION",50,EMechclass.MEDIUM, EVariantType.CHAMPION,"CENTURION CN9-A(C)","CN9-A(C)"));
        this.mechids.put(103,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.HERO,"THE BOAR'S HEAD","AS7-BH"));
        this.mechids.put(104,new MechIdInfo(EFaction.INNERSPHERE,"SPIDER",30,EMechclass.LIGHT, EVariantType.CHAMPION,"SPIDER SDR-5K(C)","SDR-5K(C)"));
        this.mechids.put(105,new MechIdInfo(EFaction.INNERSPHERE,"LOCUST",20,EMechclass.LIGHT, EVariantType.SPECIAL,"LOCUST LCT-1V(P)","LCT-1V(P)"));
        this.mechids.put(106,new MechIdInfo(EFaction.INNERSPHERE,"LOCUST",20,EMechclass.LIGHT, EVariantType.STANDARD,"LOCUST LCT-1V","LCT-1V"));
        this.mechids.put(107,new MechIdInfo(EFaction.INNERSPHERE,"LOCUST",20,EMechclass.LIGHT, EVariantType.STANDARD,"LOCUST LCT-3M","LCT-3M"));
        this.mechids.put(108,new MechIdInfo(EFaction.INNERSPHERE,"LOCUST",20,EMechclass.LIGHT, EVariantType.STANDARD,"LOCUST LCT-3S","LCT-3S"));
        this.mechids.put(109,new MechIdInfo(EFaction.INNERSPHERE,"SHADOWHAWK",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"SHADOW HAWK SHD-2H(P)","SHD-2H(P)"));
        this.mechids.put(110,new MechIdInfo(EFaction.INNERSPHERE,"SHADOWHAWK",55,EMechclass.MEDIUM, EVariantType.STANDARD,"SHADOW HAWK SHD-2H","SHD-2H"));
        this.mechids.put(111,new MechIdInfo(EFaction.INNERSPHERE,"SHADOWHAWK",55,EMechclass.MEDIUM, EVariantType.STANDARD,"SHADOW HAWK SHD-2D2","SHD-2D2"));
        this.mechids.put(112,new MechIdInfo(EFaction.INNERSPHERE,"SHADOWHAWK",55,EMechclass.MEDIUM, EVariantType.STANDARD,"SHADOW HAWK SHD-5M","SHD-5M"));
        this.mechids.put(113,new MechIdInfo(EFaction.INNERSPHERE,"THUNDERBOLT",65,EMechclass.HEAVY, EVariantType.SPECIAL,"THUNDERBOLT TDR-5S(P)","TDR-5S(P)"));
        this.mechids.put(114,new MechIdInfo(EFaction.INNERSPHERE,"THUNDERBOLT",65,EMechclass.HEAVY, EVariantType.STANDARD,"THUNDERBOLT TDR-5S","TDR-5S"));
        this.mechids.put(115,new MechIdInfo(EFaction.INNERSPHERE,"THUNDERBOLT",65,EMechclass.HEAVY, EVariantType.STANDARD,"THUNDERBOLT TDR-5SS","TDR-5SS"));
        this.mechids.put(116,new MechIdInfo(EFaction.INNERSPHERE,"THUNDERBOLT",65,EMechclass.HEAVY, EVariantType.STANDARD,"THUNDERBOLT TDR-9SE","TDR-9SE"));
        this.mechids.put(117,new MechIdInfo(EFaction.INNERSPHERE,"BATTLEMASTER",85,EMechclass.ASSAULT, EVariantType.SPECIAL,"BATTLEMASTER BLR-1G(P)","BLR-1G(P)"));
        this.mechids.put(118,new MechIdInfo(EFaction.INNERSPHERE,"BATTLEMASTER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"BATTLEMASTER BLR-1G","BLR-1G"));
        this.mechids.put(119,new MechIdInfo(EFaction.INNERSPHERE,"BATTLEMASTER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"BATTLEMASTER BLR-1D","BLR-1D"));
        this.mechids.put(120,new MechIdInfo(EFaction.INNERSPHERE,"BATTLEMASTER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"BATTLEMASTER BLR-1S","BLR-1S"));
        this.mechids.put(121,new MechIdInfo(EFaction.INNERSPHERE,"CATAPULT",65,EMechclass.HEAVY, EVariantType.HERO,"JESTER","CPLT-J"));
        this.mechids.put(122,new MechIdInfo(EFaction.INNERSPHERE,"BLACKJACK",45,EMechclass.MEDIUM, EVariantType.CHAMPION,"BLACKJACK BJ-1(C)","BJ-1(C)"));
        this.mechids.put(123,new MechIdInfo(EFaction.INNERSPHERE,"JENNER",35,EMechclass.LIGHT, EVariantType.HERO,"OXIDE","JR7-O"));
        this.mechids.put(124,new MechIdInfo(EFaction.INNERSPHERE,"HIGHLANDER",90,EMechclass.ASSAULT, EVariantType.CHAMPION,"HIGHLANDER HGN-733C(C)","HGN-733C(C)"));
        this.mechids.put(125,new MechIdInfo(EFaction.INNERSPHERE,"GRIFFIN",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"GRIFFIN GRF-1N(P)","GRF-1N(P)"));
        this.mechids.put(126,new MechIdInfo(EFaction.INNERSPHERE,"GRIFFIN",55,EMechclass.MEDIUM, EVariantType.STANDARD,"GRIFFIN GRF-1N","GRF-1N"));
        this.mechids.put(127,new MechIdInfo(EFaction.INNERSPHERE,"GRIFFIN",55,EMechclass.MEDIUM, EVariantType.STANDARD,"GRIFFIN GRF-1S","GRF-1S"));
        this.mechids.put(128,new MechIdInfo(EFaction.INNERSPHERE,"GRIFFIN",55,EMechclass.MEDIUM, EVariantType.STANDARD,"GRIFFIN GRF-3M","GRF-3M"));
        this.mechids.put(129,new MechIdInfo(EFaction.INNERSPHERE,"WOLVERINE",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"WOLVERINE WVR-6R(P)","WVR-6R(P)"));
        this.mechids.put(130,new MechIdInfo(EFaction.INNERSPHERE,"WOLVERINE",55,EMechclass.MEDIUM, EVariantType.STANDARD,"WOLVERINE WVR-6R","WVR-6R"));
        this.mechids.put(131,new MechIdInfo(EFaction.INNERSPHERE,"WOLVERINE",55,EMechclass.MEDIUM, EVariantType.STANDARD,"WOLVERINE WVR-6K","WVR-6K"));
        this.mechids.put(132,new MechIdInfo(EFaction.INNERSPHERE,"WOLVERINE",55,EMechclass.MEDIUM, EVariantType.STANDARD,"WOLVERINE WVR-7K","WVR-7K"));
        this.mechids.put(133,new MechIdInfo(EFaction.INNERSPHERE,"HUNCHBACK",50,EMechclass.MEDIUM, EVariantType.HERO,"GRID IRON","HBK-GI"));
        this.mechids.put(134,new MechIdInfo(EFaction.INNERSPHERE,"CICADA",40,EMechclass.MEDIUM, EVariantType.CHAMPION,"CICADA CDA-2A(C)","CDA-2A(C)"));
        this.mechids.put(135,new MechIdInfo(EFaction.INNERSPHERE,"HUNCHBACK",50,EMechclass.MEDIUM, EVariantType.HERO,"GRID IRON LTD","HBK-GI"));
        this.mechids.put(136,new MechIdInfo(EFaction.INNERSPHERE,"STALKER",85,EMechclass.ASSAULT, EVariantType.CHAMPION,"STALKER STK-3F(C)","STK-3F(C)"));
        this.mechids.put(137,new MechIdInfo(EFaction.INNERSPHERE,"FIRESTARTER",35,EMechclass.LIGHT, EVariantType.HERO,"EMBER","FS9-E"));
        this.mechids.put(138,new MechIdInfo(EFaction.INNERSPHERE,"FIRESTARTER",35,EMechclass.LIGHT, EVariantType.STANDARD,"FIRESTARTER FS9-S","FS9-S"));
        this.mechids.put(139,new MechIdInfo(EFaction.INNERSPHERE,"FIRESTARTER",35,EMechclass.LIGHT, EVariantType.STANDARD,"FIRESTARTER FS9-A","FS9-A"));
        this.mechids.put(140,new MechIdInfo(EFaction.INNERSPHERE,"FIRESTARTER",35,EMechclass.LIGHT, EVariantType.STANDARD,"FIRESTARTER FS9-H","FS9-H"));
        this.mechids.put(141,new MechIdInfo(EFaction.INNERSPHERE,"FIRESTARTER",35,EMechclass.LIGHT, EVariantType.STANDARD,"FIRESTARTER FS9-K","FS9-K"));
        this.mechids.put(142,new MechIdInfo(EFaction.INNERSPHERE,"CATAPHRACT",70,EMechclass.HEAVY, EVariantType.CHAMPION,"CATAPHRACT CTF-3D(C)","CTF-3D(C)"));
        this.mechids.put(143,new MechIdInfo(EFaction.INNERSPHERE,"BANSHEE",95,EMechclass.ASSAULT, EVariantType.HERO,"LA MALINCHE","BNC-LM"));
        this.mechids.put(144,new MechIdInfo(EFaction.INNERSPHERE,"BANSHEE",95,EMechclass.ASSAULT, EVariantType.STANDARD,"BANSHEE BNC-3E","BNC-3E"));
        this.mechids.put(145,new MechIdInfo(EFaction.INNERSPHERE,"BANSHEE",95,EMechclass.ASSAULT, EVariantType.STANDARD,"BANSHEE BNC-3M","BNC-3M"));
        this.mechids.put(146,new MechIdInfo(EFaction.INNERSPHERE,"BANSHEE",95,EMechclass.ASSAULT, EVariantType.STANDARD,"BANSHEE BNC-3S","BNC-3S"));
        this.mechids.put(147,new MechIdInfo(EFaction.INNERSPHERE,"VICTOR",80,EMechclass.ASSAULT, EVariantType.CHAMPION,"VICTOR VTR-9S(C)","VTR-9S(C)"));
        this.mechids.put(148,new MechIdInfo(EFaction.INNERSPHERE,"RAVEN",35,EMechclass.LIGHT, EVariantType.HERO,"HUGINN","RVN-H"));
        this.mechids.put(149,new MechIdInfo(EFaction.INNERSPHERE,"BATTLEMASTER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"BATTLEMASTER BLR-3M","BLR-3M"));
        this.mechids.put(150,new MechIdInfo(EFaction.INNERSPHERE,"BATTLEMASTER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"BATTLEMASTER BLR-3S","BLR-3S"));
        this.mechids.put(151,new MechIdInfo(EFaction.INNERSPHERE,"LOCUST",20,EMechclass.LIGHT, EVariantType.STANDARD,"LOCUST LCT-1E","LCT-1E"));
        this.mechids.put(152,new MechIdInfo(EFaction.INNERSPHERE,"LOCUST",20,EMechclass.LIGHT, EVariantType.STANDARD,"LOCUST LCT-1M","LCT-1M"));
        this.mechids.put(153,new MechIdInfo(EFaction.INNERSPHERE,"SHADOWHAWK",55,EMechclass.MEDIUM, EVariantType.STANDARD,"SHADOW HAWK SHD-2D","SHD-2D"));
        this.mechids.put(154,new MechIdInfo(EFaction.INNERSPHERE,"SHADOWHAWK",55,EMechclass.MEDIUM, EVariantType.STANDARD,"SHADOW HAWK SHD-2K","SHD-2K"));
        this.mechids.put(155,new MechIdInfo(EFaction.INNERSPHERE,"THUNDERBOLT",65,EMechclass.HEAVY, EVariantType.STANDARD,"THUNDERBOLT TDR-9S","TDR-9S"));
        this.mechids.put(156,new MechIdInfo(EFaction.INNERSPHERE,"ORION",75,EMechclass.HEAVY, EVariantType.CHAMPION,"ORION ON1-K(C)","ON1-K(C)"));
        this.mechids.put(157,new MechIdInfo(EFaction.INNERSPHERE,"TREBUCHET",50,EMechclass.MEDIUM, EVariantType.HERO,"LOUP DE GUERRE","TBT-LG"));
        this.mechids.put(158,new MechIdInfo(EFaction.INNERSPHERE,"QUICKDRAW",60,EMechclass.HEAVY, EVariantType.HERO,"IV-FOUR","QKD-IV4"));
        this.mechids.put(159,new MechIdInfo(EFaction.INNERSPHERE,"BLACKJACK",45,EMechclass.MEDIUM, EVariantType.HERO,"THE ARROW","BJ-A"));
        this.mechids.put(160,new MechIdInfo(EFaction.INNERSPHERE,"FIRESTARTER",35,EMechclass.LIGHT, EVariantType.CHAMPION,"FIRESTARTER FS9-S(C)","FS9-S(C)"));
        this.mechids.put(161,new MechIdInfo(EFaction.INNERSPHERE,"SHADOWHAWK",55,EMechclass.MEDIUM, EVariantType.CHAMPION,"SHADOW HAWK SHD-2H(C)","SHD-2H(C)"));
        this.mechids.put(162,new MechIdInfo(EFaction.CLAN,"TIMBERWOLF",75,EMechclass.HEAVY, EVariantType.SPECIAL,"TIMBER WOLF TBR-PRIME(I)","TBR-PRIME(I)"));
        this.mechids.put(163,new MechIdInfo(EFaction.CLAN,"TIMBERWOLF",75,EMechclass.HEAVY, EVariantType.STANDARD,"TIMBER WOLF TBR-PRIME","TBR-PRIME"));
        this.mechids.put(164,new MechIdInfo(EFaction.CLAN,"TIMBERWOLF",75,EMechclass.HEAVY, EVariantType.STANDARD,"TIMBER WOLF TBR-C","TBR-C"));
        this.mechids.put(165,new MechIdInfo(EFaction.CLAN,"TIMBERWOLF",75,EMechclass.HEAVY, EVariantType.STANDARD,"TIMBER WOLF TBR-S","TBR-S"));
        this.mechids.put(166,new MechIdInfo(EFaction.CLAN,"ADDER",35,EMechclass.LIGHT, EVariantType.SPECIAL,"ADDER ADR-PRIME(I)","ADR-PRIME(I)"));
        this.mechids.put(167,new MechIdInfo(EFaction.CLAN,"ADDER",35,EMechclass.LIGHT, EVariantType.STANDARD,"ADDER ADR-PRIME","ADR-PRIME"));
        this.mechids.put(168,new MechIdInfo(EFaction.CLAN,"ADDER",35,EMechclass.LIGHT, EVariantType.STANDARD,"ADDER ADR-A","ADR-A"));
        this.mechids.put(169,new MechIdInfo(EFaction.CLAN,"ADDER",35,EMechclass.LIGHT, EVariantType.STANDARD,"ADDER ADR-D","ADR-D"));
        this.mechids.put(170,new MechIdInfo(EFaction.CLAN,"DIREWOLF",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"DIRE WOLF DWF-PRIME(I)","DWF-PRIME(I)"));
        this.mechids.put(171,new MechIdInfo(EFaction.CLAN,"DIREWOLF",100,EMechclass.ASSAULT, EVariantType.STANDARD,"DIRE WOLF DWF-PRIME","DWF-PRIME"));
        this.mechids.put(172,new MechIdInfo(EFaction.CLAN,"DIREWOLF",100,EMechclass.ASSAULT, EVariantType.STANDARD,"DIRE WOLF DWF-A","DWF-A"));
        this.mechids.put(173,new MechIdInfo(EFaction.CLAN,"DIREWOLF",100,EMechclass.ASSAULT, EVariantType.STANDARD,"DIRE WOLF DWF-B","DWF-B"));
        this.mechids.put(174,new MechIdInfo(EFaction.CLAN,"KITFOX",30,EMechclass.LIGHT, EVariantType.SPECIAL,"KIT FOX KFX-PRIME(I)","KFX-PRIME(I)"));
        this.mechids.put(175,new MechIdInfo(EFaction.CLAN,"KITFOX",30,EMechclass.LIGHT, EVariantType.STANDARD,"KIT FOX KFX-PRIME","KFX-PRIME"));
        this.mechids.put(176,new MechIdInfo(EFaction.CLAN,"KITFOX",30,EMechclass.LIGHT, EVariantType.STANDARD,"KIT FOX KFX-D","KFX-D"));
        this.mechids.put(177,new MechIdInfo(EFaction.CLAN,"KITFOX",30,EMechclass.LIGHT, EVariantType.STANDARD,"KIT FOX KFX-S","KFX-S"));
        this.mechids.put(178,new MechIdInfo(EFaction.CLAN,"NOVA",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"NOVA NVA-PRIME(I)","NVA-PRIME(I)"));
        this.mechids.put(179,new MechIdInfo(EFaction.CLAN,"NOVA",50,EMechclass.MEDIUM, EVariantType.STANDARD,"NOVA NVA-PRIME","NVA-PRIME"));
        this.mechids.put(180,new MechIdInfo(EFaction.CLAN,"NOVA",50,EMechclass.MEDIUM, EVariantType.STANDARD,"NOVA NVA-B","NVA-B"));
        this.mechids.put(181,new MechIdInfo(EFaction.CLAN,"NOVA",50,EMechclass.MEDIUM, EVariantType.STANDARD,"NOVA NVA-S","NVA-S"));
        this.mechids.put(182,new MechIdInfo(EFaction.CLAN,"STORMCROW",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"STORMCROW SCR-PRIME(I)","SCR-PRIME(I)"));
        this.mechids.put(183,new MechIdInfo(EFaction.CLAN,"STORMCROW",55,EMechclass.MEDIUM, EVariantType.STANDARD,"STORMCROW SCR-PRIME","SCR-PRIME"));
        this.mechids.put(184,new MechIdInfo(EFaction.CLAN,"STORMCROW",55,EMechclass.MEDIUM, EVariantType.STANDARD,"STORMCROW SCR-C","SCR-C"));
        this.mechids.put(185,new MechIdInfo(EFaction.CLAN,"STORMCROW",55,EMechclass.MEDIUM, EVariantType.STANDARD,"STORMCROW SCR-D","SCR-D"));
        this.mechids.put(186,new MechIdInfo(EFaction.CLAN,"SUMMONER",70,EMechclass.HEAVY, EVariantType.SPECIAL,"SUMMONER SMN-PRIME(I)","SMN-PRIME(I)"));
        this.mechids.put(187,new MechIdInfo(EFaction.CLAN,"SUMMONER",70,EMechclass.HEAVY, EVariantType.STANDARD,"SUMMONER SMN-PRIME","SMN-PRIME"));
        this.mechids.put(188,new MechIdInfo(EFaction.CLAN,"SUMMONER",70,EMechclass.HEAVY, EVariantType.STANDARD,"SUMMONER SMN-B","SMN-B"));
        this.mechids.put(189,new MechIdInfo(EFaction.CLAN,"SUMMONER",70,EMechclass.HEAVY, EVariantType.STANDARD,"SUMMONER SMN-D","SMN-D"));
        this.mechids.put(190,new MechIdInfo(EFaction.CLAN,"WARHAWK",85,EMechclass.ASSAULT, EVariantType.SPECIAL,"WARHAWK WHK-PRIME(I)","WHK-PRIME(I)"));
        this.mechids.put(191,new MechIdInfo(EFaction.CLAN,"WARHAWK",85,EMechclass.ASSAULT, EVariantType.STANDARD,"WARHAWK WHK-PRIME","WHK-PRIME"));
        this.mechids.put(192,new MechIdInfo(EFaction.CLAN,"WARHAWK",85,EMechclass.ASSAULT, EVariantType.STANDARD,"WARHAWK WHK-A","WHK-A"));
        this.mechids.put(193,new MechIdInfo(EFaction.CLAN,"WARHAWK",85,EMechclass.ASSAULT, EVariantType.STANDARD,"WARHAWK WHK-B","WHK-B"));
        this.mechids.put(194,new MechIdInfo(EFaction.CLAN,"TIMBERWOLF",75,EMechclass.HEAVY, EVariantType.SPECIAL,"TIMBER WOLF TBR-PRIME(G)","TBR-PRIME(G)"));
        this.mechids.put(195,new MechIdInfo(EFaction.CLAN,"ADDER",35,EMechclass.LIGHT, EVariantType.SPECIAL,"ADDER ADR-PRIME(G)","ADR-PRIME(G)"));
        this.mechids.put(196,new MechIdInfo(EFaction.CLAN,"DIREWOLF",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"DIRE WOLF DWF-PRIME(G)","DWF-PRIME(G)"));
        this.mechids.put(197,new MechIdInfo(EFaction.CLAN,"KITFOX",30,EMechclass.LIGHT, EVariantType.SPECIAL,"KIT FOX KFX-PRIME(G)","KFX-PRIME(G)"));
        this.mechids.put(198,new MechIdInfo(EFaction.CLAN,"NOVA",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"NOVA NVA-PRIME(G)","NVA-PRIME(G)"));
        this.mechids.put(199,new MechIdInfo(EFaction.CLAN,"STORMCROW",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"STORMCROW SCR-PRIME(G)","SCR-PRIME(G)"));
        this.mechids.put(200,new MechIdInfo(EFaction.CLAN,"SUMMONER",70,EMechclass.HEAVY, EVariantType.SPECIAL,"SUMMONER SMN-PRIME(G)","SMN-PRIME(G)"));
        this.mechids.put(201,new MechIdInfo(EFaction.CLAN,"WARHAWK",85,EMechclass.ASSAULT, EVariantType.SPECIAL,"WARHAWK WHK-PRIME(G)","WHK-PRIME(G)"));
        this.mechids.put(202,new MechIdInfo(EFaction.INNERSPHERE,"KINTARO",55,EMechclass.MEDIUM, EVariantType.CHAMPION,"KINTARO KTO-18(C)","KTO-18(C)"));
        this.mechids.put(203,new MechIdInfo(EFaction.INNERSPHERE,"SPIDER",30,EMechclass.LIGHT, EVariantType.HERO,"ANANSI","SDR-A"));
        this.mechids.put(204,new MechIdInfo(EFaction.INNERSPHERE,"BATTLEMASTER",85,EMechclass.ASSAULT, EVariantType.HERO,"HELLSLINGER","BLR-1GHE"));
        this.mechids.put(205,new MechIdInfo(EFaction.INNERSPHERE,"VINDICATOR",45,EMechclass.MEDIUM, EVariantType.HERO,"ST. IVES' BLUES","VND-1SIB"));
        this.mechids.put(206,new MechIdInfo(EFaction.INNERSPHERE,"VINDICATOR",45,EMechclass.MEDIUM, EVariantType.STANDARD,"VINDICATOR VND-1R","VND-1R"));
        this.mechids.put(207,new MechIdInfo(EFaction.INNERSPHERE,"VINDICATOR",45,EMechclass.MEDIUM, EVariantType.STANDARD,"VINDICATOR VND-1AA","VND-1AA"));
        this.mechids.put(208,new MechIdInfo(EFaction.INNERSPHERE,"VINDICATOR",45,EMechclass.MEDIUM, EVariantType.STANDARD,"VINDICATOR VND-1X","VND-1X"));
        this.mechids.put(209,new MechIdInfo(EFaction.INNERSPHERE,"QUICKDRAW",60,EMechclass.HEAVY, EVariantType.CHAMPION,"QUICKDRAW QKD-4G(C)","QKD-4G(C)"));
        this.mechids.put(210,new MechIdInfo(EFaction.INNERSPHERE,"GRIFFIN",55,EMechclass.MEDIUM, EVariantType.HERO,"SPARKY","GRF-1E"));
        this.mechids.put(211,new MechIdInfo(EFaction.CLAN,"MADDOG",60,EMechclass.HEAVY, EVariantType.SPECIAL,"MAD DOG MDD-PRIME(I)","MDD-PRIME(I)"));
        this.mechids.put(212,new MechIdInfo(EFaction.CLAN,"MADDOG",60,EMechclass.HEAVY, EVariantType.STANDARD,"MAD DOG MDD-PRIME","MDD-PRIME"));
        this.mechids.put(213,new MechIdInfo(EFaction.CLAN,"MADDOG",60,EMechclass.HEAVY, EVariantType.STANDARD,"MAD DOG MDD-A","MDD-A"));
        this.mechids.put(214,new MechIdInfo(EFaction.CLAN,"MADDOG",60,EMechclass.HEAVY, EVariantType.STANDARD,"MAD DOG MDD-B","MDD-B"));
        this.mechids.put(215,new MechIdInfo(EFaction.INNERSPHERE,"TREBUCHET",50,EMechclass.MEDIUM, EVariantType.CHAMPION,"TREBUCHET TBT-7M(C)","TBT-7M(C)"));
        this.mechids.put(216,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"ATLAS AS7-S(L)","AS7-S(L)"));
        this.mechids.put(217,new MechIdInfo(EFaction.INNERSPHERE,"THUNDERBOLT",65,EMechclass.HEAVY, EVariantType.CHAMPION,"THUNDERBOLT TDR-9SE(C)","TDR-9SE(C)"));
        this.mechids.put(218,new MechIdInfo(EFaction.CLAN,"ICEFERRET",45,EMechclass.MEDIUM, EVariantType.SPECIAL,"ICE FERRET IFR-PRIME(I)","IFR-PRIME(I)"));
        this.mechids.put(219,new MechIdInfo(EFaction.CLAN,"ICEFERRET",45,EMechclass.MEDIUM, EVariantType.STANDARD,"ICE FERRET IFR-PRIME","IFR-PRIME"));
        this.mechids.put(220,new MechIdInfo(EFaction.CLAN,"ICEFERRET",45,EMechclass.MEDIUM, EVariantType.STANDARD,"ICE FERRET IFR-A","IFR-A"));
        this.mechids.put(221,new MechIdInfo(EFaction.CLAN,"ICEFERRET",45,EMechclass.MEDIUM, EVariantType.STANDARD,"ICE FERRET IFR-C","IFR-C"));
        this.mechids.put(222,new MechIdInfo(EFaction.INNERSPHERE,"LOCUST",20,EMechclass.LIGHT, EVariantType.HERO,"PIRATES' BANE","LCT-PB"));
        this.mechids.put(223,new MechIdInfo(EFaction.INNERSPHERE,"SHADOWHAWK",55,EMechclass.MEDIUM, EVariantType.HERO,"THE GRAY DEATH","SHD-GD"));
        this.mechids.put(224,new MechIdInfo(EFaction.CLAN,"MISTLYNX",25,EMechclass.LIGHT, EVariantType.SPECIAL,"MIST LYNX MLX-PRIME(I)","MLX-PRIME(I)"));
        this.mechids.put(225,new MechIdInfo(EFaction.CLAN,"MISTLYNX",25,EMechclass.LIGHT, EVariantType.STANDARD,"MIST LYNX MLX-PRIME","MLX-PRIME"));
        this.mechids.put(226,new MechIdInfo(EFaction.CLAN,"MISTLYNX",25,EMechclass.LIGHT, EVariantType.STANDARD,"MIST LYNX MLX-B","MLX-B"));
        this.mechids.put(227,new MechIdInfo(EFaction.CLAN,"MISTLYNX",25,EMechclass.LIGHT, EVariantType.STANDARD,"MIST LYNX MLX-C","MLX-C"));
        this.mechids.put(228,new MechIdInfo(EFaction.INNERSPHERE,"RAVEN",35,EMechclass.LIGHT, EVariantType.CHAMPION,"RAVEN RVN-3L(C)","RVN-3L(C)"));
        this.mechids.put(229,new MechIdInfo(EFaction.CLAN,"HELLBRINGER",65,EMechclass.HEAVY, EVariantType.SPECIAL,"HELLBRINGER HBR-PRIME(I)","HBR-PRIME(I)"));
        this.mechids.put(230,new MechIdInfo(EFaction.CLAN,"HELLBRINGER",65,EMechclass.HEAVY, EVariantType.STANDARD,"HELLBRINGER HBR-PRIME","HBR-PRIME"));
        this.mechids.put(231,new MechIdInfo(EFaction.CLAN,"HELLBRINGER",65,EMechclass.HEAVY, EVariantType.STANDARD,"HELLBRINGER HBR-A","HBR-A"));
        this.mechids.put(232,new MechIdInfo(EFaction.CLAN,"HELLBRINGER",65,EMechclass.HEAVY, EVariantType.STANDARD,"HELLBRINGER HBR-B","HBR-B"));
        this.mechids.put(233,new MechIdInfo(EFaction.CLAN,"GARGOYLE",80,EMechclass.ASSAULT, EVariantType.SPECIAL,"GARGOYLE GAR-PRIME(I)","GAR-PRIME(I)"));
        this.mechids.put(234,new MechIdInfo(EFaction.CLAN,"GARGOYLE",80,EMechclass.ASSAULT, EVariantType.STANDARD,"GARGOYLE GAR-PRIME","GAR-PRIME"));
        this.mechids.put(235,new MechIdInfo(EFaction.CLAN,"GARGOYLE",80,EMechclass.ASSAULT, EVariantType.STANDARD,"GARGOYLE GAR-A","GAR-A"));
        this.mechids.put(236,new MechIdInfo(EFaction.CLAN,"GARGOYLE",80,EMechclass.ASSAULT, EVariantType.STANDARD,"GARGOYLE GAR-D","GAR-D"));
        this.mechids.put(237,new MechIdInfo(EFaction.INNERSPHERE,"KINGCRAB",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"KING CRAB KGC-000(L)","KGC-000(L)"));
        this.mechids.put(238,new MechIdInfo(EFaction.INNERSPHERE,"KINGCRAB",100,EMechclass.ASSAULT, EVariantType.STANDARD,"KING CRAB KGC-000","KGC-000"));
        this.mechids.put(239,new MechIdInfo(EFaction.INNERSPHERE,"KINGCRAB",100,EMechclass.ASSAULT, EVariantType.STANDARD,"KING CRAB KGC-0000","KGC-0000"));
        this.mechids.put(240,new MechIdInfo(EFaction.INNERSPHERE,"KINGCRAB",100,EMechclass.ASSAULT, EVariantType.STANDARD,"KING CRAB KGC-000B","KGC-000B"));
        this.mechids.put(241,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.STANDARD,"ATLAS AS7-S","AS7-S"));
        this.mechids.put(242,new MechIdInfo(EFaction.INNERSPHERE,"CENTURION",50,EMechclass.MEDIUM, EVariantType.STANDARD,"CENTURION CN9-AH","CN9-AH"));
        this.mechids.put(243,new MechIdInfo(EFaction.INNERSPHERE,"PANTHER",35,EMechclass.LIGHT, EVariantType.SPECIAL,"PANTHER PNT-10K(R)","PNT-10K(R)"));
        this.mechids.put(244,new MechIdInfo(EFaction.INNERSPHERE,"PANTHER",35,EMechclass.LIGHT, EVariantType.STANDARD,"PANTHER PNT-10K","PNT-10K"));
        this.mechids.put(245,new MechIdInfo(EFaction.INNERSPHERE,"PANTHER",35,EMechclass.LIGHT, EVariantType.STANDARD,"PANTHER PNT-8Z","PNT-8Z"));
        this.mechids.put(246,new MechIdInfo(EFaction.INNERSPHERE,"PANTHER",35,EMechclass.LIGHT, EVariantType.STANDARD,"PANTHER PNT-9R","PNT-9R"));
        this.mechids.put(247,new MechIdInfo(EFaction.INNERSPHERE,"ENFORCER",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"ENFORCER ENF-5D(R)","ENF-5D(R)"));
        this.mechids.put(248,new MechIdInfo(EFaction.INNERSPHERE,"ENFORCER",50,EMechclass.MEDIUM, EVariantType.STANDARD,"ENFORCER ENF-5D","ENF-5D"));
        this.mechids.put(249,new MechIdInfo(EFaction.INNERSPHERE,"ENFORCER",50,EMechclass.MEDIUM, EVariantType.STANDARD,"ENFORCER ENF-4R","ENF-4R"));
        this.mechids.put(250,new MechIdInfo(EFaction.INNERSPHERE,"ENFORCER",50,EMechclass.MEDIUM, EVariantType.STANDARD,"ENFORCER ENF-5P","ENF-5P"));
        this.mechids.put(251,new MechIdInfo(EFaction.INNERSPHERE,"BANSHEE",95,EMechclass.ASSAULT, EVariantType.CHAMPION,"BANSHEE BNC-3M(C)","BNC-3M(C)"));
        this.mechids.put(252,new MechIdInfo(EFaction.INNERSPHERE,"GRASSHOPPER",70,EMechclass.HEAVY, EVariantType.SPECIAL,"GRASSHOPPER GHR-5J(R)","GHR-5J(R)"));
        this.mechids.put(253,new MechIdInfo(EFaction.INNERSPHERE,"GRASSHOPPER",70,EMechclass.HEAVY, EVariantType.STANDARD,"GRASSHOPPER GHR-5J","GHR-5J"));
        this.mechids.put(254,new MechIdInfo(EFaction.INNERSPHERE,"GRASSHOPPER",70,EMechclass.HEAVY, EVariantType.STANDARD,"GRASSHOPPER GHR-5H","GHR-5H"));
        this.mechids.put(255,new MechIdInfo(EFaction.INNERSPHERE,"GRASSHOPPER",70,EMechclass.HEAVY, EVariantType.STANDARD,"GRASSHOPPER GHR-5N","GHR-5N"));
        this.mechids.put(256,new MechIdInfo(EFaction.INNERSPHERE,"ZEUS",80,EMechclass.ASSAULT, EVariantType.SPECIAL,"ZEUS ZEU-6S(R)","ZEU-6S(R)"));
        this.mechids.put(257,new MechIdInfo(EFaction.INNERSPHERE,"ZEUS",80,EMechclass.ASSAULT, EVariantType.STANDARD,"ZEUS ZEU-6S","ZEU-6S"));
        this.mechids.put(258,new MechIdInfo(EFaction.INNERSPHERE,"ZEUS",80,EMechclass.ASSAULT, EVariantType.STANDARD,"ZEUS ZEU-6T","ZEU-6T"));
        this.mechids.put(259,new MechIdInfo(EFaction.INNERSPHERE,"ZEUS",80,EMechclass.ASSAULT, EVariantType.STANDARD,"ZEUS ZEU-9S","ZEU-9S"));
        this.mechids.put(260,new MechIdInfo(EFaction.CLAN,"ADDER",35,EMechclass.LIGHT, EVariantType.STANDARD,"ADDER ADR-B","ADR-B"));
        this.mechids.put(261,new MechIdInfo(EFaction.CLAN,"DIREWOLF",100,EMechclass.ASSAULT, EVariantType.STANDARD,"DIRE WOLF DWF-S","DWF-S"));
        this.mechids.put(262,new MechIdInfo(EFaction.CLAN,"GARGOYLE",80,EMechclass.ASSAULT, EVariantType.STANDARD,"GARGOYLE GAR-C","GAR-C"));
        this.mechids.put(263,new MechIdInfo(EFaction.CLAN,"ICEFERRET",45,EMechclass.MEDIUM, EVariantType.STANDARD,"ICE FERRET IFR-D","IFR-D"));
        this.mechids.put(264,new MechIdInfo(EFaction.CLAN,"KITFOX",30,EMechclass.LIGHT, EVariantType.STANDARD,"KIT FOX KFX-C","KFX-C"));
        this.mechids.put(265,new MechIdInfo(EFaction.CLAN,"MADDOG",60,EMechclass.HEAVY, EVariantType.STANDARD,"MAD DOG MDD-C","MDD-C"));
        this.mechids.put(266,new MechIdInfo(EFaction.CLAN,"MISTLYNX",25,EMechclass.LIGHT, EVariantType.STANDARD,"MIST LYNX MLX-A","MLX-A"));
        this.mechids.put(267,new MechIdInfo(EFaction.CLAN,"NOVA",50,EMechclass.MEDIUM, EVariantType.STANDARD,"NOVA NVA-A","NVA-A"));
        this.mechids.put(268,new MechIdInfo(EFaction.CLAN,"STORMCROW",55,EMechclass.MEDIUM, EVariantType.STANDARD,"STORMCROW SCR-A","SCR-A"));
        this.mechids.put(269,new MechIdInfo(EFaction.CLAN,"SUMMONER",70,EMechclass.HEAVY, EVariantType.STANDARD,"SUMMONER SMN-C","SMN-C"));
        this.mechids.put(270,new MechIdInfo(EFaction.CLAN,"TIMBERWOLF",75,EMechclass.HEAVY, EVariantType.STANDARD,"TIMBER WOLF TBR-D","TBR-D"));
        this.mechids.put(271,new MechIdInfo(EFaction.CLAN,"WARHAWK",85,EMechclass.ASSAULT, EVariantType.STANDARD,"WARHAWK WHK-C","WHK-C"));
        this.mechids.put(272,new MechIdInfo(EFaction.INNERSPHERE,"GRIFFIN",55,EMechclass.MEDIUM, EVariantType.CHAMPION,"GRIFFIN GRF-1S(C)","GRF-1S(C)"));
        this.mechids.put(273,new MechIdInfo(EFaction.INNERSPHERE,"WOLVERINE",55,EMechclass.MEDIUM, EVariantType.CHAMPION,"WOLVERINE WVR-6K(C)","WVR-6K(C)"));
        this.mechids.put(274,new MechIdInfo(EFaction.INNERSPHERE,"URBANMECH",30,EMechclass.LIGHT, EVariantType.SPECIAL,"URBANMECH UM-R63(S)","UM-R63(S)"));
        this.mechids.put(275,new MechIdInfo(EFaction.INNERSPHERE,"URBANMECH",30,EMechclass.LIGHT, EVariantType.STANDARD,"URBANMECH UM-R63","UM-R63"));
        this.mechids.put(276,new MechIdInfo(EFaction.INNERSPHERE,"URBANMECH",30,EMechclass.LIGHT, EVariantType.STANDARD,"URBANMECH UM-R60","UM-R60"));
        this.mechids.put(277,new MechIdInfo(EFaction.INNERSPHERE,"URBANMECH",30,EMechclass.LIGHT, EVariantType.STANDARD,"URBANMECH UM-R60L","UM-R60L"));
        this.mechids.put(278,new MechIdInfo(EFaction.INNERSPHERE,"JAGERMECH",65,EMechclass.HEAVY, EVariantType.CHAMPION,"JAGERMECH JM6-A(C)","JM6-A(C)"));
        this.mechids.put(279,new MechIdInfo(EFaction.CLAN,"EBONJAGUAR",65,EMechclass.HEAVY, EVariantType.SPECIAL,"EBON JAGUAR EBJ-PRIME(I)","EBJ-PRIME(I)"));
        this.mechids.put(280,new MechIdInfo(EFaction.CLAN,"EBONJAGUAR",65,EMechclass.HEAVY, EVariantType.STANDARD,"EBON JAGUAR EBJ-PRIME","EBJ-PRIME"));
        this.mechids.put(281,new MechIdInfo(EFaction.CLAN,"EBONJAGUAR",65,EMechclass.HEAVY, EVariantType.STANDARD,"EBON JAGUAR EBJ-A","EBJ-A"));
        this.mechids.put(282,new MechIdInfo(EFaction.CLAN,"EBONJAGUAR",65,EMechclass.HEAVY, EVariantType.STANDARD,"EBON JAGUAR EBJ-B","EBJ-B"));
        this.mechids.put(283,new MechIdInfo(EFaction.CLAN,"EBONJAGUAR",65,EMechclass.HEAVY, EVariantType.STANDARD,"EBON JAGUAR EBJ-C","EBJ-C"));
        this.mechids.put(284,new MechIdInfo(EFaction.CLAN,"EXECUTIONER",95,EMechclass.ASSAULT, EVariantType.SPECIAL,"EXECUTIONER EXE-PRIME(I)","EXE-PRIME(I)"));
        this.mechids.put(285,new MechIdInfo(EFaction.CLAN,"EXECUTIONER",95,EMechclass.ASSAULT, EVariantType.STANDARD,"EXECUTIONER EXE-PRIME","EXE-PRIME"));
        this.mechids.put(286,new MechIdInfo(EFaction.CLAN,"EXECUTIONER",95,EMechclass.ASSAULT, EVariantType.STANDARD,"EXECUTIONER EXE-A","EXE-A"));
        this.mechids.put(287,new MechIdInfo(EFaction.CLAN,"EXECUTIONER",95,EMechclass.ASSAULT, EVariantType.STANDARD,"EXECUTIONER EXE-B","EXE-B"));
        this.mechids.put(288,new MechIdInfo(EFaction.CLAN,"EXECUTIONER",95,EMechclass.ASSAULT, EVariantType.STANDARD,"EXECUTIONER EXE-D","EXE-D"));
        this.mechids.put(289,new MechIdInfo(EFaction.INNERSPHERE,"THUNDERBOLT",65,EMechclass.HEAVY, EVariantType.HERO,"TOP DOG","TDR-5S-T"));
        this.mechids.put(290,new MechIdInfo(EFaction.CLAN,"ARCTICCHEETAH",30,EMechclass.LIGHT, EVariantType.SPECIAL,"ARCTIC CHEETAH ACH-PRIME(I)","ACH-PRIME(I)"));
        this.mechids.put(291,new MechIdInfo(EFaction.CLAN,"ARCTICCHEETAH",30,EMechclass.LIGHT, EVariantType.STANDARD,"ARCTIC CHEETAH ACH-PRIME","ACH-PRIME"));
        this.mechids.put(292,new MechIdInfo(EFaction.CLAN,"ARCTICCHEETAH",30,EMechclass.LIGHT, EVariantType.STANDARD,"ARCTIC CHEETAH ACH-A","ACH-A"));
        this.mechids.put(293,new MechIdInfo(EFaction.CLAN,"ARCTICCHEETAH",30,EMechclass.LIGHT, EVariantType.STANDARD,"ARCTIC CHEETAH ACH-B","ACH-B"));
        this.mechids.put(294,new MechIdInfo(EFaction.CLAN,"ARCTICCHEETAH",30,EMechclass.LIGHT, EVariantType.STANDARD,"ARCTIC CHEETAH ACH-C","ACH-C"));
        this.mechids.put(295,new MechIdInfo(EFaction.CLAN,"SHADOWCAT",45,EMechclass.MEDIUM, EVariantType.SPECIAL,"SHADOW CAT SHC-PRIME(I)","SHC-PRIME(I)"));
        this.mechids.put(296,new MechIdInfo(EFaction.CLAN,"SHADOWCAT",45,EMechclass.MEDIUM, EVariantType.STANDARD,"SHADOW CAT SHC-PRIME","SHC-PRIME"));
        this.mechids.put(297,new MechIdInfo(EFaction.CLAN,"SHADOWCAT",45,EMechclass.MEDIUM, EVariantType.STANDARD,"SHADOW CAT SHC-A","SHC-A"));
        this.mechids.put(298,new MechIdInfo(EFaction.CLAN,"SHADOWCAT",45,EMechclass.MEDIUM, EVariantType.STANDARD,"SHADOW CAT SHC-B","SHC-B"));
        this.mechids.put(299,new MechIdInfo(EFaction.CLAN,"SHADOWCAT",45,EMechclass.MEDIUM, EVariantType.STANDARD,"SHADOW CAT SHC-P","SHC-P"));
        this.mechids.put(300,new MechIdInfo(EFaction.INNERSPHERE,"GRIFFIN",55,EMechclass.MEDIUM, EVariantType.STANDARD,"GRIFFIN GRF-2N","GRF-2N"));
        this.mechids.put(301,new MechIdInfo(EFaction.INNERSPHERE,"HIGHLANDER",90,EMechclass.ASSAULT, EVariantType.STANDARD,"HIGHLANDER HGN-732B","HGN-732B"));
        this.mechids.put(302,new MechIdInfo(EFaction.INNERSPHERE,"LOCUST",20,EMechclass.LIGHT, EVariantType.STANDARD,"LOCUST LCT-3V","LCT-3V"));
        this.mechids.put(303,new MechIdInfo(EFaction.CLAN,"DIREWOLF",100,EMechclass.ASSAULT, EVariantType.STANDARD,"DIRE WOLF DWF-W","DWF-W"));
        this.mechids.put(304,new MechIdInfo(EFaction.CLAN,"GARGOYLE",80,EMechclass.ASSAULT, EVariantType.STANDARD,"GARGOYLE GAR-B","GAR-B"));
        this.mechids.put(305,new MechIdInfo(EFaction.CLAN,"ICEFERRET",45,EMechclass.MEDIUM, EVariantType.STANDARD,"ICE FERRET IFR-B","IFR-B"));
        this.mechids.put(306,new MechIdInfo(EFaction.CLAN,"MISTLYNX",25,EMechclass.LIGHT, EVariantType.STANDARD,"MIST LYNX MLX-D","MLX-D"));
        this.mechids.put(307,new MechIdInfo(EFaction.CLAN,"NOVA",50,EMechclass.MEDIUM, EVariantType.STANDARD,"NOVA NVA-C","NVA-C"));
        this.mechids.put(308,new MechIdInfo(EFaction.CLAN,"STORMCROW",55,EMechclass.MEDIUM, EVariantType.STANDARD,"STORMCROW SCR-B","SCR-B"));
        this.mechids.put(309,new MechIdInfo(EFaction.CLAN,"TIMBERWOLF",75,EMechclass.HEAVY, EVariantType.STANDARD,"TIMBER WOLF TBR-A","TBR-A"));
        this.mechids.put(310,new MechIdInfo(EFaction.INNERSPHERE,"BATTLEMASTER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"BATTLEMASTER BLR-2C","BLR-2C"));
        this.mechids.put(311,new MechIdInfo(EFaction.INNERSPHERE,"CATAPHRACT",70,EMechclass.HEAVY, EVariantType.STANDARD,"CATAPHRACT CTF-0XP","CTF-0XP"));
        this.mechids.put(312,new MechIdInfo(EFaction.INNERSPHERE,"PANTHER",35,EMechclass.LIGHT, EVariantType.STANDARD,"PANTHER PNT-10P","PNT-10P"));
        this.mechids.put(313,new MechIdInfo(EFaction.INNERSPHERE,"ENFORCER",50,EMechclass.MEDIUM, EVariantType.STANDARD,"ENFORCER ENF-4P","ENF-4P"));
        this.mechids.put(314,new MechIdInfo(EFaction.INNERSPHERE,"GRASSHOPPER",70,EMechclass.HEAVY, EVariantType.STANDARD,"GRASSHOPPER GHR-5P","GHR-5P"));
        this.mechids.put(315,new MechIdInfo(EFaction.INNERSPHERE,"ZEUS",80,EMechclass.ASSAULT, EVariantType.STANDARD,"ZEUS ZEU-5S","ZEU-5S"));
        this.mechids.put(316,new MechIdInfo(EFaction.INNERSPHERE,"WOLVERINE",55,EMechclass.MEDIUM, EVariantType.HERO,"QUARANTINE","WVR-Q"));
        this.mechids.put(317,new MechIdInfo(EFaction.INNERSPHERE,"ENFORCER",50,EMechclass.MEDIUM, EVariantType.CHAMPION,"ENFORCER ENF-4R(C)","ENF-4R(C)"));
        this.mechids.put(318,new MechIdInfo(EFaction.CLAN,"TIMBERWOLF",75,EMechclass.HEAVY, EVariantType.CHAMPION,"TIMBER WOLF TBR-C(C)","TBR-C(C)"));
        this.mechids.put(319,new MechIdInfo(EFaction.INNERSPHERE,"BLACKKNIGHT",75,EMechclass.HEAVY, EVariantType.SPECIAL,"BLACK KNIGHT BL-6-KNT(R)","BL-6-KNT(R)"));
        this.mechids.put(320,new MechIdInfo(EFaction.INNERSPHERE,"BLACKKNIGHT",75,EMechclass.HEAVY, EVariantType.STANDARD,"BLACK KNIGHT BL-6-KNT","BL-6-KNT"));
        this.mechids.put(321,new MechIdInfo(EFaction.INNERSPHERE,"BLACKKNIGHT",75,EMechclass.HEAVY, EVariantType.STANDARD,"BLACK KNIGHT BL-6B-KNT","BL-6B-KNT"));
        this.mechids.put(322,new MechIdInfo(EFaction.INNERSPHERE,"BLACKKNIGHT",75,EMechclass.HEAVY, EVariantType.STANDARD,"BLACK KNIGHT BL-7-KNT","BL-7-KNT"));
        this.mechids.put(323,new MechIdInfo(EFaction.INNERSPHERE,"BLACKKNIGHT",75,EMechclass.HEAVY, EVariantType.STANDARD,"BLACK KNIGHT BL-7-KNT-L","BL-7-KNT-L"));
        this.mechids.put(324,new MechIdInfo(EFaction.INNERSPHERE,"MAULER",90,EMechclass.ASSAULT, EVariantType.SPECIAL,"MAULER MAL-1R(R)","MAL-1R(R)"));
        this.mechids.put(325,new MechIdInfo(EFaction.INNERSPHERE,"MAULER",90,EMechclass.ASSAULT, EVariantType.STANDARD,"MAULER MAL-1R","MAL-1R"));
        this.mechids.put(326,new MechIdInfo(EFaction.INNERSPHERE,"MAULER",90,EMechclass.ASSAULT, EVariantType.STANDARD,"MAULER MAL-MX90","MAL-MX90"));
        this.mechids.put(327,new MechIdInfo(EFaction.INNERSPHERE,"MAULER",90,EMechclass.ASSAULT, EVariantType.STANDARD,"MAULER MAL-1P","MAL-1P"));
        this.mechids.put(328,new MechIdInfo(EFaction.INNERSPHERE,"MAULER",90,EMechclass.ASSAULT, EVariantType.STANDARD,"MAULER MAL-2P","MAL-2P"));
        this.mechids.put(329,new MechIdInfo(EFaction.INNERSPHERE,"CRAB",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"CRAB CRB-27(R)","CRB-27(R)"));
        this.mechids.put(330,new MechIdInfo(EFaction.INNERSPHERE,"CRAB",50,EMechclass.MEDIUM, EVariantType.STANDARD,"CRAB CRB-27","CRB-27"));
        this.mechids.put(331,new MechIdInfo(EFaction.INNERSPHERE,"CRAB",50,EMechclass.MEDIUM, EVariantType.STANDARD,"CRAB CRB-20","CRB-20"));
        this.mechids.put(332,new MechIdInfo(EFaction.INNERSPHERE,"CRAB",50,EMechclass.MEDIUM, EVariantType.STANDARD,"CRAB CRB-27B","CRB-27B"));
        this.mechids.put(333,new MechIdInfo(EFaction.INNERSPHERE,"CRAB",50,EMechclass.MEDIUM, EVariantType.STANDARD,"CRAB CRB-27SL","CRB-27SL"));
        this.mechids.put(334,new MechIdInfo(EFaction.INNERSPHERE,"WOLFHOUND",35,EMechclass.LIGHT, EVariantType.SPECIAL,"WOLFHOUND WLF-2(R)","WLF-2(R)"));
        this.mechids.put(335,new MechIdInfo(EFaction.INNERSPHERE,"WOLFHOUND",35,EMechclass.LIGHT, EVariantType.STANDARD,"WOLFHOUND WLF-2","WLF-2"));
        this.mechids.put(336,new MechIdInfo(EFaction.INNERSPHERE,"WOLFHOUND",35,EMechclass.LIGHT, EVariantType.STANDARD,"WOLFHOUND WLF-1","WLF-1"));
        this.mechids.put(337,new MechIdInfo(EFaction.INNERSPHERE,"WOLFHOUND",35,EMechclass.LIGHT, EVariantType.STANDARD,"WOLFHOUND WLF-1A","WLF-1A"));
        this.mechids.put(338,new MechIdInfo(EFaction.INNERSPHERE,"WOLFHOUND",35,EMechclass.LIGHT, EVariantType.STANDARD,"WOLFHOUND WLF-1B","WLF-1B"));
        this.mechids.put(339,new MechIdInfo(EFaction.INNERSPHERE,"CICADA",40,EMechclass.MEDIUM, EVariantType.SPECIAL,"CICADA CDA-3F(L)","CDA-3F(L)"));
        this.mechids.put(340,new MechIdInfo(EFaction.INNERSPHERE,"WOLVERINE",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"WOLVERINE WVR-7D(L)","WVR-7D(L)"));
        this.mechids.put(341,new MechIdInfo(EFaction.INNERSPHERE,"ZEUS",80,EMechclass.ASSAULT, EVariantType.SPECIAL,"ZEUS ZEU-9S2(L)","ZEU-9S2(L)"));
        this.mechids.put(342,new MechIdInfo(EFaction.CLAN,"NOVA",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"NOVA NVA-D(L)","NVA-D(L)"));
        this.mechids.put(343,new MechIdInfo(EFaction.CLAN,"EXECUTIONER",95,EMechclass.ASSAULT, EVariantType.SPECIAL,"EXECUTIONER EXE-C(L)","EXE-C(L)"));
        this.mechids.put(344,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDER",75,EMechclass.HEAVY, EVariantType.SPECIAL,"MARAUDER MAD-3R(S)","MAD-3R(S)"));
        this.mechids.put(345,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDER",75,EMechclass.HEAVY, EVariantType.STANDARD,"MARAUDER MAD-3R","MAD-3R"));
        this.mechids.put(346,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDER",75,EMechclass.HEAVY, EVariantType.STANDARD,"MARAUDER MAD-5D","MAD-5D"));
        this.mechids.put(347,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDER",75,EMechclass.HEAVY, EVariantType.STANDARD,"MARAUDER MAD-5M","MAD-5M"));
        this.mechids.put(348,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDER",75,EMechclass.HEAVY, EVariantType.HERO,"BOUNTY HUNTER II","MAD-BH2"));
        this.mechids.put(349,new MechIdInfo(EFaction.INNERSPHERE,"KINGCRAB",100,EMechclass.ASSAULT, EVariantType.CHAMPION,"KING CRAB KGC-000B(C)","KGC-000B(C)"));
        this.mechids.put(350,new MechIdInfo(EFaction.INNERSPHERE,"KINGCRAB",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"KING CRAB KGC-000B(S)","KGC-000B(S)"));
        this.mechids.put(351,new MechIdInfo(EFaction.CLAN,"ARCTICCHEETAH",30,EMechclass.LIGHT, EVariantType.CHAMPION,"ARCTIC CHEETAH ACH-PRIME(C)","ACH-PRIME(C)"));
        this.mechids.put(352,new MechIdInfo(EFaction.CLAN,"ARCTICCHEETAH",30,EMechclass.LIGHT, EVariantType.SPECIAL,"ARCTIC CHEETAH ACH-PRIME(S)","ACH-PRIME(S)"));
        this.mechids.put(353,new MechIdInfo(EFaction.CLAN,"STORMCROW",55,EMechclass.MEDIUM, EVariantType.CHAMPION,"STORMCROW SCR-PRIME(C)","SCR-PRIME(C)"));
        this.mechids.put(354,new MechIdInfo(EFaction.CLAN,"STORMCROW",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"STORMCROW SCR-PRIME(S)","SCR-PRIME(S)"));
        this.mechids.put(355,new MechIdInfo(EFaction.CLAN,"DIREWOLF",100,EMechclass.ASSAULT, EVariantType.CHAMPION,"DIRE WOLF DWF-W(C)","DWF-W(C)"));
        this.mechids.put(356,new MechIdInfo(EFaction.CLAN,"DIREWOLF",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"DIRE WOLF DWF-W(S)","DWF-W(S)"));
        this.mechids.put(357,new MechIdInfo(EFaction.INNERSPHERE,"RAVEN",35,EMechclass.LIGHT, EVariantType.SPECIAL,"RAVEN RVN-3L(S)","RVN-3L(S)"));
        this.mechids.put(358,new MechIdInfo(EFaction.INNERSPHERE,"HUNCHBACK",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"HUNCHBACK HBK-4P(S)","HBK-4P(S)"));
        this.mechids.put(359,new MechIdInfo(EFaction.INNERSPHERE,"THUNDERBOLT",65,EMechclass.HEAVY, EVariantType.SPECIAL,"THUNDERBOLT TDR-9SE(S)","TDR-9SE(S)"));
        this.mechids.put(360,new MechIdInfo(EFaction.CLAN,"TIMBERWOLF",75,EMechclass.HEAVY, EVariantType.SPECIAL,"TIMBER WOLF TBR-C(S)","TBR-C(S)"));
        this.mechids.put(361,new MechIdInfo(EFaction.CLAN,"JENNERIIC",35,EMechclass.LIGHT, EVariantType.SPECIAL,"JENNER IIC JR7-IIC(O)","JR7-IIC(O)"));
        this.mechids.put(362,new MechIdInfo(EFaction.CLAN,"JENNERIIC",35,EMechclass.LIGHT, EVariantType.STANDARD,"JENNER IIC JR7-IIC","JR7-IIC"));
        this.mechids.put(363,new MechIdInfo(EFaction.CLAN,"JENNERIIC",35,EMechclass.LIGHT, EVariantType.STANDARD,"JENNER IIC JR7-IIC-2","JR7-IIC-2"));
        this.mechids.put(364,new MechIdInfo(EFaction.CLAN,"JENNERIIC",35,EMechclass.LIGHT, EVariantType.STANDARD,"JENNER IIC JR7-IIC-3","JR7-IIC-3"));
        this.mechids.put(365,new MechIdInfo(EFaction.CLAN,"JENNERIIC",35,EMechclass.LIGHT, EVariantType.STANDARD,"JENNER IIC JR7-IIC-A","JR7-IIC-A"));
        this.mechids.put(366,new MechIdInfo(EFaction.CLAN,"HUNCHBACKIIC",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"HUNCHBACK IIC HBK-IIC(O)","HBK-IIC(O)"));
        this.mechids.put(367,new MechIdInfo(EFaction.CLAN,"HUNCHBACKIIC",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNCHBACK IIC HBK-IIC","HBK-IIC"));
        this.mechids.put(368,new MechIdInfo(EFaction.CLAN,"HUNCHBACKIIC",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNCHBACK IIC HBK-IIC-A","HBK-IIC-A"));
        this.mechids.put(369,new MechIdInfo(EFaction.CLAN,"HUNCHBACKIIC",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNCHBACK IIC HBK-IIC-B","HBK-IIC-B"));
        this.mechids.put(370,new MechIdInfo(EFaction.CLAN,"HUNCHBACKIIC",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNCHBACK IIC HBK-IIC-C","HBK-IIC-C"));
        this.mechids.put(371,new MechIdInfo(EFaction.CLAN,"ORIONIIC",75,EMechclass.HEAVY, EVariantType.SPECIAL,"ORION IIC ON1-IIC(O)","ON1-IIC(O)"));
        this.mechids.put(372,new MechIdInfo(EFaction.CLAN,"ORIONIIC",75,EMechclass.HEAVY, EVariantType.STANDARD,"ORION IIC ON1-IIC","ON1-IIC"));
        this.mechids.put(373,new MechIdInfo(EFaction.CLAN,"ORIONIIC",75,EMechclass.HEAVY, EVariantType.STANDARD,"ORION IIC ON1-IIC-A","ON1-IIC-A"));
        this.mechids.put(374,new MechIdInfo(EFaction.CLAN,"ORIONIIC",75,EMechclass.HEAVY, EVariantType.STANDARD,"ORION IIC ON1-IIC-B","ON1-IIC-B"));
        this.mechids.put(375,new MechIdInfo(EFaction.CLAN,"ORIONIIC",75,EMechclass.HEAVY, EVariantType.STANDARD,"ORION IIC ON1-IIC-C","ON1-IIC-C"));
        this.mechids.put(376,new MechIdInfo(EFaction.CLAN,"HIGHLANDERIIC",90,EMechclass.ASSAULT, EVariantType.SPECIAL,"HIGHLANDER IIC HGN-IIC(O)","HGN-IIC(O)"));
        this.mechids.put(377,new MechIdInfo(EFaction.CLAN,"HIGHLANDERIIC",90,EMechclass.ASSAULT, EVariantType.STANDARD,"HIGHLANDER IIC HGN-IIC","HGN-IIC"));
        this.mechids.put(378,new MechIdInfo(EFaction.CLAN,"HIGHLANDERIIC",90,EMechclass.ASSAULT, EVariantType.STANDARD,"HIGHLANDER IIC HGN-IIC-A","HGN-IIC-A"));
        this.mechids.put(379,new MechIdInfo(EFaction.CLAN,"HIGHLANDERIIC",90,EMechclass.ASSAULT, EVariantType.STANDARD,"HIGHLANDER IIC HGN-IIC-B","HGN-IIC-B"));
        this.mechids.put(380,new MechIdInfo(EFaction.CLAN,"HIGHLANDERIIC",90,EMechclass.ASSAULT, EVariantType.STANDARD,"HIGHLANDER IIC HGN-IIC-C","HGN-IIC-C"));
        this.mechids.put(381,new MechIdInfo(EFaction.INNERSPHERE,"WARHAMMER",70,EMechclass.HEAVY, EVariantType.SPECIAL,"WARHAMMER WHM-6R(S)","WHM-6R(S)"));
        this.mechids.put(382,new MechIdInfo(EFaction.INNERSPHERE,"WARHAMMER",70,EMechclass.HEAVY, EVariantType.STANDARD,"WARHAMMER WHM-6R","WHM-6R"));
        this.mechids.put(383,new MechIdInfo(EFaction.INNERSPHERE,"WARHAMMER",70,EMechclass.HEAVY, EVariantType.STANDARD,"WARHAMMER WHM-6D","WHM-6D"));
        this.mechids.put(384,new MechIdInfo(EFaction.INNERSPHERE,"WARHAMMER",70,EMechclass.HEAVY, EVariantType.STANDARD,"WARHAMMER WHM-7S","WHM-7S"));
        this.mechids.put(385,new MechIdInfo(EFaction.INNERSPHERE,"WARHAMMER",70,EMechclass.HEAVY, EVariantType.HERO,"BLACK WIDOW","WHM-BW"));
        this.mechids.put(386,new MechIdInfo(EFaction.INNERSPHERE,"RIFLEMAN",60,EMechclass.HEAVY, EVariantType.SPECIAL,"RIFLEMAN RFL-3N(S)","RFL-3N(S)"));
        this.mechids.put(387,new MechIdInfo(EFaction.INNERSPHERE,"RIFLEMAN",60,EMechclass.HEAVY, EVariantType.STANDARD,"RIFLEMAN RFL-3N","RFL-3N"));
        this.mechids.put(388,new MechIdInfo(EFaction.INNERSPHERE,"RIFLEMAN",60,EMechclass.HEAVY, EVariantType.STANDARD,"RIFLEMAN RFL-3C","RFL-3C"));
        this.mechids.put(389,new MechIdInfo(EFaction.INNERSPHERE,"RIFLEMAN",60,EMechclass.HEAVY, EVariantType.STANDARD,"RIFLEMAN RFL-5D","RFL-5D"));
        this.mechids.put(390,new MechIdInfo(EFaction.INNERSPHERE,"RIFLEMAN",60,EMechclass.HEAVY, EVariantType.HERO,"LEGEND-KILLER","RFL-LK"));
        this.mechids.put(391,new MechIdInfo(EFaction.INNERSPHERE,"ARCHER",70,EMechclass.HEAVY, EVariantType.SPECIAL,"ARCHER ARC-2R(S)","ARC-2R(S)"));
        this.mechids.put(392,new MechIdInfo(EFaction.INNERSPHERE,"ARCHER",70,EMechclass.HEAVY, EVariantType.STANDARD,"ARCHER ARC-2R","ARC-2R"));
        this.mechids.put(393,new MechIdInfo(EFaction.INNERSPHERE,"ARCHER",70,EMechclass.HEAVY, EVariantType.STANDARD,"ARCHER ARC-5S","ARC-5S"));
        this.mechids.put(394,new MechIdInfo(EFaction.INNERSPHERE,"ARCHER",70,EMechclass.HEAVY, EVariantType.STANDARD,"ARCHER ARC-5W","ARC-5W"));
        this.mechids.put(395,new MechIdInfo(EFaction.INNERSPHERE,"ARCHER",70,EMechclass.HEAVY, EVariantType.HERO,"TEMPEST","ARC-T"));
        this.mechids.put(396,new MechIdInfo(EFaction.INNERSPHERE,"LOCUST",20,EMechclass.LIGHT, EVariantType.CHAMPION,"LOCUST LCT-1E(C)","LCT-1E(C)"));
        this.mechids.put(397,new MechIdInfo(EFaction.INNERSPHERE,"COMMANDO",25,EMechclass.LIGHT, EVariantType.CHAMPION,"COMMANDO COM-1D(C)","COM-1D(C)"));
        this.mechids.put(398,new MechIdInfo(EFaction.INNERSPHERE,"VINDICATOR",45,EMechclass.MEDIUM, EVariantType.CHAMPION,"VINDICATOR VND-1AA(C)","VND-1AA(C)"));
        this.mechids.put(399,new MechIdInfo(EFaction.INNERSPHERE,"AWESOME",80,EMechclass.ASSAULT, EVariantType.CHAMPION,"AWESOME AWS-9M(C)","AWS-9M(C)"));
        this.mechids.put(400,new MechIdInfo(EFaction.INNERSPHERE,"BATTLEMASTER",85,EMechclass.ASSAULT, EVariantType.CHAMPION,"BATTLEMASTER BLR-2C(C)","BLR-2C(C)"));
        this.mechids.put(401,new MechIdInfo(EFaction.CLAN,"MISTLYNX",25,EMechclass.LIGHT, EVariantType.CHAMPION,"MIST LYNX MLX-PRIME(C)","MLX-PRIME(C)"));
        this.mechids.put(402,new MechIdInfo(EFaction.CLAN,"SHADOWCAT",45,EMechclass.MEDIUM, EVariantType.CHAMPION,"SHADOW CAT SHC-PRIME(C)","SHC-PRIME(C)"));
        this.mechids.put(403,new MechIdInfo(EFaction.CLAN,"EBONJAGUAR",65,EMechclass.HEAVY, EVariantType.CHAMPION,"EBON JAGUAR EBJ-PRIME(C)","EBJ-PRIME(C)"));
        this.mechids.put(404,new MechIdInfo(EFaction.CLAN,"WARHAWK",85,EMechclass.ASSAULT, EVariantType.CHAMPION,"WARHAWK WHK-C(C)","WHK-C(C)"));
        this.mechids.put(405,new MechIdInfo(EFaction.CLAN,"KODIAK",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"KODIAK KDK-1(S)","KDK-1(S)"));
        this.mechids.put(406,new MechIdInfo(EFaction.CLAN,"KODIAK",100,EMechclass.ASSAULT, EVariantType.STANDARD,"KODIAK KDK-1","KDK-1"));
        this.mechids.put(407,new MechIdInfo(EFaction.CLAN,"KODIAK",100,EMechclass.ASSAULT, EVariantType.STANDARD,"KODIAK KDK-2","KDK-2"));
        this.mechids.put(408,new MechIdInfo(EFaction.CLAN,"KODIAK",100,EMechclass.ASSAULT, EVariantType.STANDARD,"KODIAK KDK-3","KDK-3"));
        this.mechids.put(409,new MechIdInfo(EFaction.CLAN,"KODIAK",100,EMechclass.ASSAULT, EVariantType.STANDARD,"KODIAK KDK-4","KDK-4"));
        this.mechids.put(410,new MechIdInfo(EFaction.CLAN,"KODIAK",100,EMechclass.ASSAULT, EVariantType.STANDARD,"KODIAK KDK-5","KDK-5"));
        this.mechids.put(411,new MechIdInfo(EFaction.CLAN,"KODIAK",100,EMechclass.ASSAULT, EVariantType.HERO,"SPIRIT BEAR","KDK-SB"));
        this.mechids.put(412,new MechIdInfo(EFaction.INNERSPHERE,"PHOENIXHAWK",45,EMechclass.MEDIUM, EVariantType.SPECIAL,"PHOENIX HAWK PXH-1(S)","PXH-1(S)"));
        this.mechids.put(413,new MechIdInfo(EFaction.INNERSPHERE,"PHOENIXHAWK",45,EMechclass.MEDIUM, EVariantType.STANDARD,"PHOENIX HAWK PXH-1","PXH-1"));
        this.mechids.put(414,new MechIdInfo(EFaction.INNERSPHERE,"PHOENIXHAWK",45,EMechclass.MEDIUM, EVariantType.STANDARD,"PHOENIX HAWK PXH-1B","PXH-1B"));
        this.mechids.put(415,new MechIdInfo(EFaction.INNERSPHERE,"PHOENIXHAWK",45,EMechclass.MEDIUM, EVariantType.STANDARD,"PHOENIX HAWK PXH-1K","PXH-1K"));
        this.mechids.put(416,new MechIdInfo(EFaction.INNERSPHERE,"PHOENIXHAWK",45,EMechclass.MEDIUM, EVariantType.STANDARD,"PHOENIX HAWK PXH-2","PXH-2"));
        this.mechids.put(417,new MechIdInfo(EFaction.INNERSPHERE,"PHOENIXHAWK",45,EMechclass.MEDIUM, EVariantType.STANDARD,"PHOENIX HAWK PXH-3S","PXH-3S"));
        this.mechids.put(418,new MechIdInfo(EFaction.INNERSPHERE,"PHOENIXHAWK",45,EMechclass.MEDIUM, EVariantType.HERO,"ROC","PXH-R"));
        this.mechids.put(419,new MechIdInfo(EFaction.INNERSPHERE,"PHOENIXHAWK",45,EMechclass.MEDIUM, EVariantType.HERO,"KUROI KIRI","PXH-KK"));
        this.mechids.put(420,new MechIdInfo(EFaction.INNERSPHERE,"CATAPULT",65,EMechclass.HEAVY, EVariantType.HERO,"BUTTERBEE","CPLT-BB"));
        this.mechids.put(421,new MechIdInfo(EFaction.CLAN,"VIPER",40,EMechclass.MEDIUM, EVariantType.SPECIAL,"VIPER VPR-PRIME(S)","VPR-PRIME(S)"));
        this.mechids.put(422,new MechIdInfo(EFaction.CLAN,"VIPER",40,EMechclass.MEDIUM, EVariantType.STANDARD,"VIPER VPR-PRIME","VPR-PRIME"));
        this.mechids.put(423,new MechIdInfo(EFaction.CLAN,"VIPER",40,EMechclass.MEDIUM, EVariantType.STANDARD,"VIPER VPR-A","VPR-A"));
        this.mechids.put(424,new MechIdInfo(EFaction.CLAN,"VIPER",40,EMechclass.MEDIUM, EVariantType.STANDARD,"VIPER VPR-B","VPR-B"));
        this.mechids.put(425,new MechIdInfo(EFaction.CLAN,"VIPER",40,EMechclass.MEDIUM, EVariantType.STANDARD,"VIPER VPR-C","VPR-C"));
        this.mechids.put(426,new MechIdInfo(EFaction.CLAN,"VIPER",40,EMechclass.MEDIUM, EVariantType.STANDARD,"VIPER VPR-D","VPR-D"));
        this.mechids.put(427,new MechIdInfo(EFaction.CLAN,"VIPER",40,EMechclass.MEDIUM, EVariantType.HERO,"MEDUSA","VPR-M"));
        this.mechids.put(428,new MechIdInfo(EFaction.INNERSPHERE,"CICADA",40,EMechclass.MEDIUM, EVariantType.STANDARD,"CICADA CDA-3F","CDA-3F"));
        this.mechids.put(429,new MechIdInfo(EFaction.INNERSPHERE,"WOLVERINE",55,EMechclass.MEDIUM, EVariantType.STANDARD,"WOLVERINE WVR-7D","WVR-7D"));
        this.mechids.put(430,new MechIdInfo(EFaction.INNERSPHERE,"ZEUS",80,EMechclass.ASSAULT, EVariantType.STANDARD,"ZEUS ZEU-9S2","ZEU-9S2"));
        this.mechids.put(431,new MechIdInfo(EFaction.CLAN,"NOVA",50,EMechclass.MEDIUM, EVariantType.STANDARD,"NOVA NVA-D","NVA-D"));
        this.mechids.put(432,new MechIdInfo(EFaction.CLAN,"EXECUTIONER",95,EMechclass.ASSAULT, EVariantType.STANDARD,"EXECUTIONER EXE-C","EXE-C"));
        this.mechids.put(433,new MechIdInfo(EFaction.INNERSPHERE,"CYCLOPS",90,EMechclass.ASSAULT, EVariantType.SPECIAL,"CYCLOPS CP-11-A(S)","CP-11-A(S)"));
        this.mechids.put(434,new MechIdInfo(EFaction.INNERSPHERE,"CYCLOPS",90,EMechclass.ASSAULT, EVariantType.STANDARD,"CYCLOPS CP-11-A","CP-11-A"));
        this.mechids.put(435,new MechIdInfo(EFaction.INNERSPHERE,"CYCLOPS",90,EMechclass.ASSAULT, EVariantType.STANDARD,"CYCLOPS CP-10-Q","CP-10-Q"));
        this.mechids.put(436,new MechIdInfo(EFaction.INNERSPHERE,"CYCLOPS",90,EMechclass.ASSAULT, EVariantType.STANDARD,"CYCLOPS CP-10-Z","CP-10-Z"));
        this.mechids.put(437,new MechIdInfo(EFaction.INNERSPHERE,"CYCLOPS",90,EMechclass.ASSAULT, EVariantType.STANDARD,"CYCLOPS CP-11-A-DC","CP-11-A-DC"));
        this.mechids.put(438,new MechIdInfo(EFaction.INNERSPHERE,"CYCLOPS",90,EMechclass.ASSAULT, EVariantType.STANDARD,"CYCLOPS CP-11-P","CP-11-P"));
        this.mechids.put(439,new MechIdInfo(EFaction.INNERSPHERE,"CYCLOPS",90,EMechclass.ASSAULT, EVariantType.HERO,"SLEIPNIR","CP-S"));
        this.mechids.put(440,new MechIdInfo(EFaction.INNERSPHERE,"CENTURION",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"CENTURION CN9-A(NCIX)","CN9-A(NCIX)"));
        this.mechids.put(441,new MechIdInfo(EFaction.CLAN,"NIGHTGYR",75,EMechclass.HEAVY, EVariantType.SPECIAL,"NIGHT GYR NTG-PRIME(S)","NTG-PRIME(S)"));
        this.mechids.put(442,new MechIdInfo(EFaction.CLAN,"NIGHTGYR",75,EMechclass.HEAVY, EVariantType.STANDARD,"NIGHT GYR NTG-PRIME","NTG-PRIME"));
        this.mechids.put(443,new MechIdInfo(EFaction.CLAN,"NIGHTGYR",75,EMechclass.HEAVY, EVariantType.STANDARD,"NIGHT GYR NTG-A","NTG-A"));
        this.mechids.put(444,new MechIdInfo(EFaction.CLAN,"NIGHTGYR",75,EMechclass.HEAVY, EVariantType.STANDARD,"NIGHT GYR NTG-B","NTG-B"));
        this.mechids.put(445,new MechIdInfo(EFaction.CLAN,"NIGHTGYR",75,EMechclass.HEAVY, EVariantType.STANDARD,"NIGHT GYR NTG-C","NTG-C"));
        this.mechids.put(446,new MechIdInfo(EFaction.CLAN,"NIGHTGYR",75,EMechclass.HEAVY, EVariantType.STANDARD,"NIGHT GYR NTG-D","NTG-D"));
        this.mechids.put(447,new MechIdInfo(EFaction.CLAN,"NIGHTGYR",75,EMechclass.HEAVY, EVariantType.HERO,"JADE KITE","NTG-JK"));
        this.mechids.put(448,new MechIdInfo(EFaction.INNERSPHERE,"PANTHER",35,EMechclass.LIGHT, EVariantType.CHAMPION,"PANTHER PNT-10K(C)","PNT-10K(C)"));
        this.mechids.put(449,new MechIdInfo(EFaction.INNERSPHERE,"CRAB",50,EMechclass.MEDIUM, EVariantType.CHAMPION,"CRAB CRB-27B(C)","CRB-27B(C)"));
        this.mechids.put(450,new MechIdInfo(EFaction.INNERSPHERE,"GRASSHOPPER",70,EMechclass.HEAVY, EVariantType.CHAMPION,"GRASSHOPPER GHR-5H(C)","GHR-5H(C)"));
        this.mechids.put(451,new MechIdInfo(EFaction.INNERSPHERE,"ZEUS",80,EMechclass.ASSAULT, EVariantType.CHAMPION,"ZEUS ZEU-6T(C)","ZEU-6T(C)"));
        this.mechids.put(452,new MechIdInfo(EFaction.CLAN,"JENNERIIC",35,EMechclass.LIGHT, EVariantType.CHAMPION,"JENNER IIC JR7-IIC(C)","JR7-IIC(C)"));
        this.mechids.put(453,new MechIdInfo(EFaction.CLAN,"HUNCHBACKIIC",50,EMechclass.MEDIUM, EVariantType.CHAMPION,"HUNCHBACK IIC HBK-IIC(C)","HBK-IIC(C)"));
        this.mechids.put(454,new MechIdInfo(EFaction.CLAN,"ORIONIIC",75,EMechclass.HEAVY, EVariantType.CHAMPION,"ORION IIC ON1-IIC-A(C)","ON1-IIC-A(C)"));
        this.mechids.put(455,new MechIdInfo(EFaction.CLAN,"HIGHLANDERIIC",90,EMechclass.ASSAULT, EVariantType.CHAMPION,"HIGHLANDER IIC HGN-IIC-C(C)","HGN-IIC-C(C)"));
        this.mechids.put(456,new MechIdInfo(EFaction.CLAN,"HUNTSMAN",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"HUNTSMAN HMN-PRIME(S)","HMN-PRIME(S)"));
        this.mechids.put(457,new MechIdInfo(EFaction.CLAN,"HUNTSMAN",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNTSMAN HMN-PRIME","HMN-PRIME"));
        this.mechids.put(458,new MechIdInfo(EFaction.CLAN,"HUNTSMAN",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNTSMAN HMN-A","HMN-A"));
        this.mechids.put(459,new MechIdInfo(EFaction.CLAN,"HUNTSMAN",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNTSMAN HMN-B","HMN-B"));
        this.mechids.put(460,new MechIdInfo(EFaction.CLAN,"HUNTSMAN",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNTSMAN HMN-C","HMN-C"));
        this.mechids.put(461,new MechIdInfo(EFaction.CLAN,"HUNTSMAN",50,EMechclass.MEDIUM, EVariantType.STANDARD,"HUNTSMAN HMN-P","HMN-P"));
        this.mechids.put(462,new MechIdInfo(EFaction.CLAN,"HUNTSMAN",50,EMechclass.MEDIUM, EVariantType.HERO,"PAKHET","HMN-PA"));
        this.mechids.put(463,new MechIdInfo(EFaction.INNERSPHERE,"BLACKJACK",45,EMechclass.MEDIUM, EVariantType.SPECIAL,"BLACKJACK BJ-2(L)","BJ-2(L)"));
        this.mechids.put(464,new MechIdInfo(EFaction.INNERSPHERE,"CATAPHRACT",70,EMechclass.HEAVY, EVariantType.SPECIAL,"CATAPHRACT CTF-3L(L)","CTF-3L(L)"));
        this.mechids.put(465,new MechIdInfo(EFaction.INNERSPHERE,"STALKER",85,EMechclass.ASSAULT, EVariantType.SPECIAL,"STALKER STK-3FB(L)","STK-3FB(L)"));
        this.mechids.put(466,new MechIdInfo(EFaction.CLAN,"HELLBRINGER",65,EMechclass.HEAVY, EVariantType.SPECIAL,"HELLBRINGER HBR-F(L)","HBR-F(L)"));
        this.mechids.put(467,new MechIdInfo(EFaction.CLAN,"SUMMONER",70,EMechclass.HEAVY, EVariantType.SPECIAL,"SUMMONER SMN-F(L)","SMN-F(L)"));
        this.mechids.put(468,new MechIdInfo(EFaction.CLAN,"SUMMONER",70,EMechclass.HEAVY, EVariantType.SPECIAL,"SUMMONER SMN-M(L)","SMN-M(L)"));
        this.mechids.put(469,new MechIdInfo(EFaction.CLAN,"LINEBACKER",65,EMechclass.HEAVY, EVariantType.SPECIAL,"LINEBACKER LBK-PRIME(S)","LBK-PRIME(S)"));
        this.mechids.put(470,new MechIdInfo(EFaction.CLAN,"LINEBACKER",65,EMechclass.HEAVY, EVariantType.STANDARD,"LINEBACKER LBK-PRIME","LBK-PRIME"));
        this.mechids.put(471,new MechIdInfo(EFaction.CLAN,"LINEBACKER",65,EMechclass.HEAVY, EVariantType.STANDARD,"LINEBACKER LBK-A","LBK-A"));
        this.mechids.put(472,new MechIdInfo(EFaction.CLAN,"LINEBACKER",65,EMechclass.HEAVY, EVariantType.STANDARD,"LINEBACKER LBK-B","LBK-B"));
        this.mechids.put(473,new MechIdInfo(EFaction.CLAN,"LINEBACKER",65,EMechclass.HEAVY, EVariantType.STANDARD,"LINEBACKER LBK-C","LBK-C"));
        this.mechids.put(474,new MechIdInfo(EFaction.CLAN,"LINEBACKER",65,EMechclass.HEAVY, EVariantType.STANDARD,"LINEBACKER LBK-D","LBK-D"));
        this.mechids.put(475,new MechIdInfo(EFaction.CLAN,"LINEBACKER",65,EMechclass.HEAVY, EVariantType.HERO,"REDLINE","LBK-RL"));
        this.mechids.put(476,new MechIdInfo(EFaction.CLAN,"KITFOX",30,EMechclass.LIGHT, EVariantType.HERO,"PURIFIER","KFX-PR"));
        this.mechids.put(477,new MechIdInfo(EFaction.CLAN,"ADDER",35,EMechclass.LIGHT, EVariantType.HERO,"CINDER","ADR-CN"));
        this.mechids.put(478,new MechIdInfo(EFaction.CLAN,"NOVA",50,EMechclass.MEDIUM, EVariantType.HERO,"BREAKER","NVA-BK"));
        this.mechids.put(479,new MechIdInfo(EFaction.CLAN,"STORMCROW",55,EMechclass.MEDIUM, EVariantType.HERO,"LACERATOR","SCR-LC"));
        this.mechids.put(480,new MechIdInfo(EFaction.CLAN,"SUMMONER",70,EMechclass.HEAVY, EVariantType.HERO,"PRIDE","SMN-PD"));
        this.mechids.put(481,new MechIdInfo(EFaction.CLAN,"TIMBERWOLF",75,EMechclass.HEAVY, EVariantType.HERO,"WARRANT","TBR-WAR"));
        this.mechids.put(482,new MechIdInfo(EFaction.CLAN,"WARHAWK",85,EMechclass.ASSAULT, EVariantType.HERO,"NANUQ","WHK-NQ"));
        this.mechids.put(483,new MechIdInfo(EFaction.CLAN,"DIREWOLF",100,EMechclass.ASSAULT, EVariantType.HERO,"ULTRAVIOLET","DWF-UV"));
        this.mechids.put(484,new MechIdInfo(EFaction.INNERSPHERE,"PANTHER",35,EMechclass.LIGHT, EVariantType.SPECIAL,"PANTHER PNT-10K(S)","PNT-10K(S)"));
        this.mechids.put(485,new MechIdInfo(EFaction.CLAN,"MISTLYNX",25,EMechclass.LIGHT, EVariantType.SPECIAL,"MIST LYNX MLX-PRIME(S)","MLX-PRIME(S)"));
        this.mechids.put(486,new MechIdInfo(EFaction.INNERSPHERE,"CRAB",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"CRAB CRB-27B(S)","CRB-27B(S)"));
        this.mechids.put(487,new MechIdInfo(EFaction.CLAN,"SHADOWCAT",45,EMechclass.MEDIUM, EVariantType.SPECIAL,"SHADOW CAT SHC-PRIME(S)","SHC-PRIME(S)"));
        this.mechids.put(488,new MechIdInfo(EFaction.INNERSPHERE,"GRASSHOPPER",70,EMechclass.HEAVY, EVariantType.SPECIAL,"GRASSHOPPER GHR-5H(S)","GHR-5H(S)"));
        this.mechids.put(489,new MechIdInfo(EFaction.CLAN,"EBONJAGUAR",65,EMechclass.HEAVY, EVariantType.SPECIAL,"EBON JAGUAR EBJ-PRIME(S)","EBJ-PRIME(S)"));
        this.mechids.put(490,new MechIdInfo(EFaction.INNERSPHERE,"ZEUS",80,EMechclass.ASSAULT, EVariantType.SPECIAL,"ZEUS ZEU-6T(S)","ZEU-6T(S)"));
        this.mechids.put(491,new MechIdInfo(EFaction.CLAN,"WARHAWK",85,EMechclass.ASSAULT, EVariantType.SPECIAL,"WARHAWK WHK-C(S)","WHK-C(S)"));
        this.mechids.put(492,new MechIdInfo(EFaction.CLAN,"MARAUDERIIC",85,EMechclass.ASSAULT, EVariantType.SPECIAL,"MARAUDER IIC MAD-IIC(S)","MAD-IIC(S)"));
        this.mechids.put(493,new MechIdInfo(EFaction.CLAN,"MARAUDERIIC",85,EMechclass.ASSAULT, EVariantType.STANDARD,"MARAUDER IIC MAD-IIC","MAD-IIC"));
        this.mechids.put(494,new MechIdInfo(EFaction.CLAN,"MARAUDERIIC",85,EMechclass.ASSAULT, EVariantType.STANDARD,"MARAUDER IIC MAD-IIC-8","MAD-IIC-8"));
        this.mechids.put(495,new MechIdInfo(EFaction.CLAN,"MARAUDERIIC",85,EMechclass.ASSAULT, EVariantType.STANDARD,"MARAUDER IIC MAD-IIC-A","MAD-IIC-A"));
        this.mechids.put(496,new MechIdInfo(EFaction.CLAN,"MARAUDERIIC",85,EMechclass.ASSAULT, EVariantType.STANDARD,"MARAUDER IIC MAD-IIC-B","MAD-IIC-B"));
        this.mechids.put(497,new MechIdInfo(EFaction.CLAN,"MARAUDERIIC",85,EMechclass.ASSAULT, EVariantType.STANDARD,"MARAUDER IIC MAD-IIC-C","MAD-IIC-C"));
        this.mechids.put(498,new MechIdInfo(EFaction.CLAN,"MARAUDERIIC",85,EMechclass.ASSAULT, EVariantType.STANDARD,"MARAUDER IIC MAD-IIC-D","MAD-IIC-D"));
        this.mechids.put(499,new MechIdInfo(EFaction.CLAN,"MARAUDERIIC",85,EMechclass.ASSAULT, EVariantType.HERO,"SCORCH","MAD-IIC-SC"));
        this.mechids.put(500,new MechIdInfo(EFaction.INNERSPHERE,"BUSHWACKER",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"BUSHWACKER BSW-X1(S)","BSW-X1(S)"));
        this.mechids.put(501,new MechIdInfo(EFaction.INNERSPHERE,"BUSHWACKER",55,EMechclass.MEDIUM, EVariantType.STANDARD,"BUSHWACKER BSW-X1","BSW-X1"));
        this.mechids.put(502,new MechIdInfo(EFaction.INNERSPHERE,"BUSHWACKER",55,EMechclass.MEDIUM, EVariantType.STANDARD,"BUSHWACKER BSW-X2","BSW-X2"));
        this.mechids.put(503,new MechIdInfo(EFaction.INNERSPHERE,"BUSHWACKER",55,EMechclass.MEDIUM, EVariantType.STANDARD,"BUSHWACKER BSW-S2","BSW-S2"));
        this.mechids.put(504,new MechIdInfo(EFaction.INNERSPHERE,"BUSHWACKER",55,EMechclass.MEDIUM, EVariantType.STANDARD,"BUSHWACKER BSW-P1","BSW-P1"));
        this.mechids.put(505,new MechIdInfo(EFaction.INNERSPHERE,"BUSHWACKER",55,EMechclass.MEDIUM, EVariantType.STANDARD,"BUSHWACKER BSW-P2","BSW-P2"));
        this.mechids.put(506,new MechIdInfo(EFaction.INNERSPHERE,"BUSHWACKER",55,EMechclass.MEDIUM, EVariantType.HERO,"HIGH ROLLER","BSW-HR"));
        this.mechids.put(507,new MechIdInfo(EFaction.CLAN,"SUPERNOVA",90,EMechclass.ASSAULT, EVariantType.SPECIAL,"SUPERNOVA SNV-1(S)","SNV-1(S)"));
        this.mechids.put(508,new MechIdInfo(EFaction.CLAN,"SUPERNOVA",90,EMechclass.ASSAULT, EVariantType.STANDARD,"SUPERNOVA SNV-1","SNV-1"));
        this.mechids.put(509,new MechIdInfo(EFaction.CLAN,"SUPERNOVA",90,EMechclass.ASSAULT, EVariantType.STANDARD,"SUPERNOVA SNV-3","SNV-3"));
        this.mechids.put(510,new MechIdInfo(EFaction.CLAN,"SUPERNOVA",90,EMechclass.ASSAULT, EVariantType.STANDARD,"SUPERNOVA SNV-A","SNV-A"));
        this.mechids.put(511,new MechIdInfo(EFaction.CLAN,"SUPERNOVA",90,EMechclass.ASSAULT, EVariantType.STANDARD,"SUPERNOVA SNV-B","SNV-B"));
        this.mechids.put(512,new MechIdInfo(EFaction.CLAN,"SUPERNOVA",90,EMechclass.ASSAULT, EVariantType.STANDARD,"SUPERNOVA SNV-C","SNV-C"));
        this.mechids.put(513,new MechIdInfo(EFaction.CLAN,"SUPERNOVA",90,EMechclass.ASSAULT, EVariantType.HERO,"BOILER","SNV-BR"));
        this.mechids.put(514,new MechIdInfo(EFaction.INNERSPHERE,"BLACKJACK",45,EMechclass.MEDIUM, EVariantType.STANDARD,"BLACKJACK BJ-2","BJ-2"));
        this.mechids.put(515,new MechIdInfo(EFaction.INNERSPHERE,"STALKER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"STALKER STK-3FB","STK-3FB"));
        this.mechids.put(516,new MechIdInfo(EFaction.CLAN,"HELLBRINGER",65,EMechclass.HEAVY, EVariantType.STANDARD,"HELLBRINGER HBR-F","HBR-F"));
        this.mechids.put(517,new MechIdInfo(EFaction.CLAN,"SUMMONER",70,EMechclass.HEAVY, EVariantType.STANDARD,"SUMMONER SMN-F","SMN-F"));
        this.mechids.put(518,new MechIdInfo(EFaction.CLAN,"SUMMONER",70,EMechclass.HEAVY, EVariantType.STANDARD,"SUMMONER SMN-M","SMN-M"));
        this.mechids.put(519,new MechIdInfo(EFaction.INNERSPHERE,"ASSASSIN",40,EMechclass.MEDIUM, EVariantType.SPECIAL,"ASSASSIN ASN-21(S)","ASN-21(S)"));
        this.mechids.put(520,new MechIdInfo(EFaction.INNERSPHERE,"ASSASSIN",40,EMechclass.MEDIUM, EVariantType.STANDARD,"ASSASSIN ASN-21","ASN-21"));
        this.mechids.put(521,new MechIdInfo(EFaction.INNERSPHERE,"ASSASSIN",40,EMechclass.MEDIUM, EVariantType.STANDARD,"ASSASSIN ASN-23","ASN-23"));
        this.mechids.put(522,new MechIdInfo(EFaction.INNERSPHERE,"ASSASSIN",40,EMechclass.MEDIUM, EVariantType.STANDARD,"ASSASSIN ASN-101","ASN-101"));
        this.mechids.put(523,new MechIdInfo(EFaction.INNERSPHERE,"ASSASSIN",40,EMechclass.MEDIUM, EVariantType.STANDARD,"ASSASSIN ASN-26","ASN-26"));
        this.mechids.put(524,new MechIdInfo(EFaction.INNERSPHERE,"ASSASSIN",40,EMechclass.MEDIUM, EVariantType.STANDARD,"ASSASSIN ASN-27","ASN-27"));
        this.mechids.put(525,new MechIdInfo(EFaction.INNERSPHERE,"ASSASSIN",40,EMechclass.MEDIUM, EVariantType.HERO,"DARKDEATH","ASN-DD"));
        this.mechids.put(526,new MechIdInfo(EFaction.INNERSPHERE,"WOLFHOUND",35,EMechclass.LIGHT, EVariantType.CHAMPION,"WOLFHOUND WLF-1(C)","WLF-1(C)"));
        this.mechids.put(527,new MechIdInfo(EFaction.INNERSPHERE,"PHOENIXHAWK",45,EMechclass.MEDIUM, EVariantType.CHAMPION,"PHOENIX HAWK PXH-2(C)","PXH-2(C)"));
        this.mechids.put(528,new MechIdInfo(EFaction.INNERSPHERE,"WARHAMMER",70,EMechclass.HEAVY, EVariantType.CHAMPION,"WARHAMMER WHM-6D(C)","WHM-6D(C)"));
        this.mechids.put(529,new MechIdInfo(EFaction.INNERSPHERE,"MAULER",90,EMechclass.ASSAULT, EVariantType.CHAMPION,"MAULER MAL-MX90(C)","MAL-MX90(C)"));
        this.mechids.put(530,new MechIdInfo(EFaction.CLAN,"ADDER",35,EMechclass.LIGHT, EVariantType.CHAMPION,"ADDER ADR-PRIME(C)","ADR-PRIME(C)"));
        this.mechids.put(531,new MechIdInfo(EFaction.CLAN,"NOVA",50,EMechclass.MEDIUM, EVariantType.CHAMPION,"NOVA NVA-S(C)","NVA-S(C)"));
        this.mechids.put(532,new MechIdInfo(EFaction.CLAN,"HELLBRINGER",65,EMechclass.HEAVY, EVariantType.CHAMPION,"HELLBRINGER HBR-F(C)","HBR-F(C)"));
        this.mechids.put(533,new MechIdInfo(EFaction.CLAN,"KODIAK",100,EMechclass.ASSAULT, EVariantType.CHAMPION,"KODIAK KDK-3(C)","KDK-3(C)"));
        this.mechids.put(534,new MechIdInfo(EFaction.INNERSPHERE,"ROUGHNECK",65,EMechclass.HEAVY, EVariantType.SPECIAL,"ROUGHNECK RGH-1A(S)","RGH-1A(S)"));
        this.mechids.put(535,new MechIdInfo(EFaction.INNERSPHERE,"ROUGHNECK",65,EMechclass.HEAVY, EVariantType.STANDARD,"ROUGHNECK RGH-1A","RGH-1A"));
        this.mechids.put(536,new MechIdInfo(EFaction.INNERSPHERE,"ROUGHNECK",65,EMechclass.HEAVY, EVariantType.STANDARD,"ROUGHNECK RGH-1B","RGH-1B"));
        this.mechids.put(537,new MechIdInfo(EFaction.INNERSPHERE,"ROUGHNECK",65,EMechclass.HEAVY, EVariantType.STANDARD,"ROUGHNECK RGH-1C","RGH-1C"));
        this.mechids.put(538,new MechIdInfo(EFaction.INNERSPHERE,"ROUGHNECK",65,EMechclass.HEAVY, EVariantType.STANDARD,"ROUGHNECK RGH-2A","RGH-2A"));
        this.mechids.put(539,new MechIdInfo(EFaction.INNERSPHERE,"ROUGHNECK",65,EMechclass.HEAVY, EVariantType.STANDARD,"ROUGHNECK RGH-3A","RGH-3A"));
        this.mechids.put(540,new MechIdInfo(EFaction.INNERSPHERE,"ROUGHNECK",65,EMechclass.HEAVY, EVariantType.HERO,"REAVER","RGH-R"));
        this.mechids.put(541,new MechIdInfo(EFaction.INNERSPHERE,"JAVELIN",30,EMechclass.LIGHT, EVariantType.SPECIAL,"JAVELIN JVN-10N(S)","JVN-10N(S)"));
        this.mechids.put(542,new MechIdInfo(EFaction.INNERSPHERE,"JAVELIN",30,EMechclass.LIGHT, EVariantType.STANDARD,"JAVELIN JVN-10N","JVN-10N"));
        this.mechids.put(543,new MechIdInfo(EFaction.INNERSPHERE,"JAVELIN",30,EMechclass.LIGHT, EVariantType.STANDARD,"JAVELIN JVN-10F","JVN-10F"));
        this.mechids.put(544,new MechIdInfo(EFaction.INNERSPHERE,"JAVELIN",30,EMechclass.LIGHT, EVariantType.STANDARD,"JAVELIN JVN-10P","JVN-10P"));
        this.mechids.put(545,new MechIdInfo(EFaction.INNERSPHERE,"JAVELIN",30,EMechclass.LIGHT, EVariantType.STANDARD,"JAVELIN JVN-11A","JVN-11A"));
        this.mechids.put(546,new MechIdInfo(EFaction.INNERSPHERE,"JAVELIN",30,EMechclass.LIGHT, EVariantType.STANDARD,"JAVELIN JVN-11B","JVN-11B"));
        this.mechids.put(547,new MechIdInfo(EFaction.INNERSPHERE,"JAVELIN",30,EMechclass.LIGHT, EVariantType.HERO,"HI THERE!","JVN-HT"));
        this.mechids.put(548,new MechIdInfo(EFaction.INNERSPHERE,"URBANMECH",30,EMechclass.LIGHT, EVariantType.HERO,"K-9","UM-K9"));
        this.mechids.put(549,new MechIdInfo(EFaction.INNERSPHERE,"WOLFHOUND",35,EMechclass.LIGHT, EVariantType.HERO,"GRINNER","WLF-GR"));
        this.mechids.put(550,new MechIdInfo(EFaction.INNERSPHERE,"PANTHER",35,EMechclass.LIGHT, EVariantType.HERO,"KATANA KAT","PNT-KK"));
        this.mechids.put(551,new MechIdInfo(EFaction.INNERSPHERE,"CRAB",50,EMechclass.MEDIUM, EVariantType.HERO,"FLORENTINE","CRB-FL"));
        this.mechids.put(552,new MechIdInfo(EFaction.INNERSPHERE,"ENFORCER",50,EMechclass.MEDIUM, EVariantType.HERO,"GHILLIE","ENF-GH"));
        this.mechids.put(553,new MechIdInfo(EFaction.INNERSPHERE,"GRASSHOPPER",70,EMechclass.HEAVY, EVariantType.HERO,"MJÖLNIR","GHR-MJ"));
        this.mechids.put(554,new MechIdInfo(EFaction.INNERSPHERE,"BLACKKNIGHT",75,EMechclass.HEAVY, EVariantType.HERO,"PARTISAN","BL-P-KNT"));
        this.mechids.put(555,new MechIdInfo(EFaction.INNERSPHERE,"ZEUS",80,EMechclass.ASSAULT, EVariantType.HERO,"SKOKOMISH","ZEU-SK"));
        this.mechids.put(556,new MechIdInfo(EFaction.INNERSPHERE,"MAULER",90,EMechclass.ASSAULT, EVariantType.HERO,"KNOCKOUT","MAL-KO"));
        this.mechids.put(557,new MechIdInfo(EFaction.INNERSPHERE,"KINGCRAB",100,EMechclass.ASSAULT, EVariantType.HERO,"KAIJU","KGC-KJ"));
        this.mechids.put(558,new MechIdInfo(EFaction.INNERSPHERE,"UZIEL",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"UZIEL UZL-3S(S)","UZL-3S(S)"));
        this.mechids.put(559,new MechIdInfo(EFaction.INNERSPHERE,"UZIEL",50,EMechclass.MEDIUM, EVariantType.STANDARD,"UZIEL UZL-3S","UZL-3S"));
        this.mechids.put(560,new MechIdInfo(EFaction.INNERSPHERE,"UZIEL",50,EMechclass.MEDIUM, EVariantType.STANDARD,"UZIEL UZL-2S","UZL-2S"));
        this.mechids.put(561,new MechIdInfo(EFaction.INNERSPHERE,"UZIEL",50,EMechclass.MEDIUM, EVariantType.STANDARD,"UZIEL UZL-3P","UZL-3P"));
        this.mechids.put(562,new MechIdInfo(EFaction.INNERSPHERE,"UZIEL",50,EMechclass.MEDIUM, EVariantType.STANDARD,"UZIEL UZL-5P","UZL-5P"));
        this.mechids.put(563,new MechIdInfo(EFaction.INNERSPHERE,"UZIEL",50,EMechclass.MEDIUM, EVariantType.STANDARD,"UZIEL UZL-6P","UZL-6P"));
        this.mechids.put(564,new MechIdInfo(EFaction.INNERSPHERE,"UZIEL",50,EMechclass.MEDIUM, EVariantType.HERO,"BELIAL","UZL-BE"));
        this.mechids.put(565,new MechIdInfo(EFaction.INNERSPHERE,"ANNIHILATOR",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"ANNIHILATOR ANH-2A(S)","ANH-2A(S)"));
        this.mechids.put(566,new MechIdInfo(EFaction.INNERSPHERE,"ANNIHILATOR",100,EMechclass.ASSAULT, EVariantType.STANDARD,"ANNIHILATOR ANH-2A","ANH-2A"));
        this.mechids.put(567,new MechIdInfo(EFaction.INNERSPHERE,"ANNIHILATOR",100,EMechclass.ASSAULT, EVariantType.STANDARD,"ANNIHILATOR ANH-1A","ANH-1A"));
        this.mechids.put(568,new MechIdInfo(EFaction.INNERSPHERE,"ANNIHILATOR",100,EMechclass.ASSAULT, EVariantType.STANDARD,"ANNIHILATOR ANH-1E","ANH-1E"));
        this.mechids.put(569,new MechIdInfo(EFaction.INNERSPHERE,"ANNIHILATOR",100,EMechclass.ASSAULT, EVariantType.STANDARD,"ANNIHILATOR ANH-1X","ANH-1X"));
        this.mechids.put(570,new MechIdInfo(EFaction.INNERSPHERE,"ANNIHILATOR",100,EMechclass.ASSAULT, EVariantType.STANDARD,"ANNIHILATOR ANH-1P","ANH-1P"));
        this.mechids.put(571,new MechIdInfo(EFaction.INNERSPHERE,"ANNIHILATOR",100,EMechclass.ASSAULT, EVariantType.HERO,"MEAN BABY","ANH-MB"));
        this.mechids.put(572,new MechIdInfo(EFaction.CLAN,"COUGAR",35,EMechclass.LIGHT, EVariantType.SPECIAL,"COUGAR COU-PRIME(S)","COU-PRIME(S)"));
        this.mechids.put(573,new MechIdInfo(EFaction.CLAN,"COUGAR",35,EMechclass.LIGHT, EVariantType.STANDARD,"COUGAR COU-PRIME","COU-PRIME"));
        this.mechids.put(574,new MechIdInfo(EFaction.CLAN,"COUGAR",35,EMechclass.LIGHT, EVariantType.STANDARD,"COUGAR COU-C","COU-C"));
        this.mechids.put(575,new MechIdInfo(EFaction.CLAN,"COUGAR",35,EMechclass.LIGHT, EVariantType.STANDARD,"COUGAR COU-D","COU-D"));
        this.mechids.put(576,new MechIdInfo(EFaction.CLAN,"COUGAR",35,EMechclass.LIGHT, EVariantType.STANDARD,"COUGAR COU-E","COU-E"));
        this.mechids.put(577,new MechIdInfo(EFaction.CLAN,"COUGAR",35,EMechclass.LIGHT, EVariantType.STANDARD,"COUGAR COU-H","COU-H"));
        this.mechids.put(578,new MechIdInfo(EFaction.CLAN,"COUGAR",35,EMechclass.LIGHT, EVariantType.HERO,"BLOOD ADDER","COU-BA"));
        this.mechids.put(579,new MechIdInfo(EFaction.CLAN,"MADCATMKII",90,EMechclass.ASSAULT, EVariantType.SPECIAL,"MAD CAT MK II MCII-1(S)","MCII-1(S)"));
        this.mechids.put(580,new MechIdInfo(EFaction.CLAN,"MADCATMKII",90,EMechclass.ASSAULT, EVariantType.STANDARD,"MAD CAT MK II MCII-1","MCII-1"));
        this.mechids.put(581,new MechIdInfo(EFaction.CLAN,"MADCATMKII",90,EMechclass.ASSAULT, EVariantType.STANDARD,"MAD CAT MK II MCII-2","MCII-2"));
        this.mechids.put(582,new MechIdInfo(EFaction.CLAN,"MADCATMKII",90,EMechclass.ASSAULT, EVariantType.STANDARD,"MAD CAT MK II MCII-4","MCII-4"));
        this.mechids.put(583,new MechIdInfo(EFaction.CLAN,"MADCATMKII",90,EMechclass.ASSAULT, EVariantType.STANDARD,"MAD CAT MK II MCII-A","MCII-A"));
        this.mechids.put(584,new MechIdInfo(EFaction.CLAN,"MADCATMKII",90,EMechclass.ASSAULT, EVariantType.STANDARD,"MAD CAT MK II MCII-B","MCII-B"));
        this.mechids.put(585,new MechIdInfo(EFaction.CLAN,"MADCATMKII",90,EMechclass.ASSAULT, EVariantType.HERO,"DEATHSTRIKE","MCII-DS"));
        this.mechids.put(586,new MechIdInfo(EFaction.CLAN,"MISTLYNX",25,EMechclass.LIGHT, EVariantType.HERO,"EBON DRAGOON","MLX-ED"));
        this.mechids.put(587,new MechIdInfo(EFaction.CLAN,"ARCTICCHEETAH",30,EMechclass.LIGHT, EVariantType.HERO,"SHARD","ACH-SH"));
        this.mechids.put(588,new MechIdInfo(EFaction.CLAN,"ICEFERRET",45,EMechclass.MEDIUM, EVariantType.HERO,"RAINBOW CROW","IFR-RC"));
        this.mechids.put(589,new MechIdInfo(EFaction.CLAN,"SHADOWCAT",45,EMechclass.MEDIUM, EVariantType.HERO,"MISHIPESHU","SHC-MI"));
        this.mechids.put(590,new MechIdInfo(EFaction.CLAN,"MADDOG",60,EMechclass.HEAVY, EVariantType.HERO,"BANDIT","MDD-BA"));
        this.mechids.put(591,new MechIdInfo(EFaction.CLAN,"EBONJAGUAR",65,EMechclass.HEAVY, EVariantType.HERO,"ESPRIT DE CORPS","EBJ-EC"));
        this.mechids.put(592,new MechIdInfo(EFaction.CLAN,"HELLBRINGER",65,EMechclass.HEAVY, EVariantType.HERO,"VIRAGO","HBR-VI"));
        this.mechids.put(593,new MechIdInfo(EFaction.CLAN,"GARGOYLE",80,EMechclass.ASSAULT, EVariantType.HERO,"KIN WOLF","GAR-KW"));
        this.mechids.put(594,new MechIdInfo(EFaction.CLAN,"EXECUTIONER",95,EMechclass.ASSAULT, EVariantType.HERO,"CHERBI","EXE-CH"));
        this.mechids.put(595,new MechIdInfo(EFaction.CLAN,"MISTLYNX",25,EMechclass.LIGHT, EVariantType.STANDARD,"MIST LYNX MLX-G","MLX-G"));
        this.mechids.put(596,new MechIdInfo(EFaction.CLAN,"ARCTICCHEETAH",30,EMechclass.LIGHT, EVariantType.STANDARD,"ARCTIC CHEETAH ACH-E","ACH-E"));
        this.mechids.put(597,new MechIdInfo(EFaction.CLAN,"ICEFERRET",45,EMechclass.MEDIUM, EVariantType.STANDARD,"ICE FERRET IFR-P","IFR-P"));
        this.mechids.put(598,new MechIdInfo(EFaction.CLAN,"SHADOWCAT",45,EMechclass.MEDIUM, EVariantType.STANDARD,"SHADOW CAT SHC-H","SHC-H"));
        this.mechids.put(599,new MechIdInfo(EFaction.CLAN,"MADDOG",60,EMechclass.HEAVY, EVariantType.STANDARD,"MAD DOG MDD-H","MDD-H"));
        this.mechids.put(600,new MechIdInfo(EFaction.CLAN,"EBONJAGUAR",65,EMechclass.HEAVY, EVariantType.STANDARD,"EBON JAGUAR EBJ-D","EBJ-D"));
        this.mechids.put(601,new MechIdInfo(EFaction.CLAN,"HELLBRINGER",65,EMechclass.HEAVY, EVariantType.STANDARD,"HELLBRINGER HBR-P","HBR-P"));
        this.mechids.put(602,new MechIdInfo(EFaction.CLAN,"GARGOYLE",80,EMechclass.ASSAULT, EVariantType.STANDARD,"GARGOYLE GAR-E","GAR-E"));
        this.mechids.put(603,new MechIdInfo(EFaction.CLAN,"EXECUTIONER",95,EMechclass.ASSAULT, EVariantType.STANDARD,"EXECUTIONER EXE-E","EXE-E"));
        this.mechids.put(604,new MechIdInfo(EFaction.CLAN,"JENNERIIC",35,EMechclass.LIGHT, EVariantType.HERO,"FURY","JR7-IIC-FY"));
        this.mechids.put(605,new MechIdInfo(EFaction.CLAN,"HUNCHBACKIIC",50,EMechclass.MEDIUM, EVariantType.HERO,"DEATHWISH","HBK-IIC-DW"));
        this.mechids.put(606,new MechIdInfo(EFaction.CLAN,"ORIONIIC",75,EMechclass.HEAVY, EVariantType.HERO,"SKÖLL","ON1-IIC-SK"));
        this.mechids.put(607,new MechIdInfo(EFaction.CLAN,"HIGHLANDERIIC",90,EMechclass.ASSAULT, EVariantType.HERO,"KEEPER","HGN-IIC-KP"));
        this.mechids.put(608,new MechIdInfo(EFaction.INNERSPHERE,"OSIRIS",30,EMechclass.LIGHT, EVariantType.SPECIAL,"OSIRIS OSR-3D(S)","OSR-3D(S)"));
        this.mechids.put(609,new MechIdInfo(EFaction.INNERSPHERE,"OSIRIS",30,EMechclass.LIGHT, EVariantType.STANDARD,"OSIRIS OSR-3D","OSR-3D"));
        this.mechids.put(610,new MechIdInfo(EFaction.INNERSPHERE,"OSIRIS",30,EMechclass.LIGHT, EVariantType.STANDARD,"OSIRIS OSR-4D","OSR-4D"));
        this.mechids.put(611,new MechIdInfo(EFaction.INNERSPHERE,"OSIRIS",30,EMechclass.LIGHT, EVariantType.STANDARD,"OSIRIS OSR-1V","OSR-1V"));
        this.mechids.put(612,new MechIdInfo(EFaction.INNERSPHERE,"OSIRIS",30,EMechclass.LIGHT, EVariantType.STANDARD,"OSIRIS OSR-2V","OSR-2V"));
        this.mechids.put(613,new MechIdInfo(EFaction.INNERSPHERE,"OSIRIS",30,EMechclass.LIGHT, EVariantType.STANDARD,"OSIRIS OSR-1P","OSR-1P"));
        this.mechids.put(614,new MechIdInfo(EFaction.INNERSPHERE,"OSIRIS",30,EMechclass.LIGHT, EVariantType.HERO,"SEKHMET","OSR-SE"));
        this.mechids.put(615,new MechIdInfo(EFaction.INNERSPHERE,"NIGHTSTAR",95,EMechclass.ASSAULT, EVariantType.SPECIAL,"NIGHTSTAR NSR-9J(S)","NSR-9J(S)"));
        this.mechids.put(616,new MechIdInfo(EFaction.INNERSPHERE,"NIGHTSTAR",95,EMechclass.ASSAULT, EVariantType.STANDARD,"NIGHTSTAR NSR-9J","NSR-9J"));
        this.mechids.put(617,new MechIdInfo(EFaction.INNERSPHERE,"NIGHTSTAR",95,EMechclass.ASSAULT, EVariantType.STANDARD,"NIGHTSTAR NSR-9FC","NSR-9FC"));
        this.mechids.put(618,new MechIdInfo(EFaction.INNERSPHERE,"NIGHTSTAR",95,EMechclass.ASSAULT, EVariantType.STANDARD,"NIGHTSTAR NSR-9S","NSR-9S"));
        this.mechids.put(619,new MechIdInfo(EFaction.INNERSPHERE,"NIGHTSTAR",95,EMechclass.ASSAULT, EVariantType.STANDARD,"NIGHTSTAR NSR-9P","NSR-9P"));
        this.mechids.put(620,new MechIdInfo(EFaction.INNERSPHERE,"NIGHTSTAR",95,EMechclass.ASSAULT, EVariantType.STANDARD,"NIGHTSTAR NSR-10P","NSR-10P"));
        this.mechids.put(621,new MechIdInfo(EFaction.INNERSPHERE,"NIGHTSTAR",95,EMechclass.ASSAULT, EVariantType.HERO,"WOLF PHOENIX","NSR-WP"));
        this.mechids.put(622,new MechIdInfo(EFaction.CLAN,"ARCTICWOLF",40,EMechclass.MEDIUM, EVariantType.SPECIAL,"ARCTIC WOLF ACW-PRIME(S)","ACW-PRIME(S)"));
        this.mechids.put(623,new MechIdInfo(EFaction.CLAN,"ARCTICWOLF",40,EMechclass.MEDIUM, EVariantType.STANDARD,"ARCTIC WOLF ACW-PRIME","ACW-PRIME"));
        this.mechids.put(624,new MechIdInfo(EFaction.CLAN,"ARCTICWOLF",40,EMechclass.MEDIUM, EVariantType.STANDARD,"ARCTIC WOLF ACW-A","ACW-A"));
        this.mechids.put(625,new MechIdInfo(EFaction.CLAN,"ARCTICWOLF",40,EMechclass.MEDIUM, EVariantType.STANDARD,"ARCTIC WOLF ACW-P","ACW-P"));
        this.mechids.put(626,new MechIdInfo(EFaction.CLAN,"ARCTICWOLF",40,EMechclass.MEDIUM, EVariantType.STANDARD,"ARCTIC WOLF ACW-1","ACW-1"));
        this.mechids.put(627,new MechIdInfo(EFaction.CLAN,"ARCTICWOLF",40,EMechclass.MEDIUM, EVariantType.STANDARD,"ARCTIC WOLF ACW-2","ACW-2"));
        this.mechids.put(628,new MechIdInfo(EFaction.CLAN,"ARCTICWOLF",40,EMechclass.MEDIUM, EVariantType.HERO,"BLOOD KIT","ACW-BK"));
        this.mechids.put(629,new MechIdInfo(EFaction.CLAN,"NOVACAT",70,EMechclass.HEAVY, EVariantType.SPECIAL,"NOVA CAT NCT-PRIME(S)","NCT-PRIME(S)"));
        this.mechids.put(630,new MechIdInfo(EFaction.CLAN,"NOVACAT",70,EMechclass.HEAVY, EVariantType.STANDARD,"NOVA CAT NCT-PRIME","NCT-PRIME"));
        this.mechids.put(631,new MechIdInfo(EFaction.CLAN,"NOVACAT",70,EMechclass.HEAVY, EVariantType.STANDARD,"NOVA CAT NCT-A","NCT-A"));
        this.mechids.put(632,new MechIdInfo(EFaction.CLAN,"NOVACAT",70,EMechclass.HEAVY, EVariantType.STANDARD,"NOVA CAT NCT-B","NCT-B"));
        this.mechids.put(633,new MechIdInfo(EFaction.CLAN,"NOVACAT",70,EMechclass.HEAVY, EVariantType.STANDARD,"NOVA CAT NCT-C","NCT-C"));
        this.mechids.put(634,new MechIdInfo(EFaction.CLAN,"NOVACAT",70,EMechclass.HEAVY, EVariantType.STANDARD,"NOVA CAT NCT-D","NCT-D"));
        this.mechids.put(635,new MechIdInfo(EFaction.CLAN,"NOVACAT",70,EMechclass.HEAVY, EVariantType.HERO,"COBRA CAT","NCT-CC"));
        this.mechids.put(636,new MechIdInfo(EFaction.INNERSPHERE,"THANATOS",75,EMechclass.HEAVY, EVariantType.SPECIAL,"THANATOS TNS-4S(S)","TNS-4S(S)"));
        this.mechids.put(637,new MechIdInfo(EFaction.INNERSPHERE,"THANATOS",75,EMechclass.HEAVY, EVariantType.STANDARD,"THANATOS TNS-4S","TNS-4S"));
        this.mechids.put(638,new MechIdInfo(EFaction.INNERSPHERE,"THANATOS",75,EMechclass.HEAVY, EVariantType.STANDARD,"THANATOS TNS-4P","TNS-4P"));
        this.mechids.put(639,new MechIdInfo(EFaction.INNERSPHERE,"THANATOS",75,EMechclass.HEAVY, EVariantType.STANDARD,"THANATOS TNS-5P","TNS-5P"));
        this.mechids.put(640,new MechIdInfo(EFaction.INNERSPHERE,"THANATOS",75,EMechclass.HEAVY, EVariantType.STANDARD,"THANATOS TNS-5S","TNS-5S"));
        this.mechids.put(641,new MechIdInfo(EFaction.INNERSPHERE,"THANATOS",75,EMechclass.HEAVY, EVariantType.STANDARD,"THANATOS TNS-5T","TNS-5T"));
        this.mechids.put(642,new MechIdInfo(EFaction.INNERSPHERE,"THANATOS",75,EMechclass.HEAVY, EVariantType.HERO,"HANGOVER","TNS-HA"));
        this.mechids.put(643,new MechIdInfo(EFaction.INNERSPHERE,"URBANMECH",30,EMechclass.LIGHT, EVariantType.SPECIAL,"URBANMECH UM-R68(L)","UM-R68(L)"));
        this.mechids.put(644,new MechIdInfo(EFaction.INNERSPHERE,"GRIFFIN",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"GRIFFIN GRF-5M(L)","GRF-5M(L)"));
        this.mechids.put(645,new MechIdInfo(EFaction.INNERSPHERE,"VICTOR",80,EMechclass.ASSAULT, EVariantType.SPECIAL,"VICTOR VTR-9A1(L)","VTR-9A1(L)"));
        this.mechids.put(646,new MechIdInfo(EFaction.CLAN,"KITFOX",30,EMechclass.LIGHT, EVariantType.SPECIAL,"KIT FOX KFX-G(L)","KFX-G(L)"));
        this.mechids.put(647,new MechIdInfo(EFaction.CLAN,"LINEBACKER",65,EMechclass.HEAVY, EVariantType.SPECIAL,"LINEBACKER LBK-H(L)","LBK-H(L)"));
        this.mechids.put(648,new MechIdInfo(EFaction.INNERSPHERE,"HELLSPAWN",45,EMechclass.MEDIUM, EVariantType.SPECIAL,"HELLSPAWN HSN-7D(S)","HSN-7D(S)"));
        this.mechids.put(649,new MechIdInfo(EFaction.INNERSPHERE,"HELLSPAWN",45,EMechclass.MEDIUM, EVariantType.STANDARD,"HELLSPAWN HSN-7D","HSN-7D"));
        this.mechids.put(650,new MechIdInfo(EFaction.INNERSPHERE,"HELLSPAWN",45,EMechclass.MEDIUM, EVariantType.STANDARD,"HELLSPAWN HSN-8E","HSN-8E"));
        this.mechids.put(651,new MechIdInfo(EFaction.INNERSPHERE,"HELLSPAWN",45,EMechclass.MEDIUM, EVariantType.STANDARD,"HELLSPAWN HSN-9F","HSN-9F"));
        this.mechids.put(652,new MechIdInfo(EFaction.INNERSPHERE,"HELLSPAWN",45,EMechclass.MEDIUM, EVariantType.STANDARD,"HELLSPAWN HSN-7P","HSN-7P"));
        this.mechids.put(653,new MechIdInfo(EFaction.INNERSPHERE,"HELLSPAWN",45,EMechclass.MEDIUM, EVariantType.STANDARD,"HELLSPAWN HSN-8P","HSN-8P"));
        this.mechids.put(654,new MechIdInfo(EFaction.INNERSPHERE,"HELLSPAWN",45,EMechclass.MEDIUM, EVariantType.HERO,"PARALYZER","HSN-7D2"));
        this.mechids.put(655,new MechIdInfo(EFaction.CLAN,"PIRANHA",20,EMechclass.LIGHT, EVariantType.SPECIAL,"PIRANHA PIR-1(S)","PIR-1(S)"));
        this.mechids.put(656,new MechIdInfo(EFaction.CLAN,"PIRANHA",20,EMechclass.LIGHT, EVariantType.STANDARD,"PIRANHA PIR-1","PIR-1"));
        this.mechids.put(657,new MechIdInfo(EFaction.CLAN,"PIRANHA",20,EMechclass.LIGHT, EVariantType.STANDARD,"PIRANHA PIR-2","PIR-2"));
        this.mechids.put(658,new MechIdInfo(EFaction.CLAN,"PIRANHA",20,EMechclass.LIGHT, EVariantType.STANDARD,"PIRANHA PIR-3","PIR-3"));
        this.mechids.put(659,new MechIdInfo(EFaction.CLAN,"PIRANHA",20,EMechclass.LIGHT, EVariantType.STANDARD,"PIRANHA PIR-A","PIR-A"));
        this.mechids.put(660,new MechIdInfo(EFaction.CLAN,"PIRANHA",20,EMechclass.LIGHT, EVariantType.STANDARD,"PIRANHA PIR-B","PIR-B"));
        this.mechids.put(661,new MechIdInfo(EFaction.CLAN,"PIRANHA",20,EMechclass.LIGHT, EVariantType.HERO,"CIPHER","PIR-CI"));
        this.mechids.put(662,new MechIdInfo(EFaction.CLAN,"BLACKLANNER",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"BLACK LANNER BKL-PRIME(S)","BKL-PRIME(S)"));
        this.mechids.put(663,new MechIdInfo(EFaction.CLAN,"BLACKLANNER",55,EMechclass.MEDIUM, EVariantType.STANDARD,"BLACK LANNER BKL-PRIME","BKL-PRIME"));
        this.mechids.put(664,new MechIdInfo(EFaction.CLAN,"BLACKLANNER",55,EMechclass.MEDIUM, EVariantType.STANDARD,"BLACK LANNER BKL-A","BKL-A"));
        this.mechids.put(665,new MechIdInfo(EFaction.CLAN,"BLACKLANNER",55,EMechclass.MEDIUM, EVariantType.STANDARD,"BLACK LANNER BKL-C","BKL-C"));
        this.mechids.put(666,new MechIdInfo(EFaction.CLAN,"BLACKLANNER",55,EMechclass.MEDIUM, EVariantType.STANDARD,"BLACK LANNER BKL-D","BKL-D"));
        this.mechids.put(667,new MechIdInfo(EFaction.CLAN,"BLACKLANNER",55,EMechclass.MEDIUM, EVariantType.STANDARD,"BLACK LANNER BKL-E","BKL-E"));
        this.mechids.put(668,new MechIdInfo(EFaction.CLAN,"BLACKLANNER",55,EMechclass.MEDIUM, EVariantType.HERO,"BELLONARIUS","BKL-BL"));
        this.mechids.put(669,new MechIdInfo(EFaction.INNERSPHERE,"URBANMECH",30,EMechclass.LIGHT, EVariantType.STANDARD,"URBANMECH UM-R68","UM-R68"));
        this.mechids.put(670,new MechIdInfo(EFaction.INNERSPHERE,"GRIFFIN",55,EMechclass.MEDIUM, EVariantType.STANDARD,"GRIFFIN GRF-5M","GRF-5M"));
        this.mechids.put(671,new MechIdInfo(EFaction.INNERSPHERE,"VICTOR",80,EMechclass.ASSAULT, EVariantType.STANDARD,"VICTOR VTR-9A1","VTR-9A1"));
        this.mechids.put(672,new MechIdInfo(EFaction.CLAN,"KITFOX",30,EMechclass.LIGHT, EVariantType.STANDARD,"KIT FOX KFX-G","KFX-G"));
        this.mechids.put(673,new MechIdInfo(EFaction.CLAN,"LINEBACKER",65,EMechclass.HEAVY, EVariantType.STANDARD,"LINEBACKER LBK-H","LBK-H"));
        this.mechids.put(674,new MechIdInfo(EFaction.CLAN,"SUNSPIDER",70,EMechclass.HEAVY, EVariantType.SPECIAL,"SUN SPIDER SNS-PRIME(S)","SNS-PRIME(S)"));
        this.mechids.put(675,new MechIdInfo(EFaction.CLAN,"SUNSPIDER",70,EMechclass.HEAVY, EVariantType.STANDARD,"SUN SPIDER SNS-PRIME","SNS-PRIME"));
        this.mechids.put(676,new MechIdInfo(EFaction.CLAN,"SUNSPIDER",70,EMechclass.HEAVY, EVariantType.STANDARD,"SUN SPIDER SNS-A","SNS-A"));
        this.mechids.put(677,new MechIdInfo(EFaction.CLAN,"SUNSPIDER",70,EMechclass.HEAVY, EVariantType.STANDARD,"SUN SPIDER SNS-B","SNS-B"));
        this.mechids.put(678,new MechIdInfo(EFaction.CLAN,"SUNSPIDER",70,EMechclass.HEAVY, EVariantType.STANDARD,"SUN SPIDER SNS-C","SNS-C"));
        this.mechids.put(679,new MechIdInfo(EFaction.CLAN,"SUNSPIDER",70,EMechclass.HEAVY, EVariantType.STANDARD,"SUN SPIDER SNS-D","SNS-D"));
        this.mechids.put(680,new MechIdInfo(EFaction.CLAN,"SUNSPIDER",70,EMechclass.HEAVY, EVariantType.HERO,"MANUL","SNS-ML"));
        this.mechids.put(681,new MechIdInfo(EFaction.CLAN,"SUNSPIDER",70,EMechclass.HEAVY, EVariantType.HERO,"VANGUARD","SNS-VG"));
        this.mechids.put(682,new MechIdInfo(EFaction.INNERSPHERE,"ROUGHNECK",65,EMechclass.HEAVY, EVariantType.HERO,"POWERHOUSE","RGH-PH"));
        this.mechids.put(683,new MechIdInfo(EFaction.INNERSPHERE,"FAFNIR",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"FAFNIR FNR-5(S)","FNR-5(S)"));
        this.mechids.put(684,new MechIdInfo(EFaction.INNERSPHERE,"FAFNIR",100,EMechclass.ASSAULT, EVariantType.STANDARD,"FAFNIR FNR-5","FNR-5"));
        this.mechids.put(685,new MechIdInfo(EFaction.INNERSPHERE,"FAFNIR",100,EMechclass.ASSAULT, EVariantType.STANDARD,"FAFNIR FNR-5B","FNR-5B"));
        this.mechids.put(686,new MechIdInfo(EFaction.INNERSPHERE,"FAFNIR",100,EMechclass.ASSAULT, EVariantType.STANDARD,"FAFNIR FNR-6U","FNR-6U"));
        this.mechids.put(687,new MechIdInfo(EFaction.INNERSPHERE,"FAFNIR",100,EMechclass.ASSAULT, EVariantType.STANDARD,"FAFNIR FNR-5E","FNR-5E"));
        this.mechids.put(688,new MechIdInfo(EFaction.INNERSPHERE,"FAFNIR",100,EMechclass.ASSAULT, EVariantType.STANDARD,"FAFNIR FNR-6R","FNR-6R"));
        this.mechids.put(689,new MechIdInfo(EFaction.INNERSPHERE,"FAFNIR",100,EMechclass.ASSAULT, EVariantType.HERO,"WRATH","FNR-WR"));
        this.mechids.put(690,new MechIdInfo(EFaction.INNERSPHERE,"URBANMECH",30,EMechclass.LIGHT, EVariantType.HERO,"STREET CLEANER","UM-SC"));
        this.mechids.put(691,new MechIdInfo(EFaction.INNERSPHERE,"FIRESTARTER",35,EMechclass.LIGHT, EVariantType.HERO,"FIRESTORM","FS9-FS"));
        this.mechids.put(692,new MechIdInfo(EFaction.INNERSPHERE,"GRIFFIN",55,EMechclass.MEDIUM, EVariantType.HERO,"ARES","GRF-AR"));
        this.mechids.put(693,new MechIdInfo(EFaction.INNERSPHERE,"RIFLEMAN",60,EMechclass.HEAVY, EVariantType.HERO,"DAO BREAKER","RFL-DB"));
        this.mechids.put(694,new MechIdInfo(EFaction.INNERSPHERE,"BANSHEE",95,EMechclass.ASSAULT, EVariantType.HERO,"SIREN","BNC-SR"));
        this.mechids.put(695,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.HERO,"KRAKEN","AS7-KR"));
        this.mechids.put(696,new MechIdInfo(EFaction.CLAN,"MADDOG",60,EMechclass.HEAVY, EVariantType.HERO,"REVENANT","MDD-RV"));
        this.mechids.put(697,new MechIdInfo(EFaction.INNERSPHERE,"NIGHTSTAR",95,EMechclass.ASSAULT, EVariantType.CHAMPION,"NIGHTSTAR NSR-9P(C)","NSR-9P(C)"));
        this.mechids.put(698,new MechIdInfo(EFaction.INNERSPHERE,"ROUGHNECK",65,EMechclass.HEAVY, EVariantType.CHAMPION,"ROUGHNECK RGH-1A(C)","RGH-1A(C)"));
        this.mechids.put(699,new MechIdInfo(EFaction.INNERSPHERE,"BUSHWACKER",55,EMechclass.MEDIUM, EVariantType.CHAMPION,"BUSHWACKER BSW-S2(C)","BSW-S2(C)"));
        this.mechids.put(700,new MechIdInfo(EFaction.INNERSPHERE,"ASSASSIN",40,EMechclass.MEDIUM, EVariantType.CHAMPION,"ASSASSIN ASN-101(C)","ASN-101(C)"));
        this.mechids.put(701,new MechIdInfo(EFaction.INNERSPHERE,"OSIRIS",30,EMechclass.LIGHT, EVariantType.CHAMPION,"OSIRIS OSR-1V(C)","OSR-1V(C)"));
        this.mechids.put(702,new MechIdInfo(EFaction.INNERSPHERE,"UZIEL",50,EMechclass.MEDIUM, EVariantType.CHAMPION,"UZIEL UZL-3P(C)","UZL-3P(C)"));
        this.mechids.put(703,new MechIdInfo(EFaction.CLAN,"MADDOG",60,EMechclass.HEAVY, EVariantType.CHAMPION,"MAD DOG MDD-C(C)","MDD-C(C)"));
        this.mechids.put(704,new MechIdInfo(EFaction.CLAN,"BLOODASP",90,EMechclass.ASSAULT, EVariantType.SPECIAL,"BLOOD ASP BAS-PRIME(S)","BAS-PRIME(S)"));
        this.mechids.put(705,new MechIdInfo(EFaction.CLAN,"BLOODASP",90,EMechclass.ASSAULT, EVariantType.STANDARD,"BLOOD ASP BAS-PRIME","BAS-PRIME"));
        this.mechids.put(706,new MechIdInfo(EFaction.CLAN,"BLOODASP",90,EMechclass.ASSAULT, EVariantType.STANDARD,"BLOOD ASP BAS-A","BAS-A"));
        this.mechids.put(707,new MechIdInfo(EFaction.CLAN,"BLOODASP",90,EMechclass.ASSAULT, EVariantType.STANDARD,"BLOOD ASP BAS-B","BAS-B"));
        this.mechids.put(708,new MechIdInfo(EFaction.CLAN,"BLOODASP",90,EMechclass.ASSAULT, EVariantType.STANDARD,"BLOOD ASP BAS-C","BAS-C"));
        this.mechids.put(709,new MechIdInfo(EFaction.CLAN,"BLOODASP",90,EMechclass.ASSAULT, EVariantType.STANDARD,"BLOOD ASP BAS-D","BAS-D"));
        this.mechids.put(710,new MechIdInfo(EFaction.CLAN,"BLOODASP",90,EMechclass.ASSAULT, EVariantType.HERO,"RANCOR","BAS-RA"));
        this.mechids.put(711,new MechIdInfo(EFaction.INNERSPHERE,"FLEA",20,EMechclass.LIGHT, EVariantType.SPECIAL,"FLEA FLE-17(S)","FLE-17(S)"));
        this.mechids.put(712,new MechIdInfo(EFaction.INNERSPHERE,"FLEA",20,EMechclass.LIGHT, EVariantType.STANDARD,"FLEA FLE-17","FLE-17"));
        this.mechids.put(713,new MechIdInfo(EFaction.INNERSPHERE,"FLEA",20,EMechclass.LIGHT, EVariantType.STANDARD,"FLEA FLE-15","FLE-15"));
        this.mechids.put(714,new MechIdInfo(EFaction.INNERSPHERE,"FLEA",20,EMechclass.LIGHT, EVariantType.STANDARD,"FLEA FLE-19","FLE-19"));
        this.mechids.put(715,new MechIdInfo(EFaction.INNERSPHERE,"FLEA",20,EMechclass.LIGHT, EVariantType.STANDARD,"FLEA FLE-20","FLE-20"));
        this.mechids.put(716,new MechIdInfo(EFaction.INNERSPHERE,"FLEA",20,EMechclass.LIGHT, EVariantType.STANDARD,"FLEA FLE-FA","FLE-FA"));
        this.mechids.put(717,new MechIdInfo(EFaction.INNERSPHERE,"FLEA",20,EMechclass.LIGHT, EVariantType.HERO,"ROMEO 5000","FLE-R5K"));
        this.mechids.put(718,new MechIdInfo(EFaction.CLAN,"HELLFIRE",60,EMechclass.HEAVY, EVariantType.SPECIAL,"HELLFIRE HLF-1(S)","HLF-1(S)"));
        this.mechids.put(719,new MechIdInfo(EFaction.CLAN,"HELLFIRE",60,EMechclass.HEAVY, EVariantType.STANDARD,"HELLFIRE HLF-1","HLF-1"));
        this.mechids.put(720,new MechIdInfo(EFaction.CLAN,"HELLFIRE",60,EMechclass.HEAVY, EVariantType.STANDARD,"HELLFIRE HLF-2","HLF-2"));
        this.mechids.put(721,new MechIdInfo(EFaction.CLAN,"HELLFIRE",60,EMechclass.HEAVY, EVariantType.STANDARD,"HELLFIRE HLF-A","HLF-A"));
        this.mechids.put(722,new MechIdInfo(EFaction.CLAN,"HELLFIRE",60,EMechclass.HEAVY, EVariantType.STANDARD,"HELLFIRE HLF-B","HLF-B"));
        this.mechids.put(723,new MechIdInfo(EFaction.CLAN,"HELLFIRE",60,EMechclass.HEAVY, EVariantType.STANDARD,"HELLFIRE HLF-C","HLF-C"));
        this.mechids.put(724,new MechIdInfo(EFaction.CLAN,"HELLFIRE",60,EMechclass.HEAVY, EVariantType.HERO,"VOID","HLF-VO"));
        this.mechids.put(725,new MechIdInfo(EFaction.INNERSPHERE,"VULCAN",40,EMechclass.MEDIUM, EVariantType.SPECIAL,"VULCAN VL-2T(S)","VL-2T(S)"));
        this.mechids.put(726,new MechIdInfo(EFaction.INNERSPHERE,"VULCAN",40,EMechclass.MEDIUM, EVariantType.STANDARD,"VULCAN VL-2T","VL-2T"));
        this.mechids.put(727,new MechIdInfo(EFaction.INNERSPHERE,"VULCAN",40,EMechclass.MEDIUM, EVariantType.STANDARD,"VULCAN VL-5T","VL-5T"));
        this.mechids.put(728,new MechIdInfo(EFaction.INNERSPHERE,"VULCAN",40,EMechclass.MEDIUM, EVariantType.STANDARD,"VULCAN VT-5M","VT-5M"));
        this.mechids.put(729,new MechIdInfo(EFaction.INNERSPHERE,"VULCAN",40,EMechclass.MEDIUM, EVariantType.STANDARD,"VULCAN VT-5S","VT-5S"));
        this.mechids.put(730,new MechIdInfo(EFaction.INNERSPHERE,"VULCAN",40,EMechclass.MEDIUM, EVariantType.STANDARD,"VULCAN VT-6M","VT-6M"));
        this.mechids.put(731,new MechIdInfo(EFaction.INNERSPHERE,"VULCAN",40,EMechclass.MEDIUM, EVariantType.HERO,"BLOODLUST","VL-BL"));
        this.mechids.put(732,new MechIdInfo(EFaction.CLAN,"INCUBUS",30,EMechclass.LIGHT, EVariantType.SPECIAL,"INCUBUS INC-1(S)","INC-1(S)"));
        this.mechids.put(733,new MechIdInfo(EFaction.CLAN,"INCUBUS",30,EMechclass.LIGHT, EVariantType.STANDARD,"INCUBUS INC-1","INC-1"));
        this.mechids.put(734,new MechIdInfo(EFaction.CLAN,"INCUBUS",30,EMechclass.LIGHT, EVariantType.STANDARD,"INCUBUS INC-2","INC-2"));
        this.mechids.put(735,new MechIdInfo(EFaction.CLAN,"INCUBUS",30,EMechclass.LIGHT, EVariantType.STANDARD,"INCUBUS INC-3","INC-3"));
        this.mechids.put(736,new MechIdInfo(EFaction.CLAN,"INCUBUS",30,EMechclass.LIGHT, EVariantType.STANDARD,"INCUBUS INC-4","INC-4"));
        this.mechids.put(737,new MechIdInfo(EFaction.CLAN,"INCUBUS",30,EMechclass.LIGHT, EVariantType.STANDARD,"INCUBUS INC-5","INC-5"));
        this.mechids.put(738,new MechIdInfo(EFaction.CLAN,"INCUBUS",30,EMechclass.LIGHT, EVariantType.HERO,"SABRE","INC-SA"));
        this.mechids.put(739,new MechIdInfo(EFaction.INNERSPHERE,"CHAMPION",60,EMechclass.HEAVY, EVariantType.SPECIAL,"CHAMPION CHP-1N(S)","CHP-1N(S)"));
        this.mechids.put(740,new MechIdInfo(EFaction.INNERSPHERE,"CHAMPION",60,EMechclass.HEAVY, EVariantType.STANDARD,"CHAMPION CHP-1N","CHP-1N"));
        this.mechids.put(741,new MechIdInfo(EFaction.INNERSPHERE,"CHAMPION",60,EMechclass.HEAVY, EVariantType.STANDARD,"CHAMPION CHP-2N","CHP-2N"));
        this.mechids.put(742,new MechIdInfo(EFaction.INNERSPHERE,"CHAMPION",60,EMechclass.HEAVY, EVariantType.STANDARD,"CHAMPION CHP-3N","CHP-3N"));
        this.mechids.put(743,new MechIdInfo(EFaction.INNERSPHERE,"CHAMPION",60,EMechclass.HEAVY, EVariantType.STANDARD,"CHAMPION CHP-1N2","CHP-1N2"));
        this.mechids.put(744,new MechIdInfo(EFaction.INNERSPHERE,"CHAMPION",60,EMechclass.HEAVY, EVariantType.STANDARD,"CHAMPION CHP-1NB","CHP-1NB"));
        this.mechids.put(745,new MechIdInfo(EFaction.INNERSPHERE,"CHAMPION",60,EMechclass.HEAVY, EVariantType.HERO,"INVICTUS","CHP-INV"));
        this.mechids.put(746,new MechIdInfo(EFaction.CLAN,"VAPOREAGLE",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"VAPOR EAGLE VGL-1(S)","VGL-1(S)"));
        this.mechids.put(747,new MechIdInfo(EFaction.CLAN,"VAPOREAGLE",55,EMechclass.MEDIUM, EVariantType.STANDARD,"VAPOR EAGLE VGL-1","VGL-1"));
        this.mechids.put(748,new MechIdInfo(EFaction.CLAN,"VAPOREAGLE",55,EMechclass.MEDIUM, EVariantType.STANDARD,"VAPOR EAGLE VGL-2","VGL-2"));
        this.mechids.put(749,new MechIdInfo(EFaction.CLAN,"VAPOREAGLE",55,EMechclass.MEDIUM, EVariantType.STANDARD,"VAPOR EAGLE VGL-3","VGL-3"));
        this.mechids.put(750,new MechIdInfo(EFaction.CLAN,"VAPOREAGLE",55,EMechclass.MEDIUM, EVariantType.STANDARD,"VAPOR EAGLE VGL-4","VGL-4"));
        this.mechids.put(751,new MechIdInfo(EFaction.CLAN,"VAPOREAGLE",55,EMechclass.MEDIUM, EVariantType.STANDARD,"VAPOR EAGLE VGL-A","VGL-A"));
        this.mechids.put(752,new MechIdInfo(EFaction.CLAN,"VAPOREAGLE",55,EMechclass.MEDIUM, EVariantType.HERO,"RIVAL","VGL-RI"));
        this.mechids.put(753,new MechIdInfo(EFaction.INNERSPHERE,"JAVELIN",30,EMechclass.LIGHT, EVariantType.SPECIAL,"JAVELIN JVN-11F(L)","JVN-11F(L)"));
        this.mechids.put(754,new MechIdInfo(EFaction.INNERSPHERE,"RIFLEMAN",60,EMechclass.HEAVY, EVariantType.SPECIAL,"RIFLEMAN RFL-8D(L)","RFL-8D(L)"));
        this.mechids.put(755,new MechIdInfo(EFaction.INNERSPHERE,"WARHAMMER",70,EMechclass.HEAVY, EVariantType.SPECIAL,"WARHAMMER WHM-4L(L)","WHM-4L(L)"));
        this.mechids.put(756,new MechIdInfo(EFaction.CLAN,"NIGHTGYR",75,EMechclass.HEAVY, EVariantType.SPECIAL,"NIGHT GYR NTG-H(L)","NTG-H(L)"));
        this.mechids.put(757,new MechIdInfo(EFaction.CLAN,"MARAUDERIIC",85,EMechclass.ASSAULT, EVariantType.SPECIAL,"MARAUDER IIC MAD-IIC-2(L)","MAD-IIC-2(L)"));
        this.mechids.put(758,new MechIdInfo(EFaction.INNERSPHERE,"CHARGER",80,EMechclass.ASSAULT, EVariantType.SPECIAL,"CHARGER CGR-1A1(S)","CGR-1A1(S)"));
        this.mechids.put(759,new MechIdInfo(EFaction.INNERSPHERE,"CHARGER",80,EMechclass.ASSAULT, EVariantType.STANDARD,"CHARGER CGR-1A1","CGR-1A1"));
        this.mechids.put(760,new MechIdInfo(EFaction.INNERSPHERE,"CHARGER",80,EMechclass.ASSAULT, EVariantType.STANDARD,"CHARGER CGR-1A5","CGR-1A5"));
        this.mechids.put(761,new MechIdInfo(EFaction.INNERSPHERE,"CHARGER",80,EMechclass.ASSAULT, EVariantType.STANDARD,"CHARGER CGR-3K","CGR-3K"));
        this.mechids.put(762,new MechIdInfo(EFaction.INNERSPHERE,"CHARGER",80,EMechclass.ASSAULT, EVariantType.HERO,"NUMBER SEVEN","CGR-N7"));
        this.mechids.put(763,new MechIdInfo(EFaction.INNERSPHERE,"HATAMOTOCHI",80,EMechclass.ASSAULT, EVariantType.SPECIAL,"HATAMOTO-CHI HTM-27T(S)","HTM-27T(S)"));
        this.mechids.put(764,new MechIdInfo(EFaction.INNERSPHERE,"HATAMOTOCHI",80,EMechclass.ASSAULT, EVariantType.STANDARD,"HATAMOTO-CHI HTM-27T","HTM-27T"));
        this.mechids.put(765,new MechIdInfo(EFaction.INNERSPHERE,"HATAMOTOCHI",80,EMechclass.ASSAULT, EVariantType.STANDARD,"HATAMOTO-KU HTM-27W","HTM-27W"));
        this.mechids.put(766,new MechIdInfo(EFaction.INNERSPHERE,"HATAMOTOCHI",80,EMechclass.ASSAULT, EVariantType.STANDARD,"HATAMOTO-CHI HTM-28TR","HTM-28TR"));
        this.mechids.put(767,new MechIdInfo(EFaction.INNERSPHERE,"HATAMOTOCHI",80,EMechclass.ASSAULT, EVariantType.HERO,"SHUGO","HTM-SG"));
        this.mechids.put(768,new MechIdInfo(EFaction.CLAN,"WARHAMMERIIC",80,EMechclass.ASSAULT, EVariantType.SPECIAL,"WARHAMMER IIC WHM-IIC(S)","WHM-IIC(S)"));
        this.mechids.put(769,new MechIdInfo(EFaction.CLAN,"WARHAMMERIIC",80,EMechclass.ASSAULT, EVariantType.STANDARD,"WARHAMMER IIC WHM-IIC","WHM-IIC"));
        this.mechids.put(770,new MechIdInfo(EFaction.CLAN,"WARHAMMERIIC",80,EMechclass.ASSAULT, EVariantType.STANDARD,"WARHAMMER IIC WHM-IIC-2","WHM-IIC-2"));
        this.mechids.put(771,new MechIdInfo(EFaction.CLAN,"WARHAMMERIIC",80,EMechclass.ASSAULT, EVariantType.STANDARD,"WARHAMMER IIC WHM-IIC-3","WHM-IIC-3"));
        this.mechids.put(772,new MechIdInfo(EFaction.CLAN,"WARHAMMERIIC",80,EMechclass.ASSAULT, EVariantType.STANDARD,"WARHAMMER IIC WHM-IIC-4","WHM-IIC-4"));
        this.mechids.put(773,new MechIdInfo(EFaction.CLAN,"WARHAMMERIIC",80,EMechclass.ASSAULT, EVariantType.STANDARD,"WARHAMMER IIC WHM-IIC-10","WHM-IIC-10"));
        this.mechids.put(774,new MechIdInfo(EFaction.CLAN,"WARHAMMERIIC",80,EMechclass.ASSAULT, EVariantType.HERO,"MAUL","WHM-IIC-ML"));
        this.mechids.put(775,new MechIdInfo(EFaction.CLAN,"WARHAMMERIIC",80,EMechclass.ASSAULT, EVariantType.HERO,"BLUDGEON","WHM-IIC-BL"));
        this.mechids.put(776,new MechIdInfo(EFaction.INNERSPHERE,"JAVELIN",30,EMechclass.LIGHT, EVariantType.STANDARD,"JAVELIN JVN-11F","JVN-11F"));
        this.mechids.put(777,new MechIdInfo(EFaction.INNERSPHERE,"RIFLEMAN",60,EMechclass.HEAVY, EVariantType.STANDARD,"RIFLEMAN RFL-8D","RFL-8D"));
        this.mechids.put(778,new MechIdInfo(EFaction.INNERSPHERE,"WARHAMMER",70,EMechclass.HEAVY, EVariantType.STANDARD,"WARHAMMER WHM-4L","WHM-4L"));
        this.mechids.put(779,new MechIdInfo(EFaction.CLAN,"NIGHTGYR",75,EMechclass.HEAVY, EVariantType.STANDARD,"NIGHT GYR NTG-H","NTG-H"));
        this.mechids.put(780,new MechIdInfo(EFaction.CLAN,"MARAUDERIIC",85,EMechclass.ASSAULT, EVariantType.STANDARD,"MARAUDER IIC MAD-IIC-2","MAD-IIC-2"));
        this.mechids.put(781,new MechIdInfo(EFaction.CLAN,"WARHAMMERIIC",80,EMechclass.ASSAULT, EVariantType.STANDARD,"WARHAMMER IIC WHM-IIC-A","WHM-IIC-A"));
        this.mechids.put(782,new MechIdInfo(EFaction.INNERSPHERE,"CORSAIR",95,EMechclass.ASSAULT, EVariantType.SPECIAL,"CORSAIR COR-5R(S)","COR-5R(S)"));
        this.mechids.put(783,new MechIdInfo(EFaction.INNERSPHERE,"CORSAIR",95,EMechclass.ASSAULT, EVariantType.STANDARD,"CORSAIR COR-5R","COR-5R"));
        this.mechids.put(784,new MechIdInfo(EFaction.INNERSPHERE,"CORSAIR",95,EMechclass.ASSAULT, EVariantType.STANDARD,"CORSAIR COR-6R","COR-6R"));
        this.mechids.put(785,new MechIdInfo(EFaction.INNERSPHERE,"CORSAIR",95,EMechclass.ASSAULT, EVariantType.STANDARD,"CORSAIR COR-7A","COR-7A"));
        this.mechids.put(786,new MechIdInfo(EFaction.INNERSPHERE,"CORSAIR",95,EMechclass.ASSAULT, EVariantType.STANDARD,"CORSAIR COR-5T","COR-5T"));
        this.mechids.put(787,new MechIdInfo(EFaction.INNERSPHERE,"CORSAIR",95,EMechclass.ASSAULT, EVariantType.STANDARD,"CORSAIR COR-7R","COR-7R"));
        this.mechids.put(788,new MechIdInfo(EFaction.INNERSPHERE,"CORSAIR",95,EMechclass.ASSAULT, EVariantType.HERO,"RAVAGER","COR-RA"));
        this.mechids.put(789,new MechIdInfo(EFaction.INNERSPHERE,"CORSAIR",95,EMechclass.ASSAULT, EVariantType.HERO,"BROADSIDE","COR-BR"));
        this.mechids.put(790,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDERII",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"MARAUDER II MAD-4A(S)","MAD-4A(S)"));
        this.mechids.put(791,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDERII",100,EMechclass.ASSAULT, EVariantType.STANDARD,"MARAUDER II MAD-4A","MAD-4A"));
        this.mechids.put(792,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDERII",100,EMechclass.ASSAULT, EVariantType.STANDARD,"MARAUDER II MAD-4HP","MAD-4HP"));
        this.mechids.put(793,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDERII",100,EMechclass.ASSAULT, EVariantType.STANDARD,"MARAUDER II MAD-5A","MAD-5A"));
        this.mechids.put(794,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDERII",100,EMechclass.ASSAULT, EVariantType.STANDARD,"MARAUDER II MAD-4L","MAD-4L"));
        this.mechids.put(795,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDERII",100,EMechclass.ASSAULT, EVariantType.STANDARD,"MARAUDER II MAD-6S","MAD-6S"));
        this.mechids.put(796,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDERII",100,EMechclass.ASSAULT, EVariantType.HERO,"ALPHA","MAD-AL"));
        this.mechids.put(797,new MechIdInfo(EFaction.CLAN,"RIFLEMANIIC",65,EMechclass.HEAVY, EVariantType.SPECIAL,"RIFLEMAN IIC RFL-IIC(S)","RFL-IIC(S)"));
        this.mechids.put(798,new MechIdInfo(EFaction.CLAN,"RIFLEMANIIC",65,EMechclass.HEAVY, EVariantType.STANDARD,"RIFLEMAN IIC RFL-IIC","RFL-IIC"));
        this.mechids.put(799,new MechIdInfo(EFaction.CLAN,"RIFLEMANIIC",65,EMechclass.HEAVY, EVariantType.STANDARD,"RIFLEMAN IIC RFL-IIC-2","RFL-IIC-2"));
        this.mechids.put(800,new MechIdInfo(EFaction.CLAN,"RIFLEMANIIC",65,EMechclass.HEAVY, EVariantType.STANDARD,"RIFLEMAN IIC RFL-IIC-3","RFL-IIC-3"));
        this.mechids.put(801,new MechIdInfo(EFaction.CLAN,"RIFLEMANIIC",65,EMechclass.HEAVY, EVariantType.STANDARD,"RIFLEMAN IIC RFL-IIC-4","RFL-IIC-4"));
        this.mechids.put(802,new MechIdInfo(EFaction.CLAN,"RIFLEMANIIC",65,EMechclass.HEAVY, EVariantType.STANDARD,"RIFLEMAN IIC RFL-IIC-A","RFL-IIC-A"));
        this.mechids.put(803,new MechIdInfo(EFaction.CLAN,"RIFLEMANIIC",65,EMechclass.HEAVY, EVariantType.HERO,"CHIRONEX","RFL-IIC-CH"));
        this.mechids.put(804,new MechIdInfo(EFaction.INNERSPHERE,"CATAPULT",65,EMechclass.HEAVY, EVariantType.SPECIAL,"CATAPULT CPLT-C2(S)","CPLT-C2(S)"));
        this.mechids.put(805,new MechIdInfo(EFaction.INNERSPHERE,"WARHAMMER",70,EMechclass.HEAVY, EVariantType.SPECIAL,"WARHAMMER WHM-9D(S)","WHM-9D(S)"));
        this.mechids.put(806,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDER",75,EMechclass.HEAVY, EVariantType.SPECIAL,"MARAUDER MAD-9M(S)","MAD-9M(S)"));
        this.mechids.put(807,new MechIdInfo(EFaction.INNERSPHERE,"KINGCRAB",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"KING CRAB KGC-001(S)","KGC-001(S)"));
        this.mechids.put(808,new MechIdInfo(EFaction.INNERSPHERE,"DERVISH",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"DERVISH DV-6M(S)","DV-6M(S)"));
        this.mechids.put(809,new MechIdInfo(EFaction.INNERSPHERE,"DERVISH",55,EMechclass.MEDIUM, EVariantType.STANDARD,"DERVISH DV-6M","DV-6M"));
        this.mechids.put(810,new MechIdInfo(EFaction.INNERSPHERE,"DERVISH",55,EMechclass.MEDIUM, EVariantType.STANDARD,"DERVISH DV-7D","DV-7D"));
        this.mechids.put(811,new MechIdInfo(EFaction.INNERSPHERE,"DERVISH",55,EMechclass.MEDIUM, EVariantType.STANDARD,"DERVISH DV-8D","DV-8D"));
        this.mechids.put(812,new MechIdInfo(EFaction.INNERSPHERE,"DERVISH",55,EMechclass.MEDIUM, EVariantType.STANDARD,"DERVISH DV-6MR","DV-6MR"));
        this.mechids.put(813,new MechIdInfo(EFaction.INNERSPHERE,"DERVISH",55,EMechclass.MEDIUM, EVariantType.STANDARD,"DERVISH DV-7P","DV-7P"));
        this.mechids.put(814,new MechIdInfo(EFaction.INNERSPHERE,"DERVISH",55,EMechclass.MEDIUM, EVariantType.HERO,"FRENZY","DV-FR"));
        this.mechids.put(815,new MechIdInfo(EFaction.INNERSPHERE,"CATAPULT",65,EMechclass.HEAVY, EVariantType.STANDARD,"CATAPULT CPLT-C2","CPLT-C2"));
        this.mechids.put(816,new MechIdInfo(EFaction.INNERSPHERE,"WARHAMMER",70,EMechclass.HEAVY, EVariantType.STANDARD,"WARHAMMER WHM-9D","WHM-9D"));
        this.mechids.put(817,new MechIdInfo(EFaction.INNERSPHERE,"MARAUDER",75,EMechclass.HEAVY, EVariantType.STANDARD,"MARAUDER MAD-9M","MAD-9M"));
        this.mechids.put(818,new MechIdInfo(EFaction.INNERSPHERE,"KINGCRAB",100,EMechclass.ASSAULT, EVariantType.STANDARD,"KING CRAB KGC-001","KGC-001"));
        this.mechids.put(819,new MechIdInfo(EFaction.INNERSPHERE,"LOCUST",20,EMechclass.LIGHT, EVariantType.SPECIAL,"LOCUST LCT-1V(S)","LCT-1V(S)"));
        this.mechids.put(820,new MechIdInfo(EFaction.INNERSPHERE,"SHADOWHAWK",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"SHADOW HAWK SHD-2H(S)","SHD-2H(S)"));
        this.mechids.put(821,new MechIdInfo(EFaction.INNERSPHERE,"THUNDERBOLT",65,EMechclass.HEAVY, EVariantType.SPECIAL,"THUNDERBOLT TDR-5S(S)","TDR-5S(S)"));
        this.mechids.put(822,new MechIdInfo(EFaction.INNERSPHERE,"BATTLEMASTER",85,EMechclass.ASSAULT, EVariantType.SPECIAL,"BATTLEMASTER BLR-1G(S)","BLR-1G(S)"));
        this.mechids.put(823,new MechIdInfo(EFaction.INNERSPHERE,"GRIFFIN",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"GRIFFIN GRF-1N(S)","GRF-1N(S)"));
        this.mechids.put(824,new MechIdInfo(EFaction.INNERSPHERE,"WOLVERINE",55,EMechclass.MEDIUM, EVariantType.SPECIAL,"WOLVERINE WVR-6R(S)","WVR-6R(S)"));
        this.mechids.put(825,new MechIdInfo(EFaction.INNERSPHERE,"URBANMECH",30,EMechclass.LIGHT, EVariantType.HERO,"SNOWBALL","UM-R60L(S)"));
        this.mechids.put(826,new MechIdInfo(EFaction.INNERSPHERE,"PHOENIXHAWK",45,EMechclass.MEDIUM, EVariantType.HERO,"FIREBALL","PXH-1K(S)"));
        this.mechids.put(827,new MechIdInfo(EFaction.INNERSPHERE,"THUNDERBOLT",65,EMechclass.HEAVY, EVariantType.SPECIAL,"THUNDERBOLT TDR-10SE(S)","TDR-10SE(S)"));
        this.mechids.put(828,new MechIdInfo(EFaction.INNERSPHERE,"DRAGON",60,EMechclass.HEAVY, EVariantType.SPECIAL,"GRAND DRAGON DRG-1G(S)","DRG-1G(S)"));
        this.mechids.put(829,new MechIdInfo(EFaction.INNERSPHERE,"THUNDERBOLT",65,EMechclass.HEAVY, EVariantType.STANDARD,"THUNDERBOLT TDR-10SE","TDR-10SE"));
        this.mechids.put(830,new MechIdInfo(EFaction.INNERSPHERE,"DRAGON",60,EMechclass.HEAVY, EVariantType.STANDARD,"GRAND DRAGON DRG-1G","DRG-1G"));
        this.mechids.put(831,new MechIdInfo(EFaction.CLAN,"TIMBERWOLF",75,EMechclass.HEAVY, EVariantType.SPECIAL,"TIMBER WOLF TBR-BH(S)","TBR-BH(S)"));
        this.mechids.put(832,new MechIdInfo(EFaction.CLAN,"DIREWOLF",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"DIRE WOLF DWF-C(S)","DWF-C(S)"));
        this.mechids.put(833,new MechIdInfo(EFaction.CLAN,"TIMBERWOLF",75,EMechclass.HEAVY, EVariantType.STANDARD,"TIMBER WOLF TBR-BH","TBR-BH"));
        this.mechids.put(834,new MechIdInfo(EFaction.CLAN,"DIREWOLF",100,EMechclass.ASSAULT, EVariantType.STANDARD,"DIRE WOLF DWF-C","DWF-C"));
        this.mechids.put(835,new MechIdInfo(EFaction.INNERSPHERE,"PHOENIXHAWK",45,EMechclass.MEDIUM, EVariantType.STANDARD,"PHOENIX HAWK PXH-7S","PXH-7S"));
        this.mechids.put(836,new MechIdInfo(EFaction.INNERSPHERE,"PHOENIXHAWK",45,EMechclass.MEDIUM, EVariantType.SPECIAL,"PHOENIX HAWK PXH-7S(S)","PXH-7S(S)"));
        this.mechids.put(837,new MechIdInfo(EFaction.INNERSPHERE,"STALKER",85,EMechclass.ASSAULT, EVariantType.STANDARD,"STALKER STK-7D","STK-7D"));
        this.mechids.put(838,new MechIdInfo(EFaction.INNERSPHERE,"STALKER",85,EMechclass.ASSAULT, EVariantType.SPECIAL,"STALKER STK-7D(S)","STK-7D(S)"));
        this.mechids.put(839,new MechIdInfo(EFaction.INNERSPHERE,"URBANMECH",30,EMechclass.LIGHT, EVariantType.STANDARD,"URBANMECH UM-R80","UM-R80"));
        this.mechids.put(840,new MechIdInfo(EFaction.INNERSPHERE,"URBANMECH",30,EMechclass.LIGHT, EVariantType.SPECIAL,"URBANMECH UM-R80(L)","UM-R80(L)"));
        this.mechids.put(841,new MechIdInfo(EFaction.CLAN,"VIPER",40,EMechclass.MEDIUM, EVariantType.STANDARD,"VIPER VPR-F","VPR-F"));
        this.mechids.put(842,new MechIdInfo(EFaction.CLAN,"VIPER",40,EMechclass.MEDIUM, EVariantType.SPECIAL,"VIPER VPR-F(L)","VPR-F(L)"));
        this.mechids.put(843,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.STANDARD,"ATLAS AS7-K3","AS7-K3"));
        this.mechids.put(844,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"ATLAS AS7-K3(L)","AS7-K3(L)"));
        this.mechids.put(845,new MechIdInfo(EFaction.CLAN,"NIGHTGYR",75,EMechclass.HEAVY, EVariantType.SPECIAL,"NIGHT GYR NTG-D(CS)","NTG-D(CS)"));
        this.mechids.put(846,new MechIdInfo(EFaction.INNERSPHERE,"ROUGHNECK",65,EMechclass.HEAVY, EVariantType.HERO,"BOLT","RGH-BLT"));
        this.mechids.put(847,new MechIdInfo(EFaction.CLAN,"SUNSPIDER",70,EMechclass.HEAVY, EVariantType.HERO,"AMBUSH","SNS-AMB"));
        this.mechids.put(848,new MechIdInfo(EFaction.INNERSPHERE,"MAULER",90,EMechclass.ASSAULT, EVariantType.SPECIAL,"MAULER MAL-2P(S)","MAL-2P(S)"));
        this.mechids.put(849,new MechIdInfo(EFaction.CLAN,"MARAUDERIIC",85,EMechclass.ASSAULT, EVariantType.SPECIAL,"MARAUDER IIC MAD-IIC-A(S)","MAD-IIC-A(S)"));
        this.mechids.put(990,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.STANDARD,"ATLAS AS7-D-DC","AS7-D-DC"));
        this.mechids.put(996,new MechIdInfo(EFaction.INNERSPHERE,"JENNER",35,EMechclass.LIGHT, EVariantType.SPECIAL,"JENNER JR7-D(F)","JR7-D(F)"));
        this.mechids.put(997,new MechIdInfo(EFaction.INNERSPHERE,"CATAPULT",65,EMechclass.HEAVY, EVariantType.SPECIAL,"CATAPULT CPLT-C1(F)","CPLT-C1(F)"));
        this.mechids.put(998,new MechIdInfo(EFaction.INNERSPHERE,"HUNCHBACK",50,EMechclass.MEDIUM, EVariantType.SPECIAL,"HUNCHBACK HBK-4G(F)","HBK-4G(F)"));
        this.mechids.put(999,new MechIdInfo(EFaction.INNERSPHERE,"ATLAS",100,EMechclass.ASSAULT, EVariantType.SPECIAL,"ATLAS AS7-D(F)","AS7-D(F)"));

    }

    /**
     * Überprüft, ob es eine gültige MechItemId ist.
     *
     * @param MechItemID Die (int) Id von der MWO Api
     * @return Gibt den (Boolean) Wahrheitswert zurück
     */
    public Boolean IsValidId(Integer MechItemID){

        return this.mechids.containsKey(MechItemID);
    }

    /**
     * Die (int) Tonnage des Mech's wird zurückgegeben.
     *
     * @param MechItemID Die (int) MechItemId von der MWO Api,
     * @return Gibt die (int) Tonnage des Mech's zurück.
     */
    public Integer getTonnage(Integer MechItemID) {

        return IsValidId(MechItemID) ? this.mechids.get(MechItemID).tonnage : 0;

    }

    /**
     * Die (Enum) Fraktion wird zurückgegeben.
     *
     * @param MechItemID Die (int) MechItemId von der MWO Api.
     * @return Gibt die (Enum) Fraktion des Mech's zurück.
     */
    public EFaction getFaction(Integer MechItemID) {

        return IsValidId(MechItemID) ? this.mechids.get(MechItemID).faction : EFaction.UNKNOWN;

    }

    /**
     * Die (String) Chassis des Mech's wird zurückgegeben.
     *
     * @param MechItemID Die (int) MechItemId von der MWO Api.
     * @return Gibt (String) Chassis des Mech's zurück.
     */
    public String getChassis(Integer MechItemID) {

        return IsValidId(MechItemID) ? this.mechids.get(MechItemID).chassis : this.msginvalidid;

    }

    /**
     * Die (Enum) Mechklasse wird zurückgegeben:
     *
     * @param MechItemID Die (int) MechItemId von der MWO Api.
     * @return Gibt die (Enum) Mechklasse zurück.
     */
    public EMechclass getMechclass(Integer MechItemID) {

        return IsValidId(MechItemID) ? this.mechids.get(MechItemID).mechclass : EMechclass.UNKNOWN;

    }

    /**
     * Die (String) Variante des Mech's wird zurückgegeben.
     *
     * <p>Die (String) Werte die er zurückgeben kann ist: CHAMPION, HERO, SPECIAL und STANDARD</p>
     *
     * @param MechItemID Die (int) MechItemId von der MWO Api.
     * @return Gibt die (String) Variant zurück.
     */
    public EVariantType getVarianttype(Integer MechItemID) {

        return IsValidId(MechItemID) ? this.mechids.get(MechItemID).varianttype : EVariantType.UNKNOWN;

    }

    /**
     * Der Vollständige (String) Mechname wird zurückgegeben.
     *
     * <p>Ein Beispielname wäre: GARGOYLE GAR-PRIME(I)</p>
     *
     * @param MechItemID Die (int) MechItemId von der MWO Api.
     * @return Gib den (String) vollständigen Mechnamen zurück.
     */
    public String getFullname(Integer MechItemID) {

        return IsValidId(MechItemID) ? this.mechids.get(MechItemID).fullname : this.msginvalidid;

    }

    /**
     * Die Kurzform des (String) Mech'snamens wird zurückgeben.
     *
     * <p>Ein Beispiel wäre: GAR-PRIME(I)</p>
     *
     * @param MechItemID Die (int) MechItemId von der MWO Api.
     * @return Gibt die Kurzform des (String) Mech'snamens zurück.
     */
    public String getShortname(Integer MechItemID) {

        return IsValidId(MechItemID) ? this.mechids.get(MechItemID).shortname : this.msginvalidid;

    }

    /**
     * Löscht die (HashMap) die mit {@link #MechIdInfo()} initialesiert wurde.
     */
    public void Unload() {

        this.mechids.clear();

    }
}
