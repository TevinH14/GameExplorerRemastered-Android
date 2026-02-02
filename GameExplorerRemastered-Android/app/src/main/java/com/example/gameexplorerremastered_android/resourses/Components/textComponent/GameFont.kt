package com.example.gameexplorerremastered_android.resourses.Components.textComponent

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
enum class GameFont {
    Title,
    SubTitle,
    Description,
    PrimaryButton,
    SecondaryButton,
    Picker,
    TitleItem,
    KeyTitle,
    WhiteInfo,
    Error;

    // Function to map enum to text style
    fun textStyle(): TextStyle {
        return when (this) {
            Title -> TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            SubTitle -> TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Default
            )
            Description -> TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Default
            )
            PrimaryButton, SecondaryButton -> TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Default
            )
            Picker -> TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Light,
                fontFamily = FontFamily.Default
            )
            TitleItem -> TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Default
            )
            KeyTitle -> TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Default
            )
            WhiteInfo -> TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Default
            )
            Error -> TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.Default
            )
        }
    }

    // Function to map enum to color
    fun color(): Color {
        return when (this) {
            Description -> Color.Gray
            PrimaryButton, SubTitle, WhiteInfo -> Color.Blue
            SecondaryButton -> Color.White
            Error -> Color.Red
            else -> Color.Black
        }
    }
}