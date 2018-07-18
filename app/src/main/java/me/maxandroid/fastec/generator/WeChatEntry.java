package me.maxandroid.fastec.generator;


import me.maxandroid.annotations.EntryGenerator;
import me.maxandroid.core.wechat.templates.WXEntryTemplate;

/**
 * Created by 傅令杰 on 2017/4/22
 */

@SuppressWarnings("unused")
@EntryGenerator(
        packageName = "me.maxandroid.fastec.app",
        entryTemplate = WXEntryTemplate.class
)
public interface WeChatEntry {
}
