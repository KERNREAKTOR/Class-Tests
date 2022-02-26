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

public class WeaponIdInfo {

    private Integer MechItemId;
    private String WeaponName;
    private Double Damage;

    public WeaponIdInfo(String MBC){



    }

    public Integer getMechItemId() {
        return MechItemId;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public Double getDamage() {
        return Damage;
    }
}
