package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Activity.LoadLayout(\"Splash\")'";
Debug.ShouldStop(8);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Splash")),main.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="Usuarios.AddAll(Array As String( \"Gerente\", \"Chef";
Debug.ShouldStop(32);
main.mostCurrent._usuarios.runVoidMethod ("AddAll",(Object)(main.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("Gerente"),BA.ObjectToString("Chef"),RemoteObject.createImmutable("Mesero")})))));
 BA.debugLineNum = 39;BA.debugLine="Usuarios.DropdownBackgroundColor = Colors.RGB(255";
Debug.ShouldStop(64);
main.mostCurrent._usuarios.runMethod(true,"setDropdownBackgroundColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 240)),(Object)(BA.numberCast(int.class, 203))));
 BA.debugLineNum = 40;BA.debugLine="Usuarios.DropdownTextColor = Colors.RGB(234, 117,";
Debug.ShouldStop(128);
main.mostCurrent._usuarios.runMethod(true,"setDropdownTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 234)),(Object)(BA.numberCast(int.class, 117)),(Object)(BA.numberCast(int.class, 108))));
 BA.debugLineNum = 42;BA.debugLine="SplashLogo.BringToFront";
Debug.ShouldStop(512);
main.mostCurrent._splashlogo.runVoidMethod ("BringToFront");
 BA.debugLineNum = 43;BA.debugLine="PanelCarta.SendToBack";
Debug.ShouldStop(1024);
main.mostCurrent._panelcarta.runVoidMethod ("SendToBack");
 BA.debugLineNum = 44;BA.debugLine="PanelSombra.SendToBack";
Debug.ShouldStop(2048);
main.mostCurrent._panelsombra.runVoidMethod ("SendToBack");
 BA.debugLineNum = 45;BA.debugLine="PanelRojo.Visible = False";
Debug.ShouldStop(4096);
main.mostCurrent._panelrojo.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 46;BA.debugLine="LabelSeleccion.Visible = False";
Debug.ShouldStop(8192);
main.mostCurrent._labelseleccion.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 47;BA.debugLine="PanelLogin.Visible = False";
Debug.ShouldStop(16384);
main.mostCurrent._panellogin.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,60);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 60;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Animaciones.Initialize(False)";
Debug.ShouldStop(262144);
main.mostCurrent._animaciones.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 52;BA.debugLine="AnimacionArriba.InitializeTranslate(\"AnimacionArri";
Debug.ShouldStop(524288);
main.mostCurrent._animacionarriba.runVoidMethod ("InitializeTranslate",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("AnimacionArriba")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, -(double) (0 + main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),main.mostCurrent.activityBA).<Integer>get().intValue()))));
 BA.debugLineNum = 53;BA.debugLine="Animaciones.AddAnimation(AnimacionArriba)";
Debug.ShouldStop(1048576);
main.mostCurrent._animaciones.runVoidMethod ("AddAnimation",(Object)(main.mostCurrent._animacionarriba));
 BA.debugLineNum = 54;BA.debugLine="Animaciones.Duration = 1000";
Debug.ShouldStop(2097152);
main.mostCurrent._animaciones.runMethod(true,"setDuration",BA.numberCast(long.class, 1000));
 BA.debugLineNum = 55;BA.debugLine="Animaciones.StartOffset = 1500";
Debug.ShouldStop(4194304);
main.mostCurrent._animaciones.runMethod(true,"setStartOffset",BA.numberCast(long.class, 1500));
 BA.debugLineNum = 56;BA.debugLine="Animaciones.PersistAfter = True";
