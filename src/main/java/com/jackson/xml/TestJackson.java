package com.jackson.xml;

import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author lihaocheng
 * @createtime 2024/2/25
 */
public class TestJackson {
    @Test
    void test() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        //字段为null，自动忽略，不再序列化
        xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //XML标签名:使用骆驼命名的属性名，
//        xmlMapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        //设置转换模式
//        xmlMapper.enable(MapperFeature.USE_STD_BEAN_NAMING);

        Order order = new Order();
        order.setOrderId("123");
        order.setOrderName("");
        Good good1 = new Good("乐高积木", "123", 1);
        Good good2 = new Good("拍立得", "200", 1);
        order.setGoods(Arrays.asList(good1,good2));
        String xmlString = xmlMapper.writeValueAsString(order);
        System.out.println(JSONObject.toJSONString(order));
        System.out.println(xmlString);
    }
}
