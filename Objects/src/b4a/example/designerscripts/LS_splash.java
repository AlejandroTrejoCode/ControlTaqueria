package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_splash{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 1;BA.debugLine="SplashLogo.Width = 95%x"[splash/General script]
views.get("splashlogo").vw.setWidth((int)((95d / 100 * width)));
//BA.debugLineNum = 2;BA.debugLine="SplashLogo.Height = 45%y"[splash/General script]
views.get("splashlogo").vw.setHeight((int)((45d / 100 * height)));
//BA.debugLineNum = 3;BA.debugLine="SplashLogo.Left = 2.5%x"[splash/General script]
views.get("splashlogo").vw.setLeft((int)((2.5d / 100 * width)));
//BA.debugLineNum = 4;BA.debugLine="SplashLogo.Top = 25%y"[splash/General script]
views.get("splashlogo").vw.setTop((int)((25d / 100 * height)));
//BA.debugLineNum = 6;BA.debugLine="SplashFooter.Width = 100%x"[splash/General script]
views.get("splashfooter").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 7;BA.debugLine="SplashFooter.Height = 8%y"[splash/General script]
views.get("splashfooter").vw.setHeight((int)((8d / 100 * height)));
//BA.debugLineNum = 8;BA.debugLine="SplashFooter.Top = 92%y"[splash/General script]
views.get("splashfooter").vw.setTop((int)((92d / 100 * height)));
//BA.debugLineNum = 9;BA.debugLine="SplashFooter.Left = 0%x"[splash/General script]
views.get("splashfooter").vw.setLeft((int)((0d / 100 * width)));

}
}