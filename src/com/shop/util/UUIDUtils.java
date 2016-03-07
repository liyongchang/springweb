package com.shop.util;

import java.util.UUID;

/**
 * Created by lyc on 16-3-7.
 */
public class UUIDUtils {
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
