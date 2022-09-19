package com.demo.app.utils.web;

import org.springframework.lang.Nullable;
import org.springframework.util.ObjectUtils;

/**
 * @author xg BLACK
 * @date 2022/6/9 1:50
 * description:
 */
public class ObjectUtil extends ObjectUtils {
	public ObjectUtil() {
	}

	public static boolean isNotEmpty(@Nullable Object obj) {
		return !isEmpty(obj);
	}
}
