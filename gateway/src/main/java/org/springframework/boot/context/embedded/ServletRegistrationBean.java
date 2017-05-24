package org.springframework.boot.context.embedded;

import javax.servlet.Servlet;

public class ServletRegistrationBean extends org.springframework.boot.web.servlet.ServletRegistrationBean {

    public ServletRegistrationBean() {
    }

    public ServletRegistrationBean(Servlet servlet, String... urlMappings) {
        super(servlet, urlMappings);
    }

    public ServletRegistrationBean(Servlet servlet, boolean alwaysMapUrl, String... urlMappings) {
        super(servlet, alwaysMapUrl, urlMappings);
    }
}
