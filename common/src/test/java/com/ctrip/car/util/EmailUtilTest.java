package com.ctrip.car.util;

import org.junit.Ignore;
import org.junit.Test;

import com.ctrip.car.osd.framework.common.utils.EmailUtil;

import java.io.File;


public class EmailUtilTest {

    @Test
    @Ignore
    public void testMail() {
        EmailUtil se   = new EmailUtil(false);
        String    path = TestUtil.path + "ali.gif";
        se.doSendHtmlEmail("邮件主题", "邮件内容", "438558488@qq.com");
        File affix = new File(path);
        se.doSendHtmlEmail("邮件主题", "邮件内容", "438558488@qq.com", affix);//
    }
}