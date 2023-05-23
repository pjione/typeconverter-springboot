package com.example.typeconverter.converter;

import com.example.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ConverterTest {
    @Test
    void stringToInteger(){
        assertThat(new StringToIntergerConverter().convert("10"))
                .isEqualTo(10);
    }
    @Test
    void IpPortToString(){
        IpPort ipPort = new IpPort("127.0.0.1", 8080);
        IpPortToStringConverter converter = new IpPortToStringConverter();
        String result = converter.convert(ipPort);
        assertThat(result).isEqualTo("127.0.0.1:8080");
    }
}
