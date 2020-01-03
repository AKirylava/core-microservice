package com.pwc.core.framework.processors.mobile.gestures;

import com.pwc.core.framework.data.MobileGesture;
import com.pwc.core.framework.data.WebElementAttribute;
import com.pwc.core.framework.processors.mobile.elements.MicroserviceMobileElement;
import io.appium.java_client.MobileElement;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

import static com.pwc.assertion.AssertService.assertFail;
import static com.pwc.logging.service.LoggerService.LOG;

public class TouchAndHoldImpl implements MicroserviceMobileElementGesture {

    public static boolean applies(MobileGesture gesture) {
        return (StringUtils.equalsIgnoreCase(gesture.gesture, MobileGesture.TOUCH_AND_HOLD.gesture));
    }

    public Map buildParameters(final MobileElement element, MobileGesture mobileGesture, Object customParameters) {

        Map defaultParameters = new HashMap();
        try {
            LOG(true, "Perform '%s' GESTURE", mobileGesture.gesture);
            defaultParameters.put("element", element.getId());
            if (null == customParameters) {
                defaultParameters.put("duration", 3.0);
                defaultParameters.put("x", 1.0);
                defaultParameters.put("y", 1.0);
            } else {
                defaultParameters.putAll((Map) customParameters);
            }
        } catch (Exception e) {
            assertFail("Failed to perform GESTURE '%s' due to exception=%s", mobileGesture.gesture, e.getMessage());
        }
        return defaultParameters;
    }

}
