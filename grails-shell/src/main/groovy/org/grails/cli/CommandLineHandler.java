package org.grails.cli;

import grails.build.logging.GrailsConsole;

import java.util.List;

import org.codehaus.groovy.grails.cli.parsing.CommandLine;
import org.grails.cli.profile.CommandDescription;

public interface CommandLineHandler {
    boolean handleCommand(CommandLine commandLine, GrailsConsole console); 
    List<CommandDescription> listCommands();
}
