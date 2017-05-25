package org.springframework.boot.context.embedded;

import lombok.NoArgsConstructor;

import javax.servlet.Servlet;

/***
 * This class is added to make zuul gateway running with Spring-Boot 1.5.2.RELEASE
 * It is to prevent : java.lang.ClassNotFoundException: org.springframework.boot.context.embedded.ServletRegistrationBean
 */
@NoArgsConstructor
public class ServletRegistrationBean extends org.springframework.boot.web.servlet.ServletRegistrationBean {

     public ServletRegistrationBean(Servlet servlet, String... urlMappings) {
        super(servlet, urlMappings);
    }

    public ServletRegistrationBean(Servlet servlet, boolean alwaysMapUrl, String... urlMappings) {
        super(servlet, alwaysMapUrl, urlMappings);
    }
}
