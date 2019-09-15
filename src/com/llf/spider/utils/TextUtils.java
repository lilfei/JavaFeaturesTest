package com.llf.spider.utils;

import com.sun.istack.internal.Nullable;

public class TextUtils {

    public static boolean isEmpty(@Nullable CharSequence str) {
        return str == null || str.length() == 0;
    }
    
}
