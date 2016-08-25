package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_splash{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="PanelCarta.Width = 90%x"[splash/General script]
views.get("panelcarta").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 3;BA.debugLine="PanelCarta.Height = 90%y"[splash/General script]
views.get("panelcarta").vw.setHeight((int)((90d / 100 * height)));
//BA.debugLineNum = 4;BA.debugLine="PanelCarta.Top = 2.5%y"[splash/General script]
views.get("panelcarta").vw.setTop((int)((2.5d / 100 * height)));
//BA.debugLineNum = 5;BA.debugLine="PanelCarta.Left = 5%x"[splash/General script]
views.get("panelcarta").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 8;BA.debugLine="PanelSombra.Width = 89%x"[splash/General script]
views.get("panelsombra").vw.setWidth((int)((89d / 100 * width)));
//BA.debugLineNum = 9;BA.debugLine="PanelSombra.Height = 90%y"[splash/General script]
views.get("panelsombra").vw.setHeight((int)((90d / 100 * height)));
//BA.debugLineNum = 10;BA.debugLine="PanelSombra.Top = 4%y"[splash/General script]
views.get("panelsombra").vw.setTop((int)((4d / 100 * height)));
//BA.debugLineNum = 11;BA.debugLine="PanelSombra.Left = 7%x"[splash/General script]
views.get("panelsombra").vw.setLeft((int)((7d / 100 * width)));
//BA.debugLineNum = 14;BA.debugLine="SplashLogo.Width = 90%x"[splash/General script]
views.get("splashlogo").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 15;BA.debugLine="SplashLogo.Height = 45%y"[splash/General script]
views.get("splashlogo").vw.setHeight((int)((45d / 100 * height)));
//BA.debugLineNum = 16;BA.debugLine="SplashLogo.Left = 0%x"[splash/General script]
views.get("splashlogo").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 17;BA.debugLine="SplashLogo.Top = 20%y"[splash/General script]
views.get("splashlogo").vw.setTop((int)((20d / 100 * height)));
//BA.debugLineNum = 20;BA.debugLine="PanelRojo.Width = 90%x"[splash/General script]
views.get("panelrojo").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 21;BA.debugLine="PanelRojo.Height = 5%y"[splash/General script]
views.get("panelrojo").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 22;BA.debugLine="PanelRojo.Top = 33%y"[splash/General script]
views.get("panelrojo").vw.setTop((int)((33d / 100 * height)));
//BA.debugLineNum = 23;BA.debugLine="PanelRojo.Left = 0%x"[splash/General script]
views.get("panelrojo").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 26;BA.debugLine="LabelSeleccion.Width = 90%x"[splash/General script]
views.get("labelseleccion").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 27;BA.debugLine="LabelSeleccion.Height = 5%y"[splash/General script]
views.get("labelseleccion").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 28;BA.debugLine="LabelSeleccion.Top = 0%y"[splash/General script]
views.get("labelseleccion").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 29;BA.debugLine="LabelSeleccion.Left = 0%x"[splash/General script]
views.get("labelseleccion").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 32;BA.debugLine="PanelLogin.Visible = True"[splash/General script]
views.get("panellogin").vw.setVisible(BA.parseBoolean("true"));
//BA.debugLineNum = 33;BA.debugLine="PanelLogin.Width = 90%x"[splash/General script]
views.get("panellogin").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 34;BA.debugLine="PanelLogin.Height = 40%y"[splash/General script]
views.get("panellogin").vw.setHeight((int)((40d / 100 * height)));
//BA.debugLineNum = 35;BA.debugLine="PanelLogin.Top = 38%y"[splash/General script]
views.get("panellogin").vw.setTop((int)((38d / 100 * height)));
//BA.debugLineNum = 36;BA.debugLine="PanelLogin.Left = 0%x"[splash/General script]
views.get("panellogin").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 39;BA.debugLine="LabelUsuario.Width = 90%x"[splash/General script]
views.get("labelusuario").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 40;BA.debugLine="LabelUsuario.Height = 6%y"[splash/General script]
views.get("labelusuario").vw.setHeight((int)((6d / 100 * height)));
//BA.debugLineNum = 41;BA.debugLine="LabelUsuario.Top = 6%y"[splash/General script]
views.get("labelusuario").vw.setTop((int)((6d / 100 * height)));
//BA.debugLineNum = 42;BA.debugLine="LabelUsuario.Left = 2%x"[splash/General script]
views.get("labelusuario").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 45;BA.debugLine="Divisor.Width = 70%x"[splash/General script]
views.get("divisor").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 46;BA.debugLine="Divisor.Height = 0.5%y"[splash/General script]
views.get("divisor").vw.setHeight((int)((0.5d / 100 * height)));
//BA.debugLineNum = 47;BA.debugLine="Divisor.Top = 13%y"[splash/General script]
views.get("divisor").vw.setTop((int)((13d / 100 * height)));
//BA.debugLineNum = 48;BA.debugLine="Divisor.Left = 2%x"[splash/General script]
views.get("divisor").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 51;BA.debugLine="Usuarios.Width = 90%x"[splash/General script]
views.get("usuarios").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 52;BA.debugLine="Usuarios.Height = 6%y"[splash/General script]
views.get("usuarios").vw.setHeight((int)((6d / 100 * height)));
//BA.debugLineNum = 53;BA.debugLine="Usuarios.Left = 0%x"[splash/General script]
views.get("usuarios").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 54;BA.debugLine="Usuarios.Top = 14%y"[splash/General script]
views.get("usuarios").vw.setTop((int)((14d / 100 * height)));
//BA.debugLineNum = 57;BA.debugLine="BotonAcceder.Width = 48%x"[splash/General script]
views.get("botonacceder").vw.setWidth((int)((48d / 100 * width)));
//BA.debugLineNum = 58;BA.debugLine="BotonAcceder.Height = 6%y"[splash/General script]
views.get("botonacceder").vw.setHeight((int)((6d / 100 * height)));
//BA.debugLineNum = 59;BA.debugLine="BotonAcceder.Top = 25%y"[splash/General script]
views.get("botonacceder").vw.setTop((int)((25d / 100 * height)));
//BA.debugLineNum = 60;BA.debugLine="BotonAcceder.Left = 2%x"[splash/General script]
views.get("botonacceder").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 63;BA.debugLine="BotonCancelar.Width = 35%x"[splash/General script]
views.get("botoncancelar").vw.setWidth((int)((35d / 100 * width)));
//BA.debugLineNum = 64;BA.debugLine="BotonCancelar.Height = 6%y"[splash/General script]
views.get("botoncancelar").vw.setHeight((int)((6d / 100 * height)));
//BA.debugLineNum = 65;BA.debugLine="BotonCancelar.Top = 25%y"[splash/General script]
views.get("botoncancelar").vw.setTop((int)((25d / 100 * height)));
//BA.debugLineNum = 66;BA.debugLine="BotonCancelar.Left = 53%x"[splash/General script]
views.get("botoncancelar").vw.setLeft((int)((53d / 100 * width)));
//BA.debugLineNum = 69;BA.debugLine="SplashFooter.Width = 89.9%x"[splash/General script]
views.get("splashfooter").vw.setWidth((int)((89.9d / 100 * width)));
//BA.debugLineNum = 70;BA.debugLine="SplashFooter.Height = 9%y"[splash/General script]
views.get("splashfooter").vw.setHeight((int)((9d / 100 * height)));
//BA.debugLineNum = 71;BA.debugLine="SplashFooter.Top = 84%y"[splash/General script]
views.get("splashfooter").vw.setTop((int)((84d / 100 * height)));
//BA.debugLineNum = 72;BA.debugLine="SplashFooter.Left = 5%x"[splash/General script]
views.get("splashfooter").vw.setLeft((int)((5d / 100 * width)));

}
}