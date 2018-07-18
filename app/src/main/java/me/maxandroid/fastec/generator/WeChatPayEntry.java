package me.maxandroid.fastec.generator;


import me.maxandroid.annotations.PayEntryGenerator;
import me.maxandroid.core.wechat.templates.WXPayEntryTemplate;

/**
 * Created by 傅令杰 on 2017/4/22
 */
@SuppressWarnings("unused")
@PayEntryGenerator(
        packageName = "me.maxandroid.fastec.app",
        payEntryTemplate = WXPayEntryTemplate.class
)
public interface WeChatPayEntry {
}
