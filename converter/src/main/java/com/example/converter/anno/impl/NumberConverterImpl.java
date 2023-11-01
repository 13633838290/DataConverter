package com.example.converter.anno.impl;



import com.example.converter.anno.CustomConverter;
import com.example.converter.base.BaseConverter;
import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;
import java.util.Objects;

/**
 * 数字格式化
 *
 * @author ld
 * @date 2023/07/22 10:40
 */
public class NumberConverterImpl extends BaseConverter<Number, String> {

    private DecimalFormat df;

    @Override
    protected String doConvert(Number value) {

        if (Objects.nonNull(df)) {
            return df.format(value);
        }
        CustomConverter annotation = property.getAnnotation(CustomConverter.class);
        df = new DecimalFormat();
        if (Objects.nonNull(annotation) && StringUtils.isNotEmpty(annotation.partten())) {
            df.applyPattern(annotation.partten());
        }
        return df.format(value);

    }

}
