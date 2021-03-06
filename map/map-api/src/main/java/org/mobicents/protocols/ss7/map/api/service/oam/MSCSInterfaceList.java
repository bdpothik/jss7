/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2013, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package org.mobicents.protocols.ss7.map.api.service.oam;

import java.io.Serializable;

/**
 *
 MSC-S-InterfaceList ::= BIT STRING { a (0), iu (1), mc (2), map-g (3), map-b (4), map-e (5), map-f (6), cap (7), map-d (8),
 * map-c (9)} (SIZE (10..16)) -- Other bits than listed above shall be discarded.
 *
 *
 * @author sergey vetyutnev
 *
 */
public interface MSCSInterfaceList extends Serializable {

    boolean getA();

    boolean getIu();

    boolean getMc();

    boolean getMapG();

    boolean getMapB();

    boolean getMapE();

    boolean getMapF();

    boolean getCap();

    boolean getMapD();

    boolean getMapC();

}
