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
                        if (button1.text == "")
                            button1.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        if (button1.text == "")
                            button1.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button2 -> {
                    if (playerPlaying == 1) {
                        if (button2.text == "")
                            button2.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        if (button2.text == "")
                            button2.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button3 -> {
                    if (playerPlaying == 1) {
                        if (button3.text == "")
                            button3.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        if (button3.text == "")
                            button3.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button4 -> {
                    if (playerPlaying == 1) {
                        if (button4.text == "")
                            button4.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        if (button4.text == "")
                            button4.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button5 -> {
                    if (playerPlaying == 1) {
                        if (button5.text == "")
                            button5.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        if (button5.text == "")
                            button5.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button6 -> {
                    if (playerPlaying == 1) {
                        if (button6.text == "")
                            button6.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        if (button6.text == "")
                            button6.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button7 -> {
                    if (playerPlaying == 1) {
                        if (button7.text == "")
                            button7.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        if (button7.text == "")
                            button7.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button8 -> {
                    if (playerPlaying == 1) {
                        if (button8.text == "")
                            button8.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        if (button8.text == "")
                            button8.text = "0"
                        playerPlaying = 1
                    }
                }
                R.id.button9 -> {
                    if (playerPlaying == 1) {
                        if (button9.text == "")
                            button9.text = "X"
                        playerPlaying = 2
                    }
                    else {
                        if (button9.text == "")
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
