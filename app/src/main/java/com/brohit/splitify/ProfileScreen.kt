package com.brohit.splitify

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.brohit.splitify.ui.theme.SplitifyTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    backToHome: () -> Unit,
    modifier: Modifier = Modifier
) {
    BackHandler {
        backToHome()
    }
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                modifier = Modifier.padding(horizontal = 16.dp),
                title = { },
                navigationIcon = {
                    IconButton(onClick = backToHome) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "game button",
                            modifier = Modifier.size(64.dp)
                        )
                    }
                },
                actions = {
                    IconButton(onClick = backToHome) {
                        Icon(
                            painter = painterResource(id = R.drawable.doubts_button),
                            contentDescription = "profile button"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->

        Column(
            verticalArrangement = Arrangement.spacedBy(32.dp),
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(horizontal = 32.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier)
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shadowElevation = 10.dp,
                tonalElevation = 10.dp,
                shape = MaterialTheme.shapes.medium,
                color = Color.White
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "YOUR BATCH CODE",
                        style = MaterialTheme.typography.bodyLarge,
                        color = LocalContentColor.current.copy(.7f)
                    )
                    Box(
                        modifier = Modifier
                    ) {
                        Text(
                            text = "123678",
                            style = MaterialTheme.typography.headlineMedium,
                            fontWeight = FontWeight.Bold,
                            color = LocalContentColor.current.copy(.7f)
                        )
                    }
                }
            }
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shadowElevation = 10.dp,
                tonalElevation = 10.dp,
                shape = MaterialTheme.shapes.medium,
                color = Color.White
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(32.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.share),
                        contentDescription = "Share icon",
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .size(64.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Box(
                        modifier = Modifier
                    ) {
                        Text(
                            text = "Share App",
                            style = MaterialTheme.typography.headlineMedium,
                            fontWeight = FontWeight.Bold,
                            color = LocalContentColor.current.copy(.7f)
                        )
                    }
                }
            }

            Surface(
                modifier = Modifier.fillMaxWidth(),
                shadowElevation = 10.dp,
                tonalElevation = 10.dp,
                shape = MaterialTheme.shapes.medium,
                color = Color.White
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(32.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Rate us",
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .size(64.dp),
                        tint = Color.Yellow
                    )
                    Box(
                        modifier = Modifier
                    ) {
                        Text(
                            text = "Rate us",
                            style = MaterialTheme.typography.headlineMedium,
                            fontWeight = FontWeight.Bold,
                            color = LocalContentColor.current.copy(.7f)
                        )
                    }
                }
            }
            Surface(
                modifier = Modifier.fillMaxWidth(),
                shadowElevation = 10.dp,
                tonalElevation = 10.dp,
                shape = MaterialTheme.shapes.medium,
                color = Color.White
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(32.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.logout),
                        contentDescription = "logout icon",
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .size(64.dp),
                        tint = Color.Red
                    )
                    Box(
                        modifier = Modifier
                    ) {
                        Text(
                            text = "Log out",
                            style = MaterialTheme.typography.headlineMedium,
                            fontWeight = FontWeight.Bold,
                            color = LocalContentColor.current.copy(.7f)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier)


        }

    }
}

@Preview
@Composable
private fun ProfileScreenPreview() {
    SplitifyTheme {
        Surface {
            ProfileScreen(backToHome = {})
        }
    }
}