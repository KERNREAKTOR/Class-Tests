/*
 *  ---------------------------------------------------------------- |
 *     ____ _____                                                    |
 *    / ___|___ /                   Communicate - Command - Control  |
 *   | |     |_ \                   MK V "Cerberus"                  |
 *   | |___ ___) |                                                   |
 *    \____|____/                                                    |
 *                                                                   |
 *  ---------------------------------------------------------------- |
 *  Info        : https://www.clanwolf.net                           |
 *  GitHub      : https://github.com/ClanWolf                        |
 *  ---------------------------------------------------------------- |
 *  Licensed under the Apache License, Version 2.0 (the "License");  |
 *  you may not use this file except in compliance with the License. |
 *  You may obtain a copy of the License at                          |
 *  http://www.apache.org/licenses/LICENSE-2.0                       |
 *                                                                   |
 *  Unless required by applicable law or agreed to in writing,       |
 *  software distributed under the License is distributed on an "AS  |
 *  IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either  |
 *  express or implied. See the License for the specific language    |
 *  governing permissions and limitations under the License.         |
 *                                                                   |
 *  C3 includes libraries and source code by various authors.        |
 *  Copyright (c) 2001-2022, ClanWolf.net                            |
 *  ---------------------------------------------------------------- |
 */

package mechInfo;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MechReader {
    private final ArrayList<Mech> Mechs = new ArrayList<>();

    public void readXML(String xmlFile) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Mech");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    String id = eElement.getAttribute("id");
                    String name = eElement.getAttribute("name");
                    String faction = eElement.getAttribute("faction");
                    String chassis = eElement.getAttribute("chassis");
                    Mechs.add(new Mech(id, name, faction, chassis));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Mech> getMechs() {
        return Mechs;
    }

    public static class Mech {
        private final String id;
        private final String name;
        private final String faction;
        private final String chassis;
        private int tons;

        private static final Map<String, Integer> tonnageMap = new HashMap<>();

        static {
            tonnageMap.put("hunchback", 40);
            tonnageMap.put("jenner", 35);
            tonnageMap.put("commando", 25);
            tonnageMap.put("centurion", 50);
        }

        public Mech(String id, String name, String faction, String chassis) {
            this.id = id;
            this.name = name;
            this.faction = faction;
            this.chassis = chassis;
            setTonnage();
        }

        private void setTonnage() {
            tons = tonnageMap.getOrDefault(chassis, 0);
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getFaction() {
            return faction;
        }

        public String getChassis() {
            return chassis;
        }

        public int getTons() {
            return tons;
        }
    }
}
