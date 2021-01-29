package vip.zhongsm.launcher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alibaba.android.arouter.launcher.ARouter
import vip.zhongsm.nerve.RouterMap

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onResume() {
        super.onResume()

        textView = findViewById(R.id.tv)
        textView.setOnClickListener {
            ARouter.getInstance()
                .build(RouterMap.Launcher.Target)
                .withString("key", "value")
                .navigation(this, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        textView.text = resultCode.toString()
    }
}