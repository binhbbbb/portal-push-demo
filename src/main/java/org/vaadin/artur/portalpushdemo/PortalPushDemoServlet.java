package org.vaadin.artur.portalpushdemo;

import javax.servlet.annotation.WebServlet;

import org.vaadin.artur.portalpush.PushServlet;

import com.vaadin.annotations.VaadinServletConfiguration;

// Servlet which handles pushing and serving of static resources
@WebServlet(urlPatterns = "/*", name = "PortalPushDemoServlet", asyncSupported = true)
public class PortalPushDemoServlet extends PushServlet {
}
