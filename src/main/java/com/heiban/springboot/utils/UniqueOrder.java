package com.heiban.springboot.utils;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 生成唯一商户订单号
 */
@Component
public class UniqueOrder {
    public String getUniqueOrder() {
        SimpleDateFormat format = new SimpleDateFormat("YYYYMMddHHmmss");
        String format2 = format.format(new Date());
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {
            //有可能是负数
            hashCodeV = -hashCodeV;
        }
        return "zf" + format2 + String.format("%012d", hashCodeV);
    }
}
