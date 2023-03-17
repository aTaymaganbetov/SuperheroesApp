package com.example.superheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.superheroes.ui.theme.SuperheroesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Superheroes()
        }
    }
}

@Composable
fun Superheroes() {
    val cardViewModel: CardViewModel = viewModel()

    val list = cardViewModel.cardValues.collectAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(Color(241, 250, 230, 255))
    )
    {
        Text(
            text = "Superheroes",
            fontSize = 30.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(vertical = 10.dp)
        )

        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(Color(241, 250, 230, 255))
        ) {

            items(list.value) { item ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    shape = RoundedCornerShape(15.dp),
                    elevation = 5.dp
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(201, 219, 179, 255))
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .weight(1f)
                        ) {
                            Text(
                                text = item.title,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = item.description,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Normal
                            )
                        }

                        Image(
                            painter = painterResource(id = item.image),
                            contentDescription = null,
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .padding(10.dp)
                                .size(92.dp)
                        )
                    }

                }

            }
        }
    }
}
