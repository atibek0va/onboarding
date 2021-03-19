package com.example.jihc_girls_house;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class onboarding1 extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private SlideAdapter slideAdapter;
    private TextView[] mDots;
    private Button mPrevBtn;
    private Button mNextBtn;
    private int mCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding1);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
//        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout);
//
//        mNextBtn = (Button) findViewById(R.id.nextBtn);
//        mPrevBtn = (Button) findViewById(R.id.prevBtn);
//
//        slideAdapter = new SlideAdapter(this);
//
//        mSlideViewPager.setAdapter(slideAdapter);
//
//        addDotsIndicator(0);
//
//        mSlideViewPager.addOnPageChangeListener(viewListener);
//
//        mNextBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mSlideViewPager.setCurrentItem(mCurrentPage + 1);
//            }
//        });
//
//        mPrevBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mSlideViewPager.setCurrentItem(mCurrentPage - 1);
//            }
//        });
//    }
//
//    public void addDotsIndicator(int position){
//        mDots = new TextView[3];
//        mDotLayout.removeAllViews();
//
//        for(int i = 0; i < mDots.length; i++){
//            mDots[i] = new TextView(this);
//            mDots[i].setText(Html.fromHtml("&#8226;"));
//            mDots[i].setTextSize(35);
//            mDots[i].setTextColor(getResources().getColor(R.color.black));
//
//            mDotLayout.addView(mDots[i]);
//        }
//
//        if(mDots.length > 0){
//            mDots[position].setTextColor(getResources().getColor(R.color.white));
//        }
//
//    }
//
//    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
//        @Override
//        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//        }
//
//        @Override
//        public void onPageSelected(int position) {
//            addDotsIndicator(position);
//            mCurrentPage = position;
//            if(position == 0){
//                mNextBtn.setEnabled(true);
//                mPrevBtn.setEnabled(false);
//                mPrevBtn.setVisibility(View.INVISIBLE);
//
//                mNextBtn.setText("Next");
//                mPrevBtn.setText("");
//            }else if(position == mDots.length -1){
//                mNextBtn.setEnabled(true);
//                mPrevBtn.setEnabled(true);
//                mPrevBtn.setVisibility(View.VISIBLE);
//
//                mNextBtn.setText("Finish");
//                mPrevBtn.setText("Back");
//            }else if((position == mDots.length -1)){
//                mNextBtn.setEnabled(false);
//                mPrevBtn.setEnabled(false);
//
//                mNextBtn.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent i = new Intent(onboarding1.this, NavigationDrawerActivity.class);
//                        startActivity(i);
//                    }
//                });
//            }else{
//                mNextBtn.setEnabled(true);
//                mPrevBtn.setEnabled(true);
//                mPrevBtn.setVisibility(View.VISIBLE);
//
//                mNextBtn.setText("Next");
//                mPrevBtn.setText("Back");
//            }
//        }
//
//        @Override
//        public void onPageScrollStateChanged(int state) {
//
//        }
    };
}