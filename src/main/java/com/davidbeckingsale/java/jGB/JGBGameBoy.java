/** GameBoy.java --- 
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
 * Class for a GameBoy, inherits from GBComponent 
 *
 * Created: 09/12/10
 *
 * @author David Beckingsale
 * @version 1
 * @since 12/09/2010
 */
public class JGBGameBoy extends JGBComponent {



  public void init(JGBGameBoy gameBoy, JGBLog log) {
    super.init(gameBoy, log);
  }



  public void terminate() {}



  public void reset() {}


/**
   * Method controlling the emulation
   */
  public void emulate() {
    log_.Write("Gameboy", "Emulation started");
  }
} // GameBoy
