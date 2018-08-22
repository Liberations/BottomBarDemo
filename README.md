## 主要功能点 ##

 1. 构建者模式链式设置导航栏条目
 2. 自定义导航栏的字体大小图片大小
 3. 支持纯文字类型
 4. 支持底部按钮点击事件
 4. 代码简洁不到300行，只有一个类 直接拿来用

看效果是否满意
---
![image](https://raw.githubusercontent.com/Liberations/BottomBarDemo/master/img/1.png)

## 用法 ##

```
 private fun initBottomBar() {
        bottom_bar_activity_main
                .setContainer(R.id.fl_content_activity_main)
                .setTitleSize(12)
                .setIconHeight(22)
                .setIconWidth(22)
                .setTitleBeforeAndAfterColor(
                        "#666666"
                        ,"#ff0054")
                .addItem(FragmentA::class.java
                        , getString(R.string.menu_home)
                        , R.mipmap.tab_home_unselect, R.mipmap.tab_home_select)
                .addItem(FragmentB::class.java
                        , getString(R.string.menu_category)
                        , R.mipmap.tab_type_unselect, R.mipmap.tab_type_select)
                .addItem(FragmentC::class.java
                        , getString(R.string.menu_coupon)
                        , R.mipmap.tab_xd_unselect, R.mipmap.tab_xd_select)
                .addItem(FragmentD::class.java
                        , getString(R.string.menu_broke)
                        , R.mipmap.tab_circle_unselect, R.mipmap.tab_circle_select)
                .addItem(FragmentE::class.java
                        , getString(R.string.menu_me)
                        , R.mipmap.tab_mine_unselect, R.mipmap.tab_mine_select)
                .build()
        bottom_bar_activity_main.setClickListen {
            //TODO 这里可以自己处理点击事件的逻辑
            println(it)
        }

    }
```

是不是用的很爽,这个Demo的地址我放到github了，欢迎`star` `issue`
Demo地址 [https://github.com/Liberations/BottomBarDemo](https://github.com/Liberations/BottomBarDemo)
