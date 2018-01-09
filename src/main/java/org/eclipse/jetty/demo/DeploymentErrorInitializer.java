package org.eclipse.jetty.demo;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class DeploymentErrorInitializer implements ServletContainerInitializer
{
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException
    {
        throw new NoClassDefFoundError("Intentional.Error.From.Webapp");
    }
}
