package me.maxandroid.fastec.generator;


import me.maxandroid.annotations.AppRegisterGenerator;
import me.maxandroid.core.wechat.templates.AppRegisterTemplate;

/**
 * Created by 傅令杰 on 2017/4/22
 */
@SuppressWarnings("unused")
@AppRegisterGenerator(
        packageName = "me.maxandroid.fastec.app",
        registerTemplate = AppRegisterTemplate.class
)
public interface AppRegister {
}