Debug.ShouldStop(8388608);
main.mostCurrent._animaciones.runMethod(true,"setPersistAfter",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 57;BA.debugLine="Animaciones.Start(SplashLogo)";
Debug.ShouldStop(16777216);
main.mostCurrent._animaciones.runVoidMethod ("Start",(Object)((main.mostCurrent._splashlogo.getObject())));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animacionarriba_animationend() throws Exception{
try {
		Debug.PushSubsStack("AnimacionArriba_AnimationEnd (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,63);
if (RapidSub.canDelegate("animacionarriba_animationend")) return main.remoteMe.runUserSub(false, "main","animacionarriba_animationend");
 BA.debugLineNum = 63;BA.debugLine="Sub AnimacionArriba_AnimationEnd";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="PanelLogin.BringToFront";
Debug.ShouldStop(1);
main.mostCurrent._panellogin.runVoidMethod ("BringToFront");
 BA.debugLineNum = 66;BA.debugLine="PanelLogin.Visible = True";
Debug.ShouldStop(2);
main.mostCurrent._panellogin.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 67;BA.debugLine="LabelSeleccion.BringToFront";
Debug.ShouldStop(4);
main.mostCurrent._labelseleccion.runVoidMethod ("BringToFront");
 BA.debugLineNum = 68;BA.debugLine="LabelSeleccion.Visible = True";
Debug.ShouldStop(8);
main.mostCurrent._labelseleccion.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 69;BA.debugLine="PanelRojo.BringToFront";
Debug.ShouldStop(16);
main.mostCurrent._panelrojo.runVoidMethod ("BringToFront");
 BA.debugLineNum = 70;BA.debugLine="PanelRojo.Visible = True";
Debug.ShouldStop(32);
main.mostCurrent._panelrojo.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 71;BA.debugLine="Usuarios.Visible = True";
Debug.ShouldStop(64);
main.mostCurrent._usuarios.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 72;BA.debugLine="PanelRojo.Visible = True";
Debug.ShouldStop(128);
main.mostCurrent._panelrojo.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 74;BA.debugLine="AnimacionFade.InitializeAlpha(\"AnimacionFade\", 0,";
Debug.ShouldStop(512);
main.mostCurrent._animacionfade.runVoidMethod ("InitializeAlpha",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("AnimacionFade")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 75;BA.debugLine="AnimacionFadeRojo.InitializeAlpha(\"AnimacionFadeR";
Debug.ShouldStop(1024);
main.mostCurrent._animacionfaderojo.runVoidMethod ("InitializeAlpha",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("AnimacionFadeRojo")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 76;BA.debugLine="AnimacionFadeRojo.Duration = 1000";
Debug.ShouldStop(2048);
main.mostCurrent._animacionfaderojo.runMethod(true,"setDuration",BA.numberCast(long.class, 1000));
 BA.debugLineNum = 77;BA.debugLine="AnimacionFade.Duration = 1000";
Debug.ShouldStop(4096);
main.mostCurrent._animacionfade.runMethod(true,"setDuration",BA.numberCast(long.class, 1000));
 BA.debugLineNum = 78;BA.debugLine="AnimacionFadeRojo.Start(PanelRojo)";
Debug.ShouldStop(8192);
main.mostCurrent._animacionfaderojo.runVoidMethod ("Start",(Object)((main.mostCurrent._panelrojo.getObject())));
 BA.debugLineNum = 79;BA.debugLine="AnimacionFade.Start(PanelLogin)";
Debug.ShouldStop(16384);
main.mostCurrent._animacionfade.runVoidMethod ("Start",(Object)((main.mostCurrent._panellogin.getObject())));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _animacionfade_animationend() throws Exception{
try {
		Debug.PushSubsStack("AnimacionFade_AnimationEnd (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,82);
if (RapidSub.canDelegate("animacionfade_animationend")) return main.remoteMe.runUserSub(false, "main","animacionfade_animationend");
 BA.debugLineNum = 82;BA.debugLine="Sub AnimacionFade_AnimationEnd";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _botonacceder_click() throws Exception{
try {
		Debug.PushSubsStack("BotonAcceder_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,85);
if (RapidSub.canDelegate("botonacceder_click")) return main.remoteMe.runUserSub(false, "main","botonacceder_click");
 BA.debugLineNum = 85;BA.debugLine="Sub BotonAcceder_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="If Usuarios.SelectedIndex = 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",main.mostCurrent._usuarios.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 87;BA.debugLine="Password = Input.Show(\"\", \"Escriba la contraseña";
Debug.ShouldStop(4194304);
main.mostCurrent._password = BA.NumberToString(main.mostCurrent._input.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Escriba la contraseña")),(Object)(BA.ObjectToString("Aceptar")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),main.mostCurrent.activityBA,(Object)((main.mostCurrent.__c.getField(false,"Null")))));
 BA.debugLineNum = 88;BA.debugLine="If Password = -1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",main.mostCurrent._password,BA.NumberToString(-(double) (0 + 1)))) { 
 BA.debugLineNum = 89;BA.debugLine="ToastMessageShow(Input.Input ,False)";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(main.mostCurrent._input.runMethod(true,"getInput")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 };
 }else {
 BA.debugLineNum = 92;BA.debugLine="ToastMessageShow(\"Accediste como: \" & Usuarios.";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Accediste como: "),main.mostCurrent._usuarios.runMethod(true,"getSelectedItem"))),(Object)(main.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _botoncancelar_click() throws Exception{
try {
		Debug.PushSubsStack("BotonCancelar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,96);
if (RapidSub.canDelegate("botoncancelar_click")) return main.remoteMe.runUserSub(false, "main","botoncancelar_click");
 BA.debugLineNum = 96;BA.debugLine="Sub BotonCancelar_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private PanelLogin As Panel";
main.mostCurrent._panellogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private SplashLogo As ImageView";
main.mostCurrent._splashlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Usuarios As Spinner";
main.mostCurrent._usuarios = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelRojo As Panel";
main.mostCurrent._panelrojo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LabelSeleccion As Label";
main.mostCurrent._labelseleccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private PanelCarta As Panel";
main.mostCurrent._panelcarta = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private PanelSombra As Panel";
main.mostCurrent._panelsombra = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private BotonAcceder As Button";
main.mostCurrent._botonacceder = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private BotonCancelar As Button";
main.mostCurrent._botoncancelar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim AnimacionArriba As AnimationPlus";
main.mostCurrent._animacionarriba = RemoteObject.createNew ("flm.b4a.animationplus.AnimationPlusWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim AnimacionFade As Animation";
main.mostCurrent._animacionfade = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim AnimacionFadeRojo As Animation";
main.mostCurrent._animacionfaderojo = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim Animaciones As AnimationSet";
main.mostCurrent._animaciones = RemoteObject.createNew ("flm.b4a.animationplus.AnimationSet");
 //BA.debugLineNum = 31;BA.debugLine="Dim Input As InputDialog";
main.mostCurrent._input = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog");
 //BA.debugLineNum = 32;BA.debugLine="Dim Password As String";
main.mostCurrent._password = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}