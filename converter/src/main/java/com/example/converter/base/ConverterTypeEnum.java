package com.example.converter.base;


import com.example.converter.anno.impl.*;

public enum ConverterTypeEnum {
    PHONE("PHONE", new PhoneConverterImpl()),
    DATA("DATA", new DateConverterImpl()),
    IDCARD("IDCARD", new IdCardConverterImpl()),
    NAME("NAME", new NameConverterImpl()),
    NUMBER("NUMBER", new NumberConverterImpl());

    String type;

   BaseConverter Converter;

    ConverterTypeEnum(String type, BaseConverter Converter) {
        this.Converter=Converter;
        this.type=type;

    }
    /**
     * 根据code值获取转换枚举
     */
    public static BaseConverter getClazByCode(String typeVal) {
        for (ConverterTypeEnum converterTypeEnum : ConverterTypeEnum.values()) {
            if (typeVal.equals(converterTypeEnum.type)) {
                return converterTypeEnum.Converter;
            }
        }
        return null;
    }

}
