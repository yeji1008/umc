package com.example.umc_hackathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.umc_hackathon.auth.MyPageActivity
import com.example.umc_hackathon.databinding.ActivityInterestSurveyBinding

class InterestSurveyActivity : AppCompatActivity() {

    val TAG: String = "<InterestSurveyActivity>"
    var modelList = ArrayList<MySurvey>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityInterestSurveyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 리스트 생성
        for (i in 1..10){
            val mySurvey = MySurvey(title = "사회현상에 대한 소비자 인식 $i")
            this.modelList.add(mySurvey)
        }

        binding.interestSurveyListRv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.interestSurveyListRv.setHasFixedSize(true)
//        binding.interestSurveyListRv.adapter = FormListRAdapter(modelList)

        binding.interestSurveyGoMyPageLl.setOnClickListener {
            val intent = Intent(this, MyPageActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}