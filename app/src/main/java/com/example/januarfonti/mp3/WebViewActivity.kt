package com.example.januarfonti.mp3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val i = intent.extras.get("position")
        webView.loadUrl("http://m.greenlandseafoodtrading.com/${i}/meta")
    }
}
