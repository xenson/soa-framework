package com.ctrip.car.util.image;

import junit.framework.TestCase;

import com.ctrip.car.osd.framework.common.utils.RandomUtil;
import com.ctrip.car.util.TestUtil;
import com.ctrip.car.osd.framework.common.utils.image.ImageCaptcha;

/**
 * 测试验证码生成
 */
public class ImageCaptchaTest extends TestCase {

    private String path_temp = TestUtil.path+"/temp/image";

    public void testPngCaptcha() throws Exception {
        System.out.println(ImageCaptcha.pngCaptcha(5, path_temp+ RandomUtil.UUID()+".png"));
        System.out.println(ImageCaptcha.pngCaptcha(6, path_temp+ RandomUtil.UUID()+".png"));
    }

    public void testGifCaptch() throws Exception {
        System.out.println(ImageCaptcha.gifCaptch(5, path_temp + RandomUtil.UUID() + ".gif"));
        System.out.println(ImageCaptcha.gifCaptch(6, path_temp + RandomUtil.UUID() + ".gif"));
    }
}