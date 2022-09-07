package com.sb.tools.build.maven.service;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name="apimanagement", defaultPhase = LifecyclePhase.INSTALL)
public class ApigeeManagementMojo extends AbstractMojo {
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        throw new NotImplementedException("Not implimented");
    }
}
