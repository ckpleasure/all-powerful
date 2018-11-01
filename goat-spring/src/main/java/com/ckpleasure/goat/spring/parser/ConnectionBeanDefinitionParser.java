package com.ckpleasure.goat.spring.parser;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * @author ckpleasure 2018.11.01
 */
public class ConnectionBeanDefinitionParser extends AbstractSimpleBeanDefinitionParser {
    @Override
    protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
        super.doParse(element, parserContext, builder);
    }
}
