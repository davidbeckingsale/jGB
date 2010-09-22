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
  private byte[] rom;

  public void reset() {

  }

  public void terminate() {

  }

  public void loadRom(File romFile) throws IOException {
    InputStream is = new FileInputStream(romFile);

    // Get the size of the file
    long length = romFile.length();

    if (length > Integer.MAX_VALUE) {
      // File is too large
    }

    // Create the byte array to hold the data
    rom = new byte[(int)length];

    // Read in the bytes
    int offset = 0;
    int numRead = 0;
    while (offset < rom.length
           && (numRead=is.read(rom, offset, rom.length-offset)) >= 0) {
      offset += numRead;
    }

    // Ensure all the bytes have been read in
    if (offset < rom.length) {
      throw new IOException("Could not completely read file "+romFile.getName());
    }

    // Close the input stream and return bytes
    is.close();
  }
} // JGBMmu
