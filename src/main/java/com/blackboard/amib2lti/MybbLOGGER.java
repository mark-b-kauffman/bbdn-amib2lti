package com.blackboard.amib2lti;
/* Copyright (C) 2016, Blackboard Inc.
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  -- Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *  -- Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *  -- Neither the name of Blackboard Inc. nor the names of its contributors 
 *     may be used to endorse or promote products derived from this 
 *     software without specific prior written permission.
 *  
 * THIS SOFTWARE IS PROVIDED BY BLACKBOARD INC ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL BLACKBOARD INC. BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

// READ CAREFULLY! There are two loggers used in this class. The first is using Logback to log to the directory returned by 
// PluginUtil.getLogDirectory. The second logs to the blackboard/logs/custom directory and is used to keep track of everything 
// the code does with the first. The reason for this is that is so that we can follow the logic this class uses to create and log to 
// a file using the Learn Log and LogService classes.

// 2023.02 - mbk It no longer seems possible to log to the logs/custom directory for a 3rd-party B2.
// Hence I'm commenting out the lines that log their. The logback code is logging to the logs/plugins 
// directory just fine.

import blackboard.platform.log.Log;
import blackboard.platform.log.LogService;
import blackboard.platform.log.LogService.Verbosity;
import blackboard.platform.log.LogServiceFactory;
import blackboard.platform.plugin.PlugInUtil;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.slf4j.Logger; // We'll use customLogback to log what this logging class is doing for troubleshooting.
import org.slf4j.LoggerFactory;

public class MybbLOGGER
{
  
  /* The following loggers, custom and plugin, are defined in the logback.xml file. */
  // private static final Logger customLogback = LoggerFactory.getLogger("custom");
  private static final Logger pluginLogback = LoggerFactory.getLogger(MybbLOGGER.class);
  
  /* We no longer use Learn's Logging APIs so we delete all of this

  private static LogService LOGSERVICE = null; // Changed this from LOGGER to LOGSERVICE FOR CLARITY. MBK
  private static Log B2LOG = null;  // MBK - added so we can only create the log file when it doesn't exist.


  private String logName = "bblogback.log.txt";
  File logsDirectory = null;
  private String pluginLogPath;
  */
  
  private static MybbLOGGER ABBLOGGER = null; // The singelton
  private static String loglevel;
  
  public static String getLoglevel() // We won't use this for this test. Just return the DEBUG log level.
  {

    loglevel = "DEBUG"; 

    return loglevel;
  }
  
  public static void setLoglevel(String loglevel)
  {
    if (loglevel != null) {
      loglevel = loglevel;
    }
  }
  
  public MybbLOGGER()
  {
    // Don't need so much here... Logback aleady has our path set for us.

  }
  
  public static MybbLOGGER getBbLogger() // Define a singelton logging class.
  {
    if (ABBLOGGER == null)
    {
      ABBLOGGER = new MybbLOGGER();

    }
    return ABBLOGGER;
  }
  
  public void logError(String logMessage)
  {
      String logLevelString="";
      if (getLoglevel()==null)
          logLevelString="NULL";
      else
          logLevelString=getLoglevel();
          
      // customLogback.info("Enter logError() - logLevelString:"+logLevelString);
 
      
      if ((getLoglevel() == null) || ("ALL".equalsIgnoreCase(getLoglevel())) || ("ERROR".equalsIgnoreCase(getLoglevel())) || ("DEBUG".equalsIgnoreCase(getLoglevel())) || ("WARN".equalsIgnoreCase(getLoglevel())) || ("INFO".equalsIgnoreCase(getLoglevel()))) {

          pluginLogback.error(logMessage);
          // No longer needed! logMessage(logMessage, LogService.Verbosity.ERROR);
      }
      // customLogback.info("Exit logError()");

  }
  
  public void logInfo(String logMessage)
  {
      // customLogback.info("Enter logInfo()");
      if ((getLoglevel() == null) || ("ALL".equalsIgnoreCase(getLoglevel())) || ("DEBUG".equalsIgnoreCase(getLoglevel())) || ("INFO".equalsIgnoreCase(getLoglevel()))) {
        pluginLogback.info(logMessage);
        // No longer needed! logMessage(logMessage, LogService.Verbosity.INFORMATION);
      }
      // customLogback.info("Exit logInfo()");
  }
  
  public void logDebug(String logMessage)
  {
      // customLogback.info("Enter logDebug()");
      if ((getLoglevel() == null) || ("ALL".equalsIgnoreCase(getLoglevel())) || ("DEBUG".equalsIgnoreCase(getLoglevel()))) {
        pluginLogback.debug(logMessage);
        // No longer needed! logMessage(logMessage, LogService.Verbosity.DEBUG);
      }
      // customLogback.info("Exit logDebug()");
  }
 
} //public class MybbLOGGER
