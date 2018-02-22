package com.example.vicboma.myapplication.Fragments.child

import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.vicboma.myapplication.Fragments.Exts.stateMachine
import com.example.vicboma.myapplication.LifeCycle.LIFE_CYCLE
import com.example.vicboma.myapplication.MainActivity

import com.example.vicboma.myapplication.R
import kotlinx.android.synthetic.main.fragment_ready.*


class Ready : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ready, container, false)
    }

    override fun onActivityCreated(@Nullable savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        stateMachine().transitionColorFadeIn(R.color.white, R.id.frameLayoutReady)


        btnReady.setOnClickListener {
            stateMachine().transitionColorFadeOut(R.color.white, R.id.frameLayoutReady,LIFE_CYCLE.GAME)
        }
    }

}
