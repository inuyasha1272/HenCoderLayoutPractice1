package z1.com.hencoderlayoutpractice1;

import android.content.res.Resources;
import android.util.TypedValue;

public class Utils {
    public static float dp2px(int value){
        //这里不需要传Context，使用Resources类即可
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, value, Resources.getSystem().getDisplayMetrics());
    }
}
