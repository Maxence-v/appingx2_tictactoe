package fr.epita.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_game_table.*
import kotlin.random.Random

class GameTable : AppCompatActivity(), View.OnClickListener {
    var playerPlaying = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_table)

        val originIntent = intent
        val name = originIntent.getStringExtra("NAME")
        val text = "0 ($name)"
        playerLabel.text = text

        button1.setOnClickListener(this@GameTable)
        button2.setOnClickListener(this@GameTable)
        button3.setOnClickListener(this@GameTable)
        button4.setOnClickListener(this@GameTable)
        button5.setOnClickListener(this@GameTable)
        button6.setOnClickListener(this@GameTable)
        button7.setOnClickListener(this@GameTable)
        button8.setOnClickListener(this@GameTable)
        button9.setOnClickListener(this@GameTable)

        playerPlaying = Random.nextInt(1, 2)

    }
    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.button1 -> {
                    if (playerPlaying == 1) {
                        button1.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        button1.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button2 -> {
                    if (playerPlaying == 1) {
                        button2.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        button2.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button3 -> {
                    if (playerPlaying == 1) {
                        button3.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        button3.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button4 -> {
                    if (playerPlaying == 1) {
                        button4.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        button4.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button5 -> {
                    if (playerPlaying == 1) {
                        button5.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        button5.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button6 -> {
                    if (playerPlaying == 1) {
                        button6.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        button6.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button7 -> {
                    if (playerPlaying == 1) {
                        button7.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        button7.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button8 -> {
                    if (playerPlaying == 1) {
                        button8.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        button8.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button9 -> {
                    if (playerPlaying == 1) {
                        button9.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        button9.text = "0"
                        playerPlaying = 1
                    }
                }
                else -> {
                    Log.d("SecondActivity", "onClick -> clickedView -> else reached")
                }
            }
        }
    }

}
