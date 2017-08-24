package com.example.januarfonti.mp3


import android.app.Fragment
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.januarfonti.mp3.dummy.DummyContent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,ItemFragment.OnListFragmentInteractionListener{

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val itemFragment = ItemFragment.newInstance(1)

                supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment, itemFragment)
                        .commit()

        }

        override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {
                Log.d("TRAINING", "CLICK")
                val intent = Intent(this, WebViewActivity::class.java)
                intent.putExtra("position", item?.id)
                startActivity(intent)
        }


//    var mediaPlayer :  MediaPlayer? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//
//
//        buttonPlay.setOnClickListener { view ->
//            textView.text = "Hehehe"
//
//            val uri = Uri.parse("http://m.greenlandseafoodtrading.com/1/file")
//            mediaPlayer = MediaPlayer.create(this,uri)
//
//            mediaPlayer?.start()
//        }
//
//        buttonStop.setOnClickListener { view ->
//            mediaPlayer?.stop()
//        }
//
//    }
//
//    override fun onPause() {
//        super.onPause()
//        mediaPlayer?.pause()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        mediaPlayer?.start()
//    }


}
