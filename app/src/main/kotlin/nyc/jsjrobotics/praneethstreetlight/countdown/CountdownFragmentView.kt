package nyc.jsjrobotics.praneethstreetlight.countdown

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import nyc.jsjrobotics.praneethstreetlight.R
import nyc.jsjrobotics.praneethstreetlight.runOnMainThread

class CountdownFragmentView {
    lateinit var rootXml : View
    lateinit var currentFrame : TextView
    fun init(inflater: LayoutInflater, container: ViewGroup) {
        rootXml = inflater.inflate(R.layout.fragment_countdown, container, false)
        currentFrame = rootXml.findViewById(R.id.countdown_text)
    }

    fun displayCurrentFrame(currentFrameNumber: Int) {
        runOnMainThread {
            currentFrame.text = "Current Frame: $currentFrameNumber"
        }
    }
}
