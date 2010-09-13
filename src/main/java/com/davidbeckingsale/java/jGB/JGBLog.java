/** Log.java --- 
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



/**
 * Used for logging state of the emulator. Provides a simple write
 * function in order to record information
 *
 * Created: 09/11/10
 *
 * @author David Beckingsale
 * @version 1
 * @since 11/9/2010
 */
public class JGBLog {



  private File logFile;



  /**
   * Constructor to open a new log file, filename is log-TIME-DATE.txt
   */
  public Log() {
    logFile = new File("log-" + System.getDate() + "-" + System.getCurrentTime());
    logFile.createNewFile();
  } // Log constructor


  /**
   * Writes a line to the log file. The line contains the component
   * and the message as well as the time
   *
   * @param component The component that is sending the message to be
   * logged.
   * @param message The message to be logged.
   */
  public static void Write(String component, String message) {
    String logString = component + " logged message: " + message +"at "; //time and date needed here 
  } // Write



} // Log
