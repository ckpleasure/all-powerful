package com.ckpleasure.goat.spring.handler;

import com.ckpleasure.goat.spring.parser.ConnectionBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author ckpleasure 2018.11.01
 */
public class GoatNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {

        registerBeanDefinitionParser("connection", new ConnectionBeanDefinitionParser());
    }
}
