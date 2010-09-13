/** CpuZ80.java --- 
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
 * Emulated z80 cpu, not the same as the normal z80, as there are
 * differences
 *
 * Created: 09/11/10
 *
 * @author David Beckingsale
 * @version 1
 * @since 11/9/2010
 */
public class JGBZ80 extends JGBComponent {
  //Registers
  private byte I;
  private byte R; // R - memory refresh register
  private byte A;
  // F is the flag register, the structure is as follows:
  // Bit 7 - S flag, high is op result negative
  // bit 6 - Z flag, high if result 0
  // Bit 5 - Copy of bit 5 of the result of the operation
  // Bit 4 - H flag, carry from bit 3 to 4 of operation
  // Bit 3 - Copy of bit 3 of the result of the operation
  // Bit 2 - P/V flag, contains overflow or parity
  // Bit 1 - N flag, high if last op was subtraction
  // Bit 0 - C flag, high if result does not fit in register
  private byte F;

  private byte BC;
  private byte DE;
  private byte HL;
  private byte SP;
  private byte PC;



  /**
   * Constructor to initialise all registers to empty
   */
  public CpuZ80(){
    Reset(); // Reset is used to initialise values to avoid repetion
             // of "register = 0" statements
  }



  /**
   * Resets all internal registers as well as timers and program
   * counter
  */
  private void Reset() {
    Log.Write("CPUz80", "Resetting");

    I = 0;
    R = 0;
    A = 0;
    F = 0;
    BC = 0;
    DE = 0;
    HL = 0;
    SP = 0;
    PC = 0;
  }



  // Ops start here, grouped by function, one line between each,
  // standard 3 blank lines left between different blocks
  public void ADD_hl_s(byte ss, byte HL) {
    this.HL = ss + HL;
  }

  
} // CpuZ80
