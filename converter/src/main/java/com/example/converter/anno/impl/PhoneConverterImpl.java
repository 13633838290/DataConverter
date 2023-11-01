package com.example.converter.anno.impl;

import com.example.converter.base.BaseConverter;

/**
 * 隐藏手机号码
 *
 * @author ld
 * @date 2023/07/22 10:40
 */
public class PhoneConverterImpl extends BaseConverter<String, String> {

    @Override
    protected String doConvert(String value) {
        return value.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    }

}
