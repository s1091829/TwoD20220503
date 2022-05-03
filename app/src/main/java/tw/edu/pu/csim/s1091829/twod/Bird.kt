package tw.edu.pu.csim.s1091829.twod

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Rect

class Bird(context: Context) {
    val res = context.resources  //讀取資源
    var BirdX:Int = res.displayMetrics.widthPixels  //讀取螢幕寬度
    var BirdY:Int = 300
    var w:Int
    var h:Int
    var image: Bitmap
    var SrcRect: Rect
    lateinit var DestRect: Rect
}
