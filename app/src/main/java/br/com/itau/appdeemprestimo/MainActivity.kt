package br.com.itau.appdeemprestimo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.zup.beagle.core.Appearance
import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.utils.toView
import br.com.zup.beagle.view.BeagleActivity
import br.com.zup.beagle.view.ScreenRequest
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.NavigationBar
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.ui.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // setContentView(buildContent());

        startActivity(
            BeagleActivity.newIntent(
            this,
            ScreenRequest("/emprestimo")
        ))
    }

    private fun buildContent(): View {
        val declarative = Screen(
            navigationBar = NavigationBar(
                title = "Empréstimo Parcelado"
            ),
            child = Container(
                children = listOf(
                    Text(
                        text = "this hint",
                        textColor = "#FFFFFF",
                        style = "DesignSystem.Text.H3"
                    )
                )
            ).applyFlex(Flex(justifyContent = JustifyContent.SPACE_BETWEEN))
        )
        return declarative.toView(this)
    }
}
