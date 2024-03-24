package com.brohit.splitify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.brohit.splitify.ui.theme.SplitifyTheme

enum class Screen {
    Home, Profile
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SplitifyTheme(darkTheme = false) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var currentScreen by remember {
                        mutableStateOf(Screen.Home)
                    }
                    AnimatedContent(
                        targetState = currentScreen, label = "screen",
                        transitionSpec = {
                            (fadeIn(
                                animationSpec = tween(
                                    220,
                                    delayMillis = 90
                                )
                            ) + slideIntoContainer(
                                AnimatedContentTransitionScope.SlideDirection.Left
                            ))
                                .togetherWith(
                                    fadeOut(animationSpec = tween(90)) + slideOutOfContainer(
                                        AnimatedContentTransitionScope.SlideDirection.Right
                                    )
                                )
                        }
                    ) {
                        when (it) {
                            Screen.Home -> {
                                HomeScreen(navigateToProfile = {
                                    currentScreen = Screen.Profile
                                })
                            }

                            Screen.Profile -> ProfileScreen(backToHome = {
                                currentScreen = Screen.Home
                            })
                        }
                    }
                }
            }
        }
    }


}
