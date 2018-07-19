package me.maxandroid.ec.main;

import android.graphics.Color;

import java.util.LinkedHashMap;

import me.maxandroid.core.delegates.bottom.BaseBottomDelegate;
import me.maxandroid.core.delegates.bottom.BottomItemDelegate;
import me.maxandroid.core.delegates.bottom.BottomTabBean;
import me.maxandroid.core.delegates.bottom.ItemBuilder;
import me.maxandroid.ec.main.cart.CartDelegate;
import me.maxandroid.ec.main.cart.ShopCartDelegate;
import me.maxandroid.ec.main.discover.DiscoverDelegate;
import me.maxandroid.ec.main.index.IndexDelegate;
import me.maxandroid.ec.main.sort.SortDelegate;

public class EcBottomDelegate extends BaseBottomDelegate {

    @Override
    public LinkedHashMap<BottomTabBean, BottomItemDelegate> setItems(ItemBuilder builder) {
        final LinkedHashMap<BottomTabBean, BottomItemDelegate> items = new LinkedHashMap<>();
        items.put(new BottomTabBean("{fa-home}", "主页"), new IndexDelegate());
        items.put(new BottomTabBean("{fa-sort}", "分类"), new SortDelegate());
        items.put(new BottomTabBean("{fa-compass}", "发现"), new DiscoverDelegate());
        items.put(new BottomTabBean("{fa-shopping-cart}", "购物车"), new ShopCartDelegate());
        items.put(new BottomTabBean("{fa-user}", "我的"), new IndexDelegate());
        return builder.addItems(items).build();
    }

    @Override
    public int setIndexDelegate() {
        return 0;
    }

    @Override
    public int setClickedColor() {
        return Color.parseColor("#ffff8800");
    }
}
