package vip.zhongsm.elibrary

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter

/**
 *
 *
 * @author WangJ
 * @since 2021/1/28
 * @version 0.1
 */
class MyApplication : Application() {

    private val TAG = "MyApplication"

    override fun onCreate() {
        super.onCreate()

        Log.d(TAG, "MyApplication onCreate()")

        ARouter.init(this)
    }


}