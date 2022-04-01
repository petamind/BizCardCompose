package com.example.bizcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bizcard.ui.theme.BizCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BizCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CreateBizCard("Android")
                }
            }
        }
    }
}

@Composable
fun CreateBizCard(name: String) {
    Surface(color = colorResource(id = R.color.white)) {

        Card(
            elevation = 16.dp, modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(16.dp), shape = RoundedCornerShape(corner = CornerSize(8.dp))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(8.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = android.R.drawable.ic_menu_camera),
                    contentDescription = stringResource(
                        id = R.string.app_name
                    ), modifier = Modifier
                        .size(140.dp)
                        .clip(shape = CircleShape)
                        .background(
                            color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
                        )
                )
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BizCardTheme {
        CreateBizCard("Android")
    }
}