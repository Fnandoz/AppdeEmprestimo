package br.com.itau.appdeemprestimo

import br.com.zup.beagle.annotation.BeagleComponent
import br.com.zup.beagle.setup.DesignSystem


@BeagleComponent
class AppDesignSystem : DesignSystem {

    override fun toolbarStyle(name: String): Int {
        return when (name) {
            "DesignSystem.Navigationbar.Style.Green" -> R.style.DesignSystem_Navigationbar_Style
            else -> R.style.DesignSystem_Toolbar
        }
    }

    override fun tabBarStyle(name: String): Int? {
        return when (name) {
            "DesignSystem.TabView.Custom" -> R.style.DesignSystem_TabView_Custom
            else -> null
        }
    }

    override fun image(name: String): Int {
        return when (name) {
            "imageBeagle" -> R.drawable.beagle_image
            "informationImage" -> android.R.drawable.ic_menu_help
            "delete" -> android.R.drawable.ic_delete
            "TestImage" -> android.R.drawable.editbox_dropdown_dark_frame
            "beagle" -> R.drawable.beagle
            else -> android.R.drawable.ic_menu_help
        }
    }

    override fun theme(): Int {
        return R.style.AppTheme_NoToolbar
    }

    override fun textAppearance(name: String): Int {
        return when (name) {
            "DesignSystem.Text.black.H1" -> R.style.DesignSystem_Text_black_H1
            "DesignSystem.Text.black.bold.H1" -> R.style.DesignSystem_Text_black_bold_H1
            "DesignSystem.Text.black.H2" -> R.style.DesignSystem_Text_black_H2
            "DesignSystem.Text.black.bold.H2" -> R.style.DesignSystem_Text_black_bold_H2
            "DesignSystem.Text.black.H3" -> R.style.DesignSystem_Text_black_H3
            "DesignSystem.Text.black.bold.H3" -> R.style.DesignSystem_Text_black_bold_H3
            "DesignSystem.Text.black.H4" -> R.style.DesignSystem_Text_black_H4
            "DesignSystem.Text.black.bold.H4" -> R.style.DesignSystem_Text_black_bold_H4
            "DesignSystem.Text.black.H5" -> R.style.DesignSystem_Text_black_H5
            "DesignSystem.Text.black.bold.H5" -> R.style.DesignSystem_Text_black_bold_H5
            "DesignSystem.Text.white.H4" -> R.style.DesignSystem_Text_white_H4
            "DesignSystem.Text.Action.Click" -> R.style.DesignSystem_Text_Action_Click
            "DesignSystem.Text.helloWord" -> R.style.DesignSystem_Text_helloWord
            else -> R.style.DesignSystem_Text_Default
        }
    }

    override fun buttonStyle(name: String): Int {
        return when (name) {
            "DesignSystem.Button.White" -> R.style.DesignSystem_Button_White
            "DesignSystem.Button.Text" -> R.style.DesignSystem_Button_Text
            "DesignSystem.Button.Style" -> R.style.DesignSystem_Button_Style
            "DesignSystem.Button.Black" -> R.style.DesignSystem_Button_Black
            "DesignSystem.Stylish.Button" -> R.style.DesignSystem_Stylish_Button
            "DesignSystem.Button.Orange" -> R.style.DesignSystem_Button_Default
            "DesignSystem.Stylish.ButtonAndAppearance" -> R.style.DesignSystem_Stylish_ButtonAndAppearance
            "DesignSystem.Form.Submit" -> R.style.DesignSystem_Form_Submit
            else -> android.R.style.Widget_Button
        }
    }
}