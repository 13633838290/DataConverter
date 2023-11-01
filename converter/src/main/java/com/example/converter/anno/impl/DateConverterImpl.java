package com.example.converter.anno.impl;


import com.example.converter.anno.CustomConverter;
import com.example.converter.base.BaseConverter;
import org.apache.commons.lang3.StringUtils;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 时间戳转日期
 *
 * @author ld
 * @date 2023/07/22 10:40
 */
public class DateConverterImpl extends BaseConverter<Long, String> {

    private SimpleDateFormat sdf;

    @Override
    protected String doConvert(Long value) {

        if (Objects.nonNull(sdf)) {
            return sdf.format(new Date(value));
        }
        String format = "yyyy-MM-dd";
        CustomConverter annotation = property.getAnnotation(CustomConverter.class);
        if (Objects.nonNull(annotation) && StringUtils.isNotEmpty(annotation.partten())) {
            format = annotation.partten();
        }
        this.sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(value));

    }

}
