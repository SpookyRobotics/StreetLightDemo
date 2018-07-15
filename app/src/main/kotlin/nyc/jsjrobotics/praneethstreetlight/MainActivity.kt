package nyc.jsjrobotics.praneethstreetlight

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import nyc.jsjrobotics.praneethstreetlight.countdown.CountdownFragment
import nyc.jsjrobotics.praneethstreetlight.lightDisplay.LightsDisplayFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_light_display, LightsDisplayFragment(), LightsDisplayFragment.TAG)
                    .add(R.id.fragment_countdown, CountdownFragment(), CountdownFragment.TAG)
                    .commit()
        }
    }
}