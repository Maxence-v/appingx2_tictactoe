package fr.epita.tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startBtn.setOnClickListener(this@MainActivity)
    }

    override fun onClick(clickedView: View?) {
        if (clickedView != null) {
            when (clickedView.id) {
                R.id.startBtn -> {
                    goToSecondActivity()
                    Log.d("MainActivity/Intent", "Go to SecondActivity")
                }
                else -> {
                    Log.d("MainActivity", "onClick -> clickedView -> else reached")
                }
            }
        }
    }
    private fun goToSecondActivity() {
        val explicitIntent = Intent(this, GameTable::class.java)
        val name = inputName.text.toString()
        explicitIntent.putExtra("NAME", name)
        startActivity(explicitIntent)

        /*
        val url = "http://www.epita.fr"
        val implicitIntent = Intent(Intent.ACTION_VIEW)
        implicitIntent.data = Uri.parse(url)
        startActivity(implicitIntent)
         */
    }
}
