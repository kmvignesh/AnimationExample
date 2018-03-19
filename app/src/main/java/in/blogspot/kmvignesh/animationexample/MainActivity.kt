package `in`.blogspot.kmvignesh.animationexample

import android.animation.Animator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fade_in.setOnClickListener {
            textView.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            textView.startAnimation(animation)
        }
        fade_out.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            textView.startAnimation(animation)
            Handler().postDelayed({ textView.visibility = View.GONE }, 1000)
        }
        zoom_in.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            textView.startAnimation(animation)
        }
        zoom_out.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            textView.startAnimation(animation)
        }
        slide_down.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            textView.startAnimation(animation)
        }
        slide_up.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            textView.startAnimation(animation)
        }
        bounce.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            textView.startAnimation(animation)
        }
        rotate.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            textView.startAnimation(animation)
        }

    }
}
