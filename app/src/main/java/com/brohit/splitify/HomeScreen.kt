package com.brohit.splitify

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
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
fun HomeScreen(
    navigateToProfile: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                modifier = Modifier.padding(horizontal = 16.dp),
                title = { },
                navigationIcon = {
                    IconButton(onClick = { }, modifier = Modifier) {
                        Icon(
                            painter = painterResource(id = R.drawable.console),
                            contentDescription = "game button",
                            modifier = Modifier,
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                },
                actions = {
                    IconButton(onClick = navigateToProfile) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "profile button",
                            modifier = Modifier.size(64.dp)
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(horizontal = 32.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(32.dp),
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = "Monthly expense tracker",
                    style = MaterialTheme.typography.headlineMedium,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    color = MaterialTheme.colorScheme.primary
                )
                Row(
                    modifier = Modifier
                        .height(IntrinsicSize.Max)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Surface(
                        modifier = Modifier.fillMaxHeight(),
                        shadowElevation = 5.dp,
                        tonalElevation = 5.dp,
                        shape = MaterialTheme.shapes.medium,
                        color = Color.White
                    ) {
                        Column(
                            modifier = Modifier.padding(32.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Text(
                                text = "This month",
                                style = MaterialTheme.typography.bodyLarge,
                                color = LocalContentColor.current.copy(.7f)
                            )
                            Box(
                                modifier = Modifier.padding(vertical = 24.dp, horizontal = 16.dp)
                            ) {
                                Text(
                                    text = "600",
                                    style = MaterialTheme.typography.headlineLarge,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }

                    Surface(
                        modifier = Modifier
                            .fillMaxHeight(),
                        shadowElevation = 5.dp,
                        tonalElevation = 5.dp,
                        shape = MaterialTheme.shapes.medium,
                        color = Color.White
                    ) {

                        Box(
                            modifier = Modifier.padding(16.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Past Prices",
                                style = MaterialTheme.typography.titleLarge,
                                fontWeight = FontWeight.Bold
                            )

                        }
                    }
                }

                Text(
                    text = "Spent By",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Rohit: 600",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.primary
                )
            }


            Row(
                modifier = Modifier
                    .padding(bottom = 80.dp)
                    .height(IntrinsicSize.Max)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    tonalElevation = 10.dp,
                    shadowElevation = 10.dp,
                    color = Color.White,
                    shape = MaterialTheme.shapes.medium
                ) {
                    Box(
                        modifier = Modifier
                            .padding(horizontal = 16.dp, vertical = 16.dp)
                    ) {
                        Text(
                            text = "Show Expenses",
                            style = MaterialTheme.typography.headlineSmall
                        )
                    }
                }

                Surface(
                    tonalElevation = 10.dp,
                    shadowElevation = 10.dp,
                    color = Color.White,
                    shape = CircleShape,
                    contentColor = MaterialTheme.colorScheme.primary,
                    onClick = {}
                ) {
                    Box(
                        modifier = Modifier
                            .aspectRatio(1f),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "add icon",
                            modifier = Modifier.size(32.dp)
                        )
                    }
                }
            }

        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    SplitifyTheme {
        Surface {
            HomeScreen(navigateToProfile = { })
        }
    }
}
