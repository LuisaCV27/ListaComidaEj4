package com.mexiti.listacomidaor.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.mexiti.listacomidaor.R

// Set of Material typography styles to start with

val Montserrat = FontFamily(
    Font(R.font.montserrat_bold),
    Font(R.font.montserrat_regular)
)

val AbrilFatFace = FontFamily(
    Font(R.font.abrilfatface_regular)
)

val Pacifico = FontFamily(
    Font(R.font.pacifico_regular)
)

val SignNegative = FontFamily(
    Font(R.font.sign_negative)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Pacifico,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp,
    ),

    displayMedium = TextStyle(
        fontFamily = SignNegative,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp
    ),

    labelSmall = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),

    bodyLarge = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)