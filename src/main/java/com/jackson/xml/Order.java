package com.jackson.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

/**
 * @author lihaocheng
 * @createtime 2024/2/24
 */
@Data
@JacksonXmlRootElement(localName = "Request")
public class Order {
    private String orderId;

    private String orderName;

    @JacksonXmlProperty(localName = "good")
    @JacksonXmlElementWrapper(localName = "goods")
    private List<Good> goods;
}
