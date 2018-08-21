package com.pwc.core.framework.util;

public class ObjectUtils {

    /**
     * Simple utility method to check if an Object is Empty
     *
     * @param object object to check for nulls
     * @return is object null
     */
    protected static boolean isEmpty(Object object) {

        boolean emptyObject = null == object;
        return emptyObject;
    }

    /**
     * Simple utility method to check if an Object is Not Empty
     *
     * @param object object to check for not null
     * @return is object null
     */
    protected static boolean isNotEmpty(Object object) {

        boolean notEmptyObject = null != object;
        return notEmptyObject;
    }

}
