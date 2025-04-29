package virtual.camera.app.app3.5.4

import android.content.Context
import android.content.SharedPreferences

object AppManager {
    @JvmStatic
    val mRemarkSharedPreferences: SharedPreferences by lazy {
        App.getContext().getSharedPreferences("UserRemark",Context.MODE_PRIVATE)
    }
}
