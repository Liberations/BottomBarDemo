package com.wenxiangli.bottombardemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wenxiangli.bottombardemo.fragment.FragmentB
import com.wenxiangli.bottombardemo.fragment.FragmentC
import com.wenxiangli.bottombardemo.fragment.FragmentD
import com.wenxiangli.bottombardemo.fragment.FragmentE
import com.zhiguan.rebate.business.category.FragmentA
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initBottomBar()
    }
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

}
