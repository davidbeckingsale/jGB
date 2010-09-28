/** JGBMmu.java ---
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



import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.IOException;



/**
 *
 *
 * Created: 09/15/10
 *
 * @author
 * @version
 * @since
 */
public class JgbMmu extends JgbComponent {
  private byte[] rom_;

  public void init(JgbGameboy gameBoy, JgbLog log) {
    super.init(gameBoy, log);
  }

  public void reset() {

  }

  public void terminate() {

  }



  public int readWord(int address) {
    switch (address & 0xFFFF) {
    case 0xFFFF:;
    case 0xFF80:;
    case 0xFF4C:;
    case 0xFF00:;
    case 0xFE00:;
    case 0xE000:;
    case 0xC000:;
    case 0xA000:;
    case 0x8000:;
    case 0x6000:;
    case 0x4000:;
    case 0x2000:;
    case 0x0000: return rom_[address];
    default: return 0;
    }
  }

  public void readByte(int address) {
    switch (address & 0xFF) {

    }
  }
  /**
   * Loads a rom file into the virtual memory - an array of bytes
   *
   *@param romFile The file object of the rom to be loaded
   *@throws IOExcpetion Throws an exception if the file cannot be completely read
   */
  public void loadRom(File romFile) throws IOException {
    log_.write("Mmu", "Loading File");

    InputStream is = new FileInputStream(romFile);

    // Get the size of the file
    long length = romFile.length();

    if (length > Integer.MAX_VALUE) {
      // File is too large
      log_.write("Mmu", "ROM file too large for a byte array!");
      throw new IOException("File too large for array");
    }

    // Create the byte array to hold the data
    rom_ = new byte[(int)length];

    // Read in the bytes
    int offset = 0;
    int numRead = 0;
    while (offset < rom_.length
           && (numRead=is.read(rom_, offset, rom_.length-offset)) >= 0) {
      offset += numRead;
    }

    // Ensure all the bytes have been read in
    if (offset < rom_.length) {
      throw new IOException("Could not completely read file"+romFile.getName());
    }

    // Close the input stream and return bytes
    is.close();

    log_.dump(rom_);
  } // loadRom_
} // JGBMmu
