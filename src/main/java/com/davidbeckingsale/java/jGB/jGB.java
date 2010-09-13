/** jGB.java --- 
 *
 * Copyright (C) 2010 
 *
 * Author:  <david@blackmesa>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2, or (at
 * your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; see the file COPYING.  If not, write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301, USA.
 */

package com.davidbeckingsale.java.jGB;

/**
 * Class used when jGB is run. Sets up the emulation environment,
 * initialising all objects before beginning the emulation
 *
 * Created: 09/12/10
 *
 * @author David Beckingsale
 * @version 1
 * @since 12/09/2010
 */
public class jGB {
  JGBGameBoy gameBoy;



  public static void main(String[] args) {
    gameBoy = new JGBGameBoy();
    log = new Log();

    gameBoy.init(gameBoy, log);
    gameBoy.emulate();
  }
} // jGB
