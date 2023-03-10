package com.tenginekit.tenginedemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tenginekit.tenginedemo.facedemo.FaceEntryActivity
import com.tenginekit.tenginedemo.insightface.InsightFaceEntryActivity
import com.tenginekit.tenginedemo.segdemo.SegEntryActivity
import com.tenginekit.tenginedemo.bodydemo.BodyEntryActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_main)
        val face = findViewById<View>(R.id.faceEntry)
        val insightface = findViewById<View>(R.id.InsightFaceEntry)
        val seg = findViewById<View>(R.id.segEntry)
        val body = findViewById<View>(R.id.bodyEntry)
        face.setOnClickListener(this)
        insightface.setOnClickListener(this)
        seg.setOnClickListener(this)
        body.setOnClickListener(this)
    }


    private fun jumpToFaceActivity() {
        val intent = Intent(this, FaceEntryActivity::class.java)
        startActivity(intent)
    }

    private fun jumpToInsightFaceActivity() {
        val intent = Intent(this, InsightFaceEntryActivity::class.java)
        startActivity(intent)
    }

    private fun jumpToSegActivity() {
        val intent = Intent(this, SegEntryActivity::class.java)
        startActivity(intent)
    }

    private fun jumpToBodyActivity() {
        val intent = Intent(this, BodyEntryActivity::class.java)
        startActivity(intent)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.faceEntry -> {
                jumpToFaceActivity()
            }
            R.id.InsightFaceEntry -> {
                jumpToInsightFaceActivity()
            }
            R.id.segEntry -> {
                jumpToSegActivity()
            }
            R.id.bodyEntry -> {
                jumpToBodyActivity()
            }
        }
    }


}
