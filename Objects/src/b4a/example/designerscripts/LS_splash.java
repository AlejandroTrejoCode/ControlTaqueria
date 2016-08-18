package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_splash{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 1;BA.debugLine="SplashLogo.Width = 95%x"[splash/General script]
views.get("splashlogo").vw.setWidth((int)((95d / 100 * width)));
//BA.debugLineNum = 2;BA.debugLine="SplashLogo.Height = 40%y"[splash/General script]
views.get("splashlogo").vw.setHeight((int)((40d / 100 * height)));
//BA.debugLineNum = 3;BA.debugLine="SplashLogo.Left = 2.5%x"[splash/General script]
views.get("splashlogo").vw.setLeft((int)((2.5d / 100 * width)));
//BA.debugLineNum = 4;BA.debugLine="SplashLogo.Top = 20%y"[splash/General script]
views.get("splashlogo").vw.setTop((int)((20d / 100 * height)));

}
}