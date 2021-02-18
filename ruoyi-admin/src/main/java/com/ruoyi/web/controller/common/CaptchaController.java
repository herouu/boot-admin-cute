package com.ruoyi.web.controller.common;


import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.redis.RedisCache;
import com.ruoyi.common.utils.uuid.IdUtils;
import com.wf.captcha.ArithmeticCaptcha;
import com.wf.captcha.SpecCaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * 验证码操作处理
 *
 * @author ruoyi
 */
@RestController
public class CaptchaController {

    @Autowired
    private RedisCache redisCache;

    // 验证码类型
    @Value("${ruoyi.captchaType}")
    private String captchaType;

    /**
     * 生成验证码
     */
    @GetMapping("/captchaImage")
    public AjaxResult getCode(HttpServletResponse response) throws IOException {
        // 保存验证码信息
        String uuid = IdUtils.simpleUUID();
        String verifyKey = Constants.CAPTCHA_CODE_KEY + uuid;

        String code = null;
        String image = null;

        // 生成验证码
        if ("math".equals(captchaType)) {
            ArithmeticCaptcha captcha = new ArithmeticCaptcha(130, 48);
            // captcha.setLen(3);  // 几位数运算，默认是两位
            // captcha.getArithmeticString();  // 获取运算的公式：3+2=?
            code = captcha.text();
            image = captcha.toBase64();
        } else if ("char".equals(captchaType)) {
            SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 5);
            code = specCaptcha.text().toLowerCase();
            image = specCaptcha.toBase64();
        }

        redisCache.setCacheObject(verifyKey, code, Constants.CAPTCHA_EXPIRATION, TimeUnit.MINUTES);

        AjaxResult ajax = AjaxResult.success();
        ajax.put("uuid", uuid);
        ajax.put("img", image);
        return ajax;
    }
}
