package vip.zhongsm.launcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alibaba.android.arouter.facade.annotation.Route
import vip.zhongsm.nerve.RouterMap

@Route(path = RouterMap.Launcher.Target)
class TargetActivity : AppCompatActivity() {

    private lateinit var tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        tv = findViewById(R.id.textView)

        tv.text = intent.getStringExtra("key")

        tv.setOnClickListener {
            setResult(2)
            finish()
        }
    }
}