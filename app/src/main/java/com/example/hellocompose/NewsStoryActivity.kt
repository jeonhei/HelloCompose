package com.example.hellocompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class NewsStoryActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }

    @Composable
    fun NewsStory() {
        MaterialTheme() {
            Surface(Modifier.background(Color.White)) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.kunge),
                        contentDescription = null,
                        modifier = Modifier
                            .wrapContentHeight()
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                    Text("原来她不够爱我", fontWeight = FontWeight.SemiBold, fontSize = 30.sp)

                    Spacer(modifier = Modifier.height(16.dp))
                    Text("吴业坤",
                        modifier = Modifier.fillMaxWidth(),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        textAlign = TextAlign.End)

                    Spacer(modifier = Modifier.height(16.dp))
                    Text("她慷慨赐予希望, 她空隙得到了依傍...",
                        modifier = Modifier.fillMaxWidth(),
                        fontStyle = FontStyle.Italic,
                        textAlign = TextAlign.End)
                }
            }
        }
    }

    @Preview
    @Composable
    fun Preview() {
        NewsStory()
    }
}