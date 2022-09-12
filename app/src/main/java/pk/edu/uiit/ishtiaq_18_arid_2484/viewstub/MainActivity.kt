package pk.edu.uiit.ishtiaq_18_arid_2484.viewstub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewStub
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var viewStub: ViewStub
    private lateinit var showView: Button
    private lateinit var hideView: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewsInitialization()
        viewsAction()
    }
    private fun viewsInitialization(){
        viewStub = findViewById(R.id.view_stub)
        showView = findViewById(R.id.show_view)
        hideView = findViewById(R.id.hide_view)

    }
    private fun viewsAction(){
        val view = viewStub.inflate()
        showView.setOnClickListener {
            view.visibility = View.VISIBLE
        }

        hideView.setOnClickListener {
            view.visibility = View.GONE
        }
    }
}